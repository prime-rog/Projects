package Password;

import javax.swing.JLabel;

public class Generate_pass {
	String s ;
	String AlphaNumericString; 
	public Generate_pass(boolean UC , boolean LC , boolean SC , boolean NC, JLabel lblNewLabel_11 )
	{
     
		if(UC == true)
			AlphaNumericString = AlphaNumericString+"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if(LC == true)
			AlphaNumericString = AlphaNumericString+"abcdefghijklmnopqrstuvxyz";
		if(NC == true)
			AlphaNumericString = AlphaNumericString+"0123456789";
		if(SC == true)
			AlphaNumericString = AlphaNumericString+"[]}{*&%$#@!?";
		 StringBuilder sb = new StringBuilder(16);
		 for (int i = 0; i < 16; i++) {
			 
			   // generate a random number between
			   // 0 to AlphaNumericString variable length
			   int index
			    = (int)(AlphaNumericString.length()
			      * Math.random());
			 
			   // add Character one by one in end of sb
			   sb.append(AlphaNumericString
			      .charAt(index));
			  }
		 s = sb.toString();
		 lblNewLabel_11.setText(s);
		 
	}

}
