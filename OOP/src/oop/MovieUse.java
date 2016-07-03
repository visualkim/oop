package oop;

public class MovieUse {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.print("검은 사제들");
		movie.print("더 라이트", "퇴마");
		movie.print("엑소시스트", "퇴마", 120);

		String[] actors = new String[3];
		actors[0] = "앤드류 링컨";
		actors[1] = "노만 리더스";
		actors[2] = "스티븐 연";
		movie.print("워킹데드", actors);
	}

}
