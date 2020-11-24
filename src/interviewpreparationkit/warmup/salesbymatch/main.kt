package interviewpreparationkit.warmup.salesbymatch

import java.util.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {

    val distinctSocks = ar.distinct()

    val counts = distinctSocks.map { item -> ar.count{ it == item} }
    val pairCounts = counts.map { it / 2 }

    return pairCounts.sum()
}

fun main(args: Array<String>) {

    /** TEST INPUT
     *
     * 9
     * 10 20 20 10 10 30 50 10 20
     *
     * **/
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
