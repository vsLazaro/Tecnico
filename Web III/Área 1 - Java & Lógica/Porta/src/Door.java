public class Door {

    private String positionedRoom;
    private boolean isOpen;
    private String color;
    private String material;

    public Door(String positionedRoom, boolean isOpen) {
        this.positionedRoom = positionedRoom;
        this.isOpen = isOpen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPositionedRoom(String positionedRoom) {
        this.positionedRoom = positionedRoom;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getPositionedRoom() {
        return positionedRoom;
    }

    @Override
    public String toString() {
        return "Door status: " +
                "\nThe " + positionedRoom + " door is " + ((isOpen) ? "open" : "closed") ;
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }
}
