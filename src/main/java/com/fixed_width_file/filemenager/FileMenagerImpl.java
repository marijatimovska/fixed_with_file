package com.fixed_width_file.filemenager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

public abstract class FileMenagerImpl<T> implements FileMenager<T> {

	public List<T> read(String FilePath) {
		List<T> results = new LinkedList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(new File(FilePath)))) {
			String line;

			while ((line = br.readLine()) != null) {
				if (line.length() != 66) {
					System.out.println("Incorect length");
				} else {
					T t = createInstance(line);
					if (t != null) {
						results.add(t);
					}
				}

			}

		} catch (IOException e) {
		}

		return results;
	}

	public abstract T createInstance(String line);

	public void write(String fileName, String content) {
		try (PrintWriter out = new PrintWriter(fileName)) {
			out.write(content);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
