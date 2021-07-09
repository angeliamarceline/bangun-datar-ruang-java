package bangunRuang;

import bangunDatar.Circle;

public class Sphere extends Circle{

    public Sphere() {
    }

    public double getSphereVolume() {
        double sphereVolume;
        sphereVolume = 1.33333333333 * getCircleArea() * getRadius();
        return sphereVolume;
    }

}
