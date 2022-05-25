package me.realtree.config;

import org.springframework.context.annotation.Configuration;

import me.realtree.controller.HomeController;

@Configuration
public class RootConfig {

		public HomeController homeController() {
			return new HomeController();
		}
}
