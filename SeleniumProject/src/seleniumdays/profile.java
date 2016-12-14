package seleniumdays;

public class profile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();

		profile.set Preference("intl.accept_languages","jp");

		Web driver driver = new FirefoxDriver(profile); driver.get(google.com)

	}

}
