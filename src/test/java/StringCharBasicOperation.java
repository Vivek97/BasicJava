class StringCharBasicOperations
{
/*Given a string, return a new string where the first and last chars have been exchanged
    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
  */
public String frontBack(String str) {
        char [] ch = str.toCharArray();

        if(ch.length>1)
        {
            char dummy = ch[0];
            ch[0] = ch[ch.length -1];
            ch[ch.length -1] = dummy;

        }
        return String.valueOf(ch);
    }

/*

Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
front3("Java") → "JavJavJav"
front3("") → ""
front3("ab") → "ababab"
front3("q") → "qqq"
*/

    public String front3(String str) {
        int len = str.length() > 2 ? 3 : str.length();
        str = str.substring(0,len);
        str = str + str + str;
        return str;
    }
/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
    public String backAround(String str) {
        if(str.length()>0)
        str = str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
        return str;
    }
/*

Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("") → ""
*/

    public String front22(String str) {
        int len = str.length() > 1 ? 2 : str.length();
        str = str.substring(0,len) + str + str.substring(0,len);
        return str;
    }


/*
Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
* */
    public boolean startHi(String str) {
        boolean result = str.contains("hi") ? str.substring(0,2).equals("hi") : false;
        return result;
    }

    public static void main (String args [])
    {
        StringCharBasicOperations obj = new StringCharBasicOperations();
        obj.frontBack("ab");
        obj.front3("asd");
        obj.front22("gotit");
        obj.startHi("hiii");
        obj.backAround("back");
        System.out.println("str  ="+obj.backAround(""));
    }
}

