public class Person {
    private String first, last;
    public Person(String first,String last){
        this.first = first;
        this.last = last;
    }
    public String getFirst() {
        return first;
    }
    public void setFirst(String name){
        this.first = name;
    }
    public String getLast(){
        return last;
    }
    public void setLast(String name){
        this.last = name;
    }

}
