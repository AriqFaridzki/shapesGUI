import javax.swing.JOptionPane;
public class Gui {

    public String get_name(){
        return JOptionPane.showInputDialog("Hello, Please Enter Your Name");
    }
    public void show_name (String names){
        String result = "Hello " + names + " !";
        JOptionPane.showMessageDialog(null, result);

    }
}
