package exception;

import exception.MyGeneralException;

public class ProgrammerUnavailableNowException extends MyGeneralException {
    public ProgrammerUnavailableNowException(String message) {
        super(message);
    }
}
