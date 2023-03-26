package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class PessoaTeste {

    @Test
    void deveRetornarSeEhMaiorDeIdade(){

        Pessoa joao = new Pessoa("Joãozinho", LocalDateTime.of(
                2015, 1, 1, 15, 00));
        Assertions.assertFalse(joao.ehMaiorDeIdade());

        Pessoa marta = new Pessoa("Marta", LocalDateTime.of(
                1995, 1, 1, 15, 00));
        Assertions.assertTrue(marta.ehMaiorDeIdade());

        List<Pessoa> pessoas = List.of(new Pessoa(
                "Julia", LocalDateTime.now()), new Pessoa(
                "Maria", LocalDateTime.now()));

        Assertions.assertAll("pessoas",
                () -> Assertions.assertFalse(pessoas.get(0).
                        ehMaiorDeIdade()),
                () -> Assertions.assertFalse(pessoas.get(1).
                        ehMaiorDeIdade()));

        /*@Test
        @Disabled("Teste ainda não implementado")
        void deveRetornarIdade(){
            System.out.println("");
        }*/
    }
}