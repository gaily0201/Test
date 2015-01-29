package cn.gaily.syn.pub.entity;

import java.io.Serializable;


/**
 * <p>Title: AggConfigVO</P>
 * <p>Description: 聚合对象，包括一个主表，多个子表</p>
 * @author xiaoh
 * @version 1.0
 * @since 2015-1-29
 */
public class AggConfigVO implements Serializable {

	private static final long serialVersionUID = -5694736307298969882L;

	
	public DBConfigVO parent = null;
	
	public TabConfigVO[] childrens = null;

	public DBConfigVO getParent() {
		return parent;
	}

	public void setParent(DBConfigVO parent) {
		this.parent = parent;
	}

	public TabConfigVO[] getChildrens() {
		return childrens;
	}

	public void setChildrens(TabConfigVO[] childrens) {
		this.childrens = childrens;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getParent().toString());
		for(TabConfigVO v: getChildrens()){
			sb.append(v.toString());
		}
		return sb.toString();
	}
	
	public String[] getTabNames(){
		String[] tabNames = new String[getChildrens().length];
		for(int i=0;i<tabNames.length;i++){
			tabNames[i] = getChildrens()[i].getTabName();
		}
		return tabNames;
	}
	
}
