package student.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentDAO
 */
@WebServlet("/studentdao")
public class StudentDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Connection con;
    public StudentDAO() {
    	
        super();
        // TODO Auto-generated constructor stub
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","system","tiger");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
	}
	public void getInfo(String name,int mobile) {
		try {
			PreparedStatement pstmt=con.prepareStatement("insert into info values(?,?)");
			pstmt.setString(1, name);
			pstmt.setInt(2, mobile);
			pstmt.executeUpdate();
			System.out.println("inserted successfully");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Connection failed");
		}
	}
}
