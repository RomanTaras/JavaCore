package lesson7.Task1;

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

    public static void main(String[] args) {


        SU_27 Predator = new SU_27();
        Predator.getStartEngine();
        Predator.getFlightsUp();
        Predator.getStealthTechnology();
        Predator.getNuclearStrike();
        Predator.getTurbocharging();

    }
}
