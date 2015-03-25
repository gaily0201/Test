package cn.gaily.example2;

import java.util.Date;
import java.util.Set;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleJob
  implements Job
{
  private static Logger _log = LoggerFactory.getLogger(SimpleJob.class);

  public void execute(JobExecutionContext context)
    throws JobExecutionException
  {
    JobKey jobKey = context.getJobDetail().getKey();
    System.out.println(("Executing job: " + jobKey + " executing at " + new Date() + ", fired by: " + context.getTrigger().getKey()));

    if (context.getMergedJobDataMap().size() > 0) {
      Set<String> keys = context.getMergedJobDataMap().keySet();
      for (String key : keys) {
        String val = context.getMergedJobDataMap().getString(key);
        System.out.println((" - jobDataMap entry: " + key + " = " + val));
      }
    }

    context.setResult("hello");
  }
}