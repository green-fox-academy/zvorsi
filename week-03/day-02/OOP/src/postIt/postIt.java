package postIt;

public class postIt {

private String backgroundColor;
private String text;
private String textColor;

public postIt(String backgroundColor, String text, String textColor){
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
}

public String getBackgroundColor(){
    return this.backgroundColor;
}

public String getText(){
    return this.text;
}

public String getTextColor(){
    return this.textColor;
}
public void print(){
    System.out.println("postit bgcolor is: " + backgroundColor + ", post it text is: " + text + ", text color is: " + textColor);
}



}
