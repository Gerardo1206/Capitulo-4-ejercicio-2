package ejercicio.pkg2;

public class Billing {
    public Float computeBill(Float total){
        Float a=total;
        Float b=(total)* 8 /100;
        a=a+b;
        return a;
    }
    public Float computeBill(Float total, Integer cantidad){
        Float a=total*cantidad;
        Float b=(a)* 8 /100;
        a=a+b;
        return a;
    }
    public Float computeBill(Float total, Integer cantidad,Float coupon){
        Float a=total*cantidad;
        a=a-coupon;
        Float b=(a)* 8 /100;
        a=a+b;
        return a;
    }
}
