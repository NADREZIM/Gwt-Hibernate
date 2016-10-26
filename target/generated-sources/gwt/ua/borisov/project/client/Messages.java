package ua.borisov.project.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	C:/Users/User/Downloads/apache-maven-3.2.3-bin/apache-maven-3.2.3/bin/project/src/main/resources/ua/borisov/project/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Good day,".
   * 
   * @return translated "Good day,"
   */
  @DefaultMessage("Good day,")
  @Key("day")
  String day();

  /**
   * Translated "You have no right to visit this site".
   * 
   * @return translated "You have no right to visit this site"
   */
  @DefaultMessage("You have no right to visit this site")
  @Key("error")
  String error();

  /**
   * Translated "Good evening,".
   * 
   * @return translated "Good evening,"
   */
  @DefaultMessage("Good evening,")
  @Key("evening")
  String evening();

  /**
   * Translated "User:".
   * 
   * @return translated "User:"
   */
  @DefaultMessage("User:")
  @Key("loginLabel")
  String loginLabel();

  /**
   * Translated "Good morning,".
   * 
   * @return translated "Good morning,"
   */
  @DefaultMessage("Good morning,")
  @Key("morning")
  String morning();

  /**
   * Translated "Good night,".
   * 
   * @return translated "Good night,"
   */
  @DefaultMessage("Good night,")
  @Key("night")
  String night();

  /**
   * Translated "Password".
   * 
   * @return translated "Password"
   */
  @DefaultMessage("Password")
  @Key("passwordLabel")
  String passwordLabel();
}
