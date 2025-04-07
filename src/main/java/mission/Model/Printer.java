package mission.Model;

public class Printer {
    private final Ink ink;

    public Printer(Ink ink) {
        this.ink = new Ink();
    }

    public Ink get_ink() {
        return ink;
    }

    public void print(int size, String text) {
        int ink_need = size * text.length() * 5;
        ink.use_ink(ink_need);
    }
}
