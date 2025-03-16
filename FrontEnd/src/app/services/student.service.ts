import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http:HttpClient) { }

 addStudent(Student:any):Observable<any>{
  const url="http://localhost:8181/addStudent"
  return this.http.post(url,Student);
 }


  allStudents():Observable<any>{
    const url ="http://localhost:8181/getAllStudents";
    return this.http.get(url);
  }
}
