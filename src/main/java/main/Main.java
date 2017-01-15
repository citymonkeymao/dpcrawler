package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import bean.Shop;

import crawler.Crawler;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		// default city sydney
		String cityid = "2379";
		// default crawl all items on site
		int maxShop = Integer.MAX_VALUE;
		// parsing command line
		Options options = new Options();
		options.addOption("c", true,
				"choose city to crawl,accepting value Syd, Mel");
		options.addOption("M", true, "assign the maximum shops to crawl");
		options.addOption("f",true,"out put file");
		CommandLineParser parser = new BasicParser();
		CommandLine cmd = null;
		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			System.out.println("wrong args");
			System.exit(1);
		}
		if (cmd.hasOption("c")) {
			String city = cmd.getOptionValue("c");
			if (city.equals("Mel")) {
				cityid = "2322";
			}
		}
		if (cmd.hasOption("M")) {
			String max = cmd.getOptionValue("M");
			try {
				maxShop = Integer.parseInt(max);

			} catch (NumberFormatException e) {
				System.out.println("max number must be a number!");
				System.exit(1);
			}
		}

		Crawler c = new Crawler();
		List<Shop> shops = c.craw(cityid, maxShop);
		PrintStream writeTo;
		if(cmd.hasOption("f"))
		{
			File file = new File(cmd.getOptionValue("f"));  
         writeTo = new PrintStream(new FileOutputStream(file));  
		}
		else
		{
			writeTo = System.out;
		}
		for (Shop s : shops)
		{
			writeTo.println();
			writeTo.println("---------------------------------------------");
			writeTo.println(s);
			writeTo.println("---------------------------------------------");
			writeTo.println();
		}
		System.out.println("mission complete");
		System.exit(0);
		//System.out.println(c.craw(cityid, maxShop));
	}
}
