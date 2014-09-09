package cn.gaily.orm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
	public String columnName();
	
	public String dataType();
	
	public int dataLength() default 20;
	
	public String nullAble() default "Y";
	
	public String comment() default "";
	
}
