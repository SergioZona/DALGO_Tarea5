package grafos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que resuelve el inciso A de la tarea, y ejecuta los algoritmos de costos mínimos.
 * @author Kevin Steven Gamez Abril y Sergio Julian Zona Moreno
 *
 */
public class CostoMinimo {
	/**
	 * Clase main que ejecuta el programa.
	 * @param args
	 * @throws Exception Si ocurre un error al ejecutar el programa. 
	 */
	public static void main(String[] args) throws Exception {
		
		//Carga la clase del algoritmo
		String claseAlgoritmo = CostoMinimo.class.getPackage().getName()+"."+args[0]+"CostoMinimo";
		AlgoritmoCostoMinimo algoritmo = (AlgoritmoCostoMinimo)Class.forName(claseAlgoritmo).newInstance();
		
		//Carga el grafo del archivo .txt almacenado en la carpeta data.
		String nombreArchivo=args[1];
		int [][] grafo = generarGrafo(nombreArchivo);
			
		//Ejecución del algoritmo
		long startTime = System.currentTimeMillis();
		int [][] costo = algoritmo.costoMinimo(grafo);
		long endTime = System.currentTimeMillis();
		
		System.out.println("El tiempo que tardó el algoritmo "+ claseAlgoritmo+ " fue de: "+(endTime-startTime));
		String resultado="";
		//Output results
		System.out.println("Grafo:\n");
		for(int i=0;i<costo.length;++i) 
		{
			for(int j=0; j<costo.length; ++j)
			{
				resultado+=Integer.toString(costo[i][j]);
				if(j==costo.length-1)
				{
					resultado+="\n";
				}
			}
		}
		System.out.println(resultado);
	}
	
	/**
	 * Método que carga el grafo en representación matricial.
	 * @param pNombreArchivo Nombre del archivo desde donde se cargará el grafo.
	 * @throws Exception si ocurre un error al cargar el archivo.
	 * @return Grafo generado.
	 */
	public static int[][] generarGrafo(String pNombreArchivo) throws Exception
	{
		File file = new File("./data/"+pNombreArchivo);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		int [][] grafo = null;
		int i=0;
		while(br.readLine()!=null)
		{
			String [] fila = br.readLine().split("");
			if(grafo==null)
			{
				grafo=new int[fila.length][fila.length];
			}
			for(int j=0; j<fila.length; ++j)
			{
				grafo[i][j]=Integer.parseInt(fila[j].trim());
			}
			++i;
		}	
		return grafo;
	}

}
