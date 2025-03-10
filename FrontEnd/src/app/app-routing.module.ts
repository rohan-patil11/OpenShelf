import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { UserComponent } from './components/user/user.component';
import { StudentComponent } from './components/student/student.component';
import { TeacherComponent } from './components/teacher/teacher.component';
import { BooksComponent } from './components/all-books/books.component';
import { AddMultipleBooksComponent } from './components/add-multiple-books/add-multiple-books.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { AllStudentsComponent } from './components/all-students/all-students.component';
import { AddStudentComponent } from './components/add-student/add-student.component';

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
    path:'add-student', component:AddStudentComponent
  },
  {
    path:'all-students', component:AllStudentsComponent
  },
  {
    path:'teacher', component:TeacherComponent
  },
  {
    path:'all-books', component:BooksComponent
  },
  {
    path:'add-multiple-books', component:AddMultipleBooksComponent
  },
  {
    path:'add-book', component:AddBookComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
