package com.example;

/**
 * Узел дерева.
 * @param info - значение элемента узла.
 * @param left - указатель на левый узел.
 * @param right - указатель на правый узел.
 */
public class Node {
    private String info;
    private Node left, right;

    // Конструктор
    public Node(String info, Node left, Node right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    // Геттер для информации о узле
    public String getInfo() {
        return info;
    }

    // Сеттер для информации о узле
    public void setInfo(String info) {
        this.info = info;
    }

    // Геттер для левого узла
    public Node getLeft() {
        return left;
    }

    // Сеттер для левого узла
    public void setLeft(Node left) {
        this.left = left;
    }

    // Геттер для правого узла
    public Node getRight() {
        return right;
    }

    // Сеттер для правого узла
    public void setRight(Node right) {
        this.right = right;
    }
}