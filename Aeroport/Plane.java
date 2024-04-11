package Aeroport;

public class Plane {
    String label;
    String id;
    public Plane(String label, String id) {
        this.label = label;
        this.id = id;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getID() {
        return id;
    }
    public void setID(String id) {     this.id = id;    }
    @Override
    public String toString() {
        return "Самолёт "  + label + " №" + id;
    }
}
