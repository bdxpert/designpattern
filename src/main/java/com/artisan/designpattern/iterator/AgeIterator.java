package com.artisan.designpattern.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class AgeIterator<T> implements Iterator<T>{
    private final List<T> list;
    private int position = 0;
    private Predicate<T> predicate;


    public AgeIterator(List<T> list, Predicate<T> predicate) {
        this.list = list;
        this.predicate = predicate;
        this.position = 0;
    }
    public AgeIterator(List<T> list) {
        this.list = list;
        this.predicate = null;
        this.position = 0;
    }
    public Iterator<T> iterator(){
        return this;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }


    @Override
    public boolean hasNext() {
        if(predicate !=null) {
            int tmpPosition = position;
            while (tmpPosition < list.size()) {
                T item = list.get(tmpPosition);
                if (predicate.test(item)) {
                    return Boolean.TRUE;
                } else {
                    tmpPosition++;
                }
            }
            return false;
        }
        return position < list.size();
    }

    @Override
    public T next() {
        if(predicate !=null) {
            int tmpPosition = position;
            while (tmpPosition < list.size()) {
                T item = list.get(tmpPosition);
                if (predicate.test(item)) {
                    position = tmpPosition+1;
                    return item;
                } else {
                    tmpPosition++;
                }
            }
            return null;
        }
        return list.get(position++);
    }
}
