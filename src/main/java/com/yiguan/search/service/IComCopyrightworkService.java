package com.yiguan.search.service;

import com.yiguan.search.model.ComCopyrightwork;
import jxl.write.WritableWorkbook;

import java.util.List;

public interface IComCopyrightworkService {

	public List<ComCopyrightwork> getComCopyrightworkList(String uuid);

    String createExcel(String uuid, WritableWorkbook wwb);

}
