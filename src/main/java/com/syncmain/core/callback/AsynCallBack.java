package com.syncmain.core.callback;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author pan_java
 *
 */
public abstract class AsynCallBack implements Runnable,Serializable {

	protected Object methodResult;

	public void run() {
		doNotify();
	}

	public final void setInokeResult(Object object) {
		// set method inoke result
		this.methodResult = object;
		//ccc
	}

	/**
	 * execute callback
	 */
	public abstract void doNotify();

	public static void main(String[] args) {
		/*System.out.println(new BigDecimal(9976.00100089 - 9974.01000089 - 1.99));
		System.out.println(new BigDecimal(9976.00100089 - 9974.0000089 - 1.99));
		System.out.println(new BigDecimal(1.01234560 + 1 - 1.99000000 - 0.01234560));
		System.out.println(new BigDecimal(9.09900000 * 2 - (9.99000000 + 8.08800000)));
		System.out.println(new BigDecimal(1.099 - 0.8 - 0.000001));*/
		System.out.println(new BigDecimal(990.00900000).subtract(new BigDecimal(940.00900000).add(new BigDecimal(49.90000000))));
		System.out.println(new BigDecimal(990.00900000).subtract(new BigDecimal(890.00900000).add(new BigDecimal(88.90000000))));
		for (int i = 0; i < 5000; i++) {
			new Thread(
					new Runnable() {
						public void run() {
							
						}
					}
			);
		}
	}

}
