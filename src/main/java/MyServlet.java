import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/test")

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //передадим в джаву параметры с веб страницы
        //(req.getParameterValues("param") тут возвращаем param который ввели  на веб страничке
        //если ввели localhost:8040/test?param=val
        //то на вебстранице будет val
        resp.getWriter().println(req.getParameter("param"));//должен возвращать в окно браузера введенное значение
    //?param = val;   param это ключ,    val это значение
        //ключи не должны повторяться
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //чтоб сохранить юзера в базе нам нужно передать его поля
        //через обычный броузер это не сделать, потому что в строке броузера всегда GET запрос
        //тут нужно считать пост запрос
        req.getInputStream(); //данные приходят в боди
        //req.getReader();

        //считать наши стримы и соотнести или промапить наши ключи к полям объектов

        super.doPost(req, resp);
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
        // и по айдишнику который получили делаем удаление
    }

  /*  @Override//этот метод вызывается автоматичесски, когда мы закрываем контейнер(shut down)
//при дестрое происходит освобожение ресурсов, сервлет становится неактивным
//Garbage collector очищает память
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }*/
//init метод запускается для регистрации сервлета



    //servlet registration - init     создали
    //servlet works with service metod  поработали
    //to close servlet with its resources destroy() когда нужно удалили

    //HTTP REQUES:
    //GET - get some info гет не может передавать большие данные
    //POST - save some info
    //пост запрос обладает возможностью  отправлять данные на сервер

    //PUT - update
    //DELETE delete info from BD

    //CRUD


//test?param=val
    //test?param=1
    //test?param=SomeName
    //test?param=19.11.2020
    //test?param=19.12.2020
    //test?param=product

}
