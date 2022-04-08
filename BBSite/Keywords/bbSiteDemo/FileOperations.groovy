package bbSiteDemo

import java.awt.Desktop
import java.nio.file.*

import com.kms.katalon.core.annotation.Keyword

public class FileOperations {

	// Custom keyword for opening file - provide file path as a parameter

	@Keyword

	def Open_File(String FilePath) {

		File file = new File(FilePath)

		//first check if Desktop is supported by Platform or not

		if(!Desktop.isDesktopSupported()){

			println('Desktop is not supported')

			return

		}

		Desktop desktop = Desktop.getDesktop()

		if(file.exists()) desktop.open(file)

		println "File Opened Sucessfully \r"

	}

	// Custom keyword for deleting file - provide file path as a parameter

	@Keyword

	def Delete_File(String FilePath) {

		File file = new File(FilePath)

		try

		{

			Files.deleteIfExists(Paths.get(FilePath))

		}

		catch(NoSuchFileException e)

		{

			System.out.println('No such File/Directory Exists')

		}

		catch(DirectoryNotEmptyException e)

		{

			System.out.println('Directory is not Empty.')

		}

		catch(IOException e)

		{

			System.out.println('Invalid Permissions.')

		}

		System.out.println('File Deletion is Successful.')

	}


	@Keyword
	def Create_File(String FilePath) {
		try {
			File myObj = new File(FilePath);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}


	}



	@Keyword
	def CopytoFile(String text, String filepath)
	{
		// Input custom string


		// Path of the file where data is to be copied
		Path path = (Path)Paths.get(filepath);

		System.out.println("Path of target file: "+ path.toString());

		// Byte stream whose data is to be copied
		InputStream inp = new ByteArrayInputStream(text.getBytes());

		// Try block to check for exceptions
		try {

			// Printing number of copied bytes
			System.out.println("Number of bytes copied: "+ Files.copy(inp, path,StandardCopyOption.REPLACE_EXISTING));
		}

		// Catch block to handle the exceptions
		catch (IOException e) {

			// Print the line number where exception occured
			e.printStackTrace();
		}
	}

	@Keyword
	def CopyFiles(String fipath , String fopath)
			throws IOException
	{

		// Creating two stream
		// one input and other output
		FileInputStream fis = null;
		FileOutputStream fos = null;

		// Try block to check for exceptions
		try {

			// Initializing both the streams with
			// respective file directory on local machine

			// Custom directory path on local machine
			fis = new FileInputStream(fipath);

			// Custom directory path on local machine
			fos = new FileOutputStream(fopath);

			int c;

			// Condition check
			// Reading the input file till there is input
			// present
			while ((c = fis.read()) != -1) {

				// Writing to output file of the specified
				// directory
				fos.write(c);
			}

			// By now writing to the file has ended, so

			// Display message on the console
			System.out.println(
					"copied the file successfully");
		}

		// Optional finally keyword but is good practice to
		// empty the occupied space is recommended whenever
		// closing files,connections,streams
		finally {

			// Closing the streams

			if (fis != null) {

				// Closing the fileInputStream
				fis.close();
			}
			if (fos != null) {

				// Closing the fileOutputStream
				fos.close();
			}
		}
	}

}