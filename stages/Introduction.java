/**
 * Author: Peter Bergmann
 * Date: 11/20/2024
 * File: Introduction
 * Purpose: Class for the
 * and trust components
 * Version: 1.0
 */
import java.util.Scanner;
public class Introduction {
    public static void playIntroduction(){
        Scanner in = new Scanner(System.in);
        Control.Print("""
                Welcome to Grow-Up, a text-based simulation game.
                In this game you will play as a person throughout their entire life and make decisions that will impact you and your future.
                In this game you will make choices by typing on your keyboard, for example, if your asked if you want to go to a concert, you might reply 'Yes' or 'y'\s
                If you want to see your stats you may type 'Menu' at any time.""");
        //check that player is ready.
        Player temp = new Player();
        boolean ready = false;
        while (!ready) {
            if(Control.promptCustomInput("If you are ready to begin type 'Ready'", "Ready", temp)){
                ready=true;
            }
        }
    }

}
