public class BonusMilesService {
    public int calculate(int cost) {
        int result;
        int rubleForMiles = 30;
        result = (cost / rubleForMiles);
        return result;
    }
}
