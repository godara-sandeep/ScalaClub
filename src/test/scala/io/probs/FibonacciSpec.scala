package io.probs

import org.scalatest.FlatSpec

/**
  * Created by sandeepgodara on 9/13/17.
  */
import java.time.{Duration, Instant}
class FibonacciSpec extends FlatSpec{

  import Fibonacci._

  "Fib " should "produce nth fibonacci num" in {
    fib(40)
    val start = Instant.now()
    fib(40)
    val time = Duration.between(start, Instant.now())
    Console println "Fibo Time: "+ time.toMillis

  }

  "Fib Memonized" should "produce result in less time" in{
    fibMemoized(40)
    val start = Instant.now()
    fibMemoized(40)
    val time = Duration.between(start, Instant.now())
    Console println "Fib memoized Time: "+ time.toMillis
  }

  "Fib Tabulated" should "produce result in ? " in{
    fibTabulated(40)
    val start = Instant.now()
    fibTabulated(40)
    val time = Duration.between(start, Instant.now())
    Console println "FibTabulated Time: "+ time.toMillis
  }

}
