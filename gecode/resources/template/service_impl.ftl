package ${package_path};

import java.util.List;
import ${package_path}.service.${class_name};
import ${package_path}.dao.${class_name}Dao;
import ${package_path}.model.${class_name};

import org.springframework.stereotype.Repository;

/**
 * dal Interface:${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
public class ${class_name}ServiceImpl implements ${class_name}Service{

    @Autowired
    private ${class_name}DAO ${class_name?uncap_first}DAO;

    public List<${class_name}> findAll() {
       return ${class_name?uncap_first}Dao.selectAll();
    }

    public List<${class_name}> find${class_name}s(${class_name} record){
       return ${class_name?uncap_first}Dao.select(record);
    }

    public ${class_name} get${class_name}ByPrimaryKey(Object key){
        return ${class_name?uncap_first}Dao.selectByPrimaryKey(key);
    }

    public Integer create${class_name}(${class_name} record){
        return ${class_name?uncap_first}Dao.insert(record);

    }

    public Integer delete${class_name}(${class_name} record){
        return ${class_name?uncap_first}Dao.delete(record);
    }

    public Integer remove${class_name}(${class_name} record){
        return ${class_name?uncap_first}Dao.updateByPrimaryKeySelective(record);
    }

    public Integer update${class_name}ByPrimaryKey(${class_name} record){
        return ${class_name?uncap_first}Dao.updateByPrimaryKeySelective(record);
    }

}