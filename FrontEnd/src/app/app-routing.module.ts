import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { UserComponent } from './components/user/user.component';
import { StudentComponent } from './components/student/student.component';
import { TeacherComponent } from './components/teacher/teacher.component';
import { BooksComponent } from './components/books/books.component';


const routes: Routes = [
  {
    path: '', redirectTo:'login', pathMatch: 'full'
  },
  {
    path:'login', component:LoginComponent
  },
  {
    path:'home',  component:HomeComponent
  },
  {
    path:'user', component:UserComponent
  },
  {
    path:'student', component:StudentComponent
  },
  {
    path:'teacher', component:TeacherComponent
  },
  {
    path:'books', component:BooksComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
