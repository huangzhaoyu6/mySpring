package com.my1.config;/*
 @author hzy
 @DESCRIPTION ${DESCRIPTION}
 @create 2020/5/7
*/

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义一个类过滤器，作为扫描类时使用的类过滤器
 */
public class HzyFilter implements TypeFilter {

    private ClassMetadata classMetadata;

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类信息
        classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源
        Resource resource = metadataReader.getResource();
        //获取类的名称
        String className = classMetadata.getClassName();
        System.out.println("类过滤器-------->"+className);
        if(className.contains("Dao")){
            return true;
        }
        return false;
    }
}
