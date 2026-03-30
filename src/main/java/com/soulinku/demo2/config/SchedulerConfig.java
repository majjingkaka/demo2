package com.soulinku.demo2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class SchedulerConfig {
    @Bean
    public ThreadPoolTaskScheduler configureScheduler() {
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(5); // 스레드 풀 크기
        threadPoolTaskScheduler.setThreadGroupName("yubin scheduler thread pool"); // 스레드 그룹명
        threadPoolTaskScheduler.setThreadNamePrefix("yubin-scheduler-"); // 스레드명 접두사
        threadPoolTaskScheduler.initialize(); // 스케줄러 초기화
        return threadPoolTaskScheduler;
    }
    
}
