import { Component } from '@angular/core';
import { BookService } from '../../services/book.service';
import { LoginService } from '../../services/login.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent{

  constructor(private BookService:BookService){

  }
  bookName:any;
  authorName:any;
  bookPrice:any;
  addBook(){
    {
      const book={
        bookName:this.bookName,
        authorName:this.authorName,
        bookPrice:this.bookPrice
      }
      this.BookService.addBook(book).subscribe((response)=>{
        if (response!=null) {
          alert("Book Added Succesfully")
        } else {
          alert("Book adding failed please try again")
        }
      })

    }

  }

}
