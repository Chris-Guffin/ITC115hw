
public class TicketMain {
	
	public static void main(String[] args) {
		
		Ticket[] tickets = new Ticket[3];
		tickets[0] = new WalkupTicket(1);
		tickets[1] = new WalkupTicket(2);
		tickets[2] = new WalkupTicket(3);
		
		for(int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i]);
			System.out.println();
		}
		
	}
}
