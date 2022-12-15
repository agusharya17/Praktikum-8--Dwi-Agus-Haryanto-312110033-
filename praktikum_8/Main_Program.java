package praktikum_8;

public class Main_Program {
    public static void main(String[] args){
        Customer Agus = new Customer();
        Agus.nama = "Agus Haryanto";
        Agus.alamat = "Cikarang";
        
        Order Handphone = new Order();
        
        Handphone.date = 19;
        Handphone.status = "New";
        
        Payment Baru = new Payment();
        
        Baru.jumlah = 12000000;
    }  
}