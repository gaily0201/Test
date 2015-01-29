package cn.gaily.ktl;

import java.util.List;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.database.DatabaseMeta;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.exception.KettleXMLException;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.repository.RepositoriesMeta;
import org.pentaho.di.repository.Repository;
import org.pentaho.di.repository.RepositoryDirectory;
import org.pentaho.di.repository.UserInfo;
import org.pentaho.di.repository.filerep.KettleFileRepository;
import org.pentaho.di.repository.kdr.KettleDatabaseRepository;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * <p>Title: KettleExecutor</P>
 * <p>Description: kettle文件执行器,支持job执行和trans执行</p>
 * <p>ATTENTION: 路径, 名称最好不要有中文！！</P>
 * @author xiaoh
 * @version 1.0
 * @since 2014-10-12
 */
public class KettleExecutor {

	/**
	  * <p>方法名称：execJob</p>
	  * <p>方法描述：执行本地Job文件</p>
	  * @param jobName
	  * @author xiaoh
	  * @since 2014-8-15
	  * <p> history 2014-8-15 xiaoh 创建 <p>
	  */
	public static void execJob(String jobName) {
		try {
			KettleEnvironment.init();
			JobMeta jobMeta = new JobMeta(jobName, null);
			Job job = new Job(null, jobMeta);
			job.start();
			job.waitUntilFinished();
		} catch (KettleException ke) {
		ke.printStackTrace();
		} catch (SecurityException e) {
		e.printStackTrace();
		}
	}
	 
	public static void execRJob(String jobName){
		try {
			KettleEnvironment.init();
			DatabaseMeta dbmeta = new DatabaseMeta("", "Oracle", "Native", "192.168.1.100", "orcl", "1521", "uap63_", "1");
			RepositoriesMeta rmeta = new RepositoriesMeta();
			rmeta.addDatabase(dbmeta);
			Repository repository = new KettleDatabaseRepository();
			repository.connect("admin", "admin");
			JobMeta jobMeta = new JobMeta(jobName, repository);
			Job job = new Job(repository, jobMeta);
			job.start();
			job.waitUntilFinished();
		} catch (KettleXMLException e) {
			e.printStackTrace();
		} catch (KettleException e) {
			e.printStackTrace();
		}
	}
	
	
	 /**
	  * <p>方法名称：execTrans</p>
	  * <p>方法描述：执行本地转换文件</p>
	  * @param fileName
	  * @author xiaoh
	  * @since 2014-8-15
	  * <p> history 2014-8-15 xiaoh 创建 <p>
	  */
	 public static void execTrans(String fileName){
	  try {
//		 EnvUtil.environmentInit();
		 KettleEnvironment.init();
	   	 TransMeta transMeta = new TransMeta(fileName);
	   	 Trans trans = new Trans(transMeta);
	  	 trans.execute(null);
	  	 trans.waitUntilFinished();
	  } catch (KettleException e) {
		  e.printStackTrace();
	  }
	 }

	//测试
	public static void main(String[] args) {
	  String jobName = "c:\\testTimeStamp.kjb";
	  execJob(jobName);
	}
}
