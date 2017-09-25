package io.probs

/**
  * Created by sachinvardhan on 9/22/2017.
  */

// Dynamic Programming
// 1. Optimal Structure
// 2. Overlapping SumProblems

object BinomialCoefficient {
  def OptimalBinomial( n : Int, k : Int):Int={
    if( n==k || k==0){
     return 1
    }
    else{
      OptimalBinomial(n-1,k-1) + OptimalBinomial(n-1,k)
    }
  }
}
