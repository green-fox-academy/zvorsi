public class takesLonger {
    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String insert = "always takes longer than";
        String part1 = quote.substring(0, quote.lastIndexOf("you expect"));
        String part2 = quote.substring(quote.indexOf(" you expect"),quote.length());
        //System.out.println(part1);
        //System.out.println(part2);

        System.out.println(part1 + insert + part2);
    }
}
