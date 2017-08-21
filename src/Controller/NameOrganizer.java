package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Game;

/**
 * Servlet implementation class NameOrganizer
 */
@WebServlet("/NameOrganizer")
public class NameOrganizer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameOrganizer() {
        super();
        // TODO Auto-generated constructor stub
    }

	//Called only after Players enter their names
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Game game = (Game)request.getSession().getAttribute("game");
		String firstName;
		
		for(int i=0;i<game.getNumOfPlayers();i++){
			
			firstName = request.getParameter("fname"+i);
			game.addPlayer(firstName);
			
		}
		
		PlayerRandomizer pr = new PlayerRandomizer(game);
		pr.assignPlayers();
		request.getSession().setAttribute("game", game);
		request.getRequestDispatcher("playerList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
