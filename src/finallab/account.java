package finallab;
/**
 * 
 * @author sp13-bse-015
 * this class will be abstract....
 * this is a parent class and two classes will be inhertied with this class.
 *
 */
public abstract class account {
	 protected int number;
	 protected int bal;
	 /**
	  * this function can get the number
	  * @param s
	  *  s is integer type variable and it rtuen to function
	  * @return s
	  * 
	  */
	public int getnumber(int s)
	{
		System.out.println(" get the number");
		return s;
	}
	/**
	 * this function can get the balnce
	 * @param b
	 *  b is integer type variable and it rtuen to function
	 * @return b
	 */
	public int getbalnce(int b)
	{
		System.out.println(" get the balnce");
	return b;
	} 
	public void getowner()
	{
		System.out.println(" get owner");
	}
	/**this function can get the deposit of coudtomers.
	 * 
	 * @param d
	 * d is integer type variable and it rtuen to function
	 * @return d
	 */
	public int deposit(int d)
	{
		System.out.println(" check the deposits");
	return d;
	}
	/**
	 * this function can check the with draw probabilty...
	 * @return true or false based on condition.....
	 */
 public boolean withdraw()
 {
	 System.out.println("check there withdraw");
	 return true;
 }
}
