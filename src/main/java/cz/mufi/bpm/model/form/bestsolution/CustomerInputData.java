package cz.mufi.bpm.model.form.bestsolution;

import cz.mufi.bpm.model.enums.EetClass;

/**
 * Input data of {@link Customer}. The search for the best solutions for particular {@link Customer} is based on these data.
 * 
 * @author zdenek
 *
 */
public class CustomerInputData {

	/**
	 * Type of business.
	 */
	//private EetClass eetClass;
	
	/**
	 * The average number of sales per day.
	 */
	private int averageSalesNum;

//	public EetClass getEetClass() {
//		return eetClass;
//	}
//
//	public void setEetClass(EetClass eetClass) {
//		this.eetClass = eetClass;
//	}

	public int getAverageSalesNum() {
		return averageSalesNum;
	}

	public void setAverageSalesNum(int averageSalesNum) {
		this.averageSalesNum = averageSalesNum;
	}
}
