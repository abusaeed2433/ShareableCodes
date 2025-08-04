
public class HelloWorld {

    public static void main(String[] args) {

        // 1. Write your code for taking `principal amount`, `rate of interest`

        // 2. Take time input and store it in `strTime`
        String strTime; // scanner.next();

        double time = 20;
        // 3. Find the numeric part from the time using substring or other method, and store it in the variable named `time`

        double year;
        if(strTime.charAt(strTime.length()-1) == 'm'){
            year = time / 12.0;
        }
        else{
            year = time;
        }

        System.out.println(year);
        // 4. Use the `year` directly in formula and do the rest of the code

    }

}
