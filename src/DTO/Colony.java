package DTO;

public class Colony extends Organization {
    protected String place;

    public Colony() {
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    @Override
    public void communicateByTool() {
        System.out.println("communicate by sound");
    }

    public void grow() {
        System.out.println("growth that begins");
    }

    public void reproduce() {
        System.out.println("reproduce itself");
    }

    @Override
    public String toString() {
        return "the colony size is" + super.getSize() +
                ", the colony's place is " + this.place;
    }
}
