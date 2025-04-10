import { Component, OnInit } from '@angular/core';
import { TeacherService } from '../../services/teacher.service';

@Component({
  selector: 'app-all-teachers',
  templateUrl: './all-teachers.component.html',
  styleUrls: ['./all-teachers.component.css']
})
export class AllTeachersComponent implements OnInit{
   list:any;
  constructor(private TeacherService:TeacherService){

  }
  ngOnInit(){
    this.getAllTeachers();
  }

  getAllTeachers(){
    this.TeacherService.getAllTeachers().subscribe((response)=>{
      this.list=response;
    })
  }
}
