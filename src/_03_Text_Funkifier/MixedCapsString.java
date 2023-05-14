package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			if(i%2 !=0) {
				word.append(Character.toUpperCase(unfunkifiedText.charAt(i)));
			} else {
				word.append(Character.toLowerCase(unfunkifiedText.charAt(i)));
			}
		}
		
		return word.toString();
		
	}

}
