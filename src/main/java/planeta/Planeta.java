package planeta;
import recursos.Recursos;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class Planeta {

    private int posicao;
    private List<Recursos> listaRecursos = new ArrayList<>();
    private int valorTotal;
    private double pesoTotal;






    public Planeta(int posicao, List<Recursos> listaRecursos) {
        this.posicao = posicao;
        this.listaRecursos.addAll(listaRecursos);
    }
    public Planeta(int posicao) {
        this.posicao = posicao;
    }

    public int valorTotalPlaneta(){
        listaRecursos.forEach(valores -> {
            valorTotal += valores.getValor();
        });
        return valorTotal;
    }

    public double valorPorPeso(){
        listaRecursos.forEach(pesos -> {
            pesoTotal += pesos.getValor()/pesos.getPeso();
        });
        return pesoTotal;

    }

    public int getPosicao() {
        return posicao;
    }

    public List<Recursos> getListaRecursos() {
        return listaRecursos;
    }
















}
