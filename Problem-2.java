import java.util.Scanner;


public class Problem_2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a (integer >=1):");
int a = sc.nextInt();
if (a <= 0) {
System.out.println("Please enter a positive integer.");
return;
}
StringBuilder sb = new StringBuilder();
for (int i = 0; i < a; i++) {
int odd = 2 * i + 1;
if (i > 0) sb.append(", ");
sb.append(odd);
}
System.out.println(sb.toString());
}
}
