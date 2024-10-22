import greenfoot.*;  

public class InstructionScreen extends World {
    private String[] instructions = {
        "Welcome to the game!",
        "Use arrow keys to move.",
        "Press space to jump."
    };
    private int currentIndex = 0;
    private Label instructionLabel;


    public InstructionScreen() {    
        super(600, 400, 1); 
        
        // Display the first instruction
        instructionLabel = new Label(instructions[currentIndex], 24);
        addObject(instructionLabel, 300, 200);

        // Next and Back buttons
        addObject(new NextInstruction(), 500, 350);
        addObject(new BackInstruction(), 100, 350);
    }

    private class NextInstruction extends Actor {
        public NextInstruction() {
            setImage("buttonLong_beige.png"); // Your button image
        }

        public void act() {
            if (Greenfoot.mouseClicked(this) && currentIndex < instructions.length - 1) {
                currentIndex++;
                instructionLabel.setText(instructions[currentIndex]);
            }
        }
    }

    private class BackInstruction extends Actor {
        public BackInstruction() {
            setImage("buttonLong_beige.png");
        }

        public void act() {
            if (Greenfoot.mouseClicked(this) && currentIndex > 0) {
                currentIndex--;
                instructionLabel.setText(instructions[currentIndex]);
            }
        }
    }
}