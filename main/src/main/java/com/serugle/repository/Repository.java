package com.serugle.repository;

import com.serugle.model.ElementModel;

import java.util.ArrayList;
import java.util.Optional;

public class Repository implements RepositoryInterface {
    private ArrayList<ElementModel> elements;

    public Repository() {
        this.clear();
    }

    public Optional<ElementModel> find(String username) {
        return this.elements.stream()
                .filter(element -> element.getUsername().equals(username))
                .findFirst();
    }

    public ArrayList<ElementModel> all() {
        return this.elements;
    }

    public void edit(String username, String phoneNumber) {
        ElementModel element = this.elements.stream().filter(elementF -> elementF.getUsername().equals(username)).findFirst().orElseThrow();
        int index = this.elements.indexOf(element);
        this.elements.set(index, new ElementModel(username, phoneNumber));
    }

    public void add(String username, String phoneNumber) {
        this.elements.add(new ElementModel(username, phoneNumber));
    }

    public void delete(String username) {
        this.elements.removeIf(element -> element.getUsername().equals(username));
    }

    public void clear() {
        this.elements = new ArrayList<ElementModel>();
    }
}
