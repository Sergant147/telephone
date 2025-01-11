package com.serugle.repository;

import com.serugle.model.ElementModel;

import java.util.Optional;
import java.util.Scanner;

public class ScannerRepository {
    private Repository repository;
    public Scanner scanner;

    public ScannerRepository() {
        this.repository = new Repository();
        this.scanner = new Scanner(System.in);
    }

    public void find() {
        System.out.print("Username: ");
        String username = this.scanner.nextLine();
        Optional<ElementModel> out = this.repository.find(username);
        if (out.get() != null) {
            System.out.println(out.get().getPhoneNumber());
        }
    }

    public void all() {
        for (ElementModel element : repository.all()) {
            System.out.print(element.getUsername());
            System.out.print(" is ");
            System.out.print(element.getPhoneNumber());
            System.out.println();
        }
    }

    public void edit() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        this.repository.edit(username, phone);
    }

    public void add() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        this.repository.add(username, phone);
    }

    public void delete() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        this.repository.delete(username);
    }

    public void clear() {
        this.repository.clear();
    }
}
