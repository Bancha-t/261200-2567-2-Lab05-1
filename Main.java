public class Main{
    public static void main(String[] args) {
        User user1 = new User("John",1946,7,6);
        user1.displayInfo();

        System.out.println("________________________________________");

        Admin admin1 = new Admin("nicolas", 1964, 7, 7);
        admin1.displayInfo(false);

        System.out.println("________________________________________");

        admin1.displayInfo(true);

        System.out.println("________________________________________");
    }
}
