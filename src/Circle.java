import java.lang.Math;
import java.util.Scanner;
public class Circle {

    private final double PI = 3.14159;
    public double get_pi(){
        return PI;
    }

    public double radius = 0.0;

//    public double get_radius(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan radius lingkaran (r) : ");
//
//        return input.nextInt();
//    }

    public double get_radius(){
       return this.radius;
    }

    public void set_radius(double radius){
        this.radius = radius;
    }

    public double calculate_circle_around(){
        return Math.round(2* PI * get_radius());
    }

    public double calculate_radius_squared(){
        return get_radius() * get_radius();
    }


    public double calculate_circle_area(){
        return Math.round(PI * calculate_radius_squared());
    }

    public double calculate_circle_half(){
        return Math.round(PI * calculate_radius_squared()/0.5);
    }

    public double calculate_circle_quarter(){
        return Math.round(PI * calculate_radius_squared()/0.25);
    }



    public void print_circle_area(){
        System.out.println("Luas Lingkarang Adalah : " + calculate_circle_area());
    }


}

