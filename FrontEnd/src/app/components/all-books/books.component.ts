import { Component, OnInit } from '@angular/core';
import { BookService } from '../../services/book.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  list:any=''
  constructor(private BookService:BookService){

  }
  ngOnInit(): void {
    this.allbooks();
  }

  allbooks() {
    this.BookService.allbooks().subscribe((response) =>{
    this.list=response
    })
  }

}
