import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TitleComponent } from './pages/index/title/title.component';
import { CardComponent } from './pages/portifolio/card/card.component';

const routes: Routes = [ //Routes me pede um array de objetos
  {path: '', component: TitleComponent, pathMatch: 'full'}, //Nele defino o path/caminho, o componente que deve ser renderizado ao acessar o caminho e se o caminho precisa ser exatamente esse para acessar ou não
  {path: 'portifolio', component: CardComponent, children: [
    {path: ':id', component: CardComponent}, //Rota filha de portifolio
  ]},
  {path: '**', redirectTo: ''}, //os ** no path me da um caminho default, ou seja, tudo que não exista redireciona para:... no caso vazio, volta para home
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
