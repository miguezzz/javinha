package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.println("Enter contract value: ");
		double totalValue = sc.nextDouble();
		System.out.println("Enter installment number: ");
		int installments = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, installments);
		
		System.out.println("Installments:");
		for (Installment installments_iterator : contract.getInstallments()) {
			System.out.println(installments_iterator);
		}
		
		sc.close();
	}
}
