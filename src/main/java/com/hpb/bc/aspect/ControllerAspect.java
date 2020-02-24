package com.hpb.bc.aspect;

import com.hpb.bc.util.UUIDGeneratorUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Aspect
@Component
public class ControllerAspect {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);

    @Pointcut("execution(* com.hpb.bc.controller..*(..)) and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerMethodPointcut() {
    }

    @SuppressWarnings({"unchecked", "rawtypes", "unused"})
    @Around("controllerMethodPointcut()") //指定拦截器规则
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod(); //获取被拦截的方法
        String methodName = method.getName(); //获取被拦截的方法名
        Set<Object> allParams = new LinkedHashSet<>(); //保存所有请求参数，用于输出到日志中
        logger.info("请求开始，方法：{}", methodName);
        Object result = null;
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            if (arg instanceof Map<?, ?>) {
                Map<String, Object> map = (Map<String, Object>) arg;
                allParams.add(map);
            } else if (arg instanceof HttpServletRequest) {
                HttpServletRequest request = (HttpServletRequest) arg;
                Map<String, String[]> paramMap = request.getParameterMap();
                if (paramMap != null && paramMap.size() > 0) {
                    allParams.add(paramMap);
                }
            }
        }
        if (args[0] instanceof List<?>) {
            List req = (List) args[0];
            req.add(0, UUIDGeneratorUtil.generate(pjp));
        }
        return pjp.proceed();
    }
}