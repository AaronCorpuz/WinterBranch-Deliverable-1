
package gofish;



/** This class ++ System 17796 Fundamentals of Software Design and Development
 *
 * @author Ophir Neymour
 */
public class CardDeck {
 
    
    public static void main (String[] args){
        
        String[]suit ={"Clubs", "Hearts", "Diamonds", "Spades"};
        String[]rank = {"2","3","4","5","6","7","8","9","10", "J","Q","K","A"};
        
        int [] deck = new int[52];
    
 for(int i = 0; i < deck.length;i++) deck[i] = i;
 
 for(int i = 0; i < deck.length; i++){
     
     int index = (int)Math.random() * deck.length);
     int temp = deck[i];
     deck[i] = deck[index];
     deck[index] = temp;

 }
 
 
     
    
} 
    private final String  suitId;
    private final String rankId ;
    
    public GenerateCard(String suit, String rank){
     this.suitId= suit;
     this.rankId = rank;
 }
    
    public String getGenerateCard(){
        return suitId, rankId;
                
    }
 
    public void setGenerateCard(){
        for (int i = 0; i < 4; i++){
     String suit = suits[deck[i] / 13];
     String rank  = ranks[deck[i] % 13];
     System.out.println("Card number" + deck[i] +":" + "of"+ suit);
    }
        public getCardCheck(){
            
        }
  }
        }


