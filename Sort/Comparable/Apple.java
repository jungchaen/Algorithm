public class Apple {
    private String kind;
    private String color;
    private int cost;

    public Apple(String kind, int cost) {
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() {
        return this.kind;
    }

    public Integer getCost() {
        return this.cost;
    }

    public String toString() {
        return "품종: " + this.kind + ", 가격: " + this.cost;
    }
}
