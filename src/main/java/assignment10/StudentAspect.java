package assignment10;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {
    @Before("execution(* Student.calculateAvgMark(..))")
    public void beforeCalculateAvgMarkAdvice() {
        System.out.println("Calculating average marks...");
    }

    @After("execution(* Student.showResult(..))")
    public void afterShowResultAdvice() {
        System.out.println("Result displayed.");
    }
}
