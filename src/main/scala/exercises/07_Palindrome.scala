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
  	if (s.length == 0) {
  		true
  	} else if (!s.charAt(0).isLetter) {
  		isPalindrome(s.slice(1,s.length))
  	} else if (!s.charAt(s.length-1).isLetter) {
  		isPalindrome(s.slice(0, s.length-1))
  	} else if (s.take(1).toUpperCase.equals(s.takeRight(1).toUpperCase)) {
  		isPalindrome(s.slice(1,s.length - 1))
  	} else {
  		false
  	}

}