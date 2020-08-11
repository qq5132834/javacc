package sics.seiois.ei.grammar.ree.dto;

import java.util.List;

public class ReeCondition {

	private List<ReeTableInfo> xReeTableInfoList;
	private List<ReeTableInfo> yReeTableInfoList;
	
	public List<ReeTableInfo> getxReeTableInfoList() {
		return xReeTableInfoList;
	}
	public void setxReeTableInfoList(List<ReeTableInfo> xReeTableInfoList) {
		this.xReeTableInfoList = xReeTableInfoList;
	}
	public List<ReeTableInfo> getyReeTableInfoList() {
		return yReeTableInfoList;
	}
	public void setyReeTableInfoList(List<ReeTableInfo> yReeTableInfoList) {
		this.yReeTableInfoList = yReeTableInfoList;
	}
	
}
