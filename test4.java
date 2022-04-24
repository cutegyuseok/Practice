import javax.swing.JOptionPane;
import javax.swing.*;
public class test4 {
	public static void main(String[] args) {
		double[] gear =new double[6];
		JFrame jFrame = new JFrame();
		JOptionPane.showMessageDialog(jFrame, "You can use it putting your honing LV in console. "
				+ "\n Put your normal equitment LV same as yours  ex)15->15 "
				+ "\n Put 1 infront of your Abrelshud equitment LV ex)15->115"
				+ "\n Put your Esther weapon LV ex)6->206");
		String helmetLevel = JOptionPane.showInputDialog("Enter Your Helmet ItemLevel");
		String shoulderLevel = JOptionPane.showInputDialog("Enter Your Shoulder ItemLevel");
		String topLevel = JOptionPane.showInputDialog("Enter Your top ItemLevel");
		String bottomLevel = JOptionPane.showInputDialog("Enter Your bottom ItemLevel");
		String gloveLevel = JOptionPane.showInputDialog("Enter Your glove ItemLevel");
		String weaponlevel = JOptionPane.showInputDialog("Enter Your weapon ItemLevel");
		gear[0] = Double.parseDouble(helmetLevel);
		gear[1] = Double.parseDouble(shoulderLevel);
		gear[2] = Double.parseDouble(topLevel);
		gear[3] = Double.parseDouble(bottomLevel);
		gear[4] = Double.parseDouble(gloveLevel);
		gear[5] = Double.parseDouble(weaponlevel);

		convert(gear);
		double Itlv = calculate(gear);
		double ItLv = Math.round(Itlv * 100) / 100.0;

		JFrame Frame = new JFrame();
		JOptionPane.showMessageDialog(Frame, "your item Level is "+ ItLv);
		}

	private static double calculate(double[] gear) {
		double Itlv = ((gear[0] + gear[1] + gear[2] + gear[3] + gear[4] + gear[5])/6);
		return Itlv;
	}

	private static void convert(double[] gear) {
		int i = 0;
		while(i<gear.length) {	
		if(gear[i]<100) { 
			gear[i] = (1190 + (gear[i]*15) );
		} 
		else if(200>gear[i] && gear[i]>120) {
			gear[i] = (1590+(gear[i]-120)*5);
			}
		else if(gear[i]>200) {
			gear[i] = (1565+(gear[i]-200)*10);
		}
		else{
			gear[i] = (1390+((gear[i]-100)*10));
		}
		i=i+1;
		}
	}
}
