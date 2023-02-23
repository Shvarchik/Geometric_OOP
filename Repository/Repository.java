package Repository;

import java.util.ArrayList;

public class Repository<T> {

    protected ArrayList<T> figures;

    public Repository(ArrayList<T> figures) {
        this.figures = new ArrayList<T>();
    }

    public void add(T figure) {
        figures.add(figure);
    }

    public void remove(T figure) {
        figures.remove(figure);
    }

    public void remove(int index) {
        figures.remove(index);
    }

    public void update(int index, T figure) {
        figures.set(index, figure);
    }

    public T getFigure(int index) {
        return figures.get(index);
    }

    public int count() {
        return figures.size();
    }

}
