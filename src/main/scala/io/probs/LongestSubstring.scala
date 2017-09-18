package io.probs

/**
* created by Sachin Vardhan 9/16/17
*/

import scala.collection.mutable

import scala.util.control.Breaks._

object LongestSubstring {
    def lengthOfLongestSubstring(s: String): Int = {
      val len = s.length
      var out = 0
      var max =0
      for(i <- 0 until len/2){
        val mapper = new mutable.ListMap[Char, Int]
        mapper += (s(i) -> 1)
        breakable(
          for( j <- i+1 until len){
            if(mapper.keySet.exists(_ == s(j))){
              break
            }
            else{
              mapper += (s(j) -> 1)
            }
          }
        )
        out = mapper.size
        if(max <= out){
          max = out
        }
      }
      max
    }

  def lengthOfLongestSubstring2(s : String) : Int = {
    val len = s.length
    var ans = 0
    val arr: Array[Int] = new Array[Int](128)
    var i =0
    for(j <- 0 to len-1){
      i= Math.max(arr(s.charAt(j)),i)
      ans = Math.max(ans, j-i+1)
      arr(s.charAt(j)) = (j+1)
    }
    ans
  }

}
