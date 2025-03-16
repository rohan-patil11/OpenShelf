import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TeacherService {

  constructor(private http:HttpClient) { }

  addTeacher(Teacher:any):Observable<any>{
   const url="http://localhost:8181/addTeacher"
   return this.http.post(url,Teacher);
  }

  getAllTeachers():Observable<any>{
   const url="http://localhost:8181/getAllTeachers"
   return this.http.get(url)

  }
}
