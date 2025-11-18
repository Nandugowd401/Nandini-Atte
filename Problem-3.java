import java.util.Scanner;


public class Problem_3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a (integer >=1):");
int a = sc.nextInt();
if (a <= 0) {
System.out.println("Please enter a positive integer.");
return;
}
int n = (a % 2 == 1) ? a : a - 1; 
if (n <= 0) n = 1; 
StringBuilder sb = new StringBuilder();
for (int i = 0; i < n; i++) {
int odd = 2 * i + 1;
if (i > 0) sb.append(", ");
sb.append(odd);
}
System.out.println(sb.toString());
}
}
