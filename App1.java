package ej1;

import java.io.IOException;

public class App1 {
	
	public void Ruta(String ruta) throws IOException {

		ProcessBuilder pB = new ProcessBuilder(ruta);

		try {

			pB.start();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
	public void Ruta2(String ruta2) throws IOException {

		ProcessBuilder pB = new ProcessBuilder(ruta2);

		try {

			pB.start();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
