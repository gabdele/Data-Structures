public class Pizza {
static String[] toppingsList = new String[10];
static float price;
static String description;
short i;
public Pizza(String [] enteredToppings, short toppingNum ){
    price = 14;
    price += (2*toppingNum);
    toppingsList = enteredToppings;
    if(toppingNum != 0){
        description = "Pizza with";
    }
    else{description="Pizza";}
    for(i = 0; i<toppingNum; i++){
        description += (" "+enteredToppings[i]+ ",");
    }
}
void toTheString(){
    System.out.println(description+" $"+price);
    }
}
