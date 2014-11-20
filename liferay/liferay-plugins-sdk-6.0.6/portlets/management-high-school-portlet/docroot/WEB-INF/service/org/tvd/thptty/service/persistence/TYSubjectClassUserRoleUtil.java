/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.tvd.thptty.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import org.tvd.thptty.model.TYSubjectClassUserRole;

import java.util.List;

/**
 * The persistence utility for the t y subject class user role service. This utility wraps {@link TYSubjectClassUserRolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ta Van Dung
 * @see TYSubjectClassUserRolePersistence
 * @see TYSubjectClassUserRolePersistenceImpl
 * @generated
 */
public class TYSubjectClassUserRoleUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TYSubjectClassUserRole tySubjectClassUserRole) {
		getPersistence().clearCache(tySubjectClassUserRole);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TYSubjectClassUserRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TYSubjectClassUserRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TYSubjectClassUserRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static TYSubjectClassUserRole remove(
		TYSubjectClassUserRole tySubjectClassUserRole)
		throws SystemException {
		return getPersistence().remove(tySubjectClassUserRole);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TYSubjectClassUserRole update(
		TYSubjectClassUserRole tySubjectClassUserRole, boolean merge)
		throws SystemException {
		return getPersistence().update(tySubjectClassUserRole, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TYSubjectClassUserRole update(
		TYSubjectClassUserRole tySubjectClassUserRole, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(tySubjectClassUserRole, merge, serviceContext);
	}

	/**
	* Caches the t y subject class user role in the entity cache if it is enabled.
	*
	* @param tySubjectClassUserRole the t y subject class user role to cache
	*/
	public static void cacheResult(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole) {
		getPersistence().cacheResult(tySubjectClassUserRole);
	}

	/**
	* Caches the t y subject class user roles in the entity cache if it is enabled.
	*
	* @param tySubjectClassUserRoles the t y subject class user roles to cache
	*/
	public static void cacheResult(
		java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> tySubjectClassUserRoles) {
		getPersistence().cacheResult(tySubjectClassUserRoles);
	}

	/**
	* Creates a new t y subject class user role with the primary key. Does not add the t y subject class user role to the database.
	*
	* @param tySubjectClassUserRolePK the primary key for the new t y subject class user role
	* @return the new t y subject class user role
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole create(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK) {
		return getPersistence().create(tySubjectClassUserRolePK);
	}

	/**
	* Removes the t y subject class user role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tySubjectClassUserRolePK the primary key of the t y subject class user role to remove
	* @return the t y subject class user role that was removed
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole remove(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence().remove(tySubjectClassUserRolePK);
	}

	public static org.tvd.thptty.model.TYSubjectClassUserRole updateImpl(
		org.tvd.thptty.model.TYSubjectClassUserRole tySubjectClassUserRole,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tySubjectClassUserRole, merge);
	}

	/**
	* Finds the t y subject class user role with the primary key or throws a {@link org.tvd.thptty.NoSuchSubjectClassUserRoleException} if it could not be found.
	*
	* @param tySubjectClassUserRolePK the primary key of the t y subject class user role to find
	* @return the t y subject class user role
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole findByPrimaryKey(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence().findByPrimaryKey(tySubjectClassUserRolePK);
	}

	/**
	* Finds the t y subject class user role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tySubjectClassUserRolePK the primary key of the t y subject class user role to find
	* @return the t y subject class user role, or <code>null</code> if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole fetchByPrimaryKey(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tySubjectClassUserRolePK);
	}

	/**
	* Finds all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findByC_S_U_R(
		int courses, long subjectId, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_S_U_R(courses, subjectId, userId, roleId);
	}

	/**
	* Finds a range of all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y subject class user roles to return
	* @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	* @return the range of matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findByC_S_U_R(
		int courses, long subjectId, long userId, long roleId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_U_R(courses, subjectId, userId, roleId, start, end);
	}

	/**
	* Finds an ordered range of all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y subject class user roles to return
	* @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findByC_S_U_R(
		int courses, long subjectId, long userId, long roleId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S_U_R(courses, subjectId, userId, roleId, start,
			end, orderByComparator);
	}

	/**
	* Finds the first t y subject class user role in the ordered set where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y subject class user role
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole findByC_S_U_R_First(
		int courses, long subjectId, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence()
				   .findByC_S_U_R_First(courses, subjectId, userId, roleId,
			orderByComparator);
	}

	/**
	* Finds the last t y subject class user role in the ordered set where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y subject class user role
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole findByC_S_U_R_Last(
		int courses, long subjectId, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence()
				   .findByC_S_U_R_Last(courses, subjectId, userId, roleId,
			orderByComparator);
	}

	/**
	* Finds the t y subject class user roles before and after the current t y subject class user role in the ordered set where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tySubjectClassUserRolePK the primary key of the current t y subject class user role
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y subject class user role
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole[] findByC_S_U_R_PrevAndNext(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK,
		int courses, long subjectId, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence()
				   .findByC_S_U_R_PrevAndNext(tySubjectClassUserRolePK,
			courses, subjectId, userId, roleId, orderByComparator);
	}

	/**
	* Finds all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findByC_U_R(
		int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_U_R(courses, userId, roleId);
	}

	/**
	* Finds a range of all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y subject class user roles to return
	* @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	* @return the range of matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_U_R(courses, userId, roleId, start, end);
	}

	/**
	* Finds an ordered range of all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param start the lower bound of the range of t y subject class user roles to return
	* @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findByC_U_R(
		int courses, long userId, long roleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_U_R(courses, userId, roleId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first t y subject class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching t y subject class user role
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole findByC_U_R_First(
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence()
				   .findByC_U_R_First(courses, userId, roleId, orderByComparator);
	}

	/**
	* Finds the last t y subject class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching t y subject class user role
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a matching t y subject class user role could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole findByC_U_R_Last(
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence()
				   .findByC_U_R_Last(courses, userId, roleId, orderByComparator);
	}

	/**
	* Finds the t y subject class user roles before and after the current t y subject class user role in the ordered set where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tySubjectClassUserRolePK the primary key of the current t y subject class user role
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next t y subject class user role
	* @throws org.tvd.thptty.NoSuchSubjectClassUserRoleException if a t y subject class user role with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.tvd.thptty.model.TYSubjectClassUserRole[] findByC_U_R_PrevAndNext(
		org.tvd.thptty.service.persistence.TYSubjectClassUserRolePK tySubjectClassUserRolePK,
		int courses, long userId, long roleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.tvd.thptty.NoSuchSubjectClassUserRoleException {
		return getPersistence()
				   .findByC_U_R_PrevAndNext(tySubjectClassUserRolePK, courses,
			userId, roleId, orderByComparator);
	}

	/**
	* Finds all the t y subject class user roles.
	*
	* @return the t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the t y subject class user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subject class user roles to return
	* @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	* @return the range of t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the t y subject class user roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of t y subject class user roles to return
	* @param end the upper bound of the range of t y subject class user roles to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.tvd.thptty.model.TYSubjectClassUserRole> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_S_U_R(int courses, long subjectId,
		long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_S_U_R(courses, subjectId, userId, roleId);
	}

	/**
	* Removes all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63; from the database.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_U_R(courses, userId, roleId);
	}

	/**
	* Removes all the t y subject class user roles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the t y subject class user roles where courses = &#63; and subjectId = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param subjectId the subject id to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_S_U_R(int courses, long subjectId, long userId,
		long roleId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByC_S_U_R(courses, subjectId, userId, roleId);
	}

	/**
	* Counts all the t y subject class user roles where courses = &#63; and userId = &#63; and roleId = &#63;.
	*
	* @param courses the courses to search with
	* @param userId the user id to search with
	* @param roleId the role id to search with
	* @return the number of matching t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_U_R(int courses, long userId, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_U_R(courses, userId, roleId);
	}

	/**
	* Counts all the t y subject class user roles.
	*
	* @return the number of t y subject class user roles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TYSubjectClassUserRolePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TYSubjectClassUserRolePersistence)PortletBeanLocatorUtil.locate(org.tvd.thptty.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TYSubjectClassUserRolePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TYSubjectClassUserRolePersistence persistence) {
		_persistence = persistence;
	}

	private static TYSubjectClassUserRolePersistence _persistence;
}