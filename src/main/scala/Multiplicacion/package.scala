/**
 * Taller #1 Multiplicacion eficiente de numeros enteros positivos
 * Package.scala
 * Oscar David Cuaical Lopez (202270657)
 * Jose Miguel Fuertes Benavides (202224623)
 */
import scala.annotation.tailrec

package object Multiplicacion {

  def PeasantAlgorithm(a: Int, b: Int): Int = {
    if (a == 0) 0
    else if (a % 2 == 0) PeasantAlgorithm(a / 2, b + b) else b + PeasantAlgorithm(a / 2, b + b)
  }


  def PeasantAlgorithmIt(x: Int, y: Int): Int = {
    @tailrec
    def multiplicacion(multiplicando: Int, multiplicador: Int, resultado: Int): Int = {
      if (multiplicando == 0) resultado
      else if (multiplicando % 2 == 1) multiplicacion(multiplicando / 2, multiplicador + multiplicador, resultado + multiplicador)
      else multiplicacion(multiplicando / 2, multiplicador + multiplicador, resultado)
    }
    multiplicacion(x, y, 0)
  }


  def splitMultiply(a: Int, b: Int): Int = {
    if (a < 10 && b < 10) {
      a * b
    } else {

      def contarDigitos(numero: Int): Int = {
        @tailrec
        def contarRecursivo(n: Int, contador: Int): Int = {
          if (n == 0) contador
          else contarRecursivo(n / 10, contador + 1)
        }
        contarRecursivo(numero, 0)
      }

      def numeroConMasDigitos(a: Int, b: Int): Int = {
        val digitosA = contarDigitos(a)
        val digitosB = contarDigitos(b)
        Math.max(digitosA, digitosB)
      }
      def calcularM(a: Int, b: Int): Int = numeroConMasDigitos(a, b) / 2
      def calcularX(a: Int, b: Int): Int = a / Math.pow(10, calcularM(a, b)).toInt
      def calcularY(a: Int, b: Int): Int = a % Math.pow(10, calcularM(a, b)).toInt
      def calcularZ(a: Int, b: Int): Int = b / Math.pow(10, calcularM(a, b)).toInt
      def calcularW(a: Int, b: Int): Int = b % Math.pow(10, calcularM(a, b)).toInt

      val multiplicaXZ = splitMultiply(calcularX(a, b), calcularZ(a, b))
      val multiplicaYZ = splitMultiply(calcularY(a, b), calcularZ(a, b))
      val multiplicaXW = splitMultiply(calcularX(a, b), calcularW(a, b))
      val multiplicaYW = splitMultiply(calcularY(a, b), calcularW(a, b))

      val result = multiplicaXZ * Math.pow(10, 2 * calcularM(a, b)).toInt +
        (multiplicaYZ + multiplicaXW) * Math.pow(10, calcularM(a, b)).toInt + multiplicaYW
      result
    }
  }


  def fastMultiply(a: Int, b: Int): Int = {
    if (a < 10 && b < 10) {
      a * b
    } else {

      def contarDigitos(numero: Int): Int = {
        @tailrec
        def contarRecursivo(n: Int, contador: Int): Int = {
          if (n == 0) contador
          else contarRecursivo(n / 10, contador + 1)
        }
        contarRecursivo(numero, 0)
      }

      def numeroConMasDigitos(a: Int, b: Int): Int = {
        val digitosA = contarDigitos(a)
        val digitosB = contarDigitos(b)
        Math.max(digitosA, digitosB)
      }
      def calcularM(a: Int, b: Int): Int = numeroConMasDigitos(a, b) / 2
      def calcularX(a: Int, b: Int): Int = a / Math.pow(10, calcularM(a, b)).toInt
      def calcularY(a: Int, b: Int): Int = a % Math.pow(10, calcularM(a, b)).toInt
      def calcularZ(a: Int, b: Int): Int = b / Math.pow(10, calcularM(a, b)).toInt
      def calcularW(a: Int, b: Int): Int = b % Math.pow(10, calcularM(a, b)).toInt

      val multiplicaXZ = fastMultiply(calcularX(a, b), calcularZ(a, b))
      val multiplicaYW = fastMultiply(calcularY(a, b), calcularW(a, b))
      val resta1 = calcularX(a,b)- calcularY(a,b)
      val resta2 = calcularZ(a,b) - calcularW(a,b)
      val produco = fastMultiply(resta1, resta2)

      val result = multiplicaXZ*Math.pow(10, 2*calcularM(a,b)).toInt +
        (multiplicaXZ+multiplicaYW-produco)*Math.pow(10, calcularM(a,b)).toInt + multiplicaYW
      result
    }
  }
}
