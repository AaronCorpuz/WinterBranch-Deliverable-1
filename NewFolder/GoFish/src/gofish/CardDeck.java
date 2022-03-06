
package gofish;

import java.util.ArrayList;



/** This class ++ System 17796 Fundamentals of Software Design and Development
 *
 * @author Ophir Neymour
 */
public class CardDeck  {



        ArrayList<Integer> deck = new ArrayList<>();


        public CardDeck(){
        }

public void generateCards() {
     for (int i = 0; i < 4; i++) {
          deck.add(1);
          deck.add(2);
          deck.add(3);
          deck.add(4);
          deck.add(5);
          deck.add(6);
          deck.add(7);
          deck.add(8);
          deck.add(9);
          deck.add(10);
          deck.add(11);
          deck.add(12);
          deck.add(13);
     }






        }

       public void cardCheck(int y){
           int count = 0;

            for(int i=0;i<=deck.size();i++)
            {

                if (deck.get(i) == y) {
                      count++;
                      deck.set(i, 0);
               }
             } 

        }

public void cardDestroy(int a)

        {
            for(int i=0;i<=deck.size();i++)
            {
            if(deck.get(i)==a)
                 {
                 deck.remove(i);
                 } 
            }
}

    
    public int cardDraw(){
     int index = (int)(Math.random() * deck.size());
     return deck.get(index);
    }


}
