package exam01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
	
	IOFileTest t;
	
	public InputOutput() {

	}

	public void Input() {
		File file = new File("saveFile");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);

			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {

				}
			}
			System.out.println("파일을 저장하였습니다.");
		}
	}

	public void Output() {
		File file = new File("saveFile");
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(file, true);
			fos.write(1000000000);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {

				}
			}
		}
	}

}
