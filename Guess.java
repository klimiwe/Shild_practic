public class Guess {
    public static void main (String args[])
       throws java.io.IOException {
            char ch, answer = 'k';
            int i;
            ch = 'g';
            System.out.println("Отгадай какую букву латинского алфавита я загадал");
            
            for (i=1; ch!=answer; i++){
            System.out.println("Возможно это: ");
            ch = (char)
            System.in.read();
            

        if (ch != answer)
         System.out.println("Не верно попробуй еще раз.");}

        
            System.out.println("Молодец ты угадала!!!");
        }
        }
    

