package com.lab;

public class UglyCode {
	public void myMethod() {
		// Lỗi 1: Thụt lề không chuẩn (Google dùng 2 spaces)
			int a = 10;

		// Lỗi 2: Tên biến có chứa dấu gạch dưới (Google dùng camelCase)
		int so_nguyen_sai_luật = 5;

		// Lỗi 3: Thiếu khoảng trắng sau dấu cộng
		System.out.println("Result:"+a+so_nguyen_sai_luật);

		// Lỗi 4: Dòng quá dài (Google giới hạn 100 ký tự)
		System.out.println("Day la mot dong rat dai de test xem bot checkstyle co phat hien ra loi dong qua dai hay khong nhe anh em vnu uet");
	}
}