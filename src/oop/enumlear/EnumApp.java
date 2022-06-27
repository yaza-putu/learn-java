package oop.enumlear;

public class EnumApp {
    public static void main(String[] args) {
        Member member = new Member();

        member.setName("yasa");
        member.setLevel(Level.PREMIUM);

        System.out.println(member.getLevel());
    }
}
