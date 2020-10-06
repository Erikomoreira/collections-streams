package br.com.erik.comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o1.getIdade() - o2.getIdade();
    }


}
