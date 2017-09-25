package io.probs

/**
  * Created by sachinvardhan on 9/21/2017.
  */

object ReverseInteger {
  def reverse(x: Int): Int = {
    def reverset(x : Int, acc : Int ):Int = {
      if(x != 0){
        if(acc > Integer.MAX_VALUE/10 || acc < Integer.MIN_VALUE/10) 0 else
          reverset(x/10,acc*10+(x%10))
      }
      else acc
    }
    reverset(x,0)
  }
}
