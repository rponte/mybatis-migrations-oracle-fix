package br.com.triadworks.wrapper;

public class Migrator {

	public static void main(String[] args) throws Exception {
		System.setProperty("line.separator", "\n"); // the magic is here <3
		org.apache.ibatis.migration.Migrator.main(args);
	}
	
}
