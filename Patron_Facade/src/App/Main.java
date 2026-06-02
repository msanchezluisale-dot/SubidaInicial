package App;

import Facade.CheckoutFacade;

public class Main {
    public static void main(String [] args){
        CheckoutFacade checkout= new CheckoutFacade();
        //pedido
        checkout.procesarpedido("juan carlos","aceite 150 ml - primor",2,"BCP VISA",25.00);
        //2 pedido
        checkout.procesarpedido("Luis","Mouse inalambrico Prolink ",1,"IBK VISA", 30.00);
        //3 pedido
        checkout.procesarpedido("jose","moto 200 ml- primer",1,"BCP VISA",12000.00 );
    }
}
