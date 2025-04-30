package ch06.sec08.exam03;

public class Car {
    int gas = 6;

    public void CheckGasAmount(){
        if(gas>0){

        System.out.println("gas가 있습니다");
        }
        else if(gas==0){
            System.out.println("gas를 주입하세요");
        }
    }
    public void StartEngine(){
        System.out.println("출발합니다");
    }
    public void Drive() {
        --gas;
        if(gas>0){
            System.out.printf("달립니다");
            System.out.println(" (gas잔량) : " + gas);
        }

        if(gas==0){
            System.out.printf("멈춥니다");
            System.out.println(" (gas잔량) : " + gas);
            CheckGasAmount();
        }
    }
}
