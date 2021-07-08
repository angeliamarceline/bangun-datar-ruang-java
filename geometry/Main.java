import java.util.Scanner;

import bangunDatar.Triangle;
import bangunDatar.Circle;
import bangunDatar.Square;
import bangunRuang.Prism;
import bangunRuang.Sphere;
import bangunRuang.Cube;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();
        Prism prism = new Prism();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();

        int menu = 0;
        int menuTriangle = 0;
        int menuCircle = 0;
        int menuSquare = 0;
        int menuPrism = 0;
        int menuSphere = 0;
        int menuCube = 0;

        // Add variabel and Scanner
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Geometry - Bangun Datar & Bangun Ruang");
            System.out.println("======================================");
            System.out.println("1. Triangle - Segitiga 90°");
            System.out.println("2. Circle - Lingkaran");
            System.out.println("3. Square - Persegi");
            System.out.println("4. Prism - Prisma Segitiga 90°");
            System.out.println("5. Sphere - Bola");
            System.out.println("6. Cube - Kubus");
            System.out.println("7. Exit - Keluar");

            // mengambil input
            System.out.print("Input [ 1 | 2 | 3 | 4 | 5 | 6 | 7 ] : ");
            menu = scan.nextInt();

            // Clear console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (menu) {
                case 1:
                    do {
                        System.out.println("Triangle - Segitiga 90°");
                        System.out.println("========================");
                        System.out.println("1. Calculation - Luas & Keliling");
                        System.out.println("2. Details");
                        System.out.println("3. Back");
                        System.out.print("Input [ 1 | 2 | 3 ] : ");
                        menuTriangle = scan.nextInt();

                        System.out.println("\n");

                        switch (menuTriangle) {
                            case 1:
                                System.out.println("Triangle - Segitiga 90°");
                                System.out.println("=======================");
                                System.out.print("Input Base - Alas : ");
                                double base = scan.nextDouble();
                                System.out.print("Input Height - Tinggi : ");
                                double height = scan.nextDouble();

                                triangle.setBase(base);
                                triangle.setHeight(height);

                                System.out.println("\n");
                                System.out.println("Calculation - Hasil Perhitungan");
                                System.out.println("===============================");
                                System.out.println(
                                        "Area of Triangle - Luas Segitiga :" + " " + triangle.getTriangleArea());
                                System.out.println("Perimeter of Triangle - Keliling Segitiga :" + " "
                                        + triangle.getTrianglePerimeter());
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("==========Segitiga Siku-Siku==========");
                                System.out.println(
                                        "Segitiga siku-siku merupakan segitiga yang di bagian salah satu sudutnya adalah sudut siku-siku dengan besar 90 derajat.");
                                System.out.println("Luas = ½ × alas × tinggi");
                                System.out.println("Keliling = alas + tinggi + sisi miring");
                                System.out.println("\n");
                                break;
                            case 3:
                                // Clear console
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                break;
                        }
                    } while (menuTriangle != 3);
                    break;
                case 2:
                    do {
                        System.out.println("Circle - Lingkaran");
                        System.out.println("========================");
                        System.out.println("1. Calculation - Luas & Keliling");
                        System.out.println("2. Details");
                        System.out.println("3. Back");
                        System.out.print("Input [ 1 | 2 | 3 ] : ");
                        menuCircle = scan.nextInt();

                        System.out.println("\n");

                        switch (menuCircle) {
                            case 1:
                                System.out.println("Circle - Lingkaran");
                                System.out.println("==================");
                                System.out.print("Input Radius - Jari-Jari Lingkaran : ");
                                double radius = scan.nextDouble();

                                circle.setRadius(radius);

                                System.out.println("\n");
                                System.out.println("Calculation - Hasil Perhitungan");
                                System.out.println("===============================");
                                System.out.println("Area of Circle - Luas Lingkaran :" + " " + circle.getCircleArea());
                                System.out.println("Circumference  - Keliling Lingkaran :" + " "
                                        + circle.getCircleCircumference());
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("==========Lingkaran==========");
                                System.out.println(
                                        "Lingkaran adalah kumpulan titik-titik yang membentuk lengkungan tertutup, dimana titik-titik pada lengkungan tersebut berjarak sama terhadap titik pusat.");
                                System.out.println("Luas = π x radius x radius");
                                System.out.println("Keliling = 2 x π x radius");
                                System.out.println("\n");
                                break;
                            case 3:
                                // Clear console
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                break;
                        }
                    } while (menuCircle != 3);
                    break;
                case 3:
                    do {
                        System.out.println("Square - Persegi");
                        System.out.println("========================");
                        System.out.println("1. Calculation - Luas & Keliling");
                        System.out.println("2. Details");
                        System.out.println("3. Back");
                        System.out.print("Input [ 1 | 2 | 3 ] : ");
                        menuSquare = scan.nextInt();

                        System.out.println("\n");

                        switch (menuSquare) {
                            case 1:
                                System.out.println("Square - Persegi");
                                System.out.println("=======================");
                                System.out.print("Input Side - Sisi Persegi : ");
                                double side = scan.nextDouble();

                                square.setSide(side);

                                System.out.println("\n");
                                System.out.println("Calculation - Hasil Perhitungan");
                                System.out.println("===============================");
                                System.out.println("Area of Square - Luas Persegi :" + " " + square.getSquareArea());
                                System.out.println(
                                        "Perimeter of Square - Keliling Persegi :" + " " + square.getSquarePerimeter());
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("==========Persegi==========");
                                System.out.println(
                                        "Persegi adalah bangun segi empat yang memiliki empat sisi sama panjang dan empat sudut siku-siku.");
                                System.out.println("Luas = sisi x sisi");
                                System.out.println("Keliling = 4 x sisi");
                                System.out.println("\n");
                                break;
                            case 3:
                                // Clear console
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                break;
                        }
                    } while (menuSquare != 3);
                    break;
                case 4:
                    do {
                        System.out.println("Prism - Prisma Segitiga 90°");
                        System.out.println("========================");
                        System.out.println("1. Calculation - Volume");
                        System.out.println("2. Details");
                        System.out.println("3. Back");
                        System.out.print("Input [ 1 | 2 | 3 ] : ");
                        menuPrism = scan.nextInt();

                        System.out.println("\n");

                        switch (menuPrism) {
                            case 1:
                                System.out.println("Prism - Prisma Segitiga 90°");
                                System.out.println("===========================");
                                System.out.print("Input Base - Alas Segitiga Alas : ");
                                double triangleBase = scan.nextDouble();
                                System.out.print("Input Height - Tinggi Segitiga Alas : ");
                                double triangleHeight = scan.nextDouble();
                                System.out.print("Input Prism Height - Tinggi Prisma : ");
                                Double prismHeight = scan.nextDouble();

                                prism.setBase(triangleBase);
                                prism.setHeight(triangleHeight);
                                prism.setPrismHeight(prismHeight);

                                System.out.println("\n");
                                System.out.println("Calculation - Hasil Perhitungan");
                                System.out.println("===============================");
                                System.out.println("Volume of Prism :" + " " + prism.getPrismVolume());
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("==========Prisma Segitiga 90°==========");
                                System.out.println(
                                        "Prisma segitiga siku-siku adalah bangun ruang yang mempunyai alas berbentuk segitiga siku-siku");
                                System.out.println("Volume = luas alas x tinggi");
                                System.out.println("\n");
                                break;
                            case 3:
                                // Clear console
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                break;
                        }
                    } while (menuPrism != 3);
                    break;
                case 5:
                    do {
                        System.out.println("Sphere - Bola");
                        System.out.println("========================");
                        System.out.println("1. Calculation - Volume");
                        System.out.println("2. Details");
                        System.out.println("3. Back");
                        System.out.print("Input [ 1 | 2 | 3 ] : ");
                        menuSphere = scan.nextInt();

                        System.out.println("\n");

                        switch (menuSphere) {
                            case 1:
                                System.out.println("Sphere - Bola");
                                System.out.println("=============");
                                System.out.print("Input Radius - Jari-Jari Bola : ");
                                double sphereRadius = scan.nextDouble();

                                sphere.setRadius(sphereRadius);

                                System.out.println("\n");
                                System.out.println("Calculation - Hasil Perhitungan");
                                System.out.println("===============================");
                                System.out.println("Volume of Sphere :" + " " + sphere.getSphereVolume());
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("==========Bola==========");
                                System.out.println(
                                        "Bola adalah bangun ruang tiga dimensi yang dibentuk oleh tak hingga lingkaran berjari-jari sama panjang dan berpusat pada satu titik yang sama.");
                                System.out.println("Volume = 4/3 x π x radius x radius x radius");
                                System.out.println("\n");
                                break;
                            case 3:
                                // Clear console
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                break;
                        }
                    } while (menuSphere != 3);
                    break;
                case 6:
                    do {
                        System.out.println("Cube - Kubus");
                        System.out.println("========================");
                        System.out.println("1. Calculation - Volume");
                        System.out.println("2. Details");
                        System.out.println("3. Back");
                        System.out.print("Input [ 1 | 2 | 3 ] : ");
                        menuCube = scan.nextInt();

                        System.out.println("\n");

                        switch (menuCube) {
                            case 1:
                                System.out.println("Cube - Kubus");
                                System.out.println("===============");
                                System.out.print("Input Side - Sisi Kubus : ");
                                double cubeSide = scan.nextDouble();

                                cube.setSide(cubeSide);
                                System.out.println("\n");
                                System.out.println("Calculation - Hasil Perhitungan");
                                System.out.println("===============================");
                                System.out.println("Volume of Cube :" + " " + cube.getCubeVolume());
                                System.out.println("\n");
                                break;
                            case 2:
                                System.out.println("==========Kubus==========");
                                System.out.println(
                                        "Kubus adalah bangun ruang yang dibatasi oleh enam sisi yang berbentuk persegi.");
                                System.out.println("Volume = sisi x sisi x sisi");
                                System.out.println("\n");
                                break;
                            case 3:
                                // Clear console
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                break;
                        }
                    } while (menuCube != 3);
                    break;
                case 7:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
            }

        } while (menu != 7);

        scan.close();

    }

}
