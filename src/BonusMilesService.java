public class BonusMilesService {
    public int calculate(int price) {
        int bonMiles = 20;
        int miles = price / bonMiles;
        return miles;
    }
}