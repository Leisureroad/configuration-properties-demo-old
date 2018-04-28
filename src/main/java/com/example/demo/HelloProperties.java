package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author Madhura Bhave
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

	private List<String> foo = Arrays.asList("a", "b");

	private Set<String> bar;

	public List<String> getFoo() {
		return foo;
	}

	public void setFoo(List<String> foo) {
		this.foo = foo;
	}

	public Set<String> getBar() {
		return bar;
	}

	public void setBar(Set<String> bar) {
		this.bar = bar;
	}
}
