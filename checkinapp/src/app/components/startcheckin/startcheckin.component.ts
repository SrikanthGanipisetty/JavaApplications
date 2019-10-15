import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-startcheckin',
  templateUrl: './startcheckin.component.html',
  styleUrls: ['./startcheckin.component.css']
})
export class StartcheckinComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }

  onSelect(id){
    this.router.navigate(['/checkin',id])
  }

}
