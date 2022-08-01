public class Guess {
    public static void main (String args[])
       throws java.io.IOException {
            char ch, answer = 's';
            int i = 0;
            ch = 'g';
            System.out.println("Отгадай какую букву латинского алфавита я загадал");
            
            for (i=0; ch!=answer; i++){
            System.out.println("Возможно это: ");

            ch = (char)
            System.in.read();
         if(ch == answer)
            System.out.println("Молодец ты угадала!!!");
            else 
            System.out.println("Не верно, попробуй еще.");
            }
        }
    }

