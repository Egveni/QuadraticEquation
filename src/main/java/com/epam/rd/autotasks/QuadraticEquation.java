package com.epam.rd.autotasks;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public String solve(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            return "no roots";
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return x + "";
        } else {
            double x1 = (-b - Math.sqrt(discriminant))/(2*a);
            double x2 = (-b + Math.sqrt(discriminant))/(2*a);
            return String.format("%s %s", x1,x2);
        }
    }

}