import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 720;

    private int starting_x_first_ball = 0;
    private int starting_x_second_ball = 0;
    private int starting_x_third_ball = 0;
    private int starting_x_fourth_ball = 0;



    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawEllipse();
    }

    private void drawEllipse() {
        int height_first_ball = HEIGHT / 5;
        ellipse(starting_x_first_ball, height_first_ball, 10, 10);
        int height_second_ball = 2 * HEIGHT / 5;
        ellipse(starting_x_second_ball, height_second_ball, 10, 10);
        int height_third_ball = 3 * HEIGHT / 5;
        ellipse(starting_x_third_ball, height_third_ball, 10, 10);
        int height_fourth_ball = 4 * HEIGHT / 5;
        ellipse(starting_x_fourth_ball, height_fourth_ball, 10, 10);

        starting_x_first_ball++;
        starting_x_second_ball +=2;
        starting_x_third_ball +=3;
        starting_x_fourth_ball +=4;
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }
}
