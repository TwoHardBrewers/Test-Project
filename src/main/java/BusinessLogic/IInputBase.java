package BusinessLogic;

import Model.DataBase;
import Model.ModelOfPrinter;

import java.util.ArrayList;

/**
 * Created by Raccoon on 24.08.2016.
 */
public interface IInputBase {
    ArrayList<ModelOfPrinter> loadBase(DataBase dataBase, String path);
}
