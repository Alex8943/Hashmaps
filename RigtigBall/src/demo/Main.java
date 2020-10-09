package demo;

import javax.naming.InsufficientResourcesException;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static ArrayList<Ball> getBalls() {
        ArrayList<Ball> balls = new ArrayList<>();
        FootBall fb = new FootBall(3, "Fodbold");

        balls.add(fb);
        TennisBall tb = new TennisBall(2, "fodbold");
        balls.add(tb);
        balls.add(new FootBall(3, "Wilson"));
        balls.add(new FootBall(2, "Tretorn"));
        balls.add(new FootBall(2, "Roland Garros"));
        balls.add(new FootBall(2, "Nike"));
        balls.add(new TennisBall(5, "Nike"));
        balls.add(new TennisBall(2, "Nfa"));
        balls.add(new TennisBall(6, "Nfa"));
        balls.add(new TennisBall(7, "Nfa"));



        System.out.println("Antal bolde: " + balls.size());

        FootBall fbFind = new FootBall(3, "Wilson");

        int a = balls.indexOf(fbFind);


        System.out.println("Fundet = " + a);

            return balls;
    }

    public static ArrayList<Integer> getInts(){

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(20);
        ints.add(30);
        System.out.println(ints);

        Integer min = Collections.min(ints);
        int hs = min.hashCode();
        System.out.println("Hashcide for 10 er: " + hs);
        System.out.println("Min = " + min);

        return ints;
    }

    public static void main(String[] args) {
        ArrayList<Ball> balls = getBalls();
        System.out.println(balls);

        Ball mindesteBold = Collections.min(balls);
        System.out.println("Min mindste bold er: " + mindesteBold);

        Collections.sort(balls);

        System.out.println(balls);

        for (int i = balls.size()-1; i >= 0; i--) {
            Ball b = balls.get(i);
            if (b.isTennisBall()){
                balls.remove(b);
            }
        }
        System.out.println(balls);
        /*
        ArrayList<TennisBall> tb = new ArrayList<>();

        for (Ball b: balls) {
                if (b instanceof TennisBall) {
                    tb.add((TennisBall) b);
                }
            }
        System.out.println(tb);

         */

    }
}
