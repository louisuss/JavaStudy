package study06;

public class MemberCopy implements Cloneable {
    public String id;
    public String name;
    public String pwd;
    public int age;
    public boolean adult;

    public MemberCopy(String id, String name, String pwd, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.adult = adult;
    }

    public MemberCopy getMember() {
        MemberCopy cloned = null;
        try {
            cloned = (MemberCopy)clone();
        } catch (CloneNotSupportedException e){}
        return cloned;
    }
}
