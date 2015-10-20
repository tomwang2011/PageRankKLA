public class PageRankDemo {
	public static void main(String[] args) {

	}

}
public class Page {
	public void Page(String URL) {
		_url = URL;
	}
	private String _url;
	private List<Page> _links;
}