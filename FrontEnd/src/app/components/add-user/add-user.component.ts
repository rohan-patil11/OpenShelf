import { Component } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})


export class AddUserComponent {
  username:any
  password:any
	firstName:any
	lastName:any
	role:any =''
  constructor(private UserService:UserService){

}

addUser(){
const User={
  username:this.username,
  password:this.password,
	firstName:this.firstName,
	lastName:this.lastName,
	role:this.role
}

  this.UserService.addUser(User).subscribe((response)=>{
     if (response!=null) {
      alert("User Added Successfully")
     } else {
      alert("User Adding Failed Please Try Again")
     }
  })
}
}
