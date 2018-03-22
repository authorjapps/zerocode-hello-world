package org.jsmart.zerocode.testhelp.tests.parallelrundemo;


import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelTestRunner {

    @Test
    public void testParallel() {
        //Class[] cls = {ParallelRunDemoTest.class, AnotherTest.class};
        Class[] cls = {ParallelRunDemoTest.class};

        // Parallel among classes
        System.out.println("---------------------------- Started running parallely- classes");
        JUnitCore.runClasses(ParallelComputer.classes(), cls);
        System.out.println("---------------------------- Finished running parallely- classes");

        // Parallel among methods in a class
        System.out.println("---------------------------- Started running parallely- methods");
        JUnitCore.runClasses(ParallelComputer.methods(), cls);
        System.out.println("---------------------------- Finished running parallely- methods");

        // Parallel all methods in all classes
        System.out.println("---------------------------- Started running parallely- classes n methods");
        JUnitCore.runClasses(new ParallelComputer(true, true), cls);
        System.out.println("---------------------------- Finished running parallely- classes n methods");
    }
}