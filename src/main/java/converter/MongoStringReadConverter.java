package converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.text.SimpleDateFormat;
import java.util.Date;

@ReadingConverter
public class MongoStringReadConverter implements Converter<Date, String> {

    public String convert(Date date) {
        System.out.println("========= Remain date");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
}
