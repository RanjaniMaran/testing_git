public interface Search {
  public List<Item> searchByTitle(String title);
  public List<Item> searchByAuthor(String author);
  public List<Book> searchByCategory(String category);
  public List<Item> searchByPubDate(Date publishDate);
  public List<Book> searchByISBN(int isbn);
}

public class Catalog implements Search {
  private HashMap<String, List<Item>> itemTitles;
  private HashMap<String, List<Item>> itemAuthors;
  private HashMap<String, List<Book>> bookCategory;
  private HashMap<String, List<Item>> itemPublicationDates;
  private HashMap<String, List<Book>> bookISBN;
  
  public List<Item> searchByTitle(String query) {
    // return all books containing the string query in their title.
    return itemTitles.get(query);
  }

  public List<Item> searchByAuthor(String query) {
    // return all books containing the string query in their author's name.
    return itemAuthors.get(query);
  }
  
  public List<Book> searchByCategory(String query) {
    // return all books containing the string query in their category.
    return bookCategory.get(query);
  }
  
  public List<Item> searchByPublicationDates(String query) {
    // return all books containing the string query in their Publication Dates.
    return itemPublicationDates.get(query);
  }
  
  public List<Book> searchByISBN(String query) {
    // return all books containing the string query in their ISBN.
    return bookISBN.get(query);
  }
}
