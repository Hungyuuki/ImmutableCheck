public class Testimmutablestring {

    public static void main(String[] args) {
        String string1 = "Code";
        String string2 = "Gym";
        String string3 = "CodeGym";
        String string4 = string1.concat(string2);
        String string5 = string1 + string2;
        string1 = string1.concat("Gym");
        System.out.println(string1+" string 1 tham chieu moi, tuy nhien string 1 tham chieu cu van ton tai va khong thay doi");
        System.out.println(string2+" string 2");
        System.out.println(string3+" string 3");
        System.out.println(string4+" string 1 tham chieu cu + string 2");
        System.out.println(string3.equals(string4)+" So sanh String 3 and 4");
        System.out.println(string5+" giong nhu String 4");
        System.out.println(string4.equals(string5)+" so sanh String 4 and 5");
        System.out.println(string1+" string 1 tham chieu moi");
    }
}
