import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import enumLibrary.*;

public class Product {
	private String namaProduk;
	private JenisProduk jenisProduk;
	private Frekuensi frekuensi;
	private BigDecimal iuranDuaPuluhKebawah;
	private BigDecimal iuranAtasDuaPuluh;
	private String manfaat;
	
	public Product(String namaProduk, JenisProduk jenisProduk, Frekuensi frekuensi, BigDecimal iuranDuaPuluhKebawah,
			BigDecimal iuranAtasDuaPuluh, String manfaat)
	{
		this.namaProduk = namaProduk;
		this.jenisProduk = jenisProduk;
		this.frekuensi = frekuensi;
		this.iuranDuaPuluhKebawah = iuranDuaPuluhKebawah;
		this.iuranAtasDuaPuluh = iuranAtasDuaPuluh;
		this.manfaat = manfaat;
	}
	
	public String getNamaProduk()
	{
		return namaProduk;
	}
	
	public void setNamaProduk()
	{
		this.namaProduk = namaProduk;
	}
	
	public JenisProduk getJenisProduk()
	{
		return jenisProduk;
	}
	
	public void setJenisProduk(JenisProduk jenisProduk)
	{
		this.jenisProduk = jenisProduk;
	}
	
	public Frekuensi getFrekuensi()
	{
		return frekuensi;
	}
	
	public void setFrekuensi(Frekuensi frekuensi)
	{
		this.frekuensi = frekuensi;
	}
	
	public BigDecimal getIuranDuaPuluhKebawah()
	{
		return iuranAtasDuaPuluh;
		
	}
	
	public void setIuranDuaPuluhKebawah(BigDecimal iuranDuaPuluhKebawah)
	{
		this.iuranDuaPuluhKebawah = iuranDuaPuluhKebawah;
	}
	
	public BigDecimal getIuranAtasDuaPuluh()
	{
		return iuranAtasDuaPuluh;
		
	}
	
	public void setIuranAtasDuaPuluh(BigDecimal iuranAtasDuaPuluh)
	{
		this.iuranAtasDuaPuluh = iuranAtasDuaPuluh;
	}
	
	
	
	
	
	
	
}
