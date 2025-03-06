import { Component } from '@angular/core';
import { Book } from 'src/app/model/book';
import { BookService } from '../../services/book.service';

@Component({
  selector: 'app-add-multiple-books',
  templateUrl: './add-multiple-books.component.html',
  styleUrls: ['./add-multiple-books.component.css']
})
export class AddMultipleBooksComponent {

  constructor(private BookService:BookService){

  }

  books: Book[] = [{ bookName: '', authorName: '', bookPrice: 0 }]; // ✅ Corrected naming

  addBook() {
    this.books.push({ bookName: '', authorName: '', bookPrice: 0 });
  }

  removeBook(index: number) {
    if (this.books.length > 1) {
      this.books.splice(index, 1);
    }
  }



  submitBooks() {
    this.BookService.submitBooks(this.books).subscribe(response => {
      if (response) {
        alert("Books Submitted Successfully");
      } else {
        alert("Books Submission Failed, Please Try Again");
      }
    });
  }

}
