package com.data.mapper.impala;

import com.data.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.xml.ws.soap.MTOM;
import java.util.List;

@Repository
public interface ImpalaMapper {
    void executeSql(Person person);

    List<Person>  selectSql();

    List<Person>  selectSqlByPage();

    void updateSql(Person person);

    void deleteSql(Person person);
}
