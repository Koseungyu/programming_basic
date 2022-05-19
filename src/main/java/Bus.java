public class Bus extends Car{
    int id;
    int maxCustomers;
    int currentCustomers;
    int fee;
    int oil;
    int currentSpeed;
    boolean status;

    public Bus(int id, int oil, int currentSpeed) {
        this.id = (int)(Math.random()*30)+1;
        this.maxCustomers = 30;
        this.currentCustomers = 0;
        this.fee = 0;
        this.oil = oil;
        this.currentSpeed = currentSpeed;
        this.status = false;
    }

    @Override
    public void turnOnOff(){
        if(status) {
            status = false;
            System.out.println("시동끕니다.");
        }else{
            status = true;
            System.out.println("시동겁니다.");
        }
    }
    @Override
    public void fuel(){
        System.out.println("현재 주유량은 "+this.oil+"L입니다.");
        if(this.oil==0) {
            System.out.println("차고지행");
            turnOnOff();
        }else if(this.oil<10) {
            System.out.println("주유가 필요합니다.");
        }else if(this.oil>=10){
            System.out.println("현재 주유량은 운행에 지장없습니다.");
        }
    }

    public void passenger(int currentCustomers){
        if(currentCustomers<=30){
            System.out.println("현재 탑승 인원 "+currentCustomers+"명. 운행 가능합니다.");
        }else {
            System.out.println("탑승인원 30명 초과 운행할 수 없습니다.");
        }
    }

    @Override
    public void lowSpeed(int low){
        System.out.println("현재 속도- "+this.currentSpeed+"km/h.");
        this.currentSpeed = currentSpeed-low;
        System.out.println("기존 속도 대비 " +low+ "km/h 줄여 " +this.currentSpeed+ "km/h로 운행합니다.");
    }

    @Override
    public void highSpeed(int high){
        System.out.println("현재 속도- "+this.currentSpeed+"km/h.");
        this.currentSpeed = currentSpeed+high;
        System.out.println("기존 속도 대비 " +high+ "km/h 높여 " +this.currentSpeed+ "km/h로 운행합니다.");
    }
}
