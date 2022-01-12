package org.example.Task2;

import java.util.ArrayList;
import java.util.List;

public class CatsList {
    private List<Cat> cats = new ArrayList<>();

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return cats.toString();
    }
}
