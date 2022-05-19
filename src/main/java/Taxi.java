public class Taxi extends Car {
    int id;
    int oil;
    int currentSpeed;
    int destination;
    int distance;
    int fee;
    int extraFee;
    boolean status;
    boolean passenger;

    public Taxi(int id, int oil, int currentSpeed) {
        this.id = (int)(Math.random()*30)+1;
        this.oil = oil;
        this.currentSpeed = currentSpeed;
        this.destination = 0;
        this.distance = 0;
        this.fee = 0;
        this.extraFee = 0;
        this.status = false;
        this.passenger = false;
    }

    public void manInOut(){
        if(passenger){
            turnOnOff();
        }else{
            System.out.println("승객이 탑승했습니다.");
            turnOnOff();
        }
    }

    @Override
    public void turnOnOff(){
        if(status) {
            status = false;
            System.out.println("택시상태 : 이동중. 승객 추가 탑승불가");
        }else{
            status = true;
            System.out.println("택시상태 : 일반");
        }
    }

    @Override
    public void fuel(){
        System.out.println("현재 주유량은 "+this.oil+"L입니다.");
        if(this.oil<=10) {
            System.out.println("주유가 필요합니다.");
        }else{
            System.out.println("현재 주유량은 운행에 지장없습니다.");
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

    public void pay(int fee, int destination, int distance, int extraFee){
        System.out.println("목적지에 도착했습니다.");
        if(destination<=distance){
            System.out.println("요금은 "+fee+"원 입니다.");
            System.out.println("승객 내립니다.");
        }else{
            fee+=extraFee*(destination-distance);
            System.out.println("요금은 "+fee+"원 입니다.");
            System.out.println("승객 내립니다.");
        }
    }
}
