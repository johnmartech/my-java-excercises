package com.jmar.tree;


import lombok.Data;

@Data
public class NodeWrapper<T> {

    private T node;
    private boolean visited;
    public NodeWrapper(T node) {
        this.node = node;
    }
}
