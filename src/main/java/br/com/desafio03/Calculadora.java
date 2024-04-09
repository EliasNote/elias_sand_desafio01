package br.com.desafio03;

import br.com.desafio03.tipos.Multiplicador;
import br.com.desafio03.tipos.Multiplicando;
import br.com.desafio03.tipos.Resultado;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public Integer soma(Integer a, Integer b) {
        return a + b;
    }

    public Integer subtracao(String a, Integer b) {
        return b - Integer.parseInt(a);
    }

    public Resultado multiplicacao(Multiplicador a, Multiplicando b) {
        return new Resultado(a.getValue() * b.getValue());
    }

    public List<Resultado> multiplicacao(Multiplicando b, Multiplicador a) {
        List<Resultado> resultados = new ArrayList<>();
        resultados.add(new Resultado(a.getValue() * b.getValue()));
        return resultados;
    }
}
