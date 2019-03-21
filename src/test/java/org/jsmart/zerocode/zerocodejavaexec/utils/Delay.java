package org.jsmart.zerocode.zerocodejavaexec.utils;

import org.jsmart.zerocode.zerocodejavaexec.DbSqlExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Delay {

    public void milliSeconds(int milliSec) throws InterruptedException {
        Thread.sleep(milliSec);
    }

    public void seconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

    public void minutes(int min) throws InterruptedException {
        Thread.sleep(min*60*1000);
    }

    // These should cover most of the delay scenarios
    // But you can add your own customised delay function if you need
    // and just call the same function in the step with parameters
}
