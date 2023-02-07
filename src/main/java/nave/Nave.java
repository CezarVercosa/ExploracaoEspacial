package nave;


import planeta.Planeta;
import recursos.Recursos;

import java.util.ArrayList;
import java.util.List;

public class Nave {

    private int quantidadeCombustivel;
    private int posicaoNave = 0;


    public Nave(int quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public List<Recursos> explorar(List<Planeta> planetas) {
        List<Recursos> listaRecursosColetados = new ArrayList<>();
        for (int i = 0; i < planetas.size(); i++) {
            Planeta planetaAExplorar = planetas.get(i);
            for (int a = getPosicaoNave(); a < planetaAExplorar.getPosicao(); a++){
                if(this.getQuantidadeCombustivel() >= 3){
                    this.setQuantidadeCombustivel((int) (this.getQuantidadeCombustivel() - 3));
                    this.setPosicaoNave(this.posicaoNave += 1);
                } else{
                    return listaRecursosColetados;
                }
            }
            for (int n = 0; n < planetaAExplorar.getListaRecursos().size(); n++){
                listaRecursosColetados.add(planetaAExplorar.getListaRecursos().get(n));
            }
        }
        for (int a = getPosicaoNave(); a > 0; a--){
            if(this.getQuantidadeCombustivel() >= 3){
                this.setQuantidadeCombustivel((int) (this.getQuantidadeCombustivel() - 3));
                this.setPosicaoNave(this.posicaoNave -= 1);
            } else{
                return listaRecursosColetados;
            }
        }

        return listaRecursosColetados;
    }




    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public int getPosicaoNave() {
        return posicaoNave;
    }

    public void setQuantidadeCombustivel(int quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void setPosicaoNave(int posicaoNave) {
        this.posicaoNave = posicaoNave;
    }
}
