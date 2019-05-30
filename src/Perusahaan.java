import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import enumLibrary.*;


public class Perusahaan {
	static Prospect resultProspect;
	private static HashMap<Integer, Prospect> prospectList = new HashMap<Integer, Prospect>();
	private static HashMap<String, String> nasabahList = new HashMap<String, String>();
	private static HashMap<String, Product> productList = new HashMap<String, Product>();
	private static Scanner scanner = new Scanner(System.in);
	
	
	
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
	
	//-------------------------------FUNGSI - FUNGSI UNTUK MENU PROSPECT---------------------------------------
	public static void addProspect()
	{
		
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
		
		Prospect person = new Prospect(namaDepan, namaBelakang, gender, date, tempatLahir,pekerjaan, prospectID, customerStatus);
		
		prospectList.put(person.prospectID, person);
		
	}

	public void switchNasabah()
	{
		System.out.println("Input Nomor Prospect Yang Ingin Jadi Nasabah");
		input = scanner.nextLine();
		Integer.parseInt(input);
		
		Prospect resultProspect = prospectList.get(input);
		resultProspect.setCustomerStatus(CustomerStatus.NASABAH);
	}
	
	public static void printProspectSummaryList()
	{
		if(prospectList.size() == 0)
		{
			System.out.println("Tidak Ada Prospect");
		}
		else
		{
			for(Prospect orang : prospectList.values()) 
			{
				System.out.println(orang.printSummaryProspect());
			}
		}
	}

	public static void addNasabah()
	{
		
		System.out.println("Input Nomor Prospect Yang Ingin Jadi Nasabah");
		int nomorProspect  = scanner.nextInt();
		scanner.nextLine();
		//get the Prospect object needed
		
		System.out.println("Input Nomor KTP: ");
		String inputKTP = scanner.nextLine();
		
		System.out.println("Input StatusKK: ");
		String statusKK = scanner.nextLine();
		
		System.out.println("Payment Method");
		String paymentMethod = scanner.nextLine();
		
		resultProspect = prospectList.get(nomorProspect);
		resultProspect.setCustomerStatus(CustomerStatus.NASABAH);
		
		
		prospectList.replace(nomorProspect, resultProspect);
		
		String idNasabah = makeIDNasabah(resultProspect.getProspectID());
		
		
//		Nasabah newNasabah = new Nasabah(resultProspect.getNamaDepan(), resultProspect.getNamaBelakang(), resultProspect.getJenisKelamin(),
//				resultProspect.getTanggalLahir(), resultProspect.getTempatLahir(), resultProspect.getPekerjaan(), resultProspect.getProspectID(),
//				resultProspect.getCustomerStatus(), idNasabah, inputKTP, statusKK, paymentMethod);
		
		
		
	}
	
	public static String makeIDNasabah(int prospectID)
	{
		LocalDate now = LocalDate.now();
		long monthNow = now.getMonthValue();
		long yearNow = now.getYear();
		String idNasabah = String.format("%d/%d/%d", monthNow, yearNow, prospectID);
		return idNasabah;
	}
	
	//==================================FUNGSI - FUNGSI MENU CUSTOMER===========================================================
	public void printNasabahSummaryList()
	{
		String formatNasabahList = String
	}
	
	
	
	
}


