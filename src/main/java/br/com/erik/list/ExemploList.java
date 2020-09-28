package br.com.erik.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        String nome = nomes.get(3);
        System.out.println("Obtendo um elemento da lista:" +nome);

        Integer tamanho = nomes.size();
        System.out.println("O tamanho da lista eh: "+ tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("A lista ten fernando:" + temAnderson);

        int posicao = nomes.indexOf("Wesley");
        System.out.println("A posição do Wesley eh: " + posicao);

        boolean empty = nomes.isEmpty();
        System.out.println("A lista está vazia? " + empty);

        for (String nomeItem: nomes){
            System.out.println("-->" + nomeItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("------>"+ iterator.next());
        }

        nomes.clear();

        boolean emptyDois = nomes.isEmpty();
        System.out.println("A lista está vazia? " + emptyDois);

    }

}
