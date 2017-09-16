package io.probs

import java.time.{Duration, Instant}

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by sandeepgodara on 9/15/17.
  */
class LongestSubStrSpec extends FlatSpec with Matchers{

  import LongestSubStr._


  "The longestSubStr method" should
    "return the longest substring in given String with no conscutive chars" in{

    longestSubStr("abcbea") shouldEqual "cbea"
    longestSubStr("abcabcbb") shouldEqual "abc"
    longestSubStr("bbbbb") shouldEqual "b"
    longestSubStr("pwwkew") shouldEqual "wke"
    val start = Instant.now()
    Console println longestSubStr("abcedasdfklasdfqwertyuiopasdfghjkl;zxcvbnmadeeffjqwerttyuiopasdfghjkl;zxcvbnmsilkjlksdfoieoiuweroijwerlkjsd;flkjsdf;lkjsdfhkdflkjsdlfkjsdf;lkjsdfpoiert,mfkdjd;ldfllldasdfgrtyoipweljzdlkjsdflkj")
    val time = Duration.between(start, Instant.now())
    Console println "1. Time: "+time.toMillis
  }

  "Efficient longestSubStr2 " should "return the longest substr using another approach [more dynamic][much efficient w/o trading off space] " in{
    longestSubStr2("abcbea") shouldEqual "cbea"
    longestSubStr2("abcabcbb") shouldEqual "abc"
    longestSubStr2("bbbbb") shouldEqual "b"
    longestSubStr2("pwwkew") shouldEqual "wke"
    val start = Instant.now()
    Console println longestSubStr2("abcedasdfklasdfqwertyuiopasdfghjkl;zxcvbnmadeeffjqwerttyuiopasdfghjkl;zxcvbnmsilkjlksdfoieoiuweroijwerlkjsd;flkjsdf;lkjsdfhkdflkjsdlfkjsdf;lkjsdfpoiert,mfkdjd;ldfllldasdfgrtyoipweljzdlkjsdflkj")
    val time = Duration.between(start, Instant.now())
    Console println "2. Time: "+ time.toMillis
  }




}
