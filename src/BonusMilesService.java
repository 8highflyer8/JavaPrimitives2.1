public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int rubleForMiles = 20;
        result = (price / rubleForMiles);
        return result;
    }
}
