import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluno extends Pessoa
{
    String Name; 
    String TelephoneNumber; 
    String BirthDate;
    String register_date;
    String LastEdit;
    float FinalGrade;
    LocalDateTime ldt = LocalDateTime.now();
    
    // Variables for dates
    int Day;
    int Month;
    int Year;
    
    //ExceptionA handling
    String BirthDateHolder;
    boolean ExceptionA;
    
    public Aluno(String Name, String TelephoneNumber, String BirthDate, String register_date, String LastEdit, float FinalGrade)
    {    
        super(Name, TelephoneNumber, BirthDate, register_date, LastEdit, FinalGrade);
        this.Name = Name;
        this.TelephoneNumber = TelephoneNumber;
        this.BirthDate = BirthDate;
        this.register_date = register_date;
        this.LastEdit = LastEdit;
        this.FinalGrade = FinalGrade;
    }
    
    @Override
    public void SetName(String new_Name)
    {
        this.Name = new_Name;
        String LastEdit_str = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ldt);
        this.LastEdit = LastEdit_str;
    }
    @Override
    public void SetPhone(String new_phone)
    {
        if(DataValidator.ValidatePhoneNumber(new_phone) == true)
        {
            this.TelephoneNumber = new_phone;
            String LastEdit_str = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ldt);
            this.LastEdit = LastEdit_str;
        }
        else
        {
            System.out.print("\n\n*Número de telefone inválido*\n\n");
        }
    }
    @Override
    public void SetBirthDate(String new_birth)
    {
        try
        {
            String[] birth_buffer = new_birth.split("/");
            Day = Integer.parseInt(birth_buffer[0]);
            Month = Integer.parseInt(birth_buffer[1]);
            Year = Integer.parseInt(birth_buffer[2]);
            ExceptionA = false;
        }
        catch(Exception e)
        {
            ExceptionA = true;
        }
        
        if(ExceptionA == false)
        {
            this.BirthDate = new_birth;
            String LastEdit_str = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ldt);
            this.LastEdit = LastEdit_str;
        }
        else
        {
            System.out.print("\n\n*Data de nascimento inválida*\n\n");
        }
    }
    @Override
    public void SetGrade(String new_grade)
    {
        ExceptionA = true;
        try
        {
            Float.parseFloat(new_grade);
            ExceptionA = false;
        }
        catch(Exception e)
        {
            ExceptionA = true;
        }
        
        if(ExceptionA == false)
        {
            this.FinalGrade = Float.parseFloat(new_grade);
            String LastEdit_str = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ldt);
            this.LastEdit = LastEdit_str;
        }
        else
        {
            System.out.print("\n\n*Nota inválida, ela deve ser um número*\n\n");
        }
    }
}
