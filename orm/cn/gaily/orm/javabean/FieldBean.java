package cn.gaily.orm.javabean;

/**
 * <p>Title: FieldBean</P>
 * <p>Description: 字段实体</p>
 * SELECT A.COLUMN_NAME, A.DATA_TYPE, A.DATA_LENGTH, A.NULLABLE, B.COMMENTS;
 * @author xiaoh
 * @version 1.0
 * @since 2014-9-5
 */
public class FieldBean {

	public String columnName;
	
	public String dataType;
	
	public String dataLength;
	
	public String nullAble;
	
	public String comment;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDataLength() {
		return dataLength;
	}

	public void setDataLength(String dataLength) {
		this.dataLength = dataLength;
	}

	public String getNullAble() {
		return nullAble;
	}

	public void setNullAble(String nullAble) {
		this.nullAble = nullAble;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
