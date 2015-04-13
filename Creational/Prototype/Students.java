package prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{
	private List<String> stuList;
	
	public Students() {
		this.stuList = new ArrayList<String>();
	}
	
	public Students(List<String> list) {
		this.stuList = list; 
	}
	
	public void loadData() {
		stuList.add("Amy");
		stuList.add("Bob");
		stuList.add("Cindy");
		stuList.add("David");
		stuList.add("Eric");
	}
	
	public List<String> getStuList() {
		return this.stuList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();
		List stuList = getStuList();
		
		for (int i=0; i<stuList.size(); i++) {
			tempList.add(stuList.get(i).toString());
		}
		
		return new Students(tempList);
	}
	
}
