package com.example.projeto;

import java.util.Iterator;

public class Contagem {

    public static Integer contarLivrosDisponiveisGenero(Genero genero) {
        int quantidade = 0;
        for (Livro livro : genero) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosGenero(Genero genero) {
        int quantidade = 0;
        for (Iterator a = genero.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
