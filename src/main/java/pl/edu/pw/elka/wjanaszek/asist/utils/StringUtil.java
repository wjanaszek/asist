package pl.edu.pw.elka.wjanaszek.asist.utils;

public class StringUtil {
    public static String removeQuotesAndDoubleQuotes(String s) {
        s = s.replace("\"", "");
        return s.replace("\'", "");
    }
}
