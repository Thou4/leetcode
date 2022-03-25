public class RecentCounter {
    int [] time = new int [10000];
    int rear = 0;//队列尾
    int front = 0;//队列头

    public int ping(int t) {
        int num = 1;//记录在范围内的请求数
        time [rear] = t;
        for (int i = front; i < rear; i++) {
            if (time[rear] - 3000 <= time[i]){
                front = i;
                num++;
            }
        }
        rear++;
        return num;
    }
}
