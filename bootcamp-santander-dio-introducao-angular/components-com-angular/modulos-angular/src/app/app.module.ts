import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ListaModule } from './lista/lista.module'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [ //Componentes e coisas criadas
    AppComponent
  ],
  imports: [ //Outros modulos
    BrowserModule,
    AppRoutingModule,
    ListaModule
  ],
  exports: [], //envio para quem quiser me importar os componentes x's
  providers: [], //Dados
  bootstrap: [AppComponent] // COmponente que inicializa
})
export class AppModule { }
