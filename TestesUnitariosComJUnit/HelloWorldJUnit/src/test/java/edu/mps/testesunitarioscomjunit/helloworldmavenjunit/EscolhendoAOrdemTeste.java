package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    @DisplayName("A")
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}