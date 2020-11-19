public class ItemController {

    private final static ItemService itemService = new ItemService();

    public  Item doGet() throws Exception{
        return itemService.doGet();//
    }

    public  Item doPost() throws Exception{
        return itemService.doPost();//
    }

    public  Item doPut() throws Exception{
        return itemService.doPut();//
    }

    public  Item doDelete() throws Exception{
        return itemService.doDelete();//
    }
}
