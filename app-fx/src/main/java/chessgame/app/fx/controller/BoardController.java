package chessgame.app.fx.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

/**
 * Controller of Chessboard.
 *
 * @author Prestes, E. M.
 * @see GridPane
 * @see AbstractController
 * @see FXML
 * @since October 2016
 */
public class BoardController extends AbstractController {

    public static final String VIEW_TITLE = "Chess Game";

    public static final String VIEW_URL = String.format(VIEW_PACKAGE, "BoardView");

    @FXML
    private GridPane boardView;
}