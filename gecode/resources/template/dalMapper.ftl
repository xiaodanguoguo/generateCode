package ${package_path};

import java.util.List;
import ${package_path}.model.${class_name};
import org.springframework.stereotype.Repository;

/**
 * dal Interface:${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
public interface ${class_name}Dao {

    List<${class_name}> selectAll();

    List<${class_name}> select(${class_name} record);

    Integer selectCount(${class_name} record);

    ${class_name} selectByPrimaryKey(Object key);

    Integer insert(${class_name} record);

    Integer insertSelective(${class_name} record);

    Integer delete(${class_name} record);

    Integer deleteByPrimaryKey(Object key);

    Integer updateByPrimaryKey(${class_name} record);

    Integer updateByPrimaryKeySelective(${class_name} record);

}