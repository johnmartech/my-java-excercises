package com.jmar.tree;

import lombok.Data;

@Data
public class Node<T> {

    T data;
    Node left;
    Node right;

    public Node(T data) {
        this.data = data;
    }
}
