package com.artisan.designpattern.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CustomerIterator<T> implements Iterator<T> {
    private List<T> list;
    private int position;

    public CustomerIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action);
    }

    @Override
    public boolean hasNext() {
        int tmpPosition = position;
        if (tmpPosition < list.size()) {
             return true;
        }
        return false;
    }

    @Override
    public T next() {
        int tmpPosition = this.position;
        if (tmpPosition < list.size()) {
            T item = list.get(tmpPosition);
            this.position = this.position +2;
            return item;
        }
        return null;
    }
}
