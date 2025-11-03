package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<>(maxSize);
    }

    public T add(T item){
        if (items.size() < this.maxSize) {
            items.add(item);
        } else {
            System.out.println("The List is currently full");
        }
        return null;
    }

    public List<T> getItems() {
        return items;
    }
}
