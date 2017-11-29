package Caesar;



import javax.swing.JOptionPane;

public class BeginHere {
	private static Object[] choices = {"Encode","Decode","Crack","Exit"};
	private static Boolean playAgain = true;
	private static Object[] YesOrNo = {"Yes","No"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (playAgain) {
		CaesarCipher myCipher = new CaesarCipher();
		String choice = (String)JOptionPane.showInputDialog(null, "What can I do for you?", null, JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
		
		//Encode Start
		
		if(choice.equals("Encode")){	
			String plainText = JOptionPane.showInputDialog(null, "Please enter the plain text to encode");
			int key = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a key: "));
			
		
			String codedText = CaesarCipher.encode(plainText, key);
			JOptionPane.showMessageDialog(null, "Your secret message is " +codedText);
			
			 int answer = JOptionPane.showOptionDialog(null, "Do you want to play again?", null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,YesOrNo , "Yes");
			 if(answer == 1){
				 playAgain = false;
				 JOptionPane.showMessageDialog(null, "Thank you for playing");
			 }
	}
		//Decode Start
		
		if(choice.equals("Decode")){
			String plainText = JOptionPane.showInputDialog(null, "Please enter the plain text to decode");
			int key = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a key: "));
			String codedText = CaesarCipher.decode(plainText, key);
			JOptionPane.showMessageDialog(null, codedText);
			int answer = JOptionPane.showOptionDialog(null, "Do you want to play again?", null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,YesOrNo , "Yes");
			 if(answer == 1){
				 playAgain = false;
				 JOptionPane.showMessageDialog(null, "Thank you for playing");
			 }	
		}
		}
}
}