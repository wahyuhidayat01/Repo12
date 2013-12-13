public class Person {
	private int umur;
	private String nama;
	private String npm;
	private String jurusan;

	public void setUmur(int newValue)
	{
	umur = newValue;
	}
	
	public void setNama( String newValue){
	nama = newValue;
	}
	
	public void setNpm(String newValue)
	{
	npm = newValue;
	}
	
	public void setJurusan(String newValue)
	{
	jurusan = newValue;
	}
	
	public int getUmur()
	{
	return umur;
	}
	
	public String getNama()
	{
	return nama;
	}
	
	public String getNpm()
	{
	return npm;
	}
	
	public String getJurusan()
	{
	return jurusan;
	}
}

