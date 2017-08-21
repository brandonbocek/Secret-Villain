package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Game;
import Model.Player;

/**
 * Servlet implementation class Revealer
 */
@WebServlet("/Revealer")
public class Revealer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Revealer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Game game = (Game)request.getSession().getAttribute("game");
		String playerName = (String)request.getParameter("playerName");
		String selection = (String)request.getParameter("selection");
		InfoGiver ig = new InfoGiver(game, playerName);
		if(selection.equals("full")){
			ig.updatePlayerMainButton();
		}else{
			ig.updatePlayerPeekButton();
		}
		game = ig.getGame();
		Player player = game.getClickedPlayer();
		request.getSession().setAttribute("player", player);
		request.getSession().setAttribute("selection", selection);
		request.getRequestDispatcher("reveal.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
