package com.serugle.repository;

import com.serugle.model.ElementModel;

import java.util.Optional;
import java.util.ArrayList;

public interface RepositoryInterface {
    Optional<ElementModel> find(String username);

    ArrayList<ElementModel> all();

    void edit(String username, String phoneNumber);

    void add(String username, String phoneNumber);

    void delete(String username);

    void clear();
}
