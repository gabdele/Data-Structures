public class ItemOrder {
    float totalPrice;
    float y; //price per item
    String itemName;
    int q;
    public ItemOrder(Item x, int q){ //buy 2, get 1 free
        this.q = q;
        itemName = x.name;
        y = x.price;
        if(q<3){
            totalPrice = y * q;
        }
        else{
            totalPrice = (q/3) * (y*2); //deal
            totalPrice += (q%3) * y ; //extra
        }
    }
}
