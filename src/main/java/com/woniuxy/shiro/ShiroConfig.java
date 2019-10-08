package com.woniuxy.shiro;

import javax.sql.DataSource;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
@Configuration
public class ShiroConfig {
	@Bean
	public DataSource ds() {
		DruidDataSource ds=new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/woniuxybook");
		ds.setUsername("root");
		ds.setPassword("123456");
		return ds;
	}
	@Bean
	public JdbcRealm jdbcRealm() {
		JdbcRealm realm=new JdbcRealm();
		realm.setDataSource(ds());
		
		// 认证
				realm.setAuthenticationQuery("SELECT password FROM user WHERE username=?");
				// 根据用户名查询角色
				realm.setUserRolesQuery("SELECT rolesname FROM roles_user ru INNER JOIN user u ON ru.`userid` = u.`userid` INNER JOIN roles r ON ru.rolesid = r.rolesid AND username = ?");
				// 根据角色名查询权限
				realm.setPermissionsQuery("SELECT permissionname FROM roles_permission rp INNER JOIN roles r ON rp.`rolesid` = r.`rolesid` INNER JOIN permission p ON rp.`permissionid` = p.`permissionid` AND rolesname = ?");
				
				// 必须加这个配置，否则对客户端传来的明文密码不进行解密
				
				
				// 支持权限查询(必须配置该项，否则无法判断用户拥有的角色是否拥有某个权限)
				// 这样才能，根据用户去查询用户的权限。
				realm.setPermissionsLookupEnabled(true);
		
		
		return realm;
	}
	
	
	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
		securityManager.setRealm(jdbcRealm());
		return securityManager;
	}
	
	
	
	@Bean
	public ShiroFilterFactoryBean sf() {
		ShiroFilterFactoryBean sf=new ShiroFilterFactoryBean();
		sf.setSecurityManager(securityManager());
		return sf;
	}
}
