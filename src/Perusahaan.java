import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import enumLibrary.*;

public class Perusahaan {
	private static HashMap<Integer, Prospect> prospectList = new HashMap<Integer, Prospect>();
	private static HashMap<String, String> nasabahList = new HashMap<String, String>();
	private static HashMap<String, Product> productList = new HashMap<String, Product>();
	private static Scanner scanner = new Scanner(System.in);
	private static String input;
	
	public void setProduct()
	{
		Product sehatBersama = new Product("Sehat Bersama", JenisProduk.KESEHATAN, Frekuensi.BULANAN,
				new BigDecimal(200000), new BigDecimal(400000), "Claim perawatan kelas 1.");
		Product sehatExtra = new Product("Sehat Bersama", JenisProduk.KESEHATAN, Frekuensi.TAHUNAN,
				new BigDecimal(300000), new BigDecimal(500000), "Claim perawatan kelas VIP");
		Product lifeKeluarga = new Product("Life Keluarga", JenisProduk.JIWA, Frekuensi.BULANAN,
				new BigDecimal(250000), new BigDecimal(450000), "Mendapatkan 500.000.000 apabila terjadi sesuatu pada tertanggung." );
		Product lifeSpecial = new Product("Life Special", JenisProduk.JIWA, Frekuensi.TAHUNAN,
				new BigDecimal(3600000), new BigDecimal(4800000), "Mendapatkan 800.000.000 apabila terjadi sesuatu pada tertanggung.");
		Product protection = new Product("Protection", JenisProduk.KENDARAAN, Frekuensi.TAHUNAN,
				null, new BigDecimal(2000000), "Mendapat ganti rugi sampai 100.000.000 bila terjadi sesuatu.");
		Product protectionPlus = new Product("Protection", JenisProduk.KENDARAAN, Frekuensi.TAHUNAN,
				null, new BigDecimal(2000000), "Mendapat ganti rugi sampai 100.000.000 bila terjadi sesuatu.");
		
		productList.put("SB", sehatBersama);
		productList.put("SX", sehatExtra);
		productList.put("LK", lifeKeluarga);
		productList.put("LS", lifeSpecial);
		productList.put("PR", protection);
		productList.put("PP", protectionPlus);
		
	}
	
	public void addProspect()
	{
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("Input Nama Depan: ");
		input = scanner.nextLine();
		String namaDepan = input;
		
		System.out.println("Input Nama Belakang: ");
		input = scanner.nextLine();
		String namaBelakang = input;
		
		System.out.println("Input Tanggal Lahir(dd/MM/yyyy): ");
		input = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(input, formatter);
		
		System.out.println("Input Tempat Lahir: ");
		input = scanner.nextLine();
		String tempatLahir = input;
		
		System.out.println("Input Jenis Kelamin (L/P): ");
		input = scanner.nextLine();
		Gender gender = Gender.MALE;
		if(input.equals("L"))
		{
			gender = Gender.MALE;
		}
		else if (input.equals("P"))
		{
			gender = Gender.FEMALE;
			
		}
		
		System.out.println("Input Pekerjaan: ");
		input = scanner.nextLine();
		String pekerjaan = input;
		
		int prospectID = prospectList.size() + 1;
		
		CustomerStatus customerStatus = CustomerStatus.PROSPECT;
		
		Prospect person = new Prospect(namaDepan, namaBelakang, date, tempatLahir,pekerjaan, prospectID, customerStatus);
		
		prospectList.put(person.prospectID, person);
		
	}
	
	public void switchNasabah()
	{
		System.out.println("Input Nomor Prospect");
		input = scanner.nextLine();
		Integer.parseInt(input);
		
		Prospect resultProspect = prospectList.get(input);
		resultProspect.setCustomerStatus(CustomerStatus.NASABAH);
	}
	
	public void addNasabah()
	{
		
		System.out.println("Input Nama Depan: ");
		input = scanner.nextLine();
		String noKtp = input;
		
		System.out.println("Input Nama Belakang: ");
		input = scanner.nextLine();
		String namaBelakang = input;
	}
	
	public static void printProspectSummaryList()
	{
		for(Prospect orang : prospectList.values()) 
		{
			System.out.println(orang.printSummaryProspect());
		}
	}
	
	public void printNasabahSummaryList()
	{
		
	}
	
}


