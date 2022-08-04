public class Test {
    public static void main(String[] args) {
        SwapClass s1 = new SwapClass(5);
        SwapClass s2 = new SwapClass(3);

        System.out.println(s1.getValue() + " " + s2.getValue());
        SwapClass.swap(s1, s2);
        System.out.println(s1.getValue() + " " + s2.getValue());
    }
}
