package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuIemSellerAction() {
		System.out.println("onMenuIemSellerAction");
	}
	
	@FXML
	public void onMenuIemDepartmentAction() {
		System.out.println("onMenuIemDepartmentAction(");
	}
	
	@FXML
	public void onMenuIemAboutAction() {
		System.out.println("onMenuIemAboutAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
