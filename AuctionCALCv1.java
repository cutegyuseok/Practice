import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AuctionCALCv1 {

	public static void main(String[] args) {
		String Num = JOptionPane.showInputDialog("Enter Number of people");
		String Price = JOptionPane.showInputDialog("Enter price");
		int Num1 =  Integer.parseInt(Num);
		int Price1= Integer.parseInt(Price);
		
		double BEp = (((Price1-(Price1*0.05))/Num1)*(Num1-1));
		double Dividend1 = ((Price1-(Price1*0.05))/Num1);
		double Best = (BEp/1.1);
		double Dividend2 = (Best/(Num1-1));
		double Earn= ((Price1-(Price1*0.05))-Best);
		//소수점자리 안보이게 하기
		int BEP = (int) Math.round(BEp);
		int DIvidend1 = (int) Math.round(Dividend1);
		int BEst = (int) Math.round(Best);
		int DIvidend2 = (int) Math.round(Dividend2);
		int EArn = (int) Math.round(Earn);
		
		JFrame Frame = new JFrame();
		JOptionPane.showMessageDialog(Frame, "가격:"+Price1+"          "+ Num1+"명"
				+ "\n손익분기점:"+BEP+"  분배금:"+DIvidend1+"."
						+ "\n추천가격:"+ BEst +"  분배금:"+DIvidend2+"  이익:"+EArn);
		

		
	}
}

