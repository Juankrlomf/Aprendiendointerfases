
public class Perro extends SerVivo implements IComportamientoSerVivo{

	
	@Override
	public int cumpliranios() {
		// TODO Auto-generated method stub
		edad = edad + 7;
		
		return edad;
	}
}
