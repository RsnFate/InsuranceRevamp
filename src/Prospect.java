import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import enumLibrary.*;

public class Prospect extends Person {

	protected int prospectID;
	protected CustomerStatus customerStatus;
	
	public Prospect(String namaDepan, String namaBelakang, Gender jenisKelamin, LocalDate tanggalLahir, String tempatLahir,
			String pekerjaan, int prospectID, CustomerStatus customerStatus) {
		super(namaDepan, namaBelakang, tanggalLahir, jenisKelamin, tempatLahir, pekerjaan);
		// TODO Auto-generated constructor stub
		this.prospectID = prospectID;
		this.customerStatus = customerStatus;
	}
	
	public int getProspectID()
	{
		return prospectID;
	}
	
	public void setProspectID(int prospectID)
	{
		this.prospectID = prospectID;
	}
	
	public CustomerStatus getCustomerStatus()
	{
		return customerStatus;
	}
	
	public void setCustomerStatus(CustomerStatus customerStatus)
	{
		this.customerStatus = customerStatus;
	}
	
	public String setCompleteName()
	{
		String completeName = String.format("%s %s", namaDepan, namaBelakang);
		return completeName;
	}
	
	public String printSummaryProspect()
	{
		String summaryProspect = String.format("No: %d, %s, %s, %s(%s),%s,%s", 
				this.prospectID, setCompleteName(), this.jenisKelamin, this.tanggalLahir, this.tempatLahir, this.pekerjaan, this.customerStatus);
		return summaryProspect;
	}
	
	
	
	
	
}
