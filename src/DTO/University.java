package DTO;

public class University extends Organization {
    protected String name;

    public University() {
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    @Override
    public void communicateByTool() {
        System.out.println("communicate by voice");
    }

    public void enroll() {
        System.out.println("enrollment documents and enrollment fees");
    }

    public void educate() {
        System.out.println("provide education at university standard");
    }

    @Override
    public String toString() {
        return "development of Knowledge";
    }
}
