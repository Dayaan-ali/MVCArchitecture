package in.sp.SpringJDBCJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	@Bean("ds")
	public DriverManagerDataSource getData() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jddbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("Template")
	public JdbcTemplate getTemplate() {
		JdbcTemplate tp = new JdbcTemplate();
		tp.setDataSource(getData());
		return tp;
	}
	
	@Bean("studentDao")
	public StudentDao getDao() {
		StudentDaoImpl sd = new StudentDaoImpl();
			
		}
	}
	
}
