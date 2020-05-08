package com.my5.config;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/8
*/

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//定义需要注入的全类名数组
public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.my5.bean.Fish","com.my5.bean.Tiger"};
    }
}
