package BusinessLogic;

import Model.DataBase;
import Model.ModelOfPrinter;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Raccoon on 24.08.2016.
 */
public class SaveBaseIntoFile implements IOutputBase {

    @Override
    public void saveBase(DataBase dataBase, String path) {
        OutputStream outputStream = null;
        ArrayList<ModelOfPrinter> items = dataBase.getBase();

        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(path));
            for (ModelOfPrinter item : items) {
                try {
                    outputStream.write(Integer.parseInt(System.lineSeparator()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
