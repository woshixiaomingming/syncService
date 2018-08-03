package com.syncmain.core.callback;

import java.io.Serializable;

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

}
