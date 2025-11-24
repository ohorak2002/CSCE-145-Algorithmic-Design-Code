//Oren Horak - Algorithmic Design 1 - 005
public class Concert {

	//Instance Variables
	String bandName;
	int capacity;
	int ticketsSoldPhone;
	int ticketsSoldVenue;
	double pricePhone;
	double priceVenue;
	
	//default constructors 
	public Concert()
	{
		String bandName = "No Name";
		int capacity = 0;
		int ticketsSoldPhone = 0;
		int ticketsSoldVenue = 0;
		double pricePhone = 0;
		double priceVenue = 0;
	}
	//first parameterized method
	public Concert(String xName, int xCapacity, double xPricePhone, double xPriceVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPricePhone);
		this.setPriceAtVenue(xPriceVenue);
	}
	//second parameterized method
	public Concert(String xName, int xCapacity, int xSoldByPhone, int xSoldByVenue, double xPricePhone, double xPriceVenue )
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setTicketsSoldByPhone(xSoldByPhone);
		this.setTicketsSoldByVenue(xSoldByVenue);
		this.setPriceByPhone(xPricePhone);
		this.setPriceAtVenue(xPriceVenue);

		
		//getters
	}
	public String getBandName()	
	{
		return this.bandName;
	}
	public int getCapacity()
	{
		return this.capacity;
	}
	public int getNumTicketsSoldByPhone()
	{
		return this.ticketsSoldPhone;
	}
	public int getNumTicketsSoldAtVenue()
	{
		return this.ticketsSoldVenue;
	}
	public double getPriceByPhone()
	{
		return this.pricePhone;
	}
	public double getPriceByVenue()
	{
		return this.priceVenue;
	}
		
	//mutators
	public void setBandName(String xName)
	{
		this.bandName = xName;
	}
	public void setCapacity(int xCapacity)
	{
		if(xCapacity > 0)
		{
			this.capacity = xCapacity;
		}
		else
		{
			System.out.println("Invalid Value Entered for Capacity");
		}
	}
	public void setTicketsSoldByPhone(int xSoldByPhone)
	{
		if(xSoldByPhone >= 0)
		{
			this.ticketsSoldPhone = xSoldByPhone;
		}
		else
		{
			System.out.println("Invalid input for Number of Tickets Sold By Phone!");
		}
	}
	public void setTicketsSoldByVenue(int xSoldByVenue)
	{
		if(xSoldByVenue >= 0)
		{
			this.ticketsSoldVenue = xSoldByVenue;
		}
		else
		{
			System.out.println("Invalid input for Number of Tickets Sold by Venue!");
		}
	}
		
	
	public void setPriceByPhone(double xPricePhone)
	{
		if(xPricePhone > 0)
		{
			this.pricePhone = xPricePhone;
		}
		else
		{
		System.out.println("Invalid input for the Price of a Ticket from Phone!");
		}
	}
	public void setPriceAtVenue(double xPriceVenue)
	{
		if(xPriceVenue > 0)
		{
			this.priceVenue = xPriceVenue;
		}
		else
		{
			System.out.println("Invalid input for the Price of a Ticekt from the Venue!");
		}
	}
	//extra created methods
	public int totalNumberOfTicketsSold()
	{
		return this.ticketsSoldPhone + this.ticketsSoldVenue;
	}
	public int ticketsRemaining()
	{
		return this.capacity - (this.totalNumberOfTicketsSold());
	}
	public void buyTicketsAtVenue(int xSoldByVenue)
	{
		this.setTicketsSoldByVenue(this.getNumTicketsSoldAtVenue() + xSoldByVenue); 
	}
	public void buyTicketsByPhone(int xSoldByPhone)
	{
		this.setTicketsSoldByPhone(this.getNumTicketsSoldByPhone() + xSoldByPhone);
	}	
	public double totalSales()
	{
		return (this.getPriceByVenue() * this.getNumTicketsSoldAtVenue()) + (this.getPriceByPhone() * this.getNumTicketsSoldByPhone());
	}
	
}

