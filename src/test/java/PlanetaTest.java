import nave.Nave;
import org.junit.Assert;
import org.junit.Test;
import planeta.Planeta;
import recursos.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlanetaTest {


    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta() {
        Recursos agua = new Recursos(180, 10);
        Recursos oxigenio = new Recursos(300, 2);
        Recursos ferro = new Recursos(30, 32);
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(9);
        Planeta tatooine = new Planeta(4, new ArrayList<>(Arrays.asList(agua, oxigenio, ferro)));
        List<Planeta> listaPlanetas = new ArrayList<>(Arrays.asList(tatooine));


        milleniumFalcon.explorar(listaPlanetas);
        int posicaoResultante = milleniumFalcon.getPosicaoNave();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }
    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso(){
        Planeta tatooine = new Planeta(4, new ArrayList<>());
        int valorTotalTatooine = tatooine.valorTotalPlaneta();

        int valorEsperado = 0;

        Assert.assertEquals(valorEsperado, valorTotalTatooine, 0.01);
    }
    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta(){
        Recursos agua = new Recursos(180, 10);
        Recursos oxigenio = new Recursos(300, 2);
        Recursos ferro = new Recursos(30, 32);
        Planeta tatooine = new Planeta(4, new ArrayList<>(Arrays.asList(agua, oxigenio, ferro)));
        int valorTotalTatooine = tatooine.valorTotalPlaneta();

        int valorEsperado = 510;

        Assert.assertEquals(valorEsperado, valorTotalTatooine, 0.01);
    }
    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso(){
        Planeta tatooine = new Planeta(4, new ArrayList<>());
        double valorTotalTatooine = tatooine.valorPorPeso();

        int valorEsperado = 0;

        Assert.assertEquals(valorEsperado, valorTotalTatooine, 0.01);
    }
    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta(){
        Recursos agua = new Recursos(180, 10);
        Recursos oxigenio = new Recursos(300, 2);
        Recursos ferro = new Recursos(30, 32);
        Planeta tatooine = new Planeta(4, new ArrayList<>(Arrays.asList(agua, oxigenio, ferro)));
        double valorTotalTatooine = Math.round(tatooine.valorPorPeso() * 100.0)/ 100.0;

        double valorEsperado = 168.94;

        Assert.assertEquals(valorEsperado, valorTotalTatooine, 0.01);
    }
    @Test
    public void deveExplorarOPlanetaEFicarERetornarAPosicaoInicial(){

        Nave milleniumFalcon = new Nave(30);
        Planeta tatooine = new Planeta(4, new ArrayList<>());
        Planeta cobraine = new Planeta(5, new ArrayList<>());
        List<Planeta> listaPlanetas = new ArrayList<>(Arrays.asList(tatooine, cobraine));

        milleniumFalcon.explorar(listaPlanetas);
        int posicaoEsperada = 0;
        int posicaoResultante = milleniumFalcon.getPosicaoNave();


        milleniumFalcon.explorar(listaPlanetas);

        Assert.assertEquals(posicaoEsperada, posicaoResultante);


    }




}
