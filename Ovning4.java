import javax.lang.model.util.ElementScanner6;

public class Ovning4
{
    public static void main(String[] arg)
    {
        
    int i = 0;  
     do
     {
         if(i%3 == 0 && i%5 == 0)
         {
            System.out.println("FizzBuzz");
         }
         else if(i%3 == 0)
         {
             System.out.println("Fizz");
         }
         else if(i%5 == 0)
         {
             System.out.println("Buzz");
         }
         else 
         {
             System.out.println(i);
         }

         i = i+1;
     }while(i < 100);


    }

}