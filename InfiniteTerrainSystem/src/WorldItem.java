
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
		return "Item Coordinates: " + getCoordinates()[0] +", "+getCoordinates()[1];
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
		float west = 0;
		float north = 0;
		if(getCoordinates()[1] - player.getCoordinates()[1] != 0)
		north = getCoordinates()[0] - player.getCoordinates()[0];
		
		if(getCoordinates()[1] - player.getCoordinates()[1] != 0)
		west = getCoordinates()[1] - player.getCoordinates()[1];
		
		return north + west;
	}
	
}
