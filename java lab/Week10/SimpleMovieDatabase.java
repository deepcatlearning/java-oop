import java.util.Map;
import java.util.regex.*;
import java.util.List;
import java.io.*;
import org.apache.commons.io.*;

	public void importMovies(String movieFilename)
	{	//YOUR CODE GOES HERE
		File file = new File(movieFilename);	
		
		//THERE ARE 3 GROUP
		String reg = "/([0-9]{6}),(.+),(.+(\\|.+)*)";
		
		Pattern ptReg = Pattern.compile(reg);
		Matcher m = ptReg.matcher(file);

		int g0toint;

		while(m.find()){
			g0toint = Integer.parseInt(m.group(1));
			Movie check = new Movie(g0toint,m.group(2));
			movies.put(g0toint, check);
		}
}
	//-------------------BONUS----------------------
	public List<Movie> searchMovies(String query) 
	{
		//YOUR BONUS CODE GOES HERE
		return null;
	}
	
	public List<Movie> getMoviesByTag(String tag)
	{
		//YOUR BONUS CODE GOES HERE
		return null;
	}
	
	
	public static void main(String[] args)
	{
		SimpleMovieDatabase mdb = new SimpleMovieDatabase();
		mdb.importMovies("lab10_movies.txt");
		System.out.println("Done importing "+mdb.movies.size()+" movies");
		int[] mids = new int[]{139747, 141432, 139415, 139620, 141305};
		for(int mid: mids)
		{
			System.out.println("Retrieving movie ID "+mid+": "+mdb.movies.get(mid));
		}
		
		//Uncomment for bonus
		/*System.out.println("\n////////////////////////// BONUS ///////////////////////////////");
		String[] queries = new String[]{"america", "thai", "thailand"};
		for(String query: queries)
		{
			System.out.println("Results for movies that match: "+query);
			for(Movie m: mdb.searchMovies(query))
			{
				System.out.println("\t"+m);
			}
			System.out.println();
		}
		
		String[] tags = new String[]{"Musical", "Action", "Thriller"};
		for(String tag: tags)
		{
			System.out.println("Results for movies in category: "+tag);
			for(Movie m: mdb.getMoviesByTag(tag))
			{
				System.out.println("\t"+m);
			}
			System.out.println();
		}
		*/
		
	}

}
