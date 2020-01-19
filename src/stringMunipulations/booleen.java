package stringMunipulations;

import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.MagicApiIntrinsics;

public class booleen {
    public static void main(String[] args) {
        String str = " Love is around the word  ";
        String str2 = " burger";
        String str3 = " ";
        boolean check_capital_L =  str.startsWith("L");
        boolean check_ends_d = str.endsWith("d");
        boolean equals_to_another_string = str.equals(str2);
        boolean equals_ignore_cases = str.equalsIgnoreCase(str2);
        boolean is_str3_Empty = str3.isEmpty();
//        boolean  check_ifContains = str.contains("LOVE");
        System.out.println("check capital L" + check_capital_L);
        System.out.println(" ends with d " + check_ends_d  );
        System.out.println("equals "+ equals_to_another_string);
        System.out.println("equals ignore case "+ equals_ignore_cases);
        System.out.println("is str3 empty ?" + is_str3_Empty);
//        System.out.println(" is Love in the string " = check_ifContains );
    }
}
