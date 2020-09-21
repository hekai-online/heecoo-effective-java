package com.heecoo.learn.java.heecooeffectivejava.dataStruct.list;

import com.sun.istack.internal.NotNull;

import java.util.Collection;
import java.util.Iterator;

/**
 * 抽象出一个list接口，定义list基本规则(增，删，改，查)
 * @Author: Heecoo
 * @Date: 2020/9/8 8:55 下午
 * @Version 1.0
 */
public interface List<E> extends Collection<E> {
    //线性表长度
    int size();

   //列表判空
    boolean isEmpty();

    //迭代器
    @NotNull
    Iterator<E> iterator();

    //列表默认长度
    static final int DEFAULT_LIST_CAPACITY = 10;

    //定义一个数组
    Object[] o = {};

    //添加一个元素
    boolean add(E e);

    //查询一个元素
    E get(int index);

    //删除一个元素
    E remove(int index);

    //修改某个元素
    E set(int index,E e);

    //等值比较
    boolean equal(E e);

    //hash
    int hashCode();
}
