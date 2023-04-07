package youtube;

import java.util.Date;

public class Video {
	private String title;
	private Date uploadDate;

	public Video(String title, Date uploadDate) {
		this.title = title;
		this.uploadDate = uploadDate;
	}

	public String getTitle() {
		return title;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	@Override
	public String toString() {
		return String.format("Video: " + title + ", upload date: " + uploadDate);
	}
}
