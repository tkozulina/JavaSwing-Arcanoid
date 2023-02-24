
package arcanoid;


public class ThreadMove implements Runnable {
    
    
    private volatile boolean canMove=true;
    private int delay;//задержка
    private Thread self;
    private JBoxFrame frame;// window
    
    

    public ThreadMove(int delay, JBoxFrame frame) {
        this.delay = delay;
        this.frame=frame;//передаем окно
        self= new Thread(this);
    }
    
      public void start(){
          self.start();
      }
     
   public void stop(){
   canMove=false;
   
   }

    @Override
    public void run() {
      
        try {
        while(canMove){
           frame.moveBox();
           Thread.sleep(delay);//задержка для анимации
        } }
        catch(InterruptedException ex){}
       
       
       
       }
        
    }
    
    

