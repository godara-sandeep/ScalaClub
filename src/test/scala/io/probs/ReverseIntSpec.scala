package io.probs

import java.time.{Duration, Instant}

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by sandeepgodara on 9/20/17.
  */
class ReverseIntSpec extends FlatSpec with Matchers{

  import ReverseInt._

  "Rev " should "reverse given int and result in 0 if overflows" in {
    val start = Instant.now()
    rev(123456789) shouldEqual 987654321
    rev(1563847412) shouldEqual 0
    rev(-2147483647) shouldEqual 0
    rev(1) shouldEqual 1
    rev(-1) shouldEqual -1
    rev(-855) shouldEqual -558
    rev(Int.MaxValue) shouldEqual 0
    val time = Duration.between(start, Instant.now())
    Console println "Total Time by Sandeep: "+time.toNanos
  }
}
