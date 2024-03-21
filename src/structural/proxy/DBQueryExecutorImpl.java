package structural.proxy;

public class DBQueryExecutorImpl  implements  DBQueryExecutor{

    @Override
    public void execute(String type, String query) {
        System.out.println("Query executed successfully");
    }
}
