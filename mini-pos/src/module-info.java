module com.jdc.pos {
	
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	
	opens com.jdc.pos to javafx.fxml;
	exports com.jdc.pos;

}