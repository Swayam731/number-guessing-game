import javax.swing.*;
package numbergame;

/**
 *
 * @author swayam
 */
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cmptNum = (int) (Math.random()*100 +1);
        int Ans = 0;
        int count = 1;
        try
        {
            while(Ans != cmptNum)
            {
                String response = JOptionPane.showInputDialog(null, "enter a guess between 1 to 100 ");
                Ans = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, determineGuess(Ans, cmptNum, count));
                count++;
                if(count>=11)
                {
                    JOptionPane.showMessageDialog(null,"Game over you exceed number of attempts\n please try again");
                    break;
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"please enter a number!\ntry again...");
        }
       
         if(count>=7 && count<10)
                {
                JOptionPane.showMessageDialog(null,"you have to work hard\n ");
                }
         else if(count>=4 && count<=6)
                {
                JOptionPane.showMessageDialog(null,"Wohaaa!\nyou played very well\n ");
                }   
         else if(count>=1 && count<=3)
                {
                JOptionPane.showMessageDialog(null,"congratulations! you are a genius\n ");
                }
    }
    public static String determineGuess(int Answer, int cmptNumber, int count)
        {
            if(Answer <0 || Answer >100)
            {
            return "your guess is invalid";
            }
            else if(Answer == cmptNumber)
            {
                return "correct! \n you Guess it in "+ count + " attempt ";
            }
            else if(Answer > cmptNumber)
            {
                return "Your guess is too high! try again \n try number "+ count;
            }
            else if(Answer < cmptNumber)
            {
                return "Your guess is too low! try again \n try number "+ count;
            }
            else
            {
                return "your guess is incorrect try again\n try number "+ count;
            }
            
        }
    
}
