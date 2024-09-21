import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { environment } from 'src/environments/environment';
import { Pokemon } from 'src/app/models/pokemon';

@Injectable({
  providedIn: 'root',
})
export class PokemonService {
  private apiUrl: string = '';
  private pokeData: Pokemon | any;

  constructor(private http: HttpClient) {
    this.apiUrl = environment.pokeApi;
  }

  getPokemon(pokemonName: string): Observable<Pokemon> {
    this.pokeData = this.http.get<Pokemon>(`${this.apiUrl}${pokemonName}`);

    return this.pokeData;
  }
}
