
package testihm;

import java.sql.Connection;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author plasse
 */
public class DatabaseTest {

  @Test
  public void testGetConnection() throws Exception {
    System.out.println("getConnection");
    Connection result = Database.getConnection();
    assertNotNull(result);
  }

}