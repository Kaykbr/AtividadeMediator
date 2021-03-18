package mediatoratv1;


public class ConcretePiloto1 extends ColleaguePiloto {

	public ConcretePiloto1(MediatorTorre torre) {
		super(torre);
	}

	@Override
	public void send(String message) {
		torre.send(message, this);

	}

	@Override
	public void messageReceived(String message) {
		System.out.println("Cessna 150: " + message);
	}

}