package com.sihai.annotation;

import java.lang.annotation.*;

/**
 * Created by baimugudu on 2019/5/14
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 模块的名称
     * @return
     */
    String title() default "";

    /**
     * 模块的方法
     * @return
     */
    String action() default "";
}
