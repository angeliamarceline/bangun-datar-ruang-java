import java.util.Scanner;

import bangunDatar.Triangle;
import bangunDatar.Circle;
import bangunDatar.Square;
import bangunRuang.Prism;
import bangunRuang.Sphere;
import bangunRuang.Cube;

public class MainApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();
        Prism prism = new Prism();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();

        int menu = 0;

        // Add variabel dan Scanner
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Geometry - Bangun Datar & Bangun Ruang");
            System.out.println("======================================");
            System.out.println("1. Triangle - Segitiga 90°");
            System.out.println("2. Circle - Lingkaran");
            System.out.println("3. Square - Persegi");
            System.out.println("4. Prism - Prisma");
            System.out.println("5. Sphere - Bola");
            System.out.println("6. Cube - Kubus");
            System.out.println("7. Exit - Keluar");

            // mengambil input
            System.out.print("Input [ 1 | 2 | 3 | 4 | 5 | 6 | 7 ] : ");
            menu = scan.nextInt();

            System.out.println("\n");

            switch (menu) {
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
                    System.out.println("Area of Triangle - Luas Segitiga :" + " " + triangle.getTriangleArea());
                    System.out.println(
                            "Perimeter of Triangle - Keliling Segitiga :" + " " + triangle.getTrianglePerimeter());
                    System.out.println("\n");
                    continue;
                case 2:
                    System.out.println("Circle - Lingkaran");
                    System.out.println("==================");
                    System.out.print("Input Radius - Jari-Jari Lingkaran : ");
                    double radius = scan.nextDouble();

                    circle.setRadius(radius);

                    System.out.println("\n");
                    System.out.println("Calculation - Hasil Perhitungan");
                    System.out.println("===============================");
                    System.out.println("Area of Circle - Luas Lingkaran :" + " " + circle.getCircleArea());
                    System.out.println("Circumference  - Keliling Lingkaran :" + " " + circle.getCircleCircumference());
                    System.out.println("\n");
                    continue;
                case 3:
                    System.out.println("Square - Persegi");
                    System.out.println("=======================");
                    System.out.print("Input Side - Sisi Persegi : ");
                    double side = scan.nextDouble();

                    square.setSide(side);

                    System.out.println("\n");
                    System.out.println("Calculation - Hasil Perhitungan");
                    System.out.println("===============================");
                    System.out.println("Area of Square - Luas Persegi :" + " " + square.getSquareArea());
                    System.out.println("Perimeter of Square - Keliling Persegi :" + " " + square.getSquarePerimeter());
                    System.out.println("\n");
                    continue;
                case 4:
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
                    continue;
                case 5:
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
                    continue;
                case 6:
                    System.out.println("Square - Kubus");
                    System.out.println("===============");
                    System.out.print("Input Side - Sisi Kubus : ");
                    double cubeSide = scan.nextDouble();

                    cube.setSide(cubeSide);
                    System.out.println("\n");
                    System.out.println("Calculation - Hasil Perhitungan");
                    System.out.println("===============================");
                    System.out.println("Volume of Cube :" + " " + cube.getCubeVolume());
                    System.out.println("\n");
                    continue;
                case 7:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
            }

        } while (menu != 7);

        scan.close();

    }

}
