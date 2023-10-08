public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        int priceX = 25_000;
        int milesX = service.calculate(priceX);
        System.out.println("За билет в " + priceX + " руб. начислено " + milesX + " миль.");

        int priceB = 17_550;
        int milesB = service.calculate(priceB);
        System.out.println("За билет в " + priceB + " руб. начислено " + milesB + " миль.");
    }
}

