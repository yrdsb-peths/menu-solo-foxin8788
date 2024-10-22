import greenfoot.*;  

public class MenuScreen extends World {
    private AvatarQueue avatarQueue;
    private Label avatarLabel;

    public MenuScreen() {    
        super(600, 400, 1); 
        // Start button to move to instruction screen
        addObject(new Button("Start", new InstructionScreen()),300, 210);
        addObject(new Button("High Scores", new HighScoreScreen()), 300, 160);   
        addObject(new Button("Next Avatar", new HighScoreScreen()), 300, 350);   
        
        // Avatar selection using queue
        avatarQueue = new AvatarQueue();
        String avatar = avatarQueue.getNextAvatar();
        GreenfootImage avatarImage = new GreenfootImage(avatar + ".png");
        avatarLabel = new Label(avatarImage);
        addObject(avatarLabel, 300, 300);
        
        // Button to change avatar
        addObject(new AvatarChange(), 300, 350);
    }

    private class AvatarChange extends Actor {
        

        public void act() {
            if (Greenfoot.mouseClicked(this)) {
                String avatar = avatarQueue.getNextAvatar();
                GreenfootImage avatarImage = new GreenfootImage(avatar + ".png");
                avatarLabel.setImage(avatarImage);
            }
        }
    }
}