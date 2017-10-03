package io.probs

import java.time.{Duration, Instant}

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by sandeepgodara on 9/22/17.
  */
class PascalTriangleSpec extends FlatSpec with Matchers{
  import PascalTriangle._
  "Binomial " should "return binomial num at C(n, k)" in{
    binomial(5, 2) shouldEqual 10
    binomial(4, 2) shouldEqual 6
    binomial(1, 0) shouldEqual 1
    binomial(1, 1) shouldEqual 1
    binomial(0, 0) shouldEqual 1

    val start = Instant.now()
    binomial(35, 14)
    Console println "1. Time Taken: "+Duration.between(start, Instant.now()).toMillis

  }

  "Binomial Dynamic" must "Perform faster" in{
    val start = Instant.now()
    Console println binomialDynamic(35, 14)
    Console println "2. Time Taken: "+Duration.between(start, Instant.now()).toMillis
  }

}
