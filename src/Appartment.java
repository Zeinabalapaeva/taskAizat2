public class Appartment {
    private String name;
    private int cost;
    private String address;
    public Appartment(String name,int cost,String address){
        this.name = name;
        this.cost = cost;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int pay(Student[] manas) {
        int n = cost / manas.length;
        return n;
    }
    public int paym(Student[] magistral){
        int a = cost / magistral.length;
        return a;
    }

}

