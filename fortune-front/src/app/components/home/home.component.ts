import { Component, OnInit } from '@angular/core';
import { Fortune } from 'src/app/model/Fortune';
import { FortuneServiceService } from 'src/app/services/fortune-service.service'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  public fortune:Fortune;

  constructor(private fortunService:FortuneServiceService) { }

  ngOnInit(): void {
  }

  getFortune(): void {
    console.log("Getting fortune");
    this.fortunService.getFortune().subscribe(
      data => {
        this.fortune = data;
      }
    )
  }

}
