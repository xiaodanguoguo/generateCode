package ${package_path};

import java.util.List;
import ${package_path}.service.${class_name};
import ${package_path}.model.${class_name};

import org.springframework.stereotype.Repository;

/**
 * dal Interface:${class_name}
 * @author ${author}
 * @date ${sysDate?date}
 */
public interface ${class_name}Service {

    public List<${class_name}> findAll();

    public List<${class_name}> find${class_name}s(${class_name} record);

    public ${class_name} get${class_name}ByPrimaryKey(Object key);

    public Integer create${class_name}(${class_name} record);

    public Integer delete${class_name}(${class_name} record);

    public Integer remove${class_name}(${class_name} record);

    public Integer update${class_name}ByPrimaryKey(${class_name} record);

}