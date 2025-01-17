package org.woodwhales.common.util.excel;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author woodwhales on 2021-07-28 16:58
 * @description 非日期属性excel注解
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface ExcelField {

    /**
     * excel列字段，默认为数据对象属性名
     * @return
     */
    String value();

    /**
     * 字段类型，默认为 String.class
     * @return
     */
    Class type() default String.class;

}
