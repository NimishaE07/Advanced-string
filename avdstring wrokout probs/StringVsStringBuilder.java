public class StringVsStringBuilder {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 50000; i++) {
            s += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String Time: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 50000; i++) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end2 - start2));
    }
}
