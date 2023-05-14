package _03_Text_Funkifier;



public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
StringBuilder word = new StringBuilder(unfunkifiedText);
    	
        return word.reverse().toString();

    }
}
