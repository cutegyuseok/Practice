import javax.swing.JOptionPane;


public class ItemLevelCalculatorApp {

	public static void main(String[] args) {
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
		
		double gears1 = 0;
		double gears2 = 0;
		double gears3 = 0;
		double gears4 = 0;
		double gears5 = 0;
		double gears6 = 0;
		
		if(gear1<100) { 
			gears1 = (1190 + (gear1*15) );
		} 
		else {
			gears1 = (1390+((gear1-100)*10));
		}
		if(gear2<100) { 
			gears2 = (1190 + (gear2*15) );
		} 
		else {
			gears2 = (1390+((gear2-100)*10));
		}
		if(gear3<100) { 
			gears3 = (1190 + (gear3*15) );
		} 
		else {
			gears3 = (1390+((gear3-100)*10));
		}
		if(gear4<100) { 
			gears4 = (1190 + (gear4*15) );
		} 
		else {
			gears4 = (1390+((gear4-100)*10));
		}
		if(gear5<100) { 
			gears5 = (1190 + (gear5*15) );
		} 
		else {
			gears5 = (1390+((gear5-100)*10));
		}
		if(gear6<100) { 
			gears6 = (1190 + (gear6*15) );
		} 
		else {
			gears6 = (1390+((gear6-100)*10));
		}
		
		
		
		
		double Itlv = ((gears1 + gears2 + gears3 + gears4 + gears5 + gears6)/6);
		
		
		System.out.println("your item level is :" + Itlv);

	}

}
