public class ItemService {

    private static final ItemDAO itemDAO = new ItemDAO();

    public  Item doGet() throws Exception{
        return itemDAO.doGet();//
    }
    public  Item doPost() throws Exception{
        return itemDAO.doPost();//
    }

    public  Item doPut() throws Exception{
        return itemDAO.doPut();//
    }

    public  Item doDelete() throws Exception{
        return itemDAO.doDelete();//
    }

}
