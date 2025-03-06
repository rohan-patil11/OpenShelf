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
}
