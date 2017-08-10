package test16_3.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test16_3.model.Pet;
import test16_3.util.DbUtil;

public class PetDao {

	//显示所有宠物信息
	public static ArrayList<Pet> selectAll() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList pets = new ArrayList();
		try {
			conn = DbUtil.getConn();
			String sql = "select * from pet";
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while (rs.next()) {
				Pet p = new Pet();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setColor(rs.getString("color"));
				p.setPrice(rs.getDouble("price"));
				pets.add(p);
			}
			return pets;
		} finally {
			DbUtil.close(conn, ps, rs);
		}
	}
	
	//根据宠物颜色或名称搜索
	public static ArrayList<Pet> selectCN(String string) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList pets = new ArrayList();
		try {
			conn = DbUtil.getConn();
			String sql = "select * from pet where color = ? or name = ?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, string);
			ps.setString(2, string);
			rs = ps.executeQuery();
			while(rs.next()) {
				Pet pet = new Pet();
				pet.setId(rs.getInt("id"));
				pet.setColor(rs.getString("color"));
				pet.setName(rs.getString("name"));
				pet.setPrice(rs.getDouble("price"));
				pets.add(pet);
			}
			return pets;
			
		}finally {
			DbUtil.close(conn, ps, rs);
		}
		
	}
	
	//购买宠物
	public static int deletePet(int id) throws SQLException {
		/*selectAll();*/
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DbUtil.getConn();
			String sql = "delete from pet where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			return ps.executeUpdate();
		}finally {
			DbUtil.close(conn, ps, null);
		}
	}
	
	//修改宠物价格
	public static int updatePrice(Pet pet) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DbUtil.getConn();
			String sql = "update pet set price = ? where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, pet.getPrice());
			ps.setInt(2, pet.getId());
			Pet p = new Pet();
			return ps.executeUpdate();
		}finally {
			DbUtil.close(conn, ps, null);
		}
		
	}
}
