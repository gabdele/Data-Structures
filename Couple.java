public class Couple {
    Person bride,groom;
    private Couple(){

    }
    protected Couple(Person bride, Person groom){
        this.bride = bride;
        this.groom = groom;
    }
    public void setBride(Person bride){
        this.bride = bride;
    }
    public void setGroom(Person groom) {
        this.groom = groom;
    }
    public Person getBride(){
        return bride; //.getFirst() + " " + bride.getLast()
    }
    public Person getGroom(){
        return groom; //.getFirst() + " " + groom.getLast();
    }
}
