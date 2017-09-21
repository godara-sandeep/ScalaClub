package io.probs

/**
  * Created by sachinvardhan on 9/21/2017.
  */

import java.time.{Duration, Instant}

import org.scalatest.{FlatSpec, Matchers}

class ReverseIntegerSpec extends FlatSpec with Matchers{

  import ReverseInteger._

  "Reverse " should "reverse given int and result in 0 if overflows" in {
    val start = Instant.now()
    reverse(123456789) shouldEqual 987654321
    reverse(1563847412) shouldEqual 0
    reverse(-2147483647) shouldEqual 0
    reverse(1) shouldEqual 1
    reverse(-1) shouldEqual -1
    reverse(-855) shouldEqual -558
    reverse(Int.MaxValue) shouldEqual 0
    val time = Duration.between(start, Instant.now())
    Console println "Total Time by Sachin: "+time.toNanos
  }

}
