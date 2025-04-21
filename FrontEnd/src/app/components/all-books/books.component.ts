import { Component, OnInit } from '@angular/core';
import { BookService } from '../../services/book.service';
import { Book } from '../../model/book';
import { Books } from 'src/app/model/books';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})




export class BooksComponent implements OnInit {


  list: any;

  searchBook: any;

  constructor(private BookService: BookService) {

  }
  ngOnInit(): void {
    this.allbooks();
  }

  allbooks() {
    this.BookService.allbooks().subscribe((response) => {
      this.list = response
      console.log(response);
    })
  }

  filteredBooks() {
    if (!this.searchBook) {
      return this.list
    } else {
      return this.list.filter((book:any) =>
        book.bookName.toLowerCase().includes(this.searchBook.toLowerCase())
      )
    }
  }
  assignBook(bookId:number,studentId:number){
      console.log(bookId,studentId)
      return this.BookService.assignBook(bookId,studentId).subscribe((response)=>{
        if (response!=null) {
          alert("Book Assigned Successfully")
        } else {
          alert("Book Assigning Failed Please Try Again")
        }
      })
  }
}
