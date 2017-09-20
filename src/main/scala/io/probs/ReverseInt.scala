package io.probs

/**
  * Created by sandeepgodara on 9/20/17.
  */
object ReverseInt {

  def rev(n:Int, res:Int=0):Int=
    if(n==0)res
    else {
      if (Math.abs(Int.MaxValue / 10)  < Math.abs(res)) 0 else
        rev(n / 10, res * 10 + n % 10)
    }
}
