package io.probs

import org.scalatest.{FlatSpec, Matchers}

class FindIndiciesSpec extends FlatSpec with Matchers  {
    import FindIndicies._;

   "findTargetIndices " should "find the index of target provided" in {
     val arr = Array(2, 7, 11, 15)
     val target = 9
     findTargetIndices(arr,target) shouldEqual (0,1)
     Console println findTargetIndices(Array(2, 15, 11, 15,13,11),26)
     findTargetIndices(Array(2, 15, 11, 15,13,11),26) shouldEqual (1,2)
   }
}
