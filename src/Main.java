
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 25001;
        int rubForMile = 20;

        int miles = ticketPrice / rubForMile;

        System.out.println("Количество бонусных миль: " + miles);
    }
}