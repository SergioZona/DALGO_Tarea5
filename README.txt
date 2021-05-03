Integrantes
Kevin Steven Gamez Abril (201912514)

Sergio Julian Zona Moreno (201914936)

Tarea 6
Parte 1
Aclaraciones preliminares: Se incluye un archivo de pruebas en la carpeta docs del proyecto que contiene los argumentos del programa para corrrerlo con las diferentes matrices (testCases.txt). En los argumentos se usa , ejemplo: "FloydWarshall distances100.txt". Estas se configuran dando click izquierdo sobre la clase CostoMinimo.java->Run As->Run Configurations, en Main Class debe estar seleccionado CostoMinimo y en la parte de Arguments en Program arguments se colocan los argumentos del programa.

Si el calificador desea añadir otro .txt de prueba, por favor insertelo en la carpeta data del proyecto.

Las clases donde se implementaron los algoritmos estan basados en algunas páginas, los links de estas se encuentran al inicio de cada clase, damos completo crédito a los autores y referenciamos su uso libre dentro del marco legal correspondiente. No buscamos generar plagio, ni tampoco tener inconvenietes asociados al mismo.

Entrada: . Ver ejemplos (testCases.txt). Salidas: La consola imprime la matriz de costos, al finalizar imprime el tiempo que tardo el algoritmo.

Tiempos de ejecución
Matriz: distances5.txt

Dijkstra (milliseconds): 0 BellmanFord (milliseconds): 0 FloydWarshall (milliseconds): 0

Matriz: distances100.txt

Dijkstra (milliseconds): 25 BellmanFord (milliseconds): 381 FloydWarshall (milliseconds): 22

Matriz: distances1000_202110.txt

Dijkstra (milliseconds): 4665 BellmanFord (milliseconds): No finaliza en tiempo adecuado. FloydWarshall (milliseconds): 1937

Análisis: El algoritmo que obtuvo mejor tiempo de ejecución fue FloydWarshall seguido de Dijkstra y por último BellmanFord. Si bien, la complejidad teórica de FloydWarshall y Dijkstra concuerdan, BellmanFord tuvo anormalidades que impiden la finalización con la matriz de 1000 vertices.

Parte 2
Se incluye un archivo con una matriz de prueba en la carpeta data del proyecto que contiene (BFS_test_case). En los argumentos del programa se usa , ejemplo: "distances100.txt". Estas se configuran dando click izquierdo sobre la clase BFS.java->Run As->Run Configurations, en Main Class debe estar seleccionado BFS y en la parte de Arguments en Program arguments se colocan los argumentos del programa.

Si el calificador desea añadir otro .txt de prueba, por favor insertelo en la carpeta data del proyecto.

Las clases donde se implementaron los algoritmos estan basados en algunas páginas, los links de estas se encuentran al inicio de cada clase, damos completo crédito a los autores y referenciamos su uso libre dentro del marco legal correspondiente. No buscamos generar plagio, ni tampoco tener inconvenietes asociados al mismo.

Entrada: . Salidas: La consola imprime los componentes conectados que existen y los vertices que contienen.

Parte 3
Se incluye un archivo con una matriz de prueba en la carpeta data del proyecto que contiene (DFS_test_case). En los argumentos del programa se usa , ejemplo: "distances100.txt". Estas se configuran dando click izquierdo sobre la clase DFS.java->Run As->Run Configurations, en Main Class debe estar seleccionado DFS y en la parte de Arguments en Program arguments se colocan los argumentos del programa.

Si el calificador desea añadir otro .txt de prueba, por favor insertelo en la carpeta data del proyecto.

Las clases donde se implementaron los algoritmos estan basados en algunas páginas, los links de estas se encuentran al inicio de cada clase, damos completo crédito a los autores y referenciamos su uso libre dentro del marco legal correspondiente. No buscamos generar plagio, ni tampoco tener inconvenietes asociados al mismo.

Entrada: . Salidas: La consola imprime si hay ciclos y el orden topografico de no haberlos.