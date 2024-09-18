package day37_tasks;

public final class Ebay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void uploadProduct() {
        System.out.println("you are uploading your Product to Amazon");
    }

    @Override
    public void viewCart() {
        System.out.println("You are viewing ebay cart");

    }

    @Override
    public void payForShipping(boolean isPayed) {
        if (isPayed) {
            System.out.println("FREE SHIPPING FOR EBAY PURCHASE!");
        }  else {
            System.out.println("HAVE TO PAY FOR SHIPPING IN EBAY !");
        }
    }

    @Override
    public void buyItem() {
        System.out.println("you are buying an item from ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("you are returning an item from ebay");
    }
}
