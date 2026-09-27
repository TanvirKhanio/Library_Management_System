import file.FileManager;

public class Main {

    public static void main(String[] args) {

        FileManager file = new FileManager();

        file.addMember("1, Tanvir");
        file.addMember("2, Rahim");

        System.out.println("\nAll Members:");

        file.showMembers();


        System.out.println("\nUpdating Member:");

        file.updateMember(1, "1, Tanvir Khan");


        System.out.println("\nAfter Update:");

        file.showMembers();


        System.out.println("\nDeleting Member:");

        file.deleteMember(2);


        System.out.println("\nAfter Delete:");

        file.showMembers();
    }
}
