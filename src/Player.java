import java.util.ArrayList;


public class Player {
    private String name;
    private int points;

    private ArrayList<Card> stack = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public ArrayList<Card> getStack() {
        return stack;
    }

    public void giveCard(Card card) {
        stack.add(card);
    }
}