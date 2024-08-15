package org.example.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

@Configuration
public class InterceptorConfig implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(InterceptorConfig.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("startTime", System.currentTimeMillis());
        // 排除静态资源
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        PassToken token = handlerMethod.getMethodAnnotation(PassToken.class);
        if (token != null) {
            return true;
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        String formattedExecuteTime = String.format("%10d", executeTime);
        String method = request.getMethod();
        String urlPat = request.getRequestURI();
        log.info("{}ms {} \"{}\"", formattedExecuteTime, method, urlPat);
    }
}