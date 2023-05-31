import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class circleMenu {
    private JPanel circlePanel;
    private JTextField radiusField;
    private JButton hitungLuasLingkaran1Button;
    private JButton hitungLuasLingkaranHalfButton;
    private JButton hitungLuasLinkaranQuarterButton;
    private JTextPane RumusField;
    private JButton hitungKelilingLingkaranButton;
    private JButton confirmRadiusButton;
    private JTextField hasilField;

    private double radius;

    public void toggleKalkulasiBtn(boolean action){
        hitungLuasLingkaran1Button.setEnabled(action);
        hitungLuasLingkaranHalfButton.setEnabled(action);
        hitungLuasLinkaranQuarterButton.setEnabled(action);
        hitungKelilingLingkaranButton.setEnabled(action);
    }

    public circleMenu() {

    Circle circle = new Circle();
    hitungLuasLingkaran1Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String hasil = Double.toString(circle.calculate_circle_area());
            hasilField.setText(hasil + " cm");
            RumusField.setText("PI * r * r \n"
                    + circle.get_pi()+ " + "
                    + circle.get_radius() + " + "
                    + circle.get_radius()
            );
        }
    });

    confirmRadiusButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double radius = Double.parseDouble(radiusField.getText());
                circle.set_radius(radius);
                RumusField.setText("radius berhasil di input : " + circle.get_radius());
                toggleKalkulasiBtn(true);
            } catch(NumberFormatException error) {
                RumusField.setText("Input Salah, Tolong masukan angka ");
                toggleKalkulasiBtn(false);
            }




        }
    });

        hitungLuasLingkaranHalfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String hasil = Double.toString(circle.calculate_circle_half());
                hasilField.setText(hasil + " cm");
                RumusField.setText("PI * r * r / 0.5 \n"
                        + circle.get_pi()+ " + "
                        + circle.get_radius() + " + "
                        + circle.get_radius() + " / 0.5 "
                );
            }
        });
        hitungLuasLinkaranQuarterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hasil = Double.toString(circle.calculate_circle_quarter());
                hasilField.setText(hasil + " cm");
                RumusField.setText("PI * r * r / 0.25 \n"
                        + circle.get_pi()+ " + "
                        + circle.get_radius() + " + "
                        + circle.get_radius() + " / 0.25 "
                );
            }
        });
        hitungKelilingLingkaranButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hasil = Double.toString(circle.calculate_circle_around());
                hasilField.setText(hasil + " cm");
                RumusField.setText("2 * PI * r \n"
                        + "2 * "
                        + circle.get_pi() + " + "
                        + circle.get_radius()
                );
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Circle Calculator");

        frame.setContentPane(new circleMenu().circlePanel); // main panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize( 450, 370);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

    }
}
