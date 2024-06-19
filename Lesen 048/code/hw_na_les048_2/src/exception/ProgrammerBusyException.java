package exception;

import exception.MyGeneralException;

public class ProgrammerBusyException extends MyGeneralException {
    public ProgrammerBusyException(String message) {
        super(message);
    }
}
