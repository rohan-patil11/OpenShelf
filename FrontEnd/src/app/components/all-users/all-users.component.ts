import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-all-users',
  templateUrl: './all-users.component.html',
  styleUrls: ['./all-users.component.css']
})
export class AllUsersComponent implements OnInit {
  list:any
  constructor(private UserService:UserService){

  }
  ngOnInit(){
    this.getAllUSers();
  }

  getAllUSers(){
    this.UserService.getAllUsers().subscribe((response)=>{
      this.list=response;
    })
  }
}

