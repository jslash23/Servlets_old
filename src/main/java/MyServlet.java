import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

public class MyServlet extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException{
    response.getWriter().println("Test!!! Privet!!!!");
}
@Override
    public void destroy(){
    super.destroy();
}

@Override
    public void init() throws ServletException {
    super.init();
}
}
