package study06;

public class MemberCopyExample {
    public static void main(String[] args) {
        MemberCopy original = new MemberCopy("blue", "kim", "123", 25, true);
        MemberCopy cloned = original.getMember();
        cloned.pwd = "456";
        System.out.println(original.pwd);
        System.out.println(cloned.pwd);
    }
}
