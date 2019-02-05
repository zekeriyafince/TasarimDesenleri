
package abstractfactory;

/**
 *
 * @author Zekeriya
 */
// client sınıfı
public class Factory {
    private DatabaseFactory databaseFactory;
    private Connection connection;
    private Command command;

    public Factory(DatabaseFactory dbFactory) {
        databaseFactory=dbFactory;
        connection=databaseFactory.CreateConnection();
        command=databaseFactory.CreateCommand();
    }
    
    public void Start() {
        connection.Connect();
        if(connection.State() == "Open") {
            command.Execute("Select ..");
        }
    }
    
    
}
