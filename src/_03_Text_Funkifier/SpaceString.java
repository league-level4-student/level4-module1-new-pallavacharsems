package _03_Text_Funkifier;

import java.util.Iterator;

public class SpaceString implements TextFunkifier {
	String unfunkifiedText;
	public SpaceString(String unfunkifiedText) {
		
		

	  
	        this.unfunkifiedText = unfunkifiedText;

	    
	}

	@Override
	public String funkifyText() {
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			if(i != unfunkifiedText.length()-1) {
				word.append(unfunkifiedText.charAt(i)).append(' ');
			} else {
			word.append(unfunkifiedText.charAt(i));
			}
		}
		return word.toString();
		
		
	}

}
