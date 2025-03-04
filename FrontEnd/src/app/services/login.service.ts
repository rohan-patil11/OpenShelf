import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) {

  }

  login(logininfo:any):Observable<any>{
    const url='http://localhost:8181/LogIn'
   return this.http.post(url,logininfo);
  }
}
