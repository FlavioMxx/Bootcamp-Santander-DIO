import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-check-sample',
  templateUrl: './check-sample.component.html',
  styleUrls: ['./check-sample.component.css']
})
export class CheckSampleComponent implements OnInit, DoCheck, AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, OnDestroy {
  quantidade: number = 0;

  constructor() { }


  adicionar(): void {
    this.quantidade++;
  }

  remover(): void {
    this.quantidade--;
  }

  //checked -> content -> view 

  //Quando o primeiro conteudo é iniciado
  ngAfterContentInit(): void {
    console.log('AfterContentInit');
  }

  //Depois da inicialização da view
  ngAfterViewInit(): void {
    console.log('AfterViewInit');
  }

  //Após alguma alteração, verifica o conteúdo
  ngAfterContentChecked(): void {
    console.log('AfterContentChecked');
  }

  //Após alguma alteração, verifica a view
  ngAfterViewChecked(): void {
    console.log('AfterViewChecked');
  }
  
  ngDoCheck(): void {
    console.log('DoCheck');
  }
  ngOnInit(): void {
  console.log('OnInit')
  }

  ngOnDestroy(): void {
    console.log('OnDestroy ');
  }

}
