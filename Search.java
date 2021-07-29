//public class Catalog {
  //private HashMap<String, List<Item>> ItemTitles;
  //private HashMap<String, List<Item>> ItemAuthors;
 // private HashMap<String, List<Book>> BookSubjects;
 // private HashMap<String, List<Item>> ItemPublicationDates;
  //private HashMap<String, List<Book>> BookISBN;
//}
public interface Search {
  public List<Item> searchByTitle(String title);
  public List<Item> searchByAuthor(String author);
  public List<Book> searchBySubject(String subject);
  public List<Item> searchByPubDate(Date publishDate);
  public List<Book> searchByISBN(String ISBN);
}

public class Catalog implements Search {
  private HashMap<String, List<Item>> bookTitles;
  private HashMap<String, List<Item>> bookAuthors;
  private HashMap<String, List<Book>> bookSubjects;
  private HashMap<String, List<Item>> bookPublicationDates;
  private HashMap<String, List<Book>> bookISBN;
  
  public List<Item> searchByTitle(String query) {
    // return all books containing the string query in their title.
    return ItemTitles.get(query);
  }

  public List<Item> searchByAuthor(String query) {
    // return all books containing the string query in their author's name.
    return ItemAuthors.get(query);
  }
  
  public List<Book> searchBySubjects(String query) {
    // return all books containing the string query in their subjects.
    return bookSubjects.get(query);
  }
  
  public List<Item> searchByPublicationDates(String query) {
    // return all books containing the string query in their Publication Dates.
    return ItemPublicationDates.get(query);
  }
  
  public List<Book> searchByISBN(String query) {
    // return all books containing the string query in their Publication Dates.
    return bookISBN.get(query);
  }
}
