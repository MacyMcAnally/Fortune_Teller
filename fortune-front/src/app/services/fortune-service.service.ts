import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Fortune } from '../model/Fortune';

@Injectable({
  providedIn: 'root'
})
export class FortuneServiceService {
  private url: string;

  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8080/fortune/get';
  }

  ngOnInit(): void {
  }

  public getFortune(): Observable<Fortune> {
    return this.http.get<Fortune>(this.url);
  }
}
