package com.itheima.annotation;

import javax.swing.text.Document;
import java.lang.annotation.*;

/** @Target :describe the position annotation works
 * @Retention  :describe the period annotation saved
 * @Documented :describe whether the annotation can be abstracted to api
 * @Inherited: describe the inheritance of annotation by child**/

@Target(value = {ElementType.TYPE}) //表示Anno3 只能作用在类上
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnno3 {
}
