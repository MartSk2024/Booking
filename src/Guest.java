import java.time.LocalDate;

public class Guest {
    private String guestFirstname;
    private String guestSurname;
    private LocalDate birthdate;

    public Guest(String guestFirstname, String guestSurname, LocalDate birthdate) {
        this.guestFirstname = guestFirstname;
        this.guestSurname = guestSurname;
        this.birthdate = birthdate;
    }
    // atributy třídy Guest

    public String getGuestFirstname() {
        return guestFirstname;
    }

    public void setGuestFirstname(String guestFirstname) {
        this.guestFirstname = guestFirstname;
    }

    public String getGuestSurname() {
        return guestSurname;
    }

    public void setGuestSurname(String guestSurname) {
        this.guestSurname = guestSurname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
