import { Component } from '@angular/core';
import { StudentService } from '../../services/student.service';
import { Router } from '@angular/router';
import { BookService } from '../../services/book.service';
import { BooksComponent } from '../all-books/books.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  constructor(private Router:Router){

  }

list:any =' ';
  allbooks() {

}
}


