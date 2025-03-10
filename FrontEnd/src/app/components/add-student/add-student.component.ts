import { Component } from '@angular/core';
import { StudentService } from '../../services/student.service';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent {

  constructor(private StudentService:StudentService){

  }

  firstName:any;
  lastName:any;
  course:any;

  addStudent(){

        const Student={
          firstName:this.firstName,
          lastName:this.lastName,
          course:this.course
        }

    this.StudentService.addStudent(Student).subscribe((response)=>{
      if (response!=null) {
        alert("Student Added Succesfully")
      } else {
        alert("Student adding failed please try again")
      }
    })
  }
}
