package cn.ekgc.dubbo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String username;
	private String cellphone;
	private String password;
	private String gender;
	private String email;
	private Date birthday;
	private Date createTime;
	private Date updateTime;


}
