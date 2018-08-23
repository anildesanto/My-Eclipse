
public class Paint 
{
	private String name;
	private float price;
	private int litres;
	private int coverPerLitre;
	
	public Paint(String name, float price,int litres,int coverPerLitre)
	{
		this.name = name;
		this.price = price;
		this.litres = litres;
		this.coverPerLitre = coverPerLitre;
	}
	public Paint()
	{
		
	}
	public int calculateCover(int litre, int coverPerLitre)
	{
		return	litre * coverPerLitre;
	}
	public String getName()
	{
		return name;
	}
	public float getPrice()
	{
		return price;
	}
	public int getLitres()
	{
		return litres;
	}
	public int getcoverPerLitre()
	{
		return coverPerLitre;
	}
	public String paintDetails()
	{
		return String.format("%s costs £%f and it will cover %dm2 of your room.",name,price,calculateCover(litres, coverPerLitre));
	}
	
}
