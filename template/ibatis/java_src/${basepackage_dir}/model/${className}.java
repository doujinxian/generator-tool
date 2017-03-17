<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.model;


public class ${className} extends BaseEntity {
	private static final long serialVersionUID = 5454155825314635342L;


	//columns START
	<#list table.columns as column>

	private ${column.javaType} ${column.columnNameLower};           //"${column.columnAlias}";
	</#list>
	//columns END


<@generateJavaColumns/>


}

<#macro generateJavaColumns>
	<#list table.columns as column>
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>


