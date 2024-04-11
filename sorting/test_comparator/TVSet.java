package sorting.test_comparator;

public class TVSet{
    private int diagonale;
    private String title;

    public TVSet(int diagonale, String title) {
        this.diagonale = diagonale;
        this.title = title;
    }

    public int getDiagonale() {
        return diagonale;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "diagonale=" + diagonale +
                ", title='" + title + '\'' +
                '}';
    }
}
