public class DumeInSm {
    
        public static void main(String args[]){
            double dume;
            double m;
            int counter;
            counter = 0;
    
            for(dume=1; dume<=144; dume ++){
                m = 0.0254 * dume;
                System.out.println(dume + " dume is " + m + " meters.");
                counter ++;
    
                if(counter==12){
                    System.out.println();
                    counter = 0;
                }
    
            }
            
           
        }
    }
    

