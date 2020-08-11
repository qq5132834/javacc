package sics.seiois.ei.grammar.ree.dto;

import java.util.HashSet;
import java.util.Set;

public class ReeTableInfo {
	
	private String tableName;
	private String aliasName;
	private Set<String> columnName = new HashSet<String>();
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public Set<String> getColumnName() {
		return columnName;
	}
	public void setColumnName(Set<String> columnName) {
		this.columnName = columnName;
	}
	
	@Override
	public String toString() {
		return "tableName:" + tableName + ",aliasName:" + aliasName + ",columnName:" + this.columnName.toString();
	}
	public static void main(String[] args) {
		"".split("\\.");
		String str = "ML(";
		str = str.replaceAll("\\(", "");
		System.out.println(str);
	}
	
	
}
