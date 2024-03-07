public class DeliveryPizza extends Pizza{
    String address;
    float fee;
    //float price = Pizza.price;


    DeliveryPizza(String [] enteredToppings, String address, short toppingNum){
        super(enteredToppings,toppingNum);
        if(price>18.00){
            fee = 3;
        }
        else{fee=5;}
        this.address = address;
    }
    void toTheString(){
        System.out.println(description+" $"+price+"\n+delivery fee: "
                +fee+"\ntotal price: " + (price+fee));
    }
}

