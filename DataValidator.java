public class DataValidator
{
    public static boolean ValidatePhoneNumber(String PhoneNumber)
    {
        if(PhoneNumber.length() < 10)
        {
            return false;
        }
        if(PhoneNumber.length() > 16)
        {
            return false;
        }
        return true;
    }
}
