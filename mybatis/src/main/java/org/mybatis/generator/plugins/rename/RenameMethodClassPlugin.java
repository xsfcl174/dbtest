package org.mybatis.generator.plugins.rename;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;


public class RenameMethodClassPlugin extends PluginAdapter {
	private String searchString;
	private String replaceString;
	private Pattern pattern;


	public RenameMethodClassPlugin() {
	}

	public boolean validate(List<String> warnings) {

		searchString = properties.getProperty("searchString"); //$NON-NLS-1$
		replaceString = properties.getProperty("replaceString"); //$NON-NLS-1$

		boolean valid = stringHasValue(searchString)
				&& stringHasValue(replaceString);

		if (valid) {
			pattern = Pattern.compile(searchString);
		} else {
			if (!stringHasValue(searchString)) {
				warnings.add(getString("ValidationError.18", //$NON-NLS-1$
						"RenameMethodClassPlugin", //$NON-NLS-1$
						"searchString")); //$NON-NLS-1$
			}
			if (!stringHasValue(replaceString)) {
				warnings.add(getString("ValidationError.18", //$NON-NLS-1$
						"RenameMethodClassPlugin", //$NON-NLS-1$
						"replaceString")); //$NON-NLS-1$
			}
		}

		return valid;
	}

	@Override
	public boolean clientCountByExampleMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setCountByExampleStatementId(oldName);
		return super.clientCountByExampleMethodGenerated(method, interfaze,
				introspectedTable);
	}

	@Override
	public boolean clientCountByExampleMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setCountByExampleStatementId(oldName);
		return super.clientCountByExampleMethodGenerated(method, topLevelClass,
				introspectedTable);
	}

	@Override
	public boolean clientDeleteByExampleMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setDeleteByExampleStatementId(oldName);
		return super.clientDeleteByExampleMethodGenerated(method, interfaze,
				introspectedTable);
	}

	@Override
	public boolean clientDeleteByExampleMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setDeleteByExampleStatementId(oldName);
		return super.clientDeleteByExampleMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientDeleteByPrimaryKeyMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setDeleteByPrimaryKeyStatementId(oldName);
		return super.clientDeleteByPrimaryKeyMethodGenerated(method, interfaze,
				introspectedTable);
	}

	@Override
	public boolean clientDeleteByPrimaryKeyMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setDeleteByPrimaryKeyStatementId(oldName);
		return super.clientDeleteByPrimaryKeyMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientInsertMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setInsertStatementId(oldName);
		return super.clientInsertMethodGenerated(method, interfaze,
				introspectedTable);
	}

	@Override
	public boolean clientInsertMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setInsertStatementId(oldName);
		return super.clientInsertMethodGenerated(method, topLevelClass,
				introspectedTable);
	}

	@Override
	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectByExampleWithBLOBsStatementId(oldName);
		return super.clientSelectByExampleWithBLOBsMethodGenerated(method,
				interfaze, introspectedTable);
	}

	@Override
	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectByExampleWithBLOBsStatementId(oldName);
		return super.clientSelectByExampleWithBLOBsMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectByExampleStatementId(oldName);
		return super.clientSelectByExampleWithoutBLOBsMethodGenerated(method,
				interfaze, introspectedTable);
	}

	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectByExampleStatementId(oldName);
		return super.clientSelectByExampleWithoutBLOBsMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientSelectByPrimaryKeyMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectByPrimaryKeyStatementId(oldName);
		return super.clientSelectByPrimaryKeyMethodGenerated(method, interfaze,
				introspectedTable);
	}

	@Override
	public boolean clientSelectByPrimaryKeyMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectByPrimaryKeyStatementId(oldName);
		return super.clientSelectByPrimaryKeyMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByExampleSelectiveStatementId(oldName);
		return super.clientUpdateByExampleSelectiveMethodGenerated(method,
				interfaze, introspectedTable);
	}

	@Override
	public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByExampleSelectiveStatementId(oldName);
		return super.clientUpdateByExampleSelectiveMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByExampleWithBLOBsStatementId(oldName);
		return super.clientUpdateByExampleWithBLOBsMethodGenerated(method,
				interfaze, introspectedTable);
	}

	@Override
	public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByExampleWithBLOBsStatementId(oldName);
		return super.clientUpdateByExampleWithBLOBsMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByExampleStatementId(oldName);
		return super.clientUpdateByExampleWithoutBLOBsMethodGenerated(method,
				interfaze, introspectedTable);
	}

	@Override
	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByExampleStatementId(oldName);
		return super.clientUpdateByExampleWithoutBLOBsMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByPrimaryKeySelectiveStatementId(oldName);
		return super.clientUpdateByPrimaryKeySelectiveMethodGenerated(method,
				interfaze, introspectedTable);
	}

	@Override
	public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByPrimaryKeySelectiveStatementId(oldName);
		return super.clientUpdateByPrimaryKeySelectiveMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByPrimaryKeyWithBLOBsStatementId(oldName);
		return super.clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(method,
				interfaze, introspectedTable);
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByPrimaryKeyWithBLOBsStatementId(oldName);
		return super.clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(
			Method method, Interface interfaze,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByPrimaryKeyStatementId(oldName);
		return super.clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(
				method, interfaze, introspectedTable);
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(
			Method method, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setUpdateByPrimaryKeyStatementId(oldName);
		return super.clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(
				method, topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientInsertSelectiveMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setInsertSelectiveStatementId(oldName);
		return super.clientInsertSelectiveMethodGenerated(method, interfaze,
				introspectedTable);
	}

	@Override
	public boolean clientInsertSelectiveMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setInsertSelectiveStatementId(oldName);
		return super.clientInsertSelectiveMethodGenerated(method,
				topLevelClass, introspectedTable);
	}

	@Override
	public boolean clientSelectAllMethodGenerated(Method method,
			Interface interfaze, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectAllStatementId(oldName);
		return super.clientSelectAllMethodGenerated(method, interfaze,
				introspectedTable);
	}

	@Override
	public boolean clientSelectAllMethodGenerated(Method method,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String oldName = method.getName();
		Matcher matcher = pattern.matcher(oldName);
		oldName = matcher.replaceAll(replaceString);
		method.setName(oldName);
		introspectedTable.setSelectAllStatementId(oldName);
		return super.clientSelectAllMethodGenerated(method, topLevelClass,
				introspectedTable);
	}

}
