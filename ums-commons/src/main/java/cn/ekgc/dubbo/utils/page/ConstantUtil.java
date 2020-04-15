package cn.ekgc.dubbo.utils.page;

import java.util.Properties;

public class ConstantUtil {
	private static Properties props = new Properties();
	
	static {
		try {
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("config/ums.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <b>分页常量：当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));
	
	/**
	 * <b>分页常量：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
}
