import { Component } from '@angular/core';
import { TeacherService } from '../../services/teacher.service';

@Component({
  selector: 'app-all-teachers',
  templateUrl: './all-teachers.component.html',
  styleUrls: ['./all-teachers.component.css']
})
export class AllTeachersComponent {
   list:any;
  constructor(private TeacherService:TeacherService){

  }

  getAllTeachers(){
    this.TeacherService.getAllTeachers().subscribe((response)=>{
      this.list=response;
    })
  }
}
