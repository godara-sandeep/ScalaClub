package io.probs

object FindIndicies {
  def findTargetIndices(in:Array[Int],target:Int): Tuple2[Int,Int] ={
    var map = Map[Int,Int]();
    for(index <- 0 to in.length - 1)
      map += (in(index) -> index)

    for(element <- in.zipWithIndex) {
      val remValue = target - element._1
      if(map.contains(remValue)){
        val index = map.get(remValue).get
        val newIndex = (element._2,index)
        return newIndex;
      }
    }
    return Tuple2(-1,-1)
  }

}
