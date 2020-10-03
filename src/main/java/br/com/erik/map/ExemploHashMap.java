package br.com.erik.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        // Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        //Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // Retona se existe ou não um campeão Franca
        System.out.println(campeoesMundialFifa.containsKey("Franca"));

        // Remove o campeão França
        campeoesMundialFifa.remove("Franca");

        // Retona se existe ou não um campeão Franca
        System.out.println(campeoesMundialFifa.containsKey("Franca"));

        // Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);
    }
}
