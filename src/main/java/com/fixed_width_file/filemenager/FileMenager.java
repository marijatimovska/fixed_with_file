package com.fixed_width_file.filemenager;

import java.util.List;

public interface FileMenager<T> {
	public List<T> read(String FilePath);
	public void write(String fileName, String comtent);

}
