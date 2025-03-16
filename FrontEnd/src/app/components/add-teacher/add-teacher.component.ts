import { Component } from '@angular/core';
import { TeacherService } from '../../services/teacher.service';

@Component({
  selector: 'app-add-teacher',
  templateUrl: './add-teacher.component.html',
  styleUrls: ['./add-teacher.component.css']
})
export class AddTeacherComponent {
  firstName:any;
  lastName:any;

  constructor(private TeacherService:TeacherService){

  }

  addTeacher(){
    const Teacher={
    firstName:this.firstName,
    lastName:this.lastName
    }
    this.TeacherService.addTeacher(Teacher).subscribe((response)=>{
      if (response!=null) {
        alert("Teacher Added Succesfully")
      } else {
        alert("Teacher adding failed please try again")
      }
    })
  }
}
