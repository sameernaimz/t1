package day34_tasks;
/*
Tasks 1 - FlightTicket

    Create a class called FlightTicket in your Practice_Programming project and inside the da34_tasks package


        Task:

		- data/create instance variables:
			type (first, business, economy)
			departure location
			arrival location


		- create a constructor that initializes all fields/instances
			- only allow the given ticket types to be set


        	- encapsulate all the fields/instances

 */
public class FlightTicket {
    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public FlightTicket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }
    public FlightTicket( String departureLocation, String arrivalLocation) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }
    public void setType(String type) {

        if (type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("Economy")) {

            this.type = type;
        } else {

            System.out.println("INVALID TYPE TRY AGAIN!");

        }
    }

    public String getType() {
        return type;
    }
    public String getDepartureLocation() {
        return departureLocation;
    }

        public String getarrivalLocation() {
            return arrivalLocation;
        }

    @Override
    public String toString() {
        return "FlightTicket-" +
                " departureLocation='" + departureLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                '}';
    }
}

