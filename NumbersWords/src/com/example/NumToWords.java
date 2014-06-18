/**
 * 
 */
package com.example;

/**
 * @author venkateshp
 *
 */
public class NumToWords {
	public static String numToWord(Integer i) {

		 final  String[] units = { "Zero", "One", "Two", "Three",
		        "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
		        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
		        "Seventeen", "Eighteen", "Nineteen" };
		 final  String[] tens = { "", "", "Twenty", "Thirty", "Forty",
		        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		    if (i < 20)
		        return units[i];
		    if (i < 100)
		        return tens[i / 10] + ((i % 10 > 0) ? " " + numToWord(i % 10) : "");
		    if (i < 1000)
		        return units[i / 100] + " Hundred"
		                + ((i % 100 > 0) ? " and " + numToWord(i % 100) : "");
		    if (i < 1000000)
		        return numToWord(i / 1000) + " Thousand "
		                + ((i % 1000 > 0) ? " " + numToWord(i % 1000) : "");
		    return numToWord(i / 1000000) + " Million "
		            + ((i % 1000000 > 0) ? " " + numToWord(i % 1000000) : "");
		}
	public static void main(String[] args) {
		System.out.println(NumToWords.numToWord(454));
	}

}
