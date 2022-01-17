import java.util.Random;

public class Home {
    public static void main(String[] args) {
//Задача 1 сделала с вычислением размера массива
        int a = 0;
        for (int i = 0; i <= 20; i += 2) {
            a++;
        }
        int[] mass1 = new int[a];
        for (int i = 0, j = 0; i < mass1.length; i++, j += 2) {
            mass1[i] = j;
            System.out.print(mass1[i] + " ");
        }
        System.out.println();
//Задача 2
        int b = 0;
        for (int i = 1; i < 100; i += 2) {
            b++;
        }
        int[] mass2 = new int[b];
        for (int i = 0, j = 1; i < mass2.length; i++, j += 2) {
            mass2[i] = j;
            System.out.println(mass2[i]);
        }
        for (int i = mass2.length - 1; i >= 0; i--) {
            System.out.print(mass2[i] + " ");
            System.out.println();
        }
//Задача 3
        int[] mass3 = new int[15];
        Random random = new Random();
        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = random.nextInt(99);
            System.out.print(mass3[i] + " ");
        }
        int kol = 0;
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] % 2 == 0) {
                kol++;
            }
        }
        System.out.println("\n" + kol);
//Задача 4
        int[] mass4 = new int[20];
        Random random4 = new Random();
        for (int i = 0; i < mass4.length; i++) {
            mass4[i] = random4.nextInt(20);
            System.out.print(mass4[i] + " ");
        }
        System.out.println();
        for (int i = 2; i < mass4.length; i+=2) {
                mass4[i] = 0;
        }
            for (int i = 0; i < mass4.length; i++) {
                System.out.print(mass4[i] + " ");
            }
        System.out.println();
//Задача 5
        int sum1 = 0;
        int sum2 = 0;
        double sr1 = 0;
        double sr2 = 0;
        int [] mass5 = new int[5];
        Random random5 = new Random();
        for (int i = 0; i < mass5.length; i++) {
            mass5[i] = random5.nextInt(15);
            sum1 = sum1 + mass5[i];
            System.out.print(mass5[i] + " ");
        }
        sr1 = (double) sum1 / mass5.length;
        System.out.println();
        int [] array5 = new int[5];
        Random rand5 = new Random();
        for (int i = 0; i < array5.length; i++) {
            array5[i] = rand5.nextInt(15);
            sum2 = sum2 + array5[i];
            System.out.print(array5[i] + " ");
        }
        System.out.println();
        sr2 = (double) sum2 / array5.length;
        if(sr1 > sr2) {
            System.out.println(sr1);
        }
        else System.out.println(sr2);
//Задача 6
        int [] mass6 = new int[4];
        Random random6 = new Random();
        for (int i = 0; i < mass6.length; i++) {
            mass6[i] = random6.nextInt(10);
            System.out.print(mass6[i] + " ");
        }
        System.out.println();
        boolean flag = true;
        for (int i = 0; i < mass6.length-1; i++) {
            if (mass6[i] > mass6[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Строго возрастающая последовательность");
        }
        else {
            System.out.println("Последовательность не является строго возрастающей");
        }
// Задача 7
        int[] mass7 = new int[12];
        Random random7 = new Random();
        for (int i = 0; i < mass7.length; i++) {
            mass7[i] = random7.nextInt(15);
            System.out.print(mass7[i] + " ");
        }
        System.out.println();
        int max = mass7[0];
        int ind7 = 0;
        for (int i = 0; i < mass7.length; i++){
            if(mass7[i] > max) {
                max = mass7[i];
                ind7 = i;
            }
        }
        System.out.println(ind7);
//Задача 8
        int [] mass8 = new int[10];
        Random random8 = new Random();
        for (int i = 0; i < mass8.length; i++) {
            mass8[i] = random8.nextInt(9);
            System.out.print(mass8[i] + " ");
        }
        System.out.println();
        int [] array8 = new int[10];
        Random rand8 = new Random();
        for (int i = 0; i < array8.length; i++) {
            array8[i] = rand8.nextInt(9);
            System.out.print(array8[i] + " ");
        }
        System.out.println();
        int kol8 = 0;
        double [] mas = new double [10];
        for (int i = 0; i < mas.length; i++){
            mas [i] = (double) mass8[i] / array8[i];
            System.out.print(mas[i] + " ");
            if (mas[i] % 1 == 0) {
                kol8++;
            }
         }
        System.out.println();
        System.out.println(kol8);
//Задача9
        int [] mass9 = new int[10];
        Random random9 = new Random();
        for (int i = 0; i < mass9.length; i++) {
            mass9[i] = random9.nextInt(20);
            System.out.print(mass9[i] + " ");
        }
        System.out.println();
        int buf;
        for (int i = 0; i < mass9.length; i++) {
            for (int j = i + 1; j < mass9.length; j++){
                if (mass9[i] > mass9[j]){
                    buf = mass9[i];
                    mass9[i] = mass9[j];
                    mass9[j] = buf;
                }
            }
        }
        for (int i = 0; i < mass9.length; i++) {
            System.out.print(mass9[i] + " ");
        }
    }
}


