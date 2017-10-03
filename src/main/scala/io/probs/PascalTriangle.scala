package io.probs

/**
  * Created by sandeepgodara on 9/22/17.
  */
object PascalTriangle {
  def binomial(n:Int, k:Int):Long={
    if(k == 0 || k == n) 1
    else
      binomial(n - 1, k - 1) + binomial(n - 1, k)
  }

  def binomialDynamic(n:Int, k:Int):Long={
    import collection.mutable
    val tab:mutable.Map[(Int, Int), Long] = mutable.Map.empty
    def find(n:Int, k:Int):Long = {
      tab.getOrElseUpdate (n -> k,
        if(k == 0 || k == n) 1
        else
          find(n - 1, k - 1) + find(n - 1, k)
      )
    }
    find(n, k)
  }

}
