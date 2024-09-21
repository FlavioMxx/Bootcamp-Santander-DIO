import { Component, Input, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/models/pokemon';
import { PokemonService } from 'src/app/services/pokemon.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: [
    './card.component.css',
    './types.component.css'],
})
export class CardComponent implements OnInit {
  pokemon: Pokemon;


  constructor(private service: PokemonService) {
    this.pokemon = {
      id: '',
      name: '',
      sprites: {
        front_default: '',
      },
      types: [],
    };
  }

  ngOnInit(): void { 
    this.getPokemon('pikachu');
  }

  getPokemon(pokemon: string) {
    this.service.getPokemon(pokemon.toLowerCase()).subscribe({
      next: (result) => {
        this.pokemon = {
          id: result.id,
          name: result.name,
          sprites: result.sprites,
          types: result.types,
        };
      },
      error: () => alert('Pokemon not found ')
    });
  }
}
