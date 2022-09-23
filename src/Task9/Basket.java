package Task9;

import java.awt.*;
import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;
    Basket( ){
        balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public int getNumberOfBlueBalls(){
        int count =0 ;
        for (Ball ball: balls) {
            if(ball.color == Color.BLUE){
                count++;
            }
        }
        return count;
    }
}
