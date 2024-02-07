package sprproject.beanfind;

import sprproject.SpringConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicBeanFind {


    @Test
    @DisplayName("빈 다 조회")
    void FindAllBean() {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {

            // 등록된 빈들의 이름을 가져옴
            String[] beanNames = context.getBeanDefinitionNames();

            // 각 빈의 이름과 타입을 출력
            for (String beanName : beanNames) {
                System.out.println("Bean Name: " + beanName);
                System.out.println("Bean Type: " + context.getType(beanName));
                System.out.println();
            }
        }
    }
}
