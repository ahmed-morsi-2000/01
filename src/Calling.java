class First01 extends Thread{

    public void run(){
        for (int x=0; x<5; x++){
            System.out.println("Hallo First01 !!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class First02 extends Thread{
    public void run(){
        for (int x=0; x<5; x++){
            System.out.println("Hallo First02 !!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class MainFunction implements Runnable{

    public static void main(String[] args) {
        First01 f01 = new First01();

        First02 f02 = new First02();

        f01.start();
        f02.start();

    }



    @Override
    public void run() {

    }
}