package gradle_jdbc_study.ui.service;

import java.util.List;

import gradle_jdbc_study.dao.TitleDao;
import gradle_jdbc_study.dao.impl.TitleDaoImpl;
import gradle_jdbc_study.dto.Title;

public class TitleUiService {
	private TitleDao titleDao;
	
	
	public TitleUiService() {
		titleDao = TitleDaoImpl.getInstance();
	}


	public List<Title> showTitleList() {
		return titleDao.selectTitleByAll();
	}


	public void removeTitle(Title title) {
		titleDao.deleteTitle(title);
	}


	public void modifyTitle(Title title) {
		titleDao.updateTitle(title);
	}


	public void addTitle(Title title) {
		titleDao.insertTitle(title);
	}

}
