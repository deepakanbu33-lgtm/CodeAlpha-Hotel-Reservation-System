import java.util.*;

class Room {
    int roomNo;
    String type;
    boolean booked = false;

    Room(int roomNo, String type) {
        this.roomNo = roomNo;
        this.type = type;
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Deluxe"));
        rooms.add(new Room(103, "Suite"));

        while (true) {
            System.out.println("\n1. View Rooms\n2. Book Room\n3. Cancel Booking\n4. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                for (Room r : rooms) {
                    System.out.println("Room " + r.roomNo + " | " + r.type + " | Booked: " + r.booked);
                }

            } else if (choice == 2) {
                System.out.print("Enter room number: ");
                int num = sc.nextInt();
                for (Room r : rooms) {
                    if (r.roomNo == num && !r.booked) {
                        r.booked = true;
                        System.out.println("Room booked successfully!");
                        break;
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter room number: ");
                int num = sc.nextInt();
                for (Room r : rooms) {
                    if (r.roomNo == num && r.booked) {
                        r.booked = false;
                        System.out.println("Booking cancelled!");
                        break;
                    }
                }

            } else {
                break;
            }
        }
        sc.close();
    }
}