package com.serugle;

import com.serugle.repository.ScannerRepository;

public class Handler {
    public ScannerRepository scannerRepository;

    public Handler() {
        scannerRepository = new ScannerRepository();
    }

    public void run(){
        String command;
        label:
        while (true){
            System.out.print("Command (find, all, edit, add, delete, clear, stop): ");
            command = this.scannerRepository.scanner.nextLine();
            switch (command) {
                case "find":
                    this.scannerRepository.find();
                    break;
                case "all":
                    this.scannerRepository.all();
                    break;
                case "edit":
                    this.scannerRepository.edit();
                    break;
                case "add":
                    this.scannerRepository.add();
                    break;
                case "delete":
                    this.scannerRepository.delete();
                    break;
                case "clear":
                    this.scannerRepository.clear();
                    break;
                case "stop":
                    break label;
            }
        }
        this.scannerRepository.scanner.close();
    }
}
