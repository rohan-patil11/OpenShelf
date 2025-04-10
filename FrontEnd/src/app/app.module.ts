import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { MenuComponent } from './components/menu/menu.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { UserComponent } from './components/user/user.component';
import { StudentComponent } from './components/student/student.component';
import { TeacherComponent } from './components/teacher/teacher.component';
import { BooksComponent } from './components/all-books/books.component';
import { AddMultipleBooksComponent } from './components/add-multiple-books/add-multiple-books.component';
import { AddBookComponent } from './components/add-book/add-book.component';
import { AllStudentsComponent } from './components/all-students/all-students.component';
import { AddStudentComponent } from './components/add-student/add-student.component';
import { AddUserComponent } from './components/add-user/add-user.component';
import { AllUsersComponent } from './components/all-users/all-users.component';
import { AddTeacherComponent } from './components/add-teacher/add-teacher.component';
import { AllTeachersComponent } from './components/all-teachers/all-teachers.component';
import { ResumeComponent } from './developer/resume/resume.component';
import { ContactComponent } from './developer/contact/contact.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    MenuComponent,
    FooterComponent,
    UserComponent,
    StudentComponent,
    TeacherComponent,
    BooksComponent,
    AddMultipleBooksComponent,
    AddBookComponent,
    AllStudentsComponent,
    AddStudentComponent,
    AddUserComponent,
    AllUsersComponent,
    AddTeacherComponent,
    AllTeachersComponent,
    ResumeComponent,
    ContactComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
