import java.util.Scanner;

public class Main {

	static String encendermenu = "MENÚ: \n" +
			"\t1. Encender la calculadora. \n" +
			"\t2. Salir.";

	static String encendidomenu = "MENÚ: \n" +
			"\t1. Ingresar la direccion del archivo con la ecuacion que quiere resolver:\n" +
			"\t2. La direccion del archivo tiene que ser en formato C:\\\\\\\\Users\\\\\\\\try\\\\\\\\Desktop\\\\\\\\intento.txt\\\\\\\n" +
			"\t3. Salir.";


	public static void main(String[] args) {
		iCalculadora calculadora = new Calculadora();
		Scanner input = new Scanner(System.in);
		boolean continuar = true;
		boolean seguir = true;

		do {
			System.out.print(encendermenu);
			int encender = input.nextInt();

			switch (encender) {
				case 1:
					System.out.print(encendidomenu);
					String archivo = input.nextLine();
					if (!archivo.equals("0")){
						// TODO: 2019-01-31
						
					}

					break;


				case 2:
					System.out.println("Saliendo del programa...");
					seguir = false;
					break;
			}

		}while (seguir);

	}
}


