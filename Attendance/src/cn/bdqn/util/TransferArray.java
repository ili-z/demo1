package cn.bdqn.util;

public class TransferArray {
	/**
	 * String[]	�? Int[]
	 * @param arrs
	 * @return
	 */
	public static int[] StringToInt(String[] arrs) {
		int[] ints = new int[arrs.length];
	    for(int i=0;i<arrs.length;i++){
	        ints[i] = Integer.parseInt(arrs[i]);
	    }
	    return ints;
	}
}
