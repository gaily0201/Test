package cn.gaily.example1;

import java.util.Date;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class MainApp {

	
	private void run(){
		try{
			SchedulerFactory sf = new StdSchedulerFactory();
		    Scheduler sched = sf.getScheduler();
		    
		    JobDetail job = JobBuilder.newJob(MySimpleJob.class).withIdentity("job1", "group1").build();
		    
		    CronTrigger trigger = (CronTrigger)TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
		    		.withSchedule(CronScheduleBuilder.cronSchedule("15-45 * * * * ?")).build();
		    
		    Date ft = sched.scheduleJob(job, trigger);
		    
		    sched.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		MainApp task = new MainApp();
		task.run();
	}

	
	
	
}
