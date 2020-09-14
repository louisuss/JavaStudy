package studyclass;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas==0) {
            System.out.println("No gas");
            return false;
        }
        System.out.println("gas");
        return true;
    }

    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("gas: " + gas);
                gas -= 1;
            } else {
                System.out.println("gas: " + gas);
                return;
            }
        }
    }
}
