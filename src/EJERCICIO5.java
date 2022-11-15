
public class EJERCICIO5 {

	static float importe1 = 10;
	static float importe2 = 20;
	final static int IVA = 21;

	public static void main(String[] args) {

		System.out.println("El IVA del primer importe seria : " + (importe1 * IVA) / 100 );
		System.out.println("El IVA del segundo importe seria : " + (importe2 * IVA) / 100 );

		// IVA = 19 No se puede modificar porque la variable IVA tiene puesto final y no
		// se puede modificar siempre va a ser 21 ya que lleva el final
	}

}
	       