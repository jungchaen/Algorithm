public class SwapClass {
    private int value;

    public SwapClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    static void swap(SwapClass s1, SwapClass s2) {
        int temp = s1.value;
        s1.value = s2.value;
        s2.value = temp;
    }
}
