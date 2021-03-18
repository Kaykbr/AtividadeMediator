package mediatoratv1;


public class ConcretePiloto2 extends ColleaguePiloto {

	public ConcretePiloto2(MediatorTorre torre) {
		super(torre);
	}

	@Override
	public void send(String message) {
		torre.send(message, this);

	}

	@Override
	public void messageReceived(String message) {
		System.out.println("Boeing 787: " + message);

	}

}