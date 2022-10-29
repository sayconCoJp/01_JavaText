package chap10;

public class Bicycle2 extends Vehicle {

    int registryNumber;

    public Bicycle2(int registryNumber) {
        this.registryNumber = registryNumber;
    }

    @Override
    public String toString() {
        return "私の防犯登録番号は、" + this.registryNumber;
    }

}
