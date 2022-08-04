package co.edu.unicauca.distribuidos.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServidorDeDeclaracionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServidorDeDeclaracionApplication.class, args);
		String[] vectorDatosLocalizarNS = new String[4];
		vectorDatosLocalizarNS[0] = "-ORBInitialPort";
		System.out.println("Ingrese la dirección IP donde escucha el n_s");
		vectorDatosLocalizarNS[1] = UtilidadesConsola.leerCadena();
		vectorDatosLocalizarNS[2] = "-ORBInitialPort";
		System.out.println("Ingrese el puerto donde escucha el n_s");
		vectorDatosLocalizarNS[3] = UtilidadesConsola.leerCadena();
	}

}
