




import java.util.Random;

public class IFBedingung {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(100);

        if(randomnumber<20) {
            System.out.println("mini");

        } else if ((randomnumber>20) && (randomnumber<50)){
            System.out.println("Medium");

        } else if (randomnumber<50){
            System.out.println("Large");

        }


    }

}


