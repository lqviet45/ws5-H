package DTO;

public class FPTUniversity extends University implements Role {
    private String address;

    public FPTUniversity() {
    }

    public FPTUniversity(int size, String name, String adddress) {
        super(size, name);
        this.address = adddress;
    }

    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }

    @Override
    public String toString() {
        return "FPTU has four campuses";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
