public record Route(String fromCity, String toCity, int actualDistance, int straightDistance) {
    public String toString() {
        if (actualDistance == -1) {
            return "Cannot drive from " + fromCity + " to " + toCity + ", however there is a straight line distance of " + straightDistance;
        } else {
            return "Travel from " + fromCity + " to " + toCity + " with a straight line distance of " + straightDistance + " and an actual distance of " + actualDistance;
        }
    }
}