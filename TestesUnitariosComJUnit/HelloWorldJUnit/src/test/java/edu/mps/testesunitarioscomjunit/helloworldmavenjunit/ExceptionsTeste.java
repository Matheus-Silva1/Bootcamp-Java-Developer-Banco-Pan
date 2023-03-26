package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){

        Conta contaOrigem = new Conta("123456", 0.0);
        Conta contaDestino = new Conta("583972", 100);

        TransferenciaEntreContas transferenciaEntreContas =
                new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transferir(contaOrigem,
                        contaDestino, 20));


    }
}
