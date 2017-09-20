package io.probs

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by sandeepgodara on 9/21/17.
  */
class NumsAddUpTargetSpec extends FlatSpec with Matchers{

  import NumsAddUpTarget._
  "indices" should "return array containing correct indices" in{
    indices(Array(2,7,11,15), 9) shouldEqual Array(0,1)
    indices(Array(11,15,7,2), 9) shouldEqual Array(2,3)
    indices(Array(11,15,7,2,15), 30) shouldEqual Array(1,4)

  }

}
