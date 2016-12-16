<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${package_path}.${class_name}DAO">
	<resultMap type="${package_path}.model.${class_name}" id="${class_name?uncap_first}ResultMap">
		<#list table_column as c>
		<result property="${c.nameJ}" column="${c.name?upper_case}" <#if c.name?ends_with('status')?string == 'true'>typeHandler="xx.ActStatusTypeHandler"</#if>/>
		</#list>
	</resultMap>
	
	<sql id="table_columns">
		<#list table_column as c>
		${c.name?upper_case}<#if c_has_next>,</#if>
		</#list>
    </sql>
	<sql id="entity_properties">
		<#list table_column as c>
		${r"#"}{${c.nameJ}}<#if c_has_next>,</#if>
		</#list>
	</sql>

    <!-- 使用like用法：columnName like concat('%',#columnName#,'%') -->
    <sql id="page_where">
        <trim prefix="where" prefixOverrides="and | or ">
		<#list table_column as c><#if (c_index>=1)>
            <if test="${c.nameJ} != null and ${c.nameJ} != ''">and ${c.name?upper_case} = ${r"#"}{${c.nameJ}}</if>
		</#if></#list>
        </trim>
    </sql>


	<!-- 适用于主键自增类型 -->
	<insert id="insert" parameterType="${package_path}.model.${class_name}" useGeneratedKeys="true" keyProperty="id">
		insert into ${table_name}( <include refid="table_columns" /> ) 
		values ( <include refid="entity_properties" /> )
	</insert>

    <insert id="insertSelective" parameterType="${package_path}.model.${class_name}">
        insert into ${table_name}
        <trim prefix="(" suffix=")" suffixOverrides="," >
        <#list table_column as c><#if (c_index>=1)>
            <if test="${c.nameJ} != null and ${c.nameJ} != ''">${c.name?upper_case},</if>
        </#if></#list>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides="," >
        <#list table_column as c><#if (c_index>=1)>
            <if test="${c.nameJ} != null and ${c.nameJ} != ''">${r"#"}{${c.nameJ}},</if>
        </#if></#list>
        </trim>
	</insert>


	<delete id="delete" parameterType="${package_path}.model.${class_name}">
		delete from ${table_name}
        <include refid="page_where" />
	</delete>

	<delete id="deleteByPrimaryKey" parameterType="String">
		delete from ${table_name}
		where ID = ${r"#"}{id}
	</delete>


	<update id="updateByPrimaryKey" parameterType="${package_path}.model.${class_name}">
		update ${table_name} 
		<trim prefix="set" suffixOverrides=",">
		<#list table_column as c><#if (c_index>=1)>
			<if test="${c.nameJ} != null and ${c.nameJ} != ''">${c.name?upper_case} = ${r"#"}{${c.nameJ}},</if>
		</#if></#list>
		</trim>
		<where>ID = ${r"#"}{id}</where>
	</update>

    <update id="updateByPrimaryKeySelective" parameterType="${package_path}.model.${class_name}">
        update ${table_name}
        <trim prefix="set" suffixOverrides=",">
		<#list table_column as c><#if (c_index>=1)>
            <if test="${c.nameJ} != null and ${c.nameJ} != ''">${c.name?upper_case} = ${r"#"}{${c.nameJ}},</if>
		</#if></#list>
        </trim>
        <include refid="page_where" />
    </update>


    <select id="selectAll" resultMap="${class_name?uncap_first}ResultMap">
        select <include refid="table_columns" />
        from ${table_name}
    </select>

    <select id="select" resultMap="${class_name?uncap_first}ResultMap">
        select <include refid="table_columns" />
        from ${table_name}
        <include refid="page_where" />
	</select>

    <select id="selectCount" resultType="int" >
        select count(ID) from ${table_name}
        <include refid="page_where" />
    </select>


    <select id="selectByPrimaryKey" resultMap="${class_name?uncap_first}ResultMap" parameterType="String" >
		select <include refid="table_columns" />
		from ${table_name}
		where ID = ${r"#"}{id}
	</select>
	
	<!-- 其他自定义SQL -->


</mapper>