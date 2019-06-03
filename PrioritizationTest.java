package com.aurea.codefix.client.api.model;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import pl.pojo.tester.api.assertion.Method;

public class PrioritizationTest {

    @Test
    public void getterSetters() {
        assertPojoMethodsFor(Prioritization.class).testing(Method.GETTER)
                .testing(Method.SETTER).areWellImplemented();
    }

}
