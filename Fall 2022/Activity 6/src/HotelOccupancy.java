import java.util.Scanner;
public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int floors, rooms, occRooms, vacRooms = 0;
        double totalRooms = 0, totalOcc = 0, occRate;
        System.out.println("How many floors does your hotel have?");
        floors = input.nextInt();
        for (int i = 1; i <= floors; i++) {
            System.out.printf("How many rooms are on Floor %d?", i);
            rooms = input.nextInt();
            totalRooms += rooms;
            System.out.println("How many of those rooms are occupied?");
            occRooms = input.nextInt();
            totalOcc += occRooms;
            vacRooms += (rooms - occRooms);
        }
        occRate = Math.round(totalOcc / totalRooms * 100);
        occRate /= 100;
        System.out.printf("Here are the statistics for your hotel:\n\nFloors: %d\nRooms: %d\nOccupied Rooms: %d\nVacant Rooms: %d\nOccupancy Rate: %.2f (%d%%)", floors, (int) totalRooms, (int) totalOcc, vacRooms, occRate, (int) (occRate * 100));
    }
}
