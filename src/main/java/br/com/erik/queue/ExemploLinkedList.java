package br.com.erik.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<String>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("FILA DO BANCO: " +  filaBanco);

        String clienteAtendimento = filaBanco.poll(); // remove e retorna o primeiro elemento da fila
        System.out.println("Cliente que será atendido: " + clienteAtendimento);

        System.out.println("FILA DO BANCO: " +  filaBanco);

        String primeiroCliente = filaBanco.peek(); // retorna o primeiro elemento da fila e se a fila estiver vazia retorna null
        System.out.println(primeiroCliente);

        System.out.println("FILA DO BANCO: " +  filaBanco);

        filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element(); // retorna o primeiro elemento da fila e se a fila estiver vazia retorna uma exception NoSuchElementException
        System.out.println(primeiroClienteOuErro);

        System.out.println("FILA DO BANCO: " +  filaBanco);

        for (String s : filaBanco) {
            System.out.println(s);
        }

        Iterator<String> iterator = filaBanco.iterator();
        while (iterator.hasNext()){
            System.out.println("---> " + iterator.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

    }
}
