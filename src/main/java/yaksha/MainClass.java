package yaksha;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, String> a1 = new LinkedHashMap<String, String>();
		for (int i = 0; i < n; i++) {
			a1.put(sc.nextLine(), sc.nextLine());
		}
		ArrayList<String> l1 = new ArrayList<String>();
		l1 = EmployeeRetirement.retirementEmployeeList(a1);
		System.out.println(l1);
		sc.close();
	}
}
