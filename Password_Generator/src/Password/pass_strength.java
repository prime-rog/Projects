package Password;

import javax.swing.JLabel;

public class pass_strength {
	boolean UC;
	boolean LC;
	boolean SC;
	boolean NC;
	String S;
	int count =0;
	public pass_strength(String s, JLabel lblNewLabel_11)
	{
		for(int i =0 ; i < s.length() ; i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				UC = true;
			else if(Character.isLowerCase(s.charAt(i)))
				LC = true;
			else if(Character.isDigit(s.charAt(i)))
				NC = true;
			else
				SC = true;
				
		}
		
		if(UC==true)
			count +=10;
		if(LC==true)
			count +=10;
		if(NC==true)
			count +=10;
		if(SC==true)
			count +=10;
		
		if(count ==40 || s.length()>=16)
			s= "Strong";
		else if(count == 30 || s.length()>=8)
			s= "Good";
		else if(count == 20 || s.length()>=4)
			s= "Medium";
		else if(count == 10 || s.length()>=2)
			s= "Weak";
		else
			s="Don't Joke";
		
		lblNewLabel_11.setText(s);
		
		
	}
}
