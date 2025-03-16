import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) {

  }

  addUser(user:any):Observable<any>{
    const url="http://localhost:8181/addUser"
    return this.http.post(url,user);
  }

  getAllUsers():Observable<any>{
    const url="http://localhost:8181/getAllUsers"
    return this.http.get(url)
  }
}
