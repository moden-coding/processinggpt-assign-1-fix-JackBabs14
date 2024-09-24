import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup() {
    background(135, 206, 235); 

    fill (124, 252, 0);
    rect (0, 250, 400, 150);

    fill (255, 221, 33);
    ellipse(300, 50, 75, 75);

    stroke (150, 150, 150);
    strokeWeight(7);
    line(275, 300, 275, 75);

    stroke (255, 255, 255);
    fill (255, 255, 255);
    rect(168, 75, 100, 60);

    fill (188, 0, 45);
    ellipse(218, 105, 50, 50);

    


    }

    public void settings() {
        size (400, 400);
    }
}

