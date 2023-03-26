package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTeste {

    @Test
    void validaSaldo(){

        Conta conta = new Conta("123456", 100);
        Assertions.assertNotNull(conta);

        conta.lancaCredito(50);

        Assertions.assertEquals(150, conta.getSaldo());

        Assertions.assertNotEquals(101, conta.getSaldo());

        conta = null;
        Assertions.assertNull(conta);
    }
}
