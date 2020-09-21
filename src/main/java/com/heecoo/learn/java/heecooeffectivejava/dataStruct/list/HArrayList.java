package com.heecoo.learn.java.heecooeffectivejava.dataStruct.list;

import java.io.Serializable;
import java.util.RandomAccess;

/**
 * @Author: Heecoo
 * @Date: 2020/9/8 9:15 下午
 * @Version 1.0
 */
public class HArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess,Cloneable, Serializable {
    public E get(int index) {
        return (E) elementData[index];
    }
    private static final long serialVersionUID = -1846581273408532396L;

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};

    transient Object[] elementData;

    private int size;

    public int size(){
        return size;
    }

    //定义一个构造函数
    public HArrayList(int capacity){
        if (capacity == 0)
            elementData = EMPTY_ELEMENTDATA;
        else if (capacity > 0)
            elementData = new Object[capacity];
        else throw new IllegalArgumentException("错误的capacity: "+capacity);
    }

    @Override
    public boolean add(E o) {
        if (size < elementData.length){
            elementData[size+1] = o;
        }else {
            System.out.println("列表已满！！");
            return false;
        }
        size++;
       return true;
    }


    public static void main(String[] args) {
        List<Integer> list = new HArrayList<>(10);
        list.add(1);
        System.out.println("列表长度为："+list.size());
        System.out.println(list.get(0));
    }

}
