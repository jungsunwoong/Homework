package ch07.sec09.exam;

public class FileDownloadServlet extends HttpServlet{
    FileDownloadServlet() {};
    @Override
    public void service() {
        System.out.println("파일을 다운로드 합니다.");
    }
}
