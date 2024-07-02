

public class RaceCondition implements Runnable{

    private int count;

    public void run(){
         for(int i=0;i<5;i++){
             try{
                 Thread.sleep(i*100);
                  count++;
             }catch(InterruptedException e){
                 e.printStackTrace();
             }
        
       
        }
    }
    
    public int getCount(){
    return count;

    }
    public static void main(String[] args) throws InterruptedException{
        RaceCondition r=new RaceCondition();

        Thread t1=new Thread(r);
        t1.start();

        Thread t2=new Thread(r);
        t2.start();

        t1.join();
        t2.join();
        System.out.println("count:"+ r.getCount());

    

   
    } 


}