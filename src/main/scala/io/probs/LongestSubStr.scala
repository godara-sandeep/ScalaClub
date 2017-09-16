package io.probs

/**
  * Created by sandeepgodara on 9/15/17.
  */
object LongestSubStr {

  def longestSubStr(str:String):String={

    def makeSubStr(source:String, sstr:String = ""):String = {
      val (head, tail) = source.splitAt(1)
      if(sstr.contains(head))
        sstr
      else
        makeSubStr(tail, sstr+head)
    }

    val subStrings = for(i <- 0 until str.length) yield makeSubStr(str.substring(i))
    subStrings.fold(""){(prev, curr) => if(prev.length > curr.length) prev else curr}

  }


  def longestSubStr2(str:String, list:List[String]=""::Nil):String={
    if(str.length==0) ("" /: list){(prev, curr) =>
      if(prev.length>curr.length) prev else curr
    }
    else {
      val (char, strTail) = str.splitAt(1)
      val (head, tail) = list.splitAt(1)
      val currentSubStr = head.head
      val idx = currentSubStr.indexOf(char)
      if (idx >= 0)
        longestSubStr2(strTail, (currentSubStr.splitAt(idx+1)._2 + char) :: list)

      else longestSubStr2(strTail, (currentSubStr + char) :: tail)
    }
  }

}