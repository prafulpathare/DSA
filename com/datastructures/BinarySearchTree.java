package com.datastructures;

import com.model.TreeNode;
import sun.reflect.generics.tree.Tree;

public class BinarySearchTree {
    static TreeNode root;

    static TreeNode add(TreeNode node, int value) {
        TreeNode newNode = new TreeNode(value);

        if (node == null) node = newNode;

        if(value < node.value)
            node = add(node.left, value);
        else node = add(node.right, value);

        return node;
    }

    static void traverse(TreeNode node) {



    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10);
        node = add(node, 50);
        node = add(node, 20);
        node = add(node, 80);
        node = add(node, 25);

        traverse(node);
    }

}
