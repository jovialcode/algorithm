package com.jovial.web;

import com.jovial.common.annotation.Unsolved;
import com.jovial.common.utils.AnnotationUtils;
import com.jovial.web.dto.AlgorithmStatics;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class AlgorithmController {

    @GetMapping("/")
    public String index() {
        return "Algorithm";
    }

    @GetMapping("/statics")
    public AlgorithmStatics getAlgorithmStatics(){
        readAnnotation();
        AlgorithmStatics statics = new AlgorithmStatics();
        return statics;
    }

    public void readAnnotation(){
        String basePackage = "com.jovial";
        Class annotationClass = Unsolved.class;
        Set<Class<?>> classesWithAnnotation = AnnotationUtils.getClassesWithAnnotation("com.jovial.question", annotationClass);

        for (Class<?> clazz : classesWithAnnotation) {
            System.out.println("Annotated class found: " + clazz.getName());
        }
    }
}
