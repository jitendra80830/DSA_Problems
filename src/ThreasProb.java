
class ThreasProb {
    public static void main(String[] args){
        Hacker_Earth h = new Hacker_Earth();
        h.start();

        while (h.isAlive()){
            try {

                h.sleep(10);
            }catch (Exception e){
                System.out.println("hello");
            }
            System.out.println("HackerEarth");
        }

    }
}
class Hacker_Earth extends Thread{
    public void run(){
        System.out.println("hi");
    }
}
