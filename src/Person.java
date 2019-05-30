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
	
	public Person(String namaDepan, String namaBelakang, LocalDate tanggalLahir, Gender jenisKelamin, String tempatLahir, String pekerjaan)
	{
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
		this.tanggalLahir = tanggalLahir;
		this.jenisKelamin = jenisKelamin;
		this.tempatLahir = tempatLahir;
		this.pekerjaan = pekerjaan;
	}
	
	public String getNamaDepan()
	{
		return namaDepan;
	}
	
	public void setNamaDepan(String namaDepan)
	{
		this.namaDepan =  namaDepan;
	}
	
	public String getNamaBelakang()
	{
		return namaBelakang;
	}
	
	public void setNamaBelakang(String namaBelakang)
	{
		this.namaBelakang = namaBelakang;
	}
	
	public LocalDate getTanggalLahir()
	{
		return tanggalLahir;
	}
	
	public void setTanggalLahir(LocalDate tanggalLahir)
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
	public void setPekerjaan(String pekerjaan)
	{
		this.pekerjaan = pekerjaan;
	}
	
	public Gender getJenisKelamin()
	{
		return jenisKelamin;
	}
	
	
	
}
