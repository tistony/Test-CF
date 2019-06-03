package com.aurea.codefix.client.api.model;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import pl.pojo.tester.api.assertion.Method;

public class IssueTest {

    @Test
    public void getterSetters() {
        assertPojoMethodsFor(Issue.class).testing(Method.GETTER)
                .testing(Method.SETTER).areWellImplemented();
    }

}
