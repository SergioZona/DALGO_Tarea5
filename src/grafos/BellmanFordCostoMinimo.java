package grafos;

/**
 * Clase que implementa el algoritmo de Bellman Ford para la solución del problema de costo mínimo.
 * @author Kevin Steven Gamez Abril y Sergio Julian Zona Moreno
 */
public class BellmanFordCostoMinimo implements AlgoritmoCostoMinimo{

	/**
	 * Implementación del algoritmo de Bellman Ford
	 */
	@Override
	public int[][] costoMinimo(int[][] graph) {
		int[][] grafo = converGraph(graph);
		int V = graph[0].length; // Number of vertices in graph
		int E = grafo.length; // Number of edges in graph
		int m[][]= new int[V][V];
		for (int i = 0; i < V; i++) {
			int[] fila = BellmanFord(grafo, V, E, i);
			for (int j = 0; j < fila.length; j++) {
				m[i][j] = fila[j];
			}

		}
		return m;
	}

	// The main function that finds shortest
	// distances from src to all other vertices
	// using Bellman-Ford algorithm. The function
	// also detects negative weight cycle
	// The row graph[i] represents i-th edge with
	// three values u, v and w.
	public int[] BellmanFord(int graph[][], int V, int E, int src)
	{
		// Initialize distance of all vertices as infinite.
		int []dis = new int[V];
		for (int i = 0; i < V; i++)
			dis[i] = Integer.MAX_VALUE;

		// initialize distance of source as 0
		dis[src] = 0;

		// Relax all edges |V| - 1 times. A simple
		// shortest path from src to any other
		// vertex can have at-most |V| - 1 edges
		for (int i = 0; i < V - 1; i++)
		{

			for (int j = 0; j < E; j++)
			{
				if (dis[graph[j][0]] != Integer.MAX_VALUE && dis[graph[j][0]] + graph[j][2] < dis[graph[j][1]])
					dis[graph[j][1]] = dis[graph[j][0]] + graph[j][2];
			}
		}

		// check for negative-weight cycles.
		// The above step guarantees shortest
		// distances if graph doesn't contain
		// negative weight cycle. If we get a
		// shorter path, then there is a cycle.
		for (int i = 0; i < E; i++)
		{
			int x = graph[i][0];
			int y = graph[i][1];
			int weight = graph[i][2];
			if (dis[x] != Integer.MAX_VALUE && 	dis[x] + weight < dis[y])
				System.out.println("Graph contains negative"
						+" weight cycle");
		}

		return dis;
	}

	public int[][] converGraph(int[][] grafo){
		int V = grafo[0].length;
		int[][] ret = new int[V*V][3];
		int k = 0;
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				if(grafo[i][j] != 0 && grafo[i][j] != -1) {
					ret[k][0] = i;
					ret[k][1] = j;
					ret[k][2] = grafo[i][j];
					k++;
				}
			}
		}

		return ret;
	}
}
