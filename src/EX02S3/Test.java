package EX02S3;

public class Test {
    public static void main(String[] args) {
        try {
            Date d1 = new Date(5, 13);
        } catch (DException e){
            System.out.println("An exception occurred: " +e.getMessage());
        }

    }
}
