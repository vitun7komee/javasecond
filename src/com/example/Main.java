package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите пример. Пример: ( ( 1 * 2 ) + ( ( 2 + 3 ) / 1 ) )");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArr = str.split(" ");
        FormulaTree tree = new FormulaTree(strArr);
        tree.setParams(in);
        System.out.println(tree.calculate());
    }
}