package edu.mps.testesunitarioscomjunit.helloworldmavenjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.Assumptions;

import static org.junit.jupiter.api.condition.JRE.*;

public class CondicionaisTeste {

    @Test
    @EnabledForJreRange(min=JAVA_11, max=JAVA_20)
    void validarAlgoSomenteNoUsuarioMPS(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
