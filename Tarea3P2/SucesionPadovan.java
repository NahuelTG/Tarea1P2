
/**
 * Write a description of class Padovan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SucesionPadovan {
    public String SecuenciaPadovan(int n){
        String Padovan ="";
        int padovan = 0;
        int i = 1;
        while(n >= i){
           if (i == 1 || i == 2 || i ==3){
              Padovan = Padovan + "1  ";
           }
           else if(i > 3){
              Padovan = Padovan + "  "+ (padovan(i-2) + padovan(i-3));
           }
           i++;
        }
        return Padovan;
    }
    public int padovan(int n)
    {
        int Padovan = 0;
        if (n == 1 || n == 2 || n ==3){
           Padovan = 1;
        }
        else if (n > 3){
           Padovan = padovan(n-2) + padovan(n-3);
        }
        return Padovan;
    }

}
