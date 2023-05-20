package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneroTest {

    @Test
    void deveContarLivrosDisponiveisGenero() {
        Genero genero = new Genero(
                new Livro("É assim que acaba", true),
                new Livro("É assim que começa", true),
                new Livro("Os sete maridos de Evelyn Hugo", false),
                new Livro("Tudo é rio", true)
        );
        assertEquals(3, Contagem.contarLivrosDisponiveisGenero(genero));
    }

    @Test
    void deveContarTotalLivrosGenero() {
        Genero genero = new Genero(
                new Livro("É assim que acaba", true),
                new Livro("É assim que começa", true),
                new Livro("Os sete maridos de Evelyn Hugo", true),
                new Livro("Tudo é rio", true)
        );
        assertEquals(4, Contagem.contarTotalLivrosGenero(genero));
    }

}
