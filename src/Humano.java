
public class Humano extends SerVivo implements IComportamientoSerVivo{

	
	@Override
	public int cumpliranios() {
		// TODO Auto-generated method stub
		edad= edad + 1;
		
		
		return edad;
	}
}
