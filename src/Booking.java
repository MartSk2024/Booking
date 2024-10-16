import java.time.LocalDate;

public class Booking {
    private Room room;
    private Guest guest;
    private Guest roomMate1;
    private Guest roomMate2;
    private LocalDate start;
    private LocalDate end;
    private boolean isVacation;

    public Booking(Room room, Guest guest, Guest roomMate1, Guest roomMate2, LocalDate start,
                   LocalDate end, boolean isVacation) {
        this.room = room;
        this.guest = guest;
        this.roomMate1 = roomMate1;
        this.roomMate2 = roomMate2;
        this.start = start;
        this.end = end;
        this.isVacation = isVacation;
    }
    // atributy třídy Bookings. U každé rezervace je jeden host hlavní a další
    // případné osoby v pokoji jsou jen jeho spolubydlící (spolubydlící1 a
    // a spolubydlící2). Viz též komentář ve třídě Main.

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Guest getRoomMate1() {
        return roomMate1;
    }

    public void setRoomMate1(Guest roomMate1) {
        this.roomMate1 = roomMate1;
    }

    public Guest getRoomMate2() {
        return roomMate2;
    }

    public void setRoomMate2(Guest roomMate2) {
        this.roomMate2 = roomMate2;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public boolean isVacation() {
        return isVacation;
    }

    public void setVacation(boolean vacation) {
        isVacation = vacation;
    }
}
