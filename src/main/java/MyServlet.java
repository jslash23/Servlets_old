import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(urlPatterns = "/test")

public class MyServlet extends HttpServlet {

    private static final  ItemService itemService = new ItemService();
    private static final ItemDAO itemDAO = new ItemDAO();
    private final Item item = new Item();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.getWriter().println(req.getParameter("param"));//должен возвращать в окно браузера введенное значение
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //считываем стрим приходящий из Постмана (метод POST)
        //мапим данные Гибернейтом
        //добавляем ай ди и даты
        //сохраняем в БД

        try {
            item.setName(req.getParameter("name"));
            item.setDescription(req.getParameter("description"));
            itemService.doPostService(item);
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Something wrong!!!");
            e.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
        //
        //делаем запрос req.getParameter("itemId") вызываем параметр  "itemId"
        // и по айдишнику который получили делаем удаление объекта из БД
    }
}
