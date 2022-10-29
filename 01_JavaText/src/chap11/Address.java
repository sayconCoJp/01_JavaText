package chap11;

//TODO テキストに掲載する
public class Address {

    String postalCode = "514-00001";
    String prefecture = "愛知県";
    String city = "名古屋市";
    String detail = "南区平子１丁目２－１０";

    @Override
    public String toString() {
        return postalCode + prefecture + city + detail;
    }
}
