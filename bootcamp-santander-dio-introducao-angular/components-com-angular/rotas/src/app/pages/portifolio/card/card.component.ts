import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  constructor(
    private activeRoutes: ActivatedRoute,
    private router: Router) {
    //http://localhost:4200/portifolio/{id}
    this.activeRoutes.params.subscribe(
      result => console.log(result)
    );

    this.activeRoutes.firstChild?.params.subscribe(
      result => console.log(result)
    )

    //http://localhost:4200/portifolio/{id}?{name=Maria&sobrenome=Cecilia}
    this.activeRoutes.queryParams.subscribe(
      result => console.log(result)
    );
  }

  ngOnInit(): void {
    // setInterval(() => {
    //   this.router.navigate(['/']) //Renderiza o componente que está neste caminho em x segundos
    // }, 5000) //set de segundos
  }

}
