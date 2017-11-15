import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(calcv(n));

	}

	public static int calcu(int u) {
		if (u == 0) return 0;
		if (u == 1) return 1;
		return (calcu(u-1)-calcu(u-2)*calcv(u-1)-calcv(u-2))/(1+calcu(u-1)u-1+calcv(u-1)+calcv(u-1));
	}

	public static int calcv(int v) {
		if (v == 0) return 0;
		if (v == 1) return 1;
		return (calcu(v-1)-calcv(v-1))/(Math.abs(calcu(v-2)+calcv(v-1))+2);
	}

}
