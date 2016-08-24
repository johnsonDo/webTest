package java_thread_practice_bymyself;

/**
 * Created by jiangdongcheng on 16/8/14.
 */
public class FoodTest {
    public static void main(String[] args) {
        Food food = new Food(5);
        //创建两个生产者线程,生产食物.
        for (int i=0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        food.product();
                    }
                }
            },"pro"+i).start();
        }
        //创建10个消费者消费食物.
        for (int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        food.xf();
                    }
                }
            },"xf"+i).start();
        }

    }
}
