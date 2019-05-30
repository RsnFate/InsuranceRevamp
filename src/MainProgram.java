import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import enumLibrary.*;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		mainMenu(scanner);
		scanner.close();
	}
	
	public static void printMainMenu()
	{
		String menu = "Vita Bona Insurance\n"
				+ "1. Menu Prospect\n"
				+ "2. Menu Customer\n"
				+ "3. Exit Application";
		System.out.println(menu);
	}
	
	public static void printMenuProspect()
	{
		String menu = "Menu Prospect\n"
				+ "1. Add Prospect\n"
				+ "2. Prospect to Customer\n"
				+ "3. Main Menu\n"
				+ "4. Exit Application";
		System.out.println(menu);
	}
	
	public static void printMenuCustomer()
	{
		String menu = "Menu Customer\n"
				+ "1. Buy Product\n"
				+ "2. Detail Policy\n"
				+ "3. Main Menu\n"
				+ "4. Exit Application";
		System.out.println(menu);
	}
	
	
	public static boolean validasiInput(String input, int maxMenu)
	{
		boolean validation = false;
		try {
			int numericInput = Integer.parseInt(input);
			if(numericInput <= maxMenu && numericInput >= 1) {
				validation = true;
			} else {
				System.out.printf("Tolong masukan antara 1 - %d\n", maxMenu);
			}
		}catch(Exception exception) {
			System.out.println("Format yang anda masukan salah, coba lagi.");
		}
		return validation;
	}
	
	public static void menuProspect(Scanner scanner)
	{
		//TODO function to printSummaryProspect
		Perusahaan.printProspectSummaryList();
		printMenuProspect();
		String input = scanner.nextLine().trim();
		boolean validasi = validasiInput(input, 4);
		if(validasi == false)
		{
			mainMenu(scanner);
		}
		
		switch(input)
		{
			case "1":
				//TODO: Function to add a person into customer list (prospect and nasabah included)
				Perusahaan.addProspect();
				menuProspect(scanner);
			case "2":
				//TODO: Function to flick the switch to Nasabah not complete
				Perusahaan.addNasabah();
				menuProspect(scanner);
				break;
			case "3":
				mainMenu(scanner);
			case "4":
				System.exit(0);
			default:
				System.out.println("Ada Masalah Dengan Program Ini");
		}
	}
	
	public static void menuCustomer(Scanner scanner)
	{
		//TODO function to printSummaryProspect
		
		printMenuCustomer();
		String input = scanner.nextLine().trim();
		boolean validasi = validasiInput(input, 4);
		if(validasi == false)
		{
			menuCustomer(scanner);
		}
		
		switch(input)
		{
			case "1":
				//TODO: Function to add a person into customer list (prospect and nasabah included)
				
				break;
			case "2":
				//TODO: Function to flick the switch to Nasabah not complete
				
			case "3":
				mainMenu(scanner);
			case "4":
				System.exit(0);
			default:
				System.out.println("Ada Masalah Dengan Program Ini");
		}
	}
	
	public static void mainMenu(Scanner scanner)
	{
		Perusahaan.printProspectSummaryList();
		printMainMenu();
		String input = scanner.nextLine().trim();
		boolean validasi = validasiInput(input, 3);
		if(validasi == false)
		{
			mainMenu(scanner);
		}
		
		switch(input)
		{
			case "1":
				menuProspect(scanner);
				break;
			case "2":
				menuCustomer(scanner);
				break;
			case "3":
				System.exit(0);
			default:
				System.out.println("Ada Masalah Dengan Program Ini");
				break;
		}
		
	}
}
