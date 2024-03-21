package structural.proxy;

public interface DBQueryExecutor {
    public void execute(String type, String query) throws Exception;
}
