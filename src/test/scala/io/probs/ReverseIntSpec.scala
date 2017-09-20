package io.probs

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by sandeepgodara on 9/20/17.
  */
class ReverseIntSpec extends FlatSpec with Matchers{

  import ReverseInt._

  "Rev " should "reverse given int and result in 0 if overflows" in {
    rev(123456789) shouldEqual 987654321
    rev(1563847412) shouldEqual 0
    rev(-2147483647) shouldEqual 0
    rev(1) shouldEqual 1
    rev(Int.MaxValue) shouldEqual 0
  }
}
