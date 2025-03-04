import { Component } from '@angular/core';
import { LoginService } from '../../services/login.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private LoginService:LoginService, private router:Router){

  }
username: any;
password: any;

login(){
const logininfo={
  username:this.username,
  password:this.password
}

console.log(logininfo)
this.LoginService.login(logininfo).subscribe((response) => {
  if(response!=null){
    this.router.navigate(['home'])
  }else{
    this.router.navigate(['login'])
  }
}

)}
}
