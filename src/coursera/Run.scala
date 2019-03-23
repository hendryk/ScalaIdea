package coursera

object Run extends App {
    def sumInts(a: Int, b: Int): Int =
        if (a > b) 0 else a + sumInts(a + 1, b)

    //    println(sumInts(1, 10))

    def cube(x: Int) = x * x * x

    def same(x: Int) = x

    def sumCubes(a: Int, b: Int): Int =
        if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

    //    println(sumCubes(1, 10))

    def sum(f: Int => Int, a: Int, b: Int): Int =
        if (a > b) 0
        else f(a) + sum(f, a + 1, b)

    //    println(sum(cube, 1, 10))

    def sum2(f: Int => Int)(a: Int, b: Int): Int = {

        def loop(a: Int, acc: Int): Int = {

            println(s"a: $a - acc: $acc")
            if (a > b) acc
            else loop(a + 1, f(a) + acc)
        }

        loop(a, 0)
    }

    def silnia(x: Int, acc: Int): Int = {
        println(s"$x, $acc")
        if (x == 0) acc else silnia(x - 1, x * acc)
    }

    //    println(sum2(x => x)(1, 5))
    println(silnia(4, 1))

    def sumuni(f: Int => Int): (Int, Int) => Int = {
        def sumF(a: Int, b: Int): Int =
            if (a > b) 0
            else f(a) + sumF(a + 1, b)

        sumF
    }

    val kwadrat = sumuni(x => x * x)
    println(kwadrat(1, 5))

    println(sumuni(x => x * x)(1,5))
}
