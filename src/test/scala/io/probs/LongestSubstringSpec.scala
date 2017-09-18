package io.probs

/**
  * created by Sachin Vardhan 9/16/17
  */
import java.time.{Duration, Instant}
import org.scalatest.{FlatSpec, Matchers}

class LongestSubstringSpec extends FlatSpec with Matchers {

  import LongestSubstring._

  "lengthOfLongestSubstring" should "get the length of string" in {
    lengthOfLongestSubstring("pwwkew") shouldEqual 3
    val start = Instant.now()
    Console println lengthOfLongestSubstring("abcedasdfklasdfqwertyuiopasdfghjkl;zxcvbnmadeeffjqwerttyuiopasdfghjkl;zxcvbnmsilkjlksdfoieoiuweroijwerlkjsd;flkjsdf;lkjsdfhkdflkjsdlfkjsdf;lkjsdfpoiert,mfkdjd;ldfllldasdfgrtyoipweljzdlkjsdflkj")
    val time = Duration.between(start, Instant.now())
    Console println "1. Sachin Time: "+ time.toMillis
  }


  "lengthOfLongestSubstring2" should "get the length of string" in {
    lengthOfLongestSubstring2("pwwkew") shouldEqual 3
    val start = Instant.now()
    Console println lengthOfLongestSubstring2("abcedasdfklasdfqwertyuiopasdfghjkl;zxcvbnmadeeffjqwerttyuiopasdfghjkl;zxcvbnmsilkjlksdfoieoiuweroijwerlkjsd;flkjsdf;lkjsdfhkdflkjsdlfkjsdf;lkjsdfpoiert,mfkdjd;ldfllldasdfgrtyoipweljzdlkjsdflkj")
    val time = Duration.between(start, Instant.now())
    Console println "2. Sachin Time: "+ time.toMillis
  }
}
