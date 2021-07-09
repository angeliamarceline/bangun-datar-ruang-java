package bangunRuang;

import bangunDatar.Triangle;

public class Prism extends Triangle{
    //Attribute
    private double prismHeight;
    
    //Getter Setter
    public double getPrismHeight() {
        return prismHeight;
    }

    public void setPrismHeight(double prismHeight) {
        this.prismHeight = prismHeight;
    }

    public Prism() {
    }

    public Prism(double prismHeight) {
        this.prismHeight = prismHeight;
    }

    public double getPrismVolume(){
        double prismVolume;
        prismVolume = prismHeight * getTriangleArea();
        return prismVolume;
    }
    
}
