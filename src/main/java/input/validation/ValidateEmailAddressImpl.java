package input.validation;

public class ValidateEmailAddressImpl implements ValidateEmailAddress {

    @Override
    public boolean validate(String email) {
        String regex = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
}
