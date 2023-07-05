public class BonusMilesService {
    public int calculate(int price) {

        int millPerTrip = 20;
        int bonusMiles = price / millPerTrip;

        return bonusMiles;
    }
}

