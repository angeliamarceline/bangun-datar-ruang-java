package bangunRuang;

import bangunDatar.Square;

public class Cube extends Square {
    

    public double getCubeVolume() {
        double cubeVolume;
        cubeVolume = getSquareArea() * getSide();
        return cubeVolume;
    }
}
