import bean.MyBean;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyBeanTest {
	@SuppressWarnings("deprecation")
	@Test
	public void testSimpleLoad() {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		MyBean myBean = (MyBean)xmlBeanFactory.getBean("myBean");
		System.out.println(myBean.getName());
	}
}
