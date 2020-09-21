package com.heecoo.learn.java.heecooeffectivejava.dataStruct.other;

import lombok.Data;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 定义一个二叉树
 * 概念：每个节点的子结点不超过2的树结构，父结点值大于左子树任意结点值，小于右子树任意结点值。
 *
 * @Author: Heecoo
 * @Date: 2020/9/21 11:14 上午
 * @Version 1.0
 */
@Data
public class BinaryTree {
    //值
    //我们定义一个整型二叉树
    int value;

    //定义一个左子结点
    private BinaryTree leftNode;
    //定义一个右子结点
    private BinaryTree rightNode;

    public BinaryTree(int value, BinaryTree leftNode, BinaryTree rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.value = value;
    }

    //遍历二叉树
    public Queue<Integer> traverse(BinaryTree binaryTree, Queue queue) {
        queue.add(binaryTree.value);

        if (binaryTree.leftNode != null)
            traverse(binaryTree.leftNode, queue);

        if (binaryTree.rightNode != null)
            traverse(binaryTree.rightNode, queue);


        return queue;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10,
                new BinaryTree(7, null, null),
                new BinaryTree(14, null, null)
        );
        Queue<Integer> results = new ArrayDeque<>(10);
        binaryTree.traverse(binaryTree, results);
        System.out.println(results);
    }
}
