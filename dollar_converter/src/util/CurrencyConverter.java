package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double calculator(double dollarprice, double amount) {
		return amount * dollarprice * (IOF + 1);
	}
}
