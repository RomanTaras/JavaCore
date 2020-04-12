package Task1;

class SU_27 extends Plane implements PlaneFeatures {
    int maxSpeed = 2500;
    int stealthTime = 300;
    int maxAtomicBombs = 10;

    @Override
    public void getTurbocharging() {
        System.out.println("Turbo chasging speed = " + (maxSpeed + (int) (Math.random() * 1001)) + " km/h ");
    }

    @Override
    public void getStealthTechnology() {
        System.out.println("Time when plane is invisible = " + ((int) (Math.random() * (stealthTime++))) + " s ");
    }

    @Override
    public void getNuclearStrike() {
        System.out.println("The number of dropped atomic bombs " + ((int) (Math.random() * maxAtomicBombs)) + " unit ");
    }
//    public String getMovement(String "turnLeft"; String"turn right"; String "doesUp";String  "goesDowm"){
//        System.out.println("La-la-la");
//        return null;
//    }


    @Override
    public String toString() {
        return "SU_27{" +
                "maxSpeed=" + maxSpeed +
                ", stealthTime=" + stealthTime +
                ", maxAtomicBombs=" + maxAtomicBombs +
                '}';
    }
}
