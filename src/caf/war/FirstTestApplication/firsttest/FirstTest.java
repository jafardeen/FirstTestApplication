/**
 * 
 */
package caf.war.FirstTestApplication.firsttest;

/**
 * @author jaja
 *
 */

import javax.portlet.PortletPreferences;

public class FirstTest  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient caf.war.FirstTestApplication.FirstTestApplication firstTestApplication = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public FirstTest() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.FirstTestApplication.FirstTestApplication getFirstTestApplication()  {
		if (firstTestApplication == null) {
		    firstTestApplication = (caf.war.FirstTestApplication.FirstTestApplication)resolveExpression("#{FirstTestApplication}");
		}
		return firstTestApplication;
	}
}