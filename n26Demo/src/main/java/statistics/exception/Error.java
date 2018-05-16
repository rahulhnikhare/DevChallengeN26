package statistics.exception;

import org.springframework.validation.FieldError;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
class Error {

    private final int status;

    private final String message;

    private List<FieldError> fieldErrors = new ArrayList<>();

    Error(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public void addFieldError(String objectName, String path, String message) {
        FieldError error = new FieldError(objectName, path, message);
        fieldErrors.add(error);
    }

}