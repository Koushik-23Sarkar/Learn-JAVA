public class demo {
    public static void main(String[] args){
        float f = 0.7f;

        System.out.printf("%.20f%n", f);

    }
}


// byte b = 42;     how will java store this number.




//  byte b = -42;   how will java store this number.
/**
 * 1. JAVA store (-ve) number using 2's compliment.
 * 2. 1st we convert (42) into binary number. (00101010)
 * 3. (00101010) ---> 1st complement -----> (11010101)
 * 4. (11010101) + (1) ----> 2's complement.
 * 5. now this 2's complement will store into the memory.
 * 
 * */

/**         stored binary number into actual number
 * 1. computer will understand store binary number is a (-ve) using MSB.
 * 2. if(MSB==1) => (-ve)       //      if(MSB==0) => (+ve)
 * 3. convert that binary into 1st compliment
 * 4. convert that 1st compliemnt into 2nd compliment by adding +1
 * 5. now convert that binary into number.
 * 
 */


// Case of 0's
/** To handle 0's we use 2's compliments.
 * 
 * 
 */


// Floating Points 
/** 
 * SEE COA notes
 * 
 */

/** 
 * Beacuse it store floating point using symbol--Exponent--Mantissa,
 * forthat, sometime we get approximent value of a floating number. (ex: 0.7)
 * To solve this problem, we have 'BigDecimal' (it store exact value, not approximent value)
 */

// For Floating Point, Bias = 127 is used.
// For double, 64bits, Bias = 1023  (exp=11bits)  

