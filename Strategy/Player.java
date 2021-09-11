package Strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    public Player(String name, Strategy strategy) {         // �̸��� ������ �Ҵ�޴´�
        this.name = name;
        this.strategy = strategy;
    }
    
    public Hand nextHand() {                            // ������ ���ø� �޴´�
        return strategy.nextHand();
    }
    public void win() {                 // ��
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {                // ��
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {                // ���º�
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}

