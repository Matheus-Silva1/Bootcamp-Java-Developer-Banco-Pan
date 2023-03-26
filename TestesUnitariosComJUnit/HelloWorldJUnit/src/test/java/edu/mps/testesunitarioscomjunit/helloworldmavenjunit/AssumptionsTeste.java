package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioMPS(){
        Assumptions.assumeTrue("root".equals(System.getenv(
        "USER")));

        Assertions.assertEquals(10, 5 + 5);
    }
}
