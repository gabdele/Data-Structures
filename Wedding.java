public class Wedding extends Couple{
    short[] date = new short[3];
    // [0]=month, [1]=day, [2]=year
    String location;

    public Wedding(Person bride, Person groom, short[] date, String location ){
        super(bride,groom);
        this.date = date;
        this.location = location;
    }
    public short[] getDate(){
        return date;
    }
    public void setDate(short[] date) {
        this.date = date;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
}
