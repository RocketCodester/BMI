/*
   10/14/14
   JDK 1.7
   Calculate BMI using a function
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class BMI {
    public static void main(String[] args) {
       String input=JOptionPane.showInputDialog(null,"enter your height in inches");
       double h = Double.parseDouble(input);
       input=JOptionPane.showInputDialog(null,"enter your weight in lbs");
       double w = Double.parseDouble(input);
       DecimalFormat pattern = new DecimalFormat("0.#");
       JOptionPane.showMessageDialog(null,"BMI:" +
               pattern.format(calculateBMI(w, h)));
    }
    public static double calculateBMI(double weight, double height){
       return (weight*703)/(height*height);
    }
}
