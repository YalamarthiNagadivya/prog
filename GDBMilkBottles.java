import java.util.Scanner;

public class MilkBottles {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int N = sc.nextInt();
int[] bottles = new int[N];
for (int i = 0; i < N; i++) {
int milk = sc.nextInt();
bottles[i] = 0;

bottles[i] += milk / 10;
milk %= 10;

bottles[i] += milk / 7;
milk %= 7;

bottles[i] += milk / 5;
milk %= 5;

bottles[i] += milk;
}

for (int i = 0; i < N; i++) System.out.print(bottles[i] + " ");
}
}

