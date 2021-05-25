package com.yzm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * @Auther: yzm
 * @Date: 2021/5/25 - 05 - 25 - 21:41
 * @Description: com.yzm.pojo
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data

//@ConfigurationProperties(prefix = "user")
//@Component
public class User {
    private String uname;
    private Integer age;

}
