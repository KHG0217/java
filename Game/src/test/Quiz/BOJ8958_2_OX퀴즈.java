package test.Quiz;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BOJ8958_2_OXÄûÁî {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {

			int jumsu = 0;
			int sum = 0;
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == 'O') {
					jumsu += ++sum;
				} else {
					sum = 0;
				}
			}
			System.out.println(jumsu);

		}

	}

}