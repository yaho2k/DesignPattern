package Strategy;

public class Hand {
    public static final int HANDVALUE_ROC = 0;
    public static final int HANDVALUE_SIS = 1;
    public static final int HANDVALUE_PAP = 2;
    public static final Hand[] hand = { new Hand(HANDVALUE_ROC), new Hand(HANDVALUE_SIS), new Hand(HANDVALUE_PAP), };
    private static final String[] name = { "rock", "sissors", "paper", };
    private int handvalue;

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handvalue];
    }
}
