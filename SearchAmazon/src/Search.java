import java.util.List;

import org.openqa.selenium.WebElement;

import AutomationPackage.txtSearchItems;


public class Search {
	public static void main(String[] args) {
	List<WebElement> list = null;
	list = txtSearchItems.WriteAndExecute("ratched");
	//System.out.println(list.size());
	// System.out.println(list);
	for (WebElement el : list) {

		if (txtSearchItems.isPrime(el)) {
			System.out.println(txtSearchItems.getName(el));
			System.out.println(txtSearchItems.getPrice(el));
			txtSearchItems.clickOnItem(el);
			txtSearchItems.AddToCart(el);
			txtSearchItems.login();
			
		}

	}
}
}
}
