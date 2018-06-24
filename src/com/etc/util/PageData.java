package com.etc.util;


import java.util.List;

/**
 * 分页数据类
 */
public class PageData<T> {
	private List<T> data; // 查找的数据

	private Integer total; // 总数

	private Integer pageSize;// 每页几行

	private Integer pageNo;// 當前页数
	
	private Integer totalPage;//总页数
	
	public PageData() {
		super();
	}
	
	/**
	 * 構造器
	 * @param data 查找的数据
	 * @param total 总数
	 * @param pageSize 每页几行
	 * @param page 當前页数
	 * @param totalPage 总页数
	 */
	public PageData(List<T> data, Integer total, Integer pageSize, Integer pageNo, Integer totalPage) {
		super();
		this.data = data;
		this.total = total;
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.totalPage = totalPage;
	}

	/**
	 * 
	 * @param data 查找的数据
	 * @param total 总数
	 * @param pageSize 每页几行
	 * @param pageNo 當前页数
	 */
	public PageData(List<T> data, Integer total, Integer pageSize, Integer pageNo) {
		super();
		this.data = data;
		this.total = total;
		this.pageSize = pageSize;
		this.pageNo = pageNo;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public int getTotalPage() {
		int num = total / pageSize;
		if (total % pageSize != 0)
			num++;
		totalPage = num;
		return totalPage;
	}
	
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "{total:" + total + ",data:" + data + "}";
	}
}
