package structural.proxy;

public class DBQueryExecutorProxy implements DBQueryExecutor{

    private boolean isAdmin;
    private DBQueryExecutor dbQueryExecutor;

    public DBQueryExecutorProxy(String user, String password){
        if(user.equals("admin") && password.equals("admin")){
            isAdmin =true;
        }else{
            isAdmin = false;
        }

        dbQueryExecutor = new DBQueryExecutorImpl();
    }

    @Override
    public void execute(String type, String query) throws Exception {
        if(type.equalsIgnoreCase("delete") && !isAdmin){
            throw  new Exception("Access denied");
        }
        dbQueryExecutor.execute(type, query);
    }
}
