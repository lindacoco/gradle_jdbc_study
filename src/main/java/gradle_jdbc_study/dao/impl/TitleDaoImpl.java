package gradle_jdbc_study.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.mysql.jdbc.authentication.MysqlClearPasswordPlugin;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import gradle_jdbc_study.dao.TitleDao;
import gradle_jdbc_study.ds.MySqlDataSource;
import gradle_jdbc_study.dto.Title;
import gradle_jdbc_study.util.LogUtil;

public class TitleDaoImpl implements TitleDao {

	// 싱글톤 패턴

	private static final TitleDaoImpl instance = new TitleDaoImpl();

	private TitleDaoImpl() {
	};

	public static TitleDaoImpl getInstance() {
		return instance;
	}

	@Override
	public Title selectTitleByNo(Title titled) {
		String sql = "select title_no, title_name from title where title_no=?";
		try (Connection con = MySqlDataSource.getConnection(); 
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, titled.getTitleNo());
			try (ResultSet rs = pstmt.executeQuery()) {
				LogUtil.prnLog(pstmt);
				if (rs.next()) {
					return getTitle(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private Title getTitleByNo(ResultSet rs) throws SQLException {
		int titleNo = rs.getInt("title_no");
		String titleName = rs.getString("title_name");
		return new Title(titleNo, titleName);
	}

	@Override
	public List<Title> selectTitleByAll() {
		String sql = "select title_no,title_name from title";
		// 디비연결
		try (Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			List<Title> list = new ArrayList<Title>();
			while (rs.next()) {
				list.add(getTitle(rs));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private Title getTitle(ResultSet rs) throws SQLException {
		int titleNo = rs.getInt("title_no");
		String titleName = rs.getString("title_name");
		return new Title(titleNo, titleName);
	}

	@Override
	public int insertTitle(Title title) {
		String sql="insert title values(?,?)";
		int res = 0;
		try(Connection con = MySqlDataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);)
				{
		  pstmt.setInt(1, title.getTitleNo());
		  pstmt.setString(2, title.getTitleName());
		  res = pstmt.executeUpdate();
				
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int updateTitle(Title title) {
		String sql ="update title set title_name=? where title_no =?";
		int res =0;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);)
				
		{  pstmt.setString(1, title.getTitleName());
		   pstmt.setInt(2, title.getTitleNo());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteTitle(Title title) {
		
		String sql = "delete from title where title_no = ?";
		int res = 0;
		try(Connection con = MySqlDataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);)
		{
			pstmt.setInt(1, title.getTitleNo());
			res = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;
	}

}
