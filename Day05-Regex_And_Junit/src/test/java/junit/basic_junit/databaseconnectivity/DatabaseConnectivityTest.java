package junit.basic_junit.databaseconnectivity;

import junit_problems.basic_junit.databaseconnectivity.DatabaseConnectivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseConnectivityTest {
    private  DatabaseConnectivity databaseconnect ;
    @BeforeEach
    void connectingSetUp(){
        databaseconnect = new DatabaseConnectivity();
        System.out.println("Initializing the database connection");
    }
    @Test
    void connectTest(){
        assertEquals("Connecting",databaseconnect.connect());
    }
    @Test
    void disconnectTest(){
        assertEquals("Disconnecting",databaseconnect.disconnect());
    }
    @AfterEach
    void disconnectingSetUp(){
        System.out.println("Closing the connection");
    }
}
