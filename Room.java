import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int bedsInRoom;
    private boolean isBalcony;
    private boolean isSeaView;
    private BigDecimal price;

    public Room(int roomNumber, int bedsInRoom, boolean isBalcony, boolean isSeaView, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.bedsInRoom = bedsInRoom;
        this.isBalcony = isBalcony;
        this.isSeaView = isSeaView;
        this.price = price;
    }

    public Room(int roomNumber) {
        this(roomNumber, 1, true, true, BigDecimal.valueOf(1000));
    }

    public Room(int roomNumber, BigDecimal price) {
        this(roomNumber, 3, false, true, price);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedsInRoom() {
        return bedsInRoom;
    }

    public void setBedsInRoom(int bedsInRoom) {
        this.bedsInRoom = bedsInRoom;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeaView() {
        return isSeaView;
    }

    public void setSeaView(boolean seaView) {
        isSeaView = seaView;
    }
}
