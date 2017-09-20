package io.probs

/**
  * Created by sandeepgodara on 9/13/17.
  */
object Fibonacci {

  def fib(v:Int):Int={
    if(v <= 1) 1 else fib(v-1) + fib(v - 2)
  }
  import collection.mutable.Map
  def fibMemoized(n:Int, map:Map[Int, Int]=Map()):Int={
    if(n <= 1) 1 else
      map.getOrElseUpdate(
        n,
        {
          map += (n -> (fibMemoized(n - 1, map) + fibMemoized(n - 2, map)))
          map(n)
        }
      )
  }

  def fibTabulated(n:Int, start:Int = 3, table:List[Int]= 1::1::Nil):Int={
    if(start > n) table.head else
      fibTabulated(n, start+1, table = table.take(2).sum :: table)
  }

}
