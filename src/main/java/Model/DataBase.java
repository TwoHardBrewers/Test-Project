package Model;

import BusinessLogic.IInputBase;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Raccoon on 19.08.2016.
 */
public class DataBase {
    private static final String PATH = "base.txt";

    private ArrayList<ModelOfPrinter> modelOfPrinterArrayList;

    public DataBase() {
        modelOfPrinterArrayList = new ArrayList<ModelOfPrinter>();
    }

    public void addModel(ModelOfPrinter modelOfPrinter) {
        modelOfPrinterArrayList.add(modelOfPrinter);
    }

    public void delModel(ModelOfPrinter modelOfPrinter) {
        modelOfPrinterArrayList.remove(modelOfPrinter);
    }

    public ArrayList<ModelOfPrinter> getBase() {
        return modelOfPrinterArrayList;
    }

    public void loadBase(IInputBase input) {
        modelOfPrinterArrayList = input.loadBase(this, PATH);
    }

//    public ArrayList<ModelOfPrinter> loadFromFile() {
//        try {
//            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(PATH));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        ArrayList<ModelOfPrinter> result;
//
//    }
}
