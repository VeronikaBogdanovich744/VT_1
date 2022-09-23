package Task9;

import java.awt.*;
import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.BLUE));
        basket.addBall(new Ball(Color.BLUE));
        basket.addBall(new Ball(Color.BLUE));
        basket.addBall(new Ball(Color.RED));
        basket.addBall(new Ball(Color.BLUE));
        basket.addBall(new Ball(Color.RED));
        int id = basket.getNumberOfBlueBalls();
        System.out.println(id);
    }
}

