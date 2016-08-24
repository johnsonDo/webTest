package java_thread_imooc_ch2;

/**
 * Created by jiangdongcheng on 16/8/14.
 */
public class ArmyRunnable implements Runnable {

    volatile boolean keepRunning = true;

    @Override
    public void run() {
      while(keepRunning){
          //发动5连击
          for (int i=0;i<5;i++){
              System.out.println(Thread.currentThread().getName()+"进攻对方"+i+"次");
              //让出cpu资源,来和其他线程争抢,达到交替进攻的效果.
              Thread.yield();
          }
      }
        System.out.println(Thread.currentThread().getName()+"结束了战斗!");
    }
}
