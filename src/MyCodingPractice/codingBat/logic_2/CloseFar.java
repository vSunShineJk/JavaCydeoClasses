package MyCodingPractice.codingBat.logic_2;

public class CloseFar {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        if (Math.abs(a - b) == 1 && Math.abs(a - c) == 1){
            System.out.println("far");
        } else if (Math.abs(a - b) == 1 || Math.abs(a - c) == 1){
            System.out.println("close");
        }
    }
}
