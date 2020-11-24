package interviewpreparationkit.warmup.countingvalleys

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    val intPath = path.toCharArray().toTypedArray().map {
        if(it == 'D')
            -1
        else
            1
    }

    var altitude  = 0
    var valleyCount = 0

    for(step in intPath){
        if(altitude == 0 && step < 0){ valleyCount ++ }
        altitude += step
    }

    return valleyCount
}

fun main(args: Array<String>) {

    /** TEST INPUT
     *
     * 8
     * UDDDUDUU
     *
     * **/

    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
