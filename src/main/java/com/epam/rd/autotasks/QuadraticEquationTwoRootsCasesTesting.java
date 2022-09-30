package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private String expected;


    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {4, 5, -1, "0.17539052967910607 -1.425390529679106"},
                {5, -26, 5, "5.0 0.2"},
                {8, -6, 1, "0.5 0.25"},
                {7, 6, -1, "0.14285714285714285 -1.0"},
        });
    }
    @Test
    public void TwoRootCases() {
        String result = quadraticEquation.solve(a, b, c);

    if (!result.contains(" ") || result.equals("no roots")) {
        throw new AssertionError();
    }
         String[] actual = result.split(" ");
        assertTrue(result.contains(actual[0]));
        assertTrue(result.contains(actual[1]));

}
}
