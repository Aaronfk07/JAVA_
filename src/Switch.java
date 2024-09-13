import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(6) + 5;

        switch (randomnumber){
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;
        }

    }
}
