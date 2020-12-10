package by.epam.task02.electronics.controllers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SetDataBaseTest {

    private final static String path = "E:\\new_doc\\Java\\JavaWebDeveloper\\ElectronicsFactory\\src\\by\\epam\\task02\\electronics\\controllers\\";
    private final static String file="appliances_db.txt";

    DataReadFromFile readFromFile=new DataReadFromFile(path,file);
    SetDataBase A =new SetDataBase(readFromFile);
}