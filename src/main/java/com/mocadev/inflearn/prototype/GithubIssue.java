package com.mocadev.inflearn.prototype;

import java.util.Objects;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-07
 **/
public class GithubIssue implements Cloneable {

	private int id;
	private String title;
	private GithubRepository githubRepository;

	public GithubIssue(GithubRepository githubRepository) {
		this.githubRepository = githubRepository;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GithubRepository getGithubRepository() {
		return githubRepository;
	}

	public void setGithubRepository(GithubRepository githubRepository) {
		this.githubRepository = githubRepository;
	}

	public String getUrl() {
		return "https://github.com/chcjswo/" + this.getTitle() + "/issues/" + this.getId();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GithubIssue that = (GithubIssue) o;
		return id == that.id && Objects.equals(title, that.title) && Objects.equals(
			githubRepository, that.githubRepository);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, githubRepository);
	}

}
