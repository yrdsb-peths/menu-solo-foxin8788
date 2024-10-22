import greenfoot.*;  

public class Button extends Actor {
    private World nextWorld;
    private String buttonText;
    private GreenfootImage buttonImage;

    public Button(String text, World world) {
        nextWorld = world;
        buttonText = text;
        buttonImage = new GreenfootImage("buttonLong_beige.png"); // ���ذ�ťͼ��

        // ��������ͼ��
        GreenfootImage textOverlay = new GreenfootImage(text, 24, Color.BLACK, new Color(0, 0, 0, 0));
        int textX = (buttonImage.getWidth() - textOverlay.getWidth()) / 2;
        int textY = (buttonImage.getHeight() - textOverlay.getHeight()) / 2;
        buttonImage.drawImage(textOverlay, textX, textY);
        setImage(buttonImage);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(nextWorld);
        }
    }
}
