/*
 * massiivid -  näide
 * autor - Anna Karutina
 * ülesanne 6.2
 * */

public class test {
    public static void main(String[] args) {
        int[] numbrid = new int[10];
        numbrid[0] = 1;
        numbrid[1] = 2;
        numbrid[2] = 3;
        numbrid[3] = 4;
        numbrid[4] = 5;
        System.out.println(numbrid.length);
        System.out.println(numbrid[0]);
        System.out.println(numbrid[1]);
        System.out.println(numbrid[2]);
        System.out.println(numbrid[3]);
        System.out.println(numbrid[4]);
        numbrid[5] = 6;
        System.out.println(numbrid[4]);
    }
}
