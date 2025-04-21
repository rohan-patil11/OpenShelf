import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../model/book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

   constructor(private http:HttpClient) { }

    allbooks():Observable<any>{
      const url ="http://localhost:8181/FetchAllBooks";
      return this.http.get(url);
    }

    submitBooks(books :Book[]):Observable<any>{
      const url="http://localhost:8181/AddMultipleBooks";
      return this.http.post(url,books);

    }
    addBook(book:any):Observable<any>{
      const url="http://localhost:8181/InsertBook";
      return  this.http.post(url,book);
    }
    assignBook(bookId:number,studentId:number):Observable<any>{
      const url=`http://localhost:8181/AssignBook/${bookId}/${studentId}`
      return this.http.post(url,null);
    }
}
