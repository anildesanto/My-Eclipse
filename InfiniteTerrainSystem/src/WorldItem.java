import java.text.DecimalFormat;

public class WorldItem 
{
	private String name;
	private float[] coordinates = new float [2];
	private float nCoordinates = 0;
	private float eCoordinates = 0;
	private String description = "";
	
	public WorldItem(String name,float nCoordinates,float eCoordinates,String description )
	{
		this.name = name;
		this.coordinates[0] = nCoordinates;
		this.coordinates[1] = eCoordinates;
		this.description = description;
	}
	//=============================================
	
	public float[] getCoordinates()
	{
		return coordinates;
	}
	public String getName()
	{
		return name;
	}
	public String printCoordinates()
	{
		DecimalFormat df = new DecimalFormat("#.00");
		return "Item Coordinates: " + df.format(getCoordinates()[0]) +", "+ df.format(getCoordinates()[1]);
	}
	public String description()
	{
		return String.format("You found a " + name + "\n" + description);
	}
	public void updateCoordinates(float[] coordinates)
	{
		this.coordinates = coordinates;
	}
	public float distanceCheck2(Player player)
	{
		float north =  getCoordinates()[0] - player.getCoordinates()[0];
		float west = getCoordinates()[1] - player.getCoordinates()[1];
		return north + west;
	}
	public float distanceCheck(Player player)
	{
		float north =  getCoordinates()[0] - player.getCoordinates()[0];
		float west = getCoordinates()[1] - player.getCoordinates()[1];
		return (float)Math.sqrt((Math.pow(north, 2)+Math.pow(west, 2)));
	}
}
