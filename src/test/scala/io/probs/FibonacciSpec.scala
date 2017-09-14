package io.probs

import org.scalatest.FlatSpec

/**
  * Created by sandeepgodara on 9/13/17.
  */
class FibonacciSpec extends FlatSpec{

  import Fibonacci._

  "Fib " should "produce nth fibonacci num" in {
    fib(9)
  }

  "Fib Memonized" should "produce result in less time" in{
    fibMemoized(9)
  }

  "Fib Tabulated" should "produce result in ? " in{
    assert{fibTabulated(9) == 34}
  }

}
