package com.yzm;

import com.yzm.config.MyConfig;
import com.yzm.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootAnnoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootAnnoApplication.class, args);

        /*System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
        User userA = context.getBean(MyConfig.class).user1();
        User userB = context.getBean(MyConfig.class).user1();
        System.out.println(userA==userB);
*/
        //String name = context.getBean(MyConfig.class).getClass().getSimpleName();
        //System.out.println(name);

        /*String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }*/

        //System.out.println(context.getBean(User.class));

        System.out.println(context.getBean(User.class));
    }

}
