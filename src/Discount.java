import java.util.Scanner;
public class Discount {


    public  void print_price(){
        double DISCOUNT_RATE = 0.1;
        System.out.println("Barang Setelah Diskon : " +  get_discounted_price(get_price(), DISCOUNT_RATE));
    }

    public  int get_discounted_price(int price, double DISCOUNT_RATE){
        int DISCOUNT_PRICE = (int) (price * DISCOUNT_RATE);

        return price - DISCOUNT_PRICE;

    }

    public  int get_price(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Harga Barang : ");
        return input.nextInt();
    }


}
