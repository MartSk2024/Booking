import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));

        guest2.setBirthdate(LocalDate.of(1995, 4, 5));

        Guest guest0 = new Guest("–", "–", LocalDate.of(1, 1, 1));
        // guest0 je prázdný spolubydlící (spolurezervující) pro dvojlůžkové a třílůžkové pokoje.
        // Vysvětlení: Předpokládá se, že hotel obsahuje nejvýše třílůžkové pokoje.
        // U každého rezervovaného pokoje je jeden host hlavní a zbývající osoby v pokoji
        // (jsou-li nějaké) jsou jeho spolubydlící. Pokud např. v třílůžkovém pokoji budou
        // jen dva hosté (host + spolubydlící1), bude spolubydlící2 prádný (bez jména
        // a příjmení a s neexistujícím datem narození).

        System.out.println(guest1.getGuestFirstname()+" "+guest1.getGuestSurname()+" ("+guest1.getBirthdate()+")");
        System.out.println(guest2.getGuestFirstname()+" "+guest2.getGuestSurname()+" ("+guest2.getBirthdate()+")");

        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3, BigDecimal.valueOf(2400));

        Bookings booking1 = new Bookings(room1, guest1, guest0, guest0, LocalDate.of(2021, 7, 15), LocalDate.of(2021, 7, 26), false);
        Bookings booking2 = new Bookings(room3, guest1, guest2, guest0, LocalDate.of(2021, 9, 7), LocalDate.of(2021, 9, 14), true);

        List<Bookings> listOfBookings = new ArrayList<>();
        listOfBookings.add(booking1);
        listOfBookings.add(booking2);

        List<Bookings> copyOfBookings = new ArrayList<Bookings>(listOfBookings);

        System.out.println(listOfBookings.get(0).getRoom().getRoomNumber()
                     +", "+listOfBookings.get(0).getGuest().getGuestFirstname()+" "+listOfBookings.get(0).getGuest().getGuestSurname()
                     +", "+listOfBookings.get(0).getRoomMate1().getGuestFirstname()+" "+listOfBookings.get(0).getRoomMate1().getGuestSurname()
                     +", "+listOfBookings.get(0).getRoomMate2().getGuestFirstname()+" "+listOfBookings.get(0).getRoomMate2().getGuestSurname()
                     +", "+listOfBookings.get(0).getStart()+", "+listOfBookings.get(0).getEnd()+", "+listOfBookings.get(0).isVacation());

        System.out.println(listOfBookings.get(1).getRoom().getRoomNumber()
                     +", "+listOfBookings.get(1).getGuest().getGuestFirstname()+" "+listOfBookings.get(1).getGuest().getGuestSurname()
                     +", "+listOfBookings.get(1).getRoomMate1().getGuestFirstname()+" "+listOfBookings.get(1).getRoomMate1().getGuestSurname()
                     +", "+listOfBookings.get(1).getRoomMate2().getGuestFirstname()+" "+listOfBookings.get(1).getRoomMate2().getGuestSurname()
                     +", "+listOfBookings.get(1).getStart()+", "+listOfBookings.get(1).getEnd()+", "+listOfBookings.get(1).isVacation());

        for (Bookings bookingItem : listOfBookings) {
            System.out.println(bookingItem.getRoom().getRoomNumber()
                         +", "+bookingItem.getGuest().getGuestFirstname()+" "+bookingItem.getGuest().getGuestSurname()
                         +", "+bookingItem.getRoomMate1().getGuestFirstname()+" "+bookingItem.getRoomMate1().getGuestSurname()
                         +", "+bookingItem.getRoomMate2().getGuestFirstname()+" "+bookingItem.getRoomMate2().getGuestSurname()
                         +", "+bookingItem.getStart()+", "+bookingItem.getEnd()+", "+bookingItem.isVacation());
        }
    }
}