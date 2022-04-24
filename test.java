import javax.swing.JOptionPane;
import javax.swing.*;
public class test {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JOptionPane.showMessageDialog(jFrame, "you can use it putting your honing LV in console. "
				+ "\n put your normal equitment LV same as yours  ex)15->15 "
				+ "\n put 1 infront of your Abrelshud equitment LV ex)15->115");
		String helmetLevel = JOptionPane.showInputDialog("Enter Your Helmet ItemLevel");
		String shoulderLevel = JOptionPane.showInputDialog("Enter Your Shoulder ItemLevel");
		String topLevel = JOptionPane.showInputDialog("Enter Your top ItemLevel");
		String bottomLevel = JOptionPane.showInputDialog("Enter Your bottom ItemLevel");
		String gloveLevel = JOptionPane.showInputDialog("Enter Your glove ItemLevel");
		String weaponlevel = JOptionPane.showInputDialog("Enter Your weapon ItemLevel");
		double gear1 = Double.parseDouble(helmetLevel);
		double gear2 = Double.parseDouble(shoulderLevel);
		double gear3 = Double.parseDouble(topLevel);
		double gear4 = Double.parseDouble(bottomLevel);
		double gear5 = Double.parseDouble(gloveLevel);
		double gear6 = Double.parseDouble(weaponlevel);

		if(gear1<100) { 
			gear1 = (1190 + (gear1*15) );
		} 
		else {
			gear1 = (1390+((gear1-100)*10));
		}
		if(gear2<100) { 
			gear2 = (1190 + (gear2*15) );
		} 
		else {
			gear2 = (1390+((gear2-100)*10));
		}
		if(gear3<100) { 
			gear3 = (1190 + (gear3*15) );
		} 
		else {
			gear3 = (1390+((gear3-100)*10));
		}
		if(gear4<100) { 
			gear4 = (1190 + (gear4*15) );
		} 
		else {
			gear4 = (1390+((gear4-100)*10));
		}
		if(gear5<100) { 
			gear5 = (1190 + (gear5*15) );
		} 
		else {
			gear5 = (1390+((gear5-100)*10));
		}
		if(gear6<100) { 
			gear6 = (1190 + (gear6*15) );
		} 
		else {
			gear6 = (1390+((gear6-100)*10));
		}
		
		
		double Itlv = ((gear1 + gear2 + gear3 + gear4 + gear5 + gear6)/6);
		
		JFrame Frame = new JFrame();
		JOptionPane.showMessageDialog(Frame, "your item Level is "+ Itlv);
		

	}

}
