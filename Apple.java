//Oren Horak - Algorithmic Design 1 - 005
public class Apple {

	
	//step one: instance variables of type, weight and price
	private String Type;
	private double Weight;
	private double Price;
	
	
	
	//step 2: default constructors: default type, weight, and price are given in the lab description
	public Apple()
	{
		this.Type = "Gala";
		this.Weight = 0.5;
		this.Price = 0.88;
	}
	
	//parameterized constructors
		public Apple(String xType, double xWeight, double xPrice)
		{
			this.setType(xType);
			this.setWeight(xWeight);
			this.setPrice(xPrice);
		}
		
	//step 3: accessor methods
	public String getType()
	{
		return this.Type;
	}
	public double getWeight()
	{
		return this.Weight;
	}
	public double getPrice()
	{
		return this.Price;
	}
	
	//mutator methods: this will validize all the imputs. Certain requirements are asked for in the lab description
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Red Delicious")
		||xType.equalsIgnoreCase("Golden Delicious")
		||xType.equalsIgnoreCase("Gala")
		||xType.equalsIgnoreCase("Granny Smith"))
		{
			this.Type = xType;
		}
		else
		{
			System.out.println("Invalid Input for Type!");
		}
		
	}
	public void setWeight(double xWeight)
	{
			if(xWeight <=2 && xWeight >=0)
		{
			this.Weight = xWeight;
		}
			else
		{
			System.out.println("Invalid weight entered!");
		}
	}
	public void setPrice(double xPrice)
	{
		if(xPrice < 0)
		{
			System.out.println("Invalid Number entered for price! Must be a positive number!");
		}
		else
		{
			this.Price = xPrice;
		}
	}
	public String writeOutput()
		{
		return "Type: "+this.Type
				+"\nWeight: "+this.Weight
				+"\nPrice: $"+this.Price;
		}
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


