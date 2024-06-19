
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txaLista;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtcodigo;

    @FXML
    void initialize() {
        assert txaLista != null : "fx:id=\"txaLista\" was not injected: check your FXML file 'JpUniversity.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'JpUniversity.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'JpUniversity.fxml'.";
        assert txtcodigo != null : "fx:id=\"txtcodigo\" was not injected: check your FXML file 'JpUniversity.fxml'.";

    }

}
