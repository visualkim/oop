package oop;

public class MovieUse {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.print("���� ������");
		movie.print("�� ����Ʈ", "��");
		movie.print("���ҽý�Ʈ", "��", 120);

		String[] actors = new String[3];
		actors[0] = "�ص�� ����";
		actors[1] = "�븸 ������";
		actors[2] = "��Ƽ�� ��";
		movie.print("��ŷ����", actors);
	}

}
