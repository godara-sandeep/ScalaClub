package io.probs

import java.time.{Duration, Instant}

import org.scalatest.{FlatSpec, Matchers}

class LongestSubStr1Spec extends FlatSpec with Matchers {
  import LongestSubStr1._

  "The findSubstr method " should
    "return the longest substring in given String with no conscutive chars" in {
    findSubstr("abcbea") shouldEqual "cbea"
    findSubstr("abcabcbb") shouldEqual "abc"
    findSubstr("bbbbb") shouldEqual "b"
    findSubstr("wwkew") shouldEqual "wke"
    val start = Instant.now()
    Console println findSubstr("abcedasdfklasdfqwertyuiopasdfghjkl;zxcvbnmadeeffjqwerttyuiopasdfghjkl;zxcvbnmsilkjlksdfoieoiuweroijwerlkjsd;flkjsdf;lkjsdfhkdflkjsdlfkjsdf;lkjsdfpoiert,mfkdjd;ldfllldasdfgrtyoipweljzdlkjsdflkj")
    val time = Duration.between(start,Instant.now());
    Console println "1. Time "+time.toMillis
  }
}