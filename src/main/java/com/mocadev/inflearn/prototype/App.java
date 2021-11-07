package com.mocadev.inflearn.prototype;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-07
 **/
public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		GithubRepository repository = new GithubRepository();
		repository.setUser("tony");
		repository.setName("design-pattern");

		GithubIssue githubIssue = new GithubIssue(repository);
		githubIssue.setId(1);
		githubIssue.setTitle("prototype");

		String url = githubIssue.getUrl();
		System.out.println("url = " + url);

		final GithubIssue clone = (GithubIssue) githubIssue.clone();
		System.out.println("clone.getUrl() = " + clone.getUrl());

		System.out.println(clone != githubIssue);
		System.out.println(clone.equals(githubIssue));
		System.out.println(clone.getClass() == githubIssue.getClass());
		System.out.println(clone.getGithubRepository() == githubIssue.getGithubRepository());
	}

}
