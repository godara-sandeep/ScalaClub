package io.probs

/**
  * Created by sandeepgodara on 9/21/17.
  */
object NumsAddUpTarget {

  def indices(nums:Array[Int], target:Int, index:Int=0, imbr:Int=1):Array[Int]={
    if(imbr == nums.length)
      indices(nums, target, index + 1, index + 2)
    else
      if(nums(index)+nums(imbr) == target) Array(index, imbr)
    else indices(nums, target, index, imbr + 1)
  }
}
