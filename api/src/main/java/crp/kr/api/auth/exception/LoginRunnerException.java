package crp.kr.api.auth.exception;

/**
 * packageName: crp.kr.api.auth.exception
 * fileName   : LoginRunnerException
 * author     : 최은아
 * date       : 2022-05-24
 * desc       :
 * ================================
 * DATE          AUTHOR        NOTE
 * ================================
 * 2022-05-24    최은아       최초 생성
 */
public class LoginRunnerException extends RuntimeException {
    private static final long SerializableUID = 1L;

    public LoginRunnerException() {
        super();
    }

    public LoginRunnerException(String msg) {
        super(msg);
    }
}
