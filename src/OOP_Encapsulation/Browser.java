package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
	System.out.println("launch Browser"); 
	checkBrowserVersion();
	checkOsCompatibility();
	checkRAMSpace();
	checkUpdateAvailable();
	System.out.println("browser is launched");
 }
	
	private void checkBrowserVersion() {
		System.out.println("launch Browser version"); 
	 }
	
	private void checkOsCompatibility() {
		System.out.println("launch Browser with osCompatibility"); 
	 }
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace"); 
	 }
	
	private void checkUpdateAvailable() {
		System.out.println("checkUpdateAvailable"); 
	 }
}
