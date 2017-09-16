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
    val start = Instant.now()
    Console println longestSubStr("abcedasdfklasdfqwertyuiopasdfghjkl;zxcvbnmadeeffjqwerttyuiopasdfghjkl;zxcvbnmsilkjlksdfoieoiuweroijwerlkjsd;flkjsdf;lkjsdfhkdflkjsdlfkjsdf;lkjsdfpoiert,mfkdjd;ldfllldasdfgrtyoipweljzdlkjsdflkj")
    val time = Duration.between(start, Instant.now())
    Console println "Time: "+time.toMillis
  }

  it should "return the longest substr using another approach " in{
    longestSubStr2("abcbea") shouldEqual "cbea"
    val start = Instant.now()
    Console println longestSubStr2("abcedasdfklasdfqwertyuiopasdfghjkl;zxcvbnmadeeffjqwerttyuiopasdfghjkl;zxcvbnmsilkjlksdfoieoiuweroijwerlkjsd;flkjsdf;lkjsdfhkdflkjsdlfkjsdf;lkjsdfpoiert,mfkdjd;ldfllldasdfgrtyoipweljzdlkjsdflkj")
    val time = Duration.between(start, Instant.now())
    Console println "Time: "+ time.toMillis
  }




}
