package live.wallet.dubbo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class File {
	public static void main(String[] args) {
		// FileReader reader = null;
		BufferedReader bufferedReader = null;
		InputStreamReader reader = null;
		try {
			
			String path = System.getProperty("user.dir");
			System.out.println(path);
			reader = new InputStreamReader(new FileInputStream(path+ "/src/main/java/live/wallet/dubbo/a.txt"), "UTF-8");
			bufferedReader = new BufferedReader(reader);
			String line = null;
			while (true) {
				line = bufferedReader.readLine();
				if (line == null) {
					break;
				}

				String lines[] = line.split("\\s+");

				String number = lines[0];
				String name = lines[1];
				System.out.println("select * from bms_protocol_column  WHERE column_code = '" + number
						+ "' AND column_value = '" + name + "';");

				System.out.println("UPDATE bms_protocol_column  SET column_code = 'custManager', column_value='"
						+ number + "' WHERE column_code = '" + number + "' AND column_value = '" + name + "';");

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bufferedReader.close();
				reader.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
