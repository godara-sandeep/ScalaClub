package io.probs

import java.time.{Duration, Instant}

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by sachinvardhan on 9/22/2017.
  */
class BinomialCoeffficicentSpec extends FlatSpec with Matchers{

  import BinomialCoefficient._

  "Binomial Coefficient" should "have the value as follows" in {
    val start = Instant.now()
    OptimalBinomial(20, 15) shouldEqual 15504
    val time = Duration.between(start, Instant.now())
    Console println "Total Time by Binomial: "+ time.toMillis
  }
}
