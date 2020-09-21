package com.heecoo.learn.java.heecooeffectivejava.dataStruct.list;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * 该类提供了一个整体性的对{@link List}进行实现
 * @Author: Heecoo
 * @Date: 2020/9/8 9:16 下午
 * @Version 1.0
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>{
    //申明一个构造方法，只能自己或子类使用
    protected AbstractList(){}

    @Override
    public boolean add(E o) {
        add(size(),o);
        return true;
    }
    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }


    abstract public E get(int index);


    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E set(int index, E e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equal(E e) {
        if (e==this)
            return true;
        if(!(e instanceof List))
            return false;
        //todo 比较列表里的每个月素是否相等
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for(E e:this)
            hashCode = 31*hashCode + (e==null ? 0:e.hashCode());
        return hashCode;
    }

    protected transient int modCount = 0;

}
