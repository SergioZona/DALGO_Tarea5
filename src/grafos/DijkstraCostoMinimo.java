package grafos;

import java.util.PriorityQueue;

/**
 * Clase que implementa el algoritmo de Dijkstra para la solución del problema de costo mínimo.
 * @author Kevin Steven Gamez Abril y Sergio Julian Zona Moreno
 */
public class DijkstraCostoMinimo implements AlgoritmoCostoMinimo{

	/**
	 * Implementación del algoritmo de Dijkstra
	 */
	@Override
	public int[][] costoMinimo(int[][] grafo) {
		int dp[][]= new int[grafo[0].length][grafo[0].length];
		int numVertices = grafo[0].length;
		
		int[] distancia = new int[numVertices];
		int[] padre = new int[numVertices];
		boolean[] visto = new boolean[numVertices];
		for (int i = 0; i < numVertices; ++i) {
			distancia[i] = (int) Double.POSITIVE_INFINITY;
			padre[i] = -1;
			visto[i] = false;
			dp[i][i]=0;
		}
		
		for(int i=0; i<numVertices; ++i)
		{
			distancia[i]=0;
			PriorityQueue<Integer> pila = new PriorityQueue<>();
			pila.add(distancia[i]);
			while (!pila.isEmpty()) {
				int u = pila.poll();
				visto[u] = true;
				for (int j = 0; j < numVertices; j++) {
					if (grafo[u][j] != 0) {
						// Relajación del nodo.
						if (distancia[j] > distancia[u] + grafo[u][j]) {
							distancia[j] = distancia[u] + grafo[u][j];
							padre[j] = u;
							pila.add(j);
						}
					}
				}
			}
			int k=0;
			for(int j=0; j<numVertices; ++j)
			{
				if(dp[i][j]!=0)
				{
					dp[i][j]=distancia[k];
					++k;
				}				
			}
		}
		
		return dp;
	}

}
