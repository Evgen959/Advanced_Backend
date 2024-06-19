package exception;

import exception.MyGeneralException;

public class TeamLeadUnavailableNowException extends MyGeneralException {
    public TeamLeadUnavailableNowException(String message) {
        super(message);
    }
}
