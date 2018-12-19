import bean.MyBean;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyBeanTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testSimpleLoad() {
		/**
			1,首先构造ClassPathResource对象，以便以后用Resource接口定义的各种方法来操纵资源
		 */
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		MyBean myBean = (MyBean)xmlBeanFactory.getBean("myBean");
		System.out.println(myBean.getName());
	}
}
