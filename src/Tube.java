
import java.util.Scanner;

public class Tube extends Circle{
    Scanner input = new Scanner(System.in);
    Circle lingkaran = new Circle();


    public double get_tube_height(){
        System.out.print("Masukan Tinggi Tabung (cm) : ");
        return input.nextInt();
    }

    public double calculate_tube_volume(){
        return lingkaran.calculate_circle_area() * get_tube_height();
    }

    public void print_tube_volume(){
        System.out.println("Volume Tabung Adalah : " + calculate_tube_volume());
    }

}
