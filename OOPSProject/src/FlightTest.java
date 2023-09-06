
public class FlightTest {
	public static void main(String[] args) {
		Flight flight1 = new Flight(101,"Lufthansa",
				"Mumbai", "Germany", 50000, "10-Jan-2024", "23:00");
		
		System.out.println("flight is : "+flight1); // + will invoke the toString() function
	}
}

class Flight //Object is the parent - it has the toString() - classname@address
{
	int flightNumber;
	String flightName;
	String source;
	String destination;
	float ticketCost;
	String date;
	String time;
	
	public Flight(int flightNumber, String flightName, String source, String destination, float ticketCost, String date,
			String time) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.ticketCost = ticketCost;
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", ticketCost=" + ticketCost + ", date=" + date + ", time=" + time
				+ "]";
	}
	
	
	
	
}
