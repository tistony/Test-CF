package com.aurea.codefix.client.api.model;

import static pl.pojo.tester.api.FieldPredicate.exclude;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import pl.pojo.tester.api.assertion.Method;

public class RepositoryInsightsTest {

    @Test
    public void getterSetters() {
        assertPojoMethodsFor(RepositoryInsights.class, exclude("kind", "insights")).testing(Method.GETTER)
                .testing(Method.SETTER).areWellImplemented();
    }

}
