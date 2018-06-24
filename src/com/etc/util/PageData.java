package com.etc.util;


import java.util.List;

/**
 * ��ҳ������
 */
public class PageData<T> {
	private List<T> data; // ���ҵ�����

	private Integer total; // ����

	private Integer pageSize;// ÿҳ����

	private Integer pageNo;// ��ǰҳ��
	
	private Integer totalPage;//��ҳ��
	
	public PageData() {
		super();
	}
	
	/**
	 * ������
	 * @param data ���ҵ�����
	 * @param total ����
	 * @param pageSize ÿҳ����
	 * @param page ��ǰҳ��
	 * @param totalPage ��ҳ��
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
	 * @param data ���ҵ�����
	 * @param total ����
	 * @param pageSize ÿҳ����
	 * @param pageNo ��ǰҳ��
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
