public class Test {
    public static void main(String[] args) {
        String str1="hehe";
        System.out.println(str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.equalsIgnoreCase("HEHE"));
        System.out.println(str1.concat("haha"));
        System.out.println(str1);
        System.out.println(str1.indexOf("h"));
        System.out.println(str1.lastIndexOf("h"));
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,4));

        String str2="     123456";
        System.out.println(str2.trim());
        System.out.println(str1.charAt(1));
        String str3="长亭外,古道边,芳草碧连天";
        String []strings=str3.split(" ");
        System.out.println(strings[0]);
    }
}
