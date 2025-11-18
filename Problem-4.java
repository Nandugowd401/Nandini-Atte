import java.util.*;


public class Problem_4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers separated by spaces (single line), then press Enter:");
String line = sc.nextLine().trim();
if (line.isEmpty()) {
System.out.println("No numbers provided.");
return;
}
String[] parts = line.split("\\s+");
List<Integer> nums = new ArrayList<>();
for (String p : parts) {
try { nums.add(Integer.parseInt(p)); }
catch (NumberFormatException e) { /* skip invalid tokens */ }
}


Map<Integer, Integer> counts = new LinkedHashMap<>();
for (int d = 1; d <= 9; d++) counts.put(d, 0);


for (int val : nums) {
for (int d = 1; d <= 9; d++) {
if (val % d == 0) counts.put(d, counts.get(d) + 1);
}
}


System.out.println(counts);
}
}
