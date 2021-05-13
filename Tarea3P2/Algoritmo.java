/**
 * Write a description of class Algoritmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algoritmo
{
    public String Sucesion(int n){
        String Sucesion = "";
        boolean sucesion= true;
        int a = 1;
        int t = 0;
        int b = 0;
        while(n > t){
            Sucesion =Sucesion + a +"    ";
    
            if(sucesion == false){
               b--;
               if(b < 1){
                   sucesion = true;
                   b++;
               }
            }
            if(sucesion == true){
               b++;
               if(b == 3){
                   sucesion = false;
               }
            }
            a = a + b;
            t++;
        }
        
        return Sucesion;
    }
}
