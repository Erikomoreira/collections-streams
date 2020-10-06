package br.com.erik.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor opcional que está presente");
        optionalString.ifPresent(System.out::println);
        //optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente");
        System.out.println(optionalNull.isPresent());
        //optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não está presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente");
        System.out.println(emptyOptional.isPresent());
        //emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança erro NullPointerException");
        System.out.println(optionalNullErro.isPresent());
        //optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Não está presente"));

    }
}
