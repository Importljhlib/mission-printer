package mission.Model;

public class Ink {
    private static final int MAX_INK = 1000;
    private int ink_amount;

    public Ink() {
        this.ink_amount = MAX_INK;
    }

    public int get_ink_amount() {
        return ink_amount;
    }

    public void use_ink(int amount) {
        if (ink_amount < amount) {
            throw new IllegalStateException("잉크가 부족해 출력이 중단되었습니다.");
        }
        ink_amount -= amount;
    }

    public void refill_ink() {
        this.ink_amount += MAX_INK;
    }
}
