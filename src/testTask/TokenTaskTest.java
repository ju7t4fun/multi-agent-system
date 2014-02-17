package testTask;

import java.util.StringTokenizer;

public class TokenTaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "LOTR=29 TheWitcher=19`";

		StringTokenizer argST = new StringTokenizer(str, " ");
		while (argST.hasMoreTokens()) {

			StringTokenizer st = new StringTokenizer(argST.nextToken(), "=");
			if (st.hasMoreTokens()) {
				System.out.println("Name:" + st.nextToken());
				if (st.hasMoreTokens())
					System.out.println("Price:" + st.nextToken());
			}

		}
	}

}
