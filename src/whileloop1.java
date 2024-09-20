import java.util.Random;

public class whileloop1 {
    public static void main(String[] args) {

        Random random = new Random();
        boolean isFinished = false;

        int count = 0;

        while (!isFinished){
            int randomNumber = random.nextInt(31 - 11) + 11;

            count += randomNumber;

        if(randomNumber == 15 || randomNumber == 25) {
            isFinished = true;
        }

        }
        System.out.println(count);
    }
}

