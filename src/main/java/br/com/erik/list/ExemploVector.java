package br.com.erik.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<String>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Handebol");
        esportes.add("Natação");

        esportes.set(2, "Teste");

        esportes.remove(2);

        esportes.remove("Handebol");

        System.out.println(esportes.get(0));

        for (String esporte : esportes) {
            System.out.println(esporte);
        }

    }


}
