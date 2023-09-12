
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypes
{

    public static void main(String[] args) 
    {
        int i =10;
        double f = 9.5;
       f +=i;
        boolean flag = true;
        flag = !flag;

        while (i<100){
            System.out.println(i++);
            System.out.println(flag);
            System.out.println(f);
        }
    }
}