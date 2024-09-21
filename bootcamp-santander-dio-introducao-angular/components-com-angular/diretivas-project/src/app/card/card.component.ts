import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  produtos: string[] = [];
  menuType: string = '';

  constructor() { 
    this.produtos = [
      "CPU",
      "Monitor",
      "Teclado",
      "Mouse",
      "Headset",
    ];
  }

  ngOnInit(): void {
  }

  adicionar(): void {
    this.produtos.push("novo produto adicionado");
  }

  remover(index: number): void {
    alert(`ITEM ${this.produtos[index]} REMOVIDO!`)
    this.produtos.splice(index, 1);
  }

}
