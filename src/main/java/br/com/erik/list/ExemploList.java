package br.com.erik.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList();

        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Eduardo");
        nomes.add("Mônica");
        nomes.add("Arnaldo");

        System.out.println("Lista não ordenada: "+ nomes);

        Collections.sort(nomes);
        System.out.println("Lista ordenada: "+ nomes);

        nomes.set(2, "Bob");
        System.out.println("Depois de utilizar o SET: "+ nomes );

        nomes.remove(4);
        System.out.println("Depois de utilizar o Remove por id: "+ nomes );

        nomes.remove("Bob");
        System.out.println("Depois de utilizar o Remove por Objeto: "+ nomes );

        String nome = nomes.get(4);
        System.out.println(nome);

    }

}
