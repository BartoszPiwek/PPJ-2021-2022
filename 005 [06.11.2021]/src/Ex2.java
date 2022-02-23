public class Ex2 {
    public static void main(String[] args) {
        byte value = (byte)10;
        int hex = 0x0 + value;

        System.out.println(value);
        System.out.println(Integer.toBinaryString(value));
    }
}