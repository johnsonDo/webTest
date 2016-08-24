package java_thread_practice_CSDN;

/**
 * Created by jiangdongcheng on 16/8/14.
 */
public class TicketOffice{
    private int ticketNum = 0;

    public TicketOffice(int num){
       this.ticketNum = num;
    }

    public void setTicketNum(int num){
        this.ticketNum = num;
    }

    public int getTicketNum(){
        return ticketNum;
    }

    // 出售车票的方法
    public synchronized void sellTicket(){
        ticketNum--;
        if(ticketNum > 0){
            System.out.println("剩余票数:"+ticketNum);
        }else{
            System.out.println("余票不足,售票失败!");
        }
    }

}


