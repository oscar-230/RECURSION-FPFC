/**
 * Taller #1 Multiplicacion eficiente de numeros enteros positivos
 * Pruebas.sc
 * Oscar David Cuaical Lopez (202270657)
 * Jose Miguel Fuertes Benavides (202224623)
 */
import Multiplicacion._

//PRIMERA FUNCION
PeasantAlgorithm(0,0) // Esperado = 0
PeasantAlgorithm(2145,0) // Esperado = 0
PeasantAlgorithm(0,45) // Esperado = 0
PeasantAlgorithm(5,2) // Esperado = 10
PeasantAlgorithm(7,3) // Esperado = 21
PeasantAlgorithm(54,521) // Esperado = 28134
PeasantAlgorithm(542,98562) // Esperado = 53420604
PeasantAlgorithm(2145,3233) // Esperado = 6934785
PeasantAlgorithm(3598,5426) // Esperado = 19522748
PeasantAlgorithm(45,259) // Esperado = 11655
PeasantAlgorithm(8,4) // Esperado = 32
PeasantAlgorithm(69,2) // Esperado = 138
PeasantAlgorithm(87,69) // Esperado = 6003
PeasantAlgorithm(56,89) // Esperado = 4984
PeasantAlgorithm(125,236) // Esperado = 29500
PeasantAlgorithm(9658,1) // Esperado = 9658
PeasantAlgorithm(1,5615) // Esperado = 5615
PeasantAlgorithm(10025,986) // Esperado = 9884650
PeasantAlgorithm(126,252) //Esperado = 31752

//SEGUNDA FUNCION
PeasantAlgorithmIt(0,0) // Esperado = 0
PeasantAlgorithmIt(0,46) // Esperado = 0
PeasantAlgorithmIt(37,456) //Esperado = 16872
PeasantAlgorithmIt(1,5698) //Esperdao = 5698
PeasantAlgorithmIt(5658,1) //Esperado = 5658
PeasantAlgorithmIt(54,567) //Esperado = 30618
PeasantAlgorithmIt(4546,458) //Esperado = 2082068
PeasantAlgorithmIt(36,4523) //Esperado = 162828
PeasantAlgorithmIt(2145,3233) //Esperado = 6934785
PeasantAlgorithmIt(25976,45632) //Esperdao = 1185336832
PeasantAlgorithmIt(5,2) //Esperado = 10
PeasantAlgorithmIt(7,3) //Esperado = 21
PeasantAlgorithmIt(8,4) //Esperado = 32
PeasantAlgorithmIt(65,462) //Esperado = 30030
PeasantAlgorithmIt(89,56) //Esperado = 4984
PeasantAlgorithmIt(87,69) //Esperado = 6003
PeasantAlgorithmIt(895,333) //Esperado = 298035
PeasantAlgorithmIt(1589,4569) //Esperado = 7260141
PeasantAlgorithmIt(10025,986) //Esperado = 9884650
PeasantAlgorithmIt(126,252) //Esperado = 31752


//TERCERA FUNCION
splitMultiply(37,12) //Esperado = 444
splitMultiply(8,895) //Esperado = 7160
splitMultiply(5,456) //Esperado = 2280
splitMultiply(45,89) //Esperado = 4005
splitMultiply(87,45) //Esperado = 3915
splitMultiply(0,9) //Esperado = 0
splitMultiply(5,0) //Esperado = 0
splitMultiply(2145,3233) //Esperado = 6934785
splitMultiply(25976,45632) //Esperado = 1185336832
splitMultiply(895,333) //Eperado = 298035
splitMultiply(55,68) //Esperado = 3740
splitMultiply(562,32568) //Esperado = 18303216
splitMultiply(5658,7189) //Esperado = 40675362
splitMultiply(5,2) //Esperado = 10
splitMultiply(7,3) //Esperado = 21
splitMultiply(8,4) //Esperado = 32
splitMultiply(89,56) //Esperado = 4984
splitMultiply(87,69) //Esperado = 6003
splitMultiply(1589,4569) //Esperado = 7260141
splitMultiply(10025,98654) //Esperado = 989006350
splitMultiply(2354,1254) //Esperado = 2951916

//CUARTA FUNCION
fastMultiply(0,58) //Esperado = 0
fastMultiply(21,0) //Esperado = 0
fastMultiply(1,5698) //Esperado = 5698
fastMultiply(54,567) //Esperado = 30618
fastMultiply(4546,458) //Esperado = 2082068
fastMultiply(36,4523) //Esperado = 162828
fastMultiply(5,2) //Esperado = 10
fastMultiply(7,3) //Esperado = 21
fastMultiply(8,4) //Esperado = 32
fastMultiply(0,0) //Esperado = 0
fastMultiply(5658,1) //Esperado = 5658
fastMultiply(65,462) //Esperado = 30030
fastMultiply(89,56) //Esperado = 4984
fastMultiply(895,333) //Esperado = 298035
fastMultiply(1589,4569) //Esperado = 7260141
fastMultiply(2145,3233) //Esperado = 6934785
fastMultiply(25976,45632) //Esperado = 1185336832
fastMultiply(10025,986) //Esperado = 9884650
fastMultiply(2354,1254) //Esperado = 2951916

