package structural.proxy;

public class MainClass {

    public static void main(String[] args) throws Exception {
        DBQueryExecutorProxy proxy = new DBQueryExecutorProxy("admin", "admin");

        proxy.execute("delete", "query");

        proxy = new DBQueryExecutorProxy("admin", "Admin");
        proxy.execute("delete", "query");

    }

}
