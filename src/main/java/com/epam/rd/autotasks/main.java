package com.epam.rd.autotasks;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        String a = quadraticEquation.solve(1, 8, 1);
        String[] root1 = a.split(" ");
        System.out.println(root1);
    }

}
