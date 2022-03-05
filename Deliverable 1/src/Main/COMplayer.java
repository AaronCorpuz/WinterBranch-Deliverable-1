package Main;
import java.util.ArrayList;
public class COMplayer 
{
    ArrayList<Integer> hand = new ArrayList<>(); 

    public COMplayer() 
    {
    }

    public ArrayList<Integer> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Integer> hand) {
        this.hand = hand;
    }
    
    public void handAdd(int x)
    {
    hand.add(x);
    }
    public Integer cardAsk()
    {
     int index = (int)(Math.random() * hand.size());
  
     System.out.println("Card: " + hand.get(index));
     return hand.get(index);
    }
    public int cardCheck(int y)
    {
    int count=0;
    for(int i=0;i<=hand.size();i++)
    {
        if(hand.get(i)==y)
        {
            count++;
        }
    }
    return count;
    }
    public int cardSelect(int z)
    {
    int count=0;
    for(int i=0;i<=hand.size();i++)
    {
        if(hand.get(i)==z)
        {
            count++;
            hand.remove(i);
        }
    }
    return count;
    }
    public void handRemove(int p)
    {
    for(int i=0;i<=hand.size();i++)
    {
        if(hand.get(i)==p)
        {
            hand.remove(i);
        }
    }
}
}
