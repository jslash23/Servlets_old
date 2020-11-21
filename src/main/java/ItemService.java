
import java.io.IOException;

public class ItemService {

      final static ItemDAO itemDAO = new ItemDAO();

    public Item doGet() throws Exception {
        return itemDAO.doGet();//
    }

    public void doPostService(Item item) throws IOException {
        itemDAO.save(item);//
    }

    public Item doPut() throws Exception {
        return itemDAO.doPut();//
    }

    public Item doDelete() throws Exception {
        return itemDAO.doDelete();//
    }

}
