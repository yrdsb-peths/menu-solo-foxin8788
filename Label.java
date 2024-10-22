import greenfoot.*;  

public class Label extends Actor {
    private GreenfootImage labelImage;

    public Label(String text, int fontSize) {
        // Use greenfoot.Color instead of java.awt.Color
        labelImage = new GreenfootImage(text, fontSize, Color.BLACK, Color.WHITE); // Black text, white background
        setImage(labelImage);
    }

    public Label(GreenfootImage image) {
        setImage(image);
    }

    public void setText(String text) {
        labelImage.clear();
        labelImage = new GreenfootImage(text, 24, Color.BLACK, Color.WHITE); // Black text, white background
        setImage(labelImage);
    }

    public void setImage(GreenfootImage image) {
        super.setImage(image);
    }
}