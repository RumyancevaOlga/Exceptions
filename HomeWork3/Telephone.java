public class Telephone {
    
    private long telephone;

    public Telephone(long telephone) {
        this.telephone = telephone;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "{" + telephone + "}";
    }
}
