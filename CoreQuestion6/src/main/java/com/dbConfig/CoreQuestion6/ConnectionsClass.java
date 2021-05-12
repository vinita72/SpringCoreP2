package com.dbConfig.CoreQuestion6;

import org.springframework.beans.factory.annotation.Value;

public class ConnectionsClass {
	@Value("${DB_DRIVER_CLASS}")
	private static String driverClass;
	@Value("${DB_URL}")
	private static String dbURL;
	@Value("${DB_USERNAME}")
	private static String userName;
	@Value("${DB_PASSWORD}")
	private static char[] password;

	public ConnectionsClass() {
	}

	public static void printDBConfigs() {
		System.out.println("Driver Class = " + driverClass);
		System.out.println("DB URL = " + dbURL);
		System.out.println("User Name = " + userName);

		// Never do below in production environment :D
		System.out.println("Password = " + String.valueOf(password));
	}
}
