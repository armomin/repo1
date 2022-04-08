package bbSiteDemo

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import internal.GlobalVariable

public class ConsoleText {

	@Keyword
	def ConsoleToFile() {
		try {
			// Store current System.out before assigning a new value
			PrintStream console = System.out;

			// Creating file output stream
			PrintStream fileOut = new PrintStream("./out.txt");

			System.out.println("Enter data line by line. Type exit to terminate the program");

			// Redirecting standard console output to a file.
			System.setOut(fileOut);

			// Get input using Scanner from Console
			Scanner scanner = new Scanner(System.in);

			// Read string line.
			// Write exit to terminate the program
			String inputLine = scanner.nextLine();

			while(true)
			{

				// If user input 'quit' then break the loop.
				if("exit".equalsIgnoreCase(inputLine))
				{
					break;
				}

				System.out.println(inputLine);

				// Get next user input line text.
				inputLine = scanner.nextLine();
			}

			System.out.println("Program terminated ");

			// Use stored value for output stream
			System.setOut(console);
			System.out.println("Program terminated");

		}catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
