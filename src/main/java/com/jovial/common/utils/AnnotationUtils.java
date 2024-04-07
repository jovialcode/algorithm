package com.jovial.common.utils;

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;
import java.util.stream.Collectors;

public class AnnotationUtils {
    public static Set<Class<?>> getClassesWithAnnotation(String basePackage, Class annotationClass) {
        // 패키지 경로를 설정합니다.
        // 클래스 패스 스캐너를 생성하고 필터를 지정합니다.
        ClassPathScanningCandidateComponentProvider scanner =
                new ClassPathScanningCandidateComponentProvider(false);
        scanner.addIncludeFilter(new AnnotationTypeFilter(annotationClass));

        // 패키지에서 클래스를 스캔하고 어노테이션이 적용된 클래스를 가져옵니다.
        Set<Class<?>> annotatedClasses = scanner.findCandidateComponents(basePackage).stream()
                .map(beanDefinition -> {
                    try {
                        return Class.forName(beanDefinition.getBeanClassName());
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .filter(clazz -> clazz != null)
                .collect(Collectors.toSet());

        return annotatedClasses;
    }
}
