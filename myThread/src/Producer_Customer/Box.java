package Producer_Customer;

public class Box {
    private int milk;
    private boolean state = false;  //表示奶箱状态

    /*
    存储牛奶
     */
    public synchronized void put(int milk) {
        //如果有牛奶，就等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶就生产
        this.milk = milk;
        System.out.println("存入第" + this.milk + "瓶牛奶");
        //生产完毕 修改奶箱状态
        state = true;

        //唤醒其他等待线程
        notifyAll();
    }

    /*
        获取牛奶
    */
    public synchronized void get() {
        //如果没有牛奶，就等待生产
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶， 就消费
        System.out.println("拿到第" + this.milk + "瓶牛奶");

        //消费完  修改状态
        state = false;

        //唤醒其他等待线程
        notifyAll();
    }
}
