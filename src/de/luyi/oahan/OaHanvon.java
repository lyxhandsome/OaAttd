package de.luyi.oahan;

public class OaHanvon {
	public static void main(String[] args) throws Exception {
		SQLAccess dao = new SQLAccess();
		dao.readDataBase();
		System.out.println("Finished!");
	}
}
