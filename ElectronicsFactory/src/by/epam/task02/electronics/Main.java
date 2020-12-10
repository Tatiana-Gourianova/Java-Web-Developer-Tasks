package by.epam.task02.electronics;

import by.epam.task02.electronics.controllers.DataReadFromFile;
import by.epam.task02.electronics.controllers.SetDataBase;
import by.epam.task02.electronics.nomenclature.Electronics;
import by.epam.task02.electronics.nomenclature.ElectronicsType;
import by.epam.task02.electronics.nomenclature.Oven;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static class SimpleElectronicsFactory {
        public void SimpleElectronicsFactory(){ }

        public static Electronics orderElectronics(ElectronicsType type) {
            Electronics electronics = null;

            switch (type) {
                case OVEN:
                    electronics = new Oven();
                    break;
                case LAPTOP:
                    //  electronics = new Laptop();
                    break;
                case REFRIGERATOR:
                    // electronics = new Refrigerator();
                    break;

            }
          //  electronics.chooseSumsung();
            return electronics;
        }

    }

    public static class ElectronicsShop {

        private SimpleElectronicsFactory electronicsFactory;

        public ElectronicsShop(SimpleElectronicsFactory electronicsFactory) {
            this.electronicsFactory = electronicsFactory;
        }

        public Electronics orderElectronics(ElectronicsType type) {
            Electronics electronics = electronicsFactory.orderElectronics(type);
        //  electronics.chooseSumsung();
            System.out.println("That's good!");
            return electronics;
        }

    }

    public static void main(String[] args) {

   /* SetDataBaseTest.java

        String path = "E:\\new_doc\\Java\\JavaWebDeveloper\\ElectronicsFactory\\src\\by\\epam\\task02\\electronics\\controllers\\";
        String file="appliances_db.txt";

        DataReadFromFile readFromFile=new DataReadFromFile(path,file);
        SetDataBase A =new SetDataBase(readFromFile);
    */
        @SuppressWarnings("resourse")
        Scanner in = new Scanner(System.in);

        System.out.println("What do you want to order: \n 1 OVEN  \n 2 LAPTOP \n 3 REFRIGERATOR");
        int choice = in.nextInt();
        ElectronicsType choosen=ElectronicsType.OVEN;
        switch (choice) {
            case 1:
                choosen = ElectronicsType.OVEN;
                break;
            case 2:
                choosen = ElectronicsType.LAPTOP;
                break;
            case 3:
                choosen = ElectronicsType.REFRIGERATOR;
                break;
        }

        System.out.println(Arrays.toString(choosen.values()));

        System.out.println(choosen);

        SimpleElectronicsFactory A=new SimpleElectronicsFactory();
        ElectronicsShop V = new ElectronicsShop(A);

        Electronics vv;
        vv= V.orderElectronics(choosen);


    }

    }

