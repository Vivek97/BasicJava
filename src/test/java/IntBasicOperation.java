public class IntBasicOperation {

/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
or35(3) → true
or35(10) → true
or35(8) → false
*/
public boolean or35(int n) {

    if(n% 3 == 0 || n%5 ==0)
        return true;

    return false;
}
/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
*/
    public boolean icyHot(int temp1, int temp2) {
        boolean result = (temp1 < 0 && temp2 >100) ? true : (temp2 < 0 && temp1 >100);
        return result;
    }

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/
    public boolean in1020(int a, int b) {
        boolean result = (a >=10 && a <= 20) ? true :(b >=10 && b <= 20);
        return result;
    }
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/

    public boolean hasTeen(int a, int b, int c) {
        boolean result = (((a >12) && (a<20)) || ((b>12)&&(b<20)) ||((c>12)&&(c<20))) ? true : false;
        return result;
    }
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/
    public boolean loneTeen(int a, int b) {
        boolean result = (a>12 && a<20 )? (b<11 || b>19) :(b>12 && b<20 );
        return result;
    }



    public static void main (String args [])
    {
        IntBasicOperation obj = new IntBasicOperation();
        obj.or35(34);
        System.out.println("result  = "+obj.or35(56));
        obj.icyHot(120,0);
        System.out.println("result  = "+obj.icyHot(120,-10));
    }

}

