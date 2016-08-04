package com.example.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.config.ServiceConfig;

@Configuration
@Import(ServiceConfig.class)
public class RootConfig {}
