package grafos;


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
		int V = grafo[0].length;
		int m[][]= new int[V][V];
		for (int i = 0; i < V; i++) {
			int[] fila = dijkstra(grafo, i);
			for (int j = 0; j < fila.length; j++) {
				m[i][j] = fila[j];
			}
		}
		return m;
	}

	public int[] dijkstra(int graph[][], int src)
	{
		int V =graph[0].length;
		boolean sptSet[] = new boolean[V];

		int[] dist = new int[V];
		for (int i = 0; i < V; i++)
		{
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}

		dist[src] = 0;

		for (int count = 0; count < V-1; count++)
		{
			int u = colaPrioridad(dist, sptSet);

			sptSet[u] = true;

			for (int v = 0; v < V; v++)

				if (!sptSet[v] && graph[u][v]!=0 && graph[u][v]!=-1 &&
				dist[u] != Integer.MAX_VALUE &&
				dist[u]+graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}
		return dist;
	}


	public int colaPrioridad(int dist[], boolean sptSet[])
	{
		int min = Integer.MAX_VALUE, min_index=-1;

		for (int v = 0; v < dist.length; v++)
			if (sptSet[v] == false && dist[v] <= min)
			{
				min = dist[v];
				min_index = v;
			}

		return min_index;
	}


}
