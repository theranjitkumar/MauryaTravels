package maurya.travels.app.dao;

import java.util.List;
import maurya.travels.app.model.Blog;

public interface Iblog {
	public void addBlog(Blog blog);

	public void updateBlog(Blog blog);

	public void deleteBlog(int id);

	public Blog blogById(int id);

	public List<Blog> list();
}
