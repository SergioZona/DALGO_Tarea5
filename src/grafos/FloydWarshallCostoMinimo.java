package grafos;

/**
 * Clase que implementa el algoritmo de Floyd Warshall para la solución del problema de costo mínimo.
 * @author Kevin Steven Gamez Abril y Sergio Julian Zona Moreno
 */
public class FloydWarshallCostoMinimo implements AlgoritmoCostoMinimo{

	/**
	 * Implementación del algoritmo de Bellman Ford
	 */
	@Override
	public int[][] costoMinimo(int[][] grafo) {
		int dp[][]= new int[grafo[0].length][grafo[0].length];
		
		//Inicialización de variables
		int i=0;
		int j=0;
		int k=0;
		int n=grafo[0].length;
		
		while(k<=n)
		{
			//Ecuación de recurrencia
			if(k==0)
			{
				dp[i][j]=grafo[i][j];
			}
			else if(k>0 && i!=k && j!=k)
			{
				dp[i][j]=Math.min(dp[i][j], dp[i][k-1]+dp[k-1][j]);
			}
			
			//Recorrido de la matriz.
			if(j<n-1)
			{
				++j;
			}
			else if(j==n-1 && i<n-1)
			{
				++i;
				j=0;
			}
			else if(j==n-1 && i==n-1) //Es necesario efectuar |V| veces la relajación de vértices para llegar a la solución.
			{
				++k;
			}
		}
		
		return dp;
	}

}


