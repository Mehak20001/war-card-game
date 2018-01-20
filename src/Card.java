public class Card {
    private String color;
    private int value;
    public static String colors[] = {"hearts", "tiles", "clovers", "pikes"};
    public static int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public Card(int val, String col) {
        this.color = col;
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isGreaterThan(Card card) {
        return (this.value > card.getValue());
    }
}