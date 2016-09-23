package exercises

object Palindrome {
  /** 
   *  True if the string is a palindrome, after removing all non-alphabetic 
   *  characters (e.g., spaces, numbers, and punctuation).
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
  def isPalindrome(s: String): Boolean = 
  	if (s.length <= 1) {
  		true
  	} else if (s.take(1).equals(s.takeRight(1))) {
  		println(s.slice(1,s.length - 1))
  		isPalindrome(s.slice(1,s.length))
  	} else {
  		false
  	}

}