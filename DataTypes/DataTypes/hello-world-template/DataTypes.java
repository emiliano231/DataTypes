
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// String vabral = "value";
// (str + " " + str2)
//str1.equals(string2)
public class DataTypes
{

    public static void main(String[] args) 
    {

        String[] strArray = {"Alpha","Brovo","Charlie","Delta","Echo"};

        for (int i =0; i<strArray.length; i++) {
            System.out.print(strArray[i]);
            if (i==strArray.length-1){
                return; 
            }else {  
                System.out.print("-");

            }
        }
    }

    //int i =10;
    //double f = 9.5;
    //f +=i;
    // boolean flag = true;
    //flag = !flag;

    // while (i<100){
    //System.out.println(i++);
    // System.out.println(flag);
    //System.out.println(f);
    //}
}
