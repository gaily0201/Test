package cn.gaily.example2;

import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SchedulerMetaData;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlugInExample
{
  public void run()
    throws Exception
  {
    Logger log = LoggerFactory.getLogger(PlugInExample.class);

    SchedulerFactory sf = new StdSchedulerFactory();
    Scheduler sched = sf.getScheduler();

    System.out.println("------- Initialization Complete -----------");

    System.out.println("------- (Not Scheduling any Jobs - relying on XML definitions --");

    System.out.println("------- Starting Scheduler ----------------");

    sched.start();

    System.out.println("------- Started Scheduler -----------------");

    System.out.println("------- Waiting five minutes... -----------");
    try
    {
      Thread.sleep(30000L);
    }
    catch (Exception e)
    {
    }

    System.out.println("------- Shutting Down ---------------------");
    sched.shutdown(true);
    System.out.println("------- Shutdown Complete -----------------");

    SchedulerMetaData metaData = sched.getMetaData();
    System.out.println("Executed " + metaData.getNumberOfJobsExecuted() + " jobs.");
  }

  public static void main(String[] args) throws Exception
  {
    PlugInExample example = new PlugInExample();
    example.run();
  }
}