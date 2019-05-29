import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import enumLibrary.*;

public class Person {
	protected String namaDepan;
	protected String namaBelakang;
	protected LocalDate tanggalLahir;
	protected Gender jenisKelamin;
	protected String tempatLahir;
	protected String pekerjaan;
	
	public Person(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, String pekerjaan)
	{
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
		this.tanggalLahir = tanggalLahir;
		this.tempatLahir = tempatLahir;
		this.pekerjaan = pekerjaan;
	}
	
	public String getNamaDepan()
	{
		return namaDepan;
	}
	
	public void setNamaDepan()
	{
		this.namaBelakang =  namaBelakang;
	}
	
	public String getNamaBelakang()
	{
		return namaBelakang;
	}
	
	public void setNamaBelakang()
	{
		this.namaBelakang = namaBelakang;
	}
	
	public LocalDate getTanggalLahir()
	{
		return tanggalLahir;
	}
	
	public void setTanggalLahir()
	{
		this.tanggalLahir = tanggalLahir;
	}
	
	public String getTempatLahir()
	{
		return tempatLahir;
	}
	
	public void setTempatLahir(String tempatLahir)
	{
		this.tempatLahir = tempatLahir;
	}
	
	public String getPekerjaan()
	{
		
		return pekerjaan;
	}
	
	
	
	
}
