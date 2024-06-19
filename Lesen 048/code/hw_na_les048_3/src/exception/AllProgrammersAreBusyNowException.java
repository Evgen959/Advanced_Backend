package exception;

import exception.MyGeneralException;

import java.util.List;

public class AllProgrammersAreBusyNowException extends MyGeneralException {

    private List<String> info;

    public AllProgrammersAreBusyNowException(String message, List<String> info) {
        super(message);
        this.info = info;
    }

    public List<String> getInfo() {
        return info;
    }
}
