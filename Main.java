/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aaron
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardDeck cd;
        cd = new CardDeck();
        COMplayer cpu;
        cpu = new COMplayer();
        Boolean play = true, check = false, redraw = false;
        
        int round = 0;
        int ask = 0;
        int found = 1;
        int num = 0, counter = 0;
        int cPoint = 0, uPoint = 0;
        
        int[] hand = new int[52];
        
        System.out.println("We're going to be playing Go Fish! Time to start distributing cards.\n"
                + "We will be starting with 7 cards each. Have fun!");
        
        cd.generateCards();
        for (int i = 0; i < 7; i++) {
            
            hand[i] = cd.cardDraw();
            cpu.handAdd(cd.cardDraw());
    
        }
        
        do {
            round++;
            check = false;
            counter = 0;
            
            Arrays.sort(hand);
            
            System.out.println("Round " + round + "! The current points are\nYou: " 
                   + uPoint + "CPU: " + cPoint + "\n\nIt's your turn now.\n");
            
            System.out.println("These are your cards. Select one to ask the opponent.\n");
            
            for (int i = hand.length - 1; i >= 0; i--) {
                if (hand[i] == 0) {
                }
                else if (hand[i] == 11) {
                    System.out.print("Jack(11)  ");
                }
                else if (hand[i] == 12) {
                    System.out.print("Queen(12)  ");
                }
                else if (hand[i] == 13) {
                    System.out.print("King(13)  ");
                }
                else if (hand[i] == 1) {
                    System.out.print("Ace(1)  ");
                }
                else {
                    System.out.print(hand[i] + "  ");
                }
                
            }
            System.out.println();
            
            do {
                ask = sc.nextInt();
                
                for (int i = hand.length -1; i >= 0; i--) {
                    if (hand[i] == ask) {
                        check = true;
                    }
                }
                if (check != true) {
                    System.out.println("Please enter a card in your hand.");
                }
            }
            while(check == false);

            found = cpu.cardSelect(ask);
            if (found == 0) {
                System.out.println("Go Fish!");
//                hand[0] = cd.cardDraw();
                System.out.println("You drew a " + hand[0] + "!\n");
            }
            else {
                System.out.println("Here are " + found + " " + ask+ "s!\n");
                
                for (int i = 0; i < found; i++) {
                    hand[i] = ask;
                }
            }
            
            Arrays.sort(hand);
            
            for (int i = hand.length -1; i >= 0; i--) {
                if (i == 0) {
                    num = hand[i];
                    counter++;

                }
                else if(counter == 4 && hand[i] != 0) {
                    uPoint++;
                    System.out.println(num + " " + counter);
                    for (int ii = hand.length -1; ii >= 0; ii--) {
                        if (num == hand[ii]) {
                            System.out.println(ii + ": "+hand[ii]);
                            hand[ii] = 0;
                        }
                    }
                    Arrays.sort(hand);
                    
                    for (int ii = hand.length -1; ii >= 0; ii--) {
                        if (hand[ii] != 0) {
                            redraw = false;
                            break;
                        }
                        else {
                            redraw = true;
                        }
                    }
                    System.out.println("You got a point!");
                    }
                else if (num != hand[i]) {
                    counter = 0;
                    num = hand[i];
                    counter++;
                    System.out.println(num + " " + counter);
                }
                else if (num == hand[i]) {
                    counter++;
                    System.out.println(num + " " + counter);
                }
                else if (num == 0) {
                    
                    System.out.println(num + " " + counter);
                    
                    counter = 0;
                    num = 0;
                    break;
                }
            }
            
            if (redraw == true) {
                
                if (!cd.deck.isEmpty()) {
                    for (int i = 0; i < 7; i++) {
                    redraw = false;
                    hand[i] = cd.cardDraw();
    
                    }
                }
                
            }
            
            Arrays.sort(hand);
            
            System.out.println("It's now my turn!");
            
            ask = cpu.cardAsk();
            found = 0;
            
            System.out.println("Do you have any " + ask+"s?");
            
            for(int i = hand.length -1; i >= 0; i--) {
                if (hand[i] == ask) {
                    found++;
                    hand[i] = 0;
                }
                
            }
            if (found == 0) {
                System.out.println("Aww... Go Fish!");
            }
            else {
                for (int i = 0; i >= found; i++) {
                   cpu.handAdd(ask); 
                }   
            }
            
            if (cpu.cardSelect(ask) == 4) {
                cpu.handRemove(ask);
            }
            
            if (cpu.hand.size() == 0) {
                
                if (!cd.deck.isEmpty()) {
                    for (int i = 0; i < 7; i++) {
                    cpu.handAdd(cd.cardDraw());
                    }
                }
            }
            
            if (redraw == true && cpu.hand.size() == 0 && !cd.deck.isEmpty()) {
                play = false;
            }
            
        }
        while(play == true);
        
    System.out.println("Game Over! There are no more cards!\n"
            + "The player has " + uPoint + " points and the CPU has "
                    + cPoint +" points.\n\n");
        
    if (uPoint > cPoint) {
        System.out.println("You win! Congratulations!");
    }
    else if (cPoint > uPoint) {
        System.out.println("The CPU wins! Better luck next time!");
    }
    else {
        System.out.println("It's a tie!");
    }
    
        
    }
}
