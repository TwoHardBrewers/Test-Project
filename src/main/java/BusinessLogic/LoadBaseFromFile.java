package BusinessLogic;

import Model.DataBase;
import Model.ModelOfPrinter;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Raccoon on 24.08.2016.
 */
public class LoadBaseFromFile implements IInputBase {

    @Override
    public ArrayList<ModelOfPrinter> loadBase(DataBase dataBase, String path) {
        InputStream inputStream = null;
        ArrayList<ModelOfPrinter> result;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
