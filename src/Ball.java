import java.lang.Math;
public class Ball extends Circle {

    Circle lingkaran = new Circle();

    public double calculate_ball_area(){
       return 4 * lingkaran.calculate_circle_area();
    }

    public double calculate_ball_volume(){
        return Math.round(1.33333 * lingkaran.get_pi() * calculate_radius_cubed(lingkaran.get_radius()));
    }

    public double calculate_radius_cubed(double radius){
        return radius * radius * radius;
    }

    public void print_ball_volume(){
        System.out.println("Volume dari bola adalah : " + calculate_ball_volume());
    }

    public void print_ball_area(){
        System.out.println("Luas Dari Bola Adalah : " + calculate_ball_area());
    }
}
