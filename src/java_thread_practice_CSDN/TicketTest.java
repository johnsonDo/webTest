package java_thread_practice_CSDN;

/**
 * Created by jiangdongcheng on 16/8/14.
 */
public class TicketTest {

    public static void main(String[] args) {
       final TicketOffice to = new TicketOffice(100);

        // 启动10个线程，即10个窗口开始卖票
        for(int i=0;i<10;i++){

            new Thread(new Runnable(){

                @Override
                public void run() {

                    // 当还有剩余票的时候，就去执行
                    while (to.getTicketNum() > 0){

                        to.sellTicket();
                        System.out.println("我的线程名字是:"+Thread.currentThread().getName());
                    }

                }

            }).start();
        }
    }
}
