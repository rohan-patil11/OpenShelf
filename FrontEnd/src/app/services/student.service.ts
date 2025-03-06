import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http:HttpClient) { }

  allbooks():Observable<any>{
    const url ="http://localhost:8181/getAllStudents";
    return this.http.get(url);
  }
}
