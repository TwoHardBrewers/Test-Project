package Model;

/**
 * Created by Raccoon on 22.08.2016.
 */
public class ModelOfPrinter {
    private String name;
    private int count;

    public ModelOfPrinter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {

        return name;
    }

    public int getCount() {
        return count;
    }

}
