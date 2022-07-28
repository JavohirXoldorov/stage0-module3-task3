package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        System.out.println(first + "\n" + second + "\n" + third + "\n");
        int linkToFirst = 1;
        int linkToSecond = 10;
        int linkToThird = 100;
        first = linkToFirst;
        second = linkToSecond;
        third = linkToThird;
        System.out.println(first + "\n" + second + "\n" + third + "\n");
    }
}
