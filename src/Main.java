public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        System.out.println(a[1]);

        double[] b = {1.57, 7.645, 9.986};

        System.out.println(b[2]);

        int[] c = {1, 6, 8, 7, 9};
        System.out.println(c[3]);

        // Задача 2

        System.out.println(a[0] + "," + a[1] + "," + a[2]);
        System.out.println(b[0] + "," + b[1] + "," + b[2]);
        System.out.println(c[0] + "," + c[1] + "," + c[2] + "," + c[3]);

        // Задача 3

        System.out.println(a[2] + "," + a[1] + "," + a[0]);
        System.out.println(b[2] + "," + b[1] + "," + b[0]);
        System.out.println(c[3] + "," + c[2] + "," + c[1] + "," + c[0]);

        // Задача 4
        for (int i = 0; i < 3; i++) {
            a[i] = a[i] + 1;
            if (a[i]%2==0)


                System.out.println(a[i]);

        }



    }

}








            

