import java.util.Scanner;
public class FrequencyChart
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int oneTen = 0;
        int tenTwen = 0;
        int twenThir = 0;
        int thirFour = 0;
        int fourFif = 0;
        int fifSix = 0;
        int sixSev = 0;
        int sevEigh = 0;
        int eighNine = 0;
        int nineOne = 0;
        
        int length;
        System.out.println("How many numbers do you want to enter?");
        length = input.nextInt();
        
        int[] nums = new int [length];
        
        for(int i = 0; i < length; i++) 
        {
            System.out.println("Enter your number(1-100): "+(i+1));
            nums[i] = input.nextInt();
            if(nums[i] > 0 && nums[i] < 11){oneTen++;}
            else if(nums[i] > 10 && nums[i] < 21){tenTwen++;}
            else if(nums[i] > 20 && nums[i] < 31){twenThir++;}
            else if(nums[i] > 30 && nums[i] < 41){thirFour++;}
            else if(nums[i] > 40 && nums[i] < 51){fourFif++;}
            else if(nums[i] > 50 && nums[i] < 61){fifSix++;}
            else if(nums[i] > 60 && nums[i] < 71){sixSev++;}
            else if(nums[i] > 70 && nums[i] < 81){sevEigh++;}
            else if(nums[i] > 80 && nums[i] < 91){eighNine++;}
            else if(nums[i] > 90 && nums[i] < 101){nineOne++;}
        }
        
        System.out.println(" 1 - 10 | "+printStars(oneTen));
        System.out.println("11 - 20 | "+printStars(tenTwen));
        System.out.println("21 - 30 | "+printStars(twenThir));
        System.out.println("31 - 40 | "+printStars(thirFour));
        System.out.println("41 - 50 | "+printStars(fourFif));
        System.out.println("51 - 60 | "+printStars(fifSix));
        System.out.println("61 - 70 | "+printStars(sixSev));
        System.out.println("71 - 80 | "+printStars(sevEigh));
        System.out.println("81 - 90 | "+printStars(eighNine));
        System.out.println("91 - 100| "+printStars(nineOne));
    }
    
    public static String printStars(int x) 
    {
        String stars = "";
         for(int i = 0; i < x; i++)
        {
            stars += "*";
        }
        return stars;
    }
}
