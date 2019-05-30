import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

import enumLibrary.*;
	
public class Nasabah extends Prospect{
	
	private Prospect prospect;
	private String idNasabah;
	private String noKtp;
	private StatusKK statusKK;
	private PaymentMethod paymentMethod;

	
	public Nasabah(String namaDepan, String namaBelakang, Gender jenisKelamin,LocalDate tanggalLahir, String tempatLahir, String pekerjaan,
			int prospectID, CustomerStatus customerStatus, 
			String idNasabah, String noKtp, StatusKK statusKK, PaymentMethod paymentMethod) {
		super(namaDepan, namaBelakang, jenisKelamin, tanggalLahir, tempatLahir, pekerjaan, prospectID, customerStatus);
		// TODO Auto-generated constructor stub
	}

	public String getIDNasabah()
	{
		return this.idNasabah;
	}
	
	public void setIDNasabah(String idNasabah)
	{
		this.idNasabah = idNasabah;
	}
	
	public String getNoKtp()
	{
		return this.noKtp;
	}
	
	public void setNoKtp(String noKtp)
	{
		this.noKtp = noKtp;
	}
	
	public StatusKK getStatusKK()
	{
		return this.statusKK;
	}
	
	public void setIDNasabah(StatusKK statusKK)
	{
		this.statusKK = statusKK;
	}
	
	public String makeIDNasabah()
	{
		LocalDate now = LocalDate.now();
		long monthNow = now.getMonthValue();
		long yearNow = now.getYear();
		String idNasabah = String.format("%d/%d/%d", monthNow, yearNow, prospectID);
		return idNasabah;
	}
	
	public String printSummaryNasabah()
	{
		String summaryNasabah = String.format("No: %s, %s %s, %s, %s(%s), %s,KTP: %s, Status di KK: %s, Payment Method: %s",
				idNasabah,namaDepan, namaBelakang,  jenisKelamin, tanggalLahir, tempatLahir,
				noKtp, statusKK, paymentMethod);
		return summaryNasabah;
	}
	
	
	
}
