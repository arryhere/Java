

// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

// public class java_regex_1 {
//     public static void main(String[] args) {
//         Pattern p = Pattern.compile(".m");
//         Matcher m = p.matcher(".am");
//         boolean b = m.matches();
//         System.out.println(b);

//         boolean b2 = Pattern.matches(".m" , "am");
//         System.out.println(b2);

//         boolean b3 = Pattern.compile(".m").matcher("em").matches();
//         System.out.println(b3);

//         System.out.println("1 " + Pattern.matches("[amn]", "acd"));
//         System.out.println("2 " + Pattern.matches("[^amn]", "c"));
//         System.out.println("3 " + Pattern.matches("[a-zA-Z]", "T"));
//         System.out.println("4 " + Pattern.matches("[^a-zA-Z]", "$"));
//         System.out.println("5 " + Pattern.matches("[MS]{2}[a-z]{5}", "SSohini"));
//         System.out.println("6 " + Pattern.matches("[xyz]?", "x"));      //appears 1 or does not occur
//         System.out.println("7 " + Pattern.matches("[xyz]+", "x"));      //occur 1 or more than 1
//         System.out.println("8 " + Pattern.matches("[xyz]*", ""));       //occur 0 or more than 0
//         System.out.println("9 " + Pattern.matches("\\d", "1"));
//         System.out.println("10 " + Pattern.matches("\\D", "#c"));
//     }
// }