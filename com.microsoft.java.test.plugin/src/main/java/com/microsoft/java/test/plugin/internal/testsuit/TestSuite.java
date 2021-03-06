package com.microsoft.java.test.plugin.internal.testsuit;

import java.util.List;

import org.eclipse.lsp4j.Range;

public class TestSuite {
	private Range range;
	
    private String uri;
	
	private String test;
	
	private List<Integer> childrenIndices;
	
	private Integer parentIndex;
	
	private String packageName;
	
	private TestLevel level;
	
	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	public List<Integer> getChildren() {
		return childrenIndices;
	}

	public void setChildren(List<Integer> children) {
		this.childrenIndices = children;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public TestLevel getLevel() {
		return level;
	}

	public void setLevel(TestLevel level) {
		this.level = level;
	}
	
	public Integer getParent() {
		return parentIndex;
	}

	public void setParent(Integer parent) {
		this.parentIndex = parent;
	}

	public TestSuite(Range range, String uri, String test, String packageName, TestLevel level) {
		this.range = range;
		this.uri = uri;
		this.test = test;
		this.packageName = packageName;
		this.level = level;
	}
}
