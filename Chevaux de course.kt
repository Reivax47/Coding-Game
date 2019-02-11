import java.util.*
import java.io.*
import java.math.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    
    
    val N = input.nextInt()
    var lesdadas= arrayOf<Int>()
    
    System.err.println("$N")
    
    for (i in 0 until N) {
        //val pi = input.nextInt()
        lesdadas+= input.nextInt()
        
    }
    
    lesdadas.sort()
    var diff=arrayOf<Int>()
    
    for (t in 0..N-2){
    
        diff+=Math.abs(lesdadas[t]-lesdadas[t+1])
    }
    
    var resultat=diff.min()
   
    println("$resultat")

}
