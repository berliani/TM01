
import javax.swing.*;

public class GUI extends JFrame {
    private JTextField totaldata;
    private JTextField hargatertinggi;
    private JButton CLOSE;
    private JButton SUBMIT;
    private JPanel panelmain;

    public GUI() {
        this.setContentPane(panelmain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        totaldata = new JTextField(10);
        hargatertinggi = new JTextField(10);
        SUBMIT = new JButton("SUBMIT");

        JPanel contenpane = new JPanel();
        contenpane.add(new JLabel("Harga dibawah 2000 : "));
        contenpane.add(totaldata);
        contenpane.add(hargatertinggi);
        contenpane.add(SUBMIT);
        contenpane.add(CLOSE);
        setGlassPane(contenpane);

    }
    public static void main(String[] args) {
                GUI mainscreen = new GUI();
                mainscreen.setVisible(true);
            }
        }


// maaf pak saya masih bingung gimana cara masukkin codingan ini ke GUI-nya