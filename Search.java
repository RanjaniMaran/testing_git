import java.util.HashMap;
import java.util.List;

public class SearchItem {
	SearchItem(){}
	
	public String[] searchItem(String title) throws IOException {
		try 
		{
			BufferedReader csvReader = new BufferedReader(new FileReader("Books.csv"));
			String row;
			while ((row = csvReader.readLine()) != null) {
			    String[] data = row.split(",");
			    System.out.println(data[0]);
			if (data[1].equals(title)) {
				return data;
			}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
}
}
