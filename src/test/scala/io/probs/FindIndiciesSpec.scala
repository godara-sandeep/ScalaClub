package io.probs

import org.scalatest.{FlatSpec, Matchers}

class FindIndiciesSpec extends FlatSpec with Matchers  {
    import FindIndicies._;

   "findTargetIndices " should "find the index of target provided" in {
     val arr = Array(2, 7, 11, 15)
     val target = 9
     findTargetIndices(arr,target) shouldEqual (0,1)

   }
}
