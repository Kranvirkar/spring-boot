package in.nit.service;

import in.nit.dto.Purchase;
import in.nit.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
