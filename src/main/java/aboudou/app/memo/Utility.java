package aboudou.app.memo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import com.google.gson.Gson;

import aboudou.app.memo.entities.Memo;

public class Utility {

	private static final String FILENAME = "D:\\memos";

	public static void saveMemo(Memo memo) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream(FILENAME, true);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(memo);

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void addMemo(Memo memo)
	{
		Gson gson =new Gson();
		
		writeMemo(memo, gson);
	}

	public static void writeMemo(Memo memo, Gson gson) {
		List<Memo> allMemos =  new ArrayList<Memo>();
		allMemos = readMemos();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			
			allMemos.add(memo);
			
			bw.write(gson.toJson(allMemos));
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	
	public static List<Memo> readMemos() {

		Gson gson = new Gson();
		
		try (BufferedReader bw = new BufferedReader(new FileReader(FILENAME))) {
			Type type = new TypeToken<List<Memo>>(){}.getType();
			List<Memo> memos =  gson.fromJson(bw, type);
			return memos;
		} catch (IOException e) {
			e.printStackTrace();
			return new ArrayList<Memo>();
		}
	}
}
