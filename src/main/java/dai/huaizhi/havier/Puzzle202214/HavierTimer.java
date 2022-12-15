package dai.huaizhi.havier.Puzzle202214;

import java.util.Timer;
import java.util.TimerTask;

public class HavierTimer {
    private int minute = 0;
    private int second = 0;
    private int second10th = 0;
    private boolean isThreadLocked = false;

    Timer timer = new Timer(true);

    public void start() {
        if(isThreadLocked){
            throw new RuntimeException("This timer is timing. A HavierTimer instance must be one thread.");
        }
        isThreadLocked = true;
        timer = new Timer();
        timer.schedule(timerTask(), 0, 100);
    }

    private TimerTask timerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                recordSecond10th();
            }
        };
    }

    private void recordSecond10th() {
        second10th++;
        checkSecond10thMax();
    }

    private void checkSecond10thMax() {
        if (second10th >= 10) {
            second++;
            second10th = 0;
        }
    }


    public String getCurrentTimer() {
        return minute + " minutes " + second + "." + second10th + "seconds";
    }

    public void cancel() {
        timer.cancel();
        initTime();
        isThreadLocked = false;
    }

    private void initTime() {
        this.second10th = 0;
        this.minute = 0;
        this.second = 0;
    }

    private void record1Second() {
        this.second ++;
        checkSecondMax();
    }



    private void checkSecondMax() {
        if (second >= 60) {
            second = 0;
            minute++;
        }
    }
}
