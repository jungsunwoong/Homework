package org.scoula.travel.dataimport;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.scoula.travel.dao.TravelDao;
import org.scoula.travel.dao.travelDaoImpl;
import org.scoula.travel.domain.TravelVO;
import org.scoula.database.JDBCUtil;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ImportTravelData {
    public static void main(String[] args) throws CsvValidationException, IOException {
        TravelDao dao = new travelDaoImpl();
        List<TravelVO> travels = new CsvToBeanBuilder<TravelVO>(new FileReader("travel.csv"))
                .withType(TravelVO.class)
                .build()
                .parse();
        travels.forEach(travel -> {
            System.out.println(travel);
            dao.insert(travel);
        });
        JDBCUtil.close();
    }
}
