package java_thread_practice_bymyself;

/**
 * Created by jiangdongcheng on 16/8/14.
 */
public class Food {
    private int num;  //食物数量,食物总量不能超过10,也不能小于0

    public Food(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    //生产食物
    public synchronized void product(){
        while (num == 10){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        num++;
        System.out.println(Thread.currentThread().getName()+"生产一个食物,现在总量为:"+getNum());
        notifyAll();
    }
    //消费食物
    public synchronized void xf(){
        while(num == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        num--;
        System.out.println(Thread.currentThread().getName()+"消费了一个食物,现在总量为:"+getNum());
        notifyAll();
    }

}
