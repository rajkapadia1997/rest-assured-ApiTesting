import java.util.ArrayList;

public class UserList {
	private float page;
	private float per_page;
	private float total;
	private float total_pages;
	ArrayList<Object> data = new ArrayList<Object>();
	Ad ad;

	// Getter Methods

	public float getPage() {
		return page;
	}

	public float getPer_page() {
		return per_page;
	}

	public float getTotal() {
		return total;
	}

	public float getTotal_pages() {
		return total_pages;
	}

	public Ad getAd() {
		return ad;
	}

	// Setter Methods

	public void setPage(float page) {
		this.page = page;
	}

	public void setPer_page(float per_page) {
		this.per_page = per_page;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public void setTotal_pages(float total_pages) {
		this.total_pages = total_pages;
	}

	public void setAd(Ad ad) {
		this.ad = ad;
	}

}
