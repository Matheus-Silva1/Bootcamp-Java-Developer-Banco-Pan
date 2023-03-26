package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    void validarLancamento(){
        int primeiroLancamento[] = {10, 20, 30, 40, 50};
        int segundoLancamento[] = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento,
        segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5d;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
