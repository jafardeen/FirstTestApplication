/**
 * 
 */
package caf.war.FirstTestApplication.firsttest;

/**
 * @author jaja
 *
 */

public class FirstTestDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.FirstTestApplication.firsttest.FirstTest firstTest = null;

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.FirstTestApplication.firsttest.FirstTest getFirstTest()  {
		if (firstTest == null) {
		    firstTest = (caf.war.FirstTestApplication.firsttest.FirstTest)resolveExpression("#{FirstTest}");
		}
		return firstTest;
	}
	
}