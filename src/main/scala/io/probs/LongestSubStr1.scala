package io.probs

object LongestSubStr1 {
  def findSubstr(inputData:String):String = {
    var oldString:String = "";
    val len = inputData.length - 1

    for(counter <- 0 to len) {
      val str = new StringBuffer();
      var counter1 = counter;
      var charIndex = -1;
      while (counter1 <= len && charIndex== -1) {
        val ch = inputData charAt counter1
        charIndex = str.indexOf(String.valueOf(ch))
        if (charIndex == -1) {
          str.append(ch)
        }
        counter1 += 1
      }
      val finalString = str.toString;
      oldString = if(oldString.length() >= finalString.length) oldString else finalString
    }
    oldString
  }
}