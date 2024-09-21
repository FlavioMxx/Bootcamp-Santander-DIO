import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-atributos',
  templateUrl: './comp-atributos.component.html',
  styleUrls: ['./comp-atributos.component.css']
})
export class CompAtributosComponent implements OnInit {
  estilo: string = "";
  corFundo: string = "purple";
  corFonte: string = "white"; 
  item: string = "";
  lista: string[] = [];
  isEnableLink: boolean = true;

  constructor() { }

  ngOnInit(): void {
  }

  adicionarNaLista(): void {
    this.lista.push(this.item);
  }

  trocar(): void {
    if(this.estilo === "disable") {
      this.estilo = "enable";
    } else {
      this.estilo = "disable";
    }
  }
}
