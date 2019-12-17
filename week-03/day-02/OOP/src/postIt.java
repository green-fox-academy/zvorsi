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

    public static void main(String[] args) {
        postIt postIt1 = new postIt("Color.ORANGE", "Idea 1", "Color.BLUE");
        postIt postIt2 = new postIt("Color.PINK", "Awesome!", "Color.BLACK");
        postIt postIt3 = new postIt("Color.YELLOW", "Superb!", "Color.GREEN");

        postIt1.print();
        postIt2.print();
        postIt3.print();
    }

}
