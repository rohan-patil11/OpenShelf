import { Component, OnInit } from '@angular/core';
import { StudentService } from '../../services/student.service';

@Component({
  selector: 'app-all-students',
  templateUrl: './all-students.component.html',
  styleUrls: ['./all-students.component.css']
})
export class AllStudentsComponent implements OnInit{
;


  list:any;
  searchStudent: any
  constructor(private StudentService:StudentService){

  }
  ngOnInit(): void {
     this.allStudents();
  }

  allStudents(){
    this.StudentService.allStudents().subscribe((response)=>{
      this.list=response;
    })
  }

  filteredList(){
     if (!this.searchStudent) {
      return this.list
     } else {
      return this.list.filter((student:any)=>
        student.firstName.toLowerCase().includes(this.searchStudent.toLowerCase())
      )
     }
}
}
