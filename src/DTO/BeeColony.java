package DTO;

public class BeeColony extends Colony implements Role {
    private String type;

    public BeeColony() {
    }

    public BeeColony(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of bees");
    }

    @Override
    public String toString() {
        return "the colony size " + super.getSize()
                + " the colony place is" + super.place
                + "the colony type is " + this.getType();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
