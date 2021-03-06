/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.rivetlogic.ecommerce.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rivetlogic.ecommerce.model.ShoppingOrder;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Shopping Order service. This utility wraps {@link com.rivetlogic.ecommerce.service.persistence.impl.ShoppingOrderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author rivetlogic
 * @see ShoppingOrderPersistence
 * @see com.rivetlogic.ecommerce.service.persistence.impl.ShoppingOrderPersistenceImpl
 * @generated
 */
@ProviderType
public class ShoppingOrderUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ShoppingOrder shoppingOrder) {
		getPersistence().clearCache(shoppingOrder);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ShoppingOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ShoppingOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ShoppingOrder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ShoppingOrder update(ShoppingOrder shoppingOrder) {
		return getPersistence().update(shoppingOrder);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ShoppingOrder update(ShoppingOrder shoppingOrder,
		ServiceContext serviceContext) {
		return getPersistence().update(shoppingOrder, serviceContext);
	}

	/**
	* Returns all the Shopping Orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the Shopping Orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @return the range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<ShoppingOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first Shopping Order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByUuid_First(java.lang.String uuid,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first Shopping Order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByUuid_Last(java.lang.String uuid,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the Shopping Orders before and after the current Shopping Order in the ordered set where uuid = &#63;.
	*
	* @param orderId the primary key of the current Shopping Order
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Shopping Order
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder[] findByUuid_PrevAndNext(long orderId,
		java.lang.String uuid,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByUuid_PrevAndNext(orderId, uuid, orderByComparator);
	}

	/**
	* Removes all the Shopping Orders where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of Shopping Orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching Shopping Orders
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the Shopping Order where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchShoppingOrderException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByUUID_G(java.lang.String uuid, long groupId)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the Shopping Order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the Shopping Order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the Shopping Order where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the Shopping Order that was removed
	*/
	public static ShoppingOrder removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of Shopping Orders where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching Shopping Orders
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the Shopping Orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the Shopping Orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @return the range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first Shopping Order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first Shopping Order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the Shopping Orders before and after the current Shopping Order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param orderId the primary key of the current Shopping Order
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Shopping Order
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder[] findByUuid_C_PrevAndNext(long orderId,
		java.lang.String uuid, long companyId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(orderId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the Shopping Orders where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of Shopping Orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching Shopping Orders
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the Shopping Orders where orderStatus = &#63; and userId = &#63;.
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @return the matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByOrderStatusAndUserId(
		java.lang.String orderStatus, long userId) {
		return getPersistence().findByOrderStatusAndUserId(orderStatus, userId);
	}

	/**
	* Returns a range of all the Shopping Orders where orderStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @return the range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByOrderStatusAndUserId(
		java.lang.String orderStatus, long userId, int start, int end) {
		return getPersistence()
				   .findByOrderStatusAndUserId(orderStatus, userId, start, end);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where orderStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByOrderStatusAndUserId(
		java.lang.String orderStatus, long userId, int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .findByOrderStatusAndUserId(orderStatus, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where orderStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByOrderStatusAndUserId(
		java.lang.String orderStatus, long userId, int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrderStatusAndUserId(orderStatus, userId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first Shopping Order in the ordered set where orderStatus = &#63; and userId = &#63;.
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByOrderStatusAndUserId_First(
		java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByOrderStatusAndUserId_First(orderStatus, userId,
			orderByComparator);
	}

	/**
	* Returns the first Shopping Order in the ordered set where orderStatus = &#63; and userId = &#63;.
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByOrderStatusAndUserId_First(
		java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByOrderStatusAndUserId_First(orderStatus, userId,
			orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where orderStatus = &#63; and userId = &#63;.
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByOrderStatusAndUserId_Last(
		java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByOrderStatusAndUserId_Last(orderStatus, userId,
			orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where orderStatus = &#63; and userId = &#63;.
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByOrderStatusAndUserId_Last(
		java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByOrderStatusAndUserId_Last(orderStatus, userId,
			orderByComparator);
	}

	/**
	* Returns the Shopping Orders before and after the current Shopping Order in the ordered set where orderStatus = &#63; and userId = &#63;.
	*
	* @param orderId the primary key of the current Shopping Order
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Shopping Order
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder[] findByOrderStatusAndUserId_PrevAndNext(
		long orderId, java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByOrderStatusAndUserId_PrevAndNext(orderId,
			orderStatus, userId, orderByComparator);
	}

	/**
	* Removes all the Shopping Orders where orderStatus = &#63; and userId = &#63; from the database.
	*
	* @param orderStatus the order status
	* @param userId the user ID
	*/
	public static void removeByOrderStatusAndUserId(
		java.lang.String orderStatus, long userId) {
		getPersistence().removeByOrderStatusAndUserId(orderStatus, userId);
	}

	/**
	* Returns the number of Shopping Orders where orderStatus = &#63; and userId = &#63;.
	*
	* @param orderStatus the order status
	* @param userId the user ID
	* @return the number of matching Shopping Orders
	*/
	public static int countByOrderStatusAndUserId(
		java.lang.String orderStatus, long userId) {
		return getPersistence().countByOrderStatusAndUserId(orderStatus, userId);
	}

	/**
	* Returns all the Shopping Orders where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @return the matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupOrderStatusAndUserId(
		long groupId, java.lang.String orderStatus, long userId) {
		return getPersistence()
				   .findByGroupOrderStatusAndUserId(groupId, orderStatus, userId);
	}

	/**
	* Returns a range of all the Shopping Orders where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @return the range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupOrderStatusAndUserId(
		long groupId, java.lang.String orderStatus, long userId, int start,
		int end) {
		return getPersistence()
				   .findByGroupOrderStatusAndUserId(groupId, orderStatus,
			userId, start, end);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupOrderStatusAndUserId(
		long groupId, java.lang.String orderStatus, long userId, int start,
		int end, OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .findByGroupOrderStatusAndUserId(groupId, orderStatus,
			userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupOrderStatusAndUserId(
		long groupId, java.lang.String orderStatus, long userId, int start,
		int end, OrderByComparator<ShoppingOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupOrderStatusAndUserId(groupId, orderStatus,
			userId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByGroupOrderStatusAndUserId_First(
		long groupId, java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByGroupOrderStatusAndUserId_First(groupId, orderStatus,
			userId, orderByComparator);
	}

	/**
	* Returns the first Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByGroupOrderStatusAndUserId_First(
		long groupId, java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByGroupOrderStatusAndUserId_First(groupId,
			orderStatus, userId, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByGroupOrderStatusAndUserId_Last(
		long groupId, java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByGroupOrderStatusAndUserId_Last(groupId, orderStatus,
			userId, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByGroupOrderStatusAndUserId_Last(
		long groupId, java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByGroupOrderStatusAndUserId_Last(groupId, orderStatus,
			userId, orderByComparator);
	}

	/**
	* Returns the Shopping Orders before and after the current Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* @param orderId the primary key of the current Shopping Order
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Shopping Order
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder[] findByGroupOrderStatusAndUserId_PrevAndNext(
		long orderId, long groupId, java.lang.String orderStatus, long userId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByGroupOrderStatusAndUserId_PrevAndNext(orderId,
			groupId, orderStatus, userId, orderByComparator);
	}

	/**
	* Removes all the Shopping Orders where groupId = &#63; and orderStatus = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	*/
	public static void removeByGroupOrderStatusAndUserId(long groupId,
		java.lang.String orderStatus, long userId) {
		getPersistence()
			.removeByGroupOrderStatusAndUserId(groupId, orderStatus, userId);
	}

	/**
	* Returns the number of Shopping Orders where groupId = &#63; and orderStatus = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param userId the user ID
	* @return the number of matching Shopping Orders
	*/
	public static int countByGroupOrderStatusAndUserId(long groupId,
		java.lang.String orderStatus, long userId) {
		return getPersistence()
				   .countByGroupOrderStatusAndUserId(groupId, orderStatus,
			userId);
	}

	/**
	* Returns all the Shopping Orders where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the Shopping Orders where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @return the range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupId(long groupId, int start,
		int end, OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupId(long groupId, int start,
		int end, OrderByComparator<ShoppingOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first Shopping Order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByGroupId_First(long groupId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first Shopping Order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByGroupId_First(long groupId,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByGroupId_Last(long groupId,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByGroupId_Last(long groupId,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the Shopping Orders before and after the current Shopping Order in the ordered set where groupId = &#63;.
	*
	* @param orderId the primary key of the current Shopping Order
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Shopping Order
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder[] findByGroupId_PrevAndNext(long orderId,
		long groupId, OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(orderId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the Shopping Orders where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of Shopping Orders where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching Shopping Orders
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the Shopping Orders where groupId = &#63; and orderStatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @return the matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupIdAndOrderStatus(
		long groupId, java.lang.String orderStatus) {
		return getPersistence().findByGroupIdAndOrderStatus(groupId, orderStatus);
	}

	/**
	* Returns a range of all the Shopping Orders where groupId = &#63; and orderStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @return the range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupIdAndOrderStatus(
		long groupId, java.lang.String orderStatus, int start, int end) {
		return getPersistence()
				   .findByGroupIdAndOrderStatus(groupId, orderStatus, start, end);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where groupId = &#63; and orderStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupIdAndOrderStatus(
		long groupId, java.lang.String orderStatus, int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .findByGroupIdAndOrderStatus(groupId, orderStatus, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Shopping Orders where groupId = &#63; and orderStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Shopping Orders
	*/
	public static List<ShoppingOrder> findByGroupIdAndOrderStatus(
		long groupId, java.lang.String orderStatus, int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupIdAndOrderStatus(groupId, orderStatus, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByGroupIdAndOrderStatus_First(
		long groupId, java.lang.String orderStatus,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByGroupIdAndOrderStatus_First(groupId, orderStatus,
			orderByComparator);
	}

	/**
	* Returns the first Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByGroupIdAndOrderStatus_First(
		long groupId, java.lang.String orderStatus,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByGroupIdAndOrderStatus_First(groupId, orderStatus,
			orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order
	* @throws NoSuchShoppingOrderException if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder findByGroupIdAndOrderStatus_Last(long groupId,
		java.lang.String orderStatus,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByGroupIdAndOrderStatus_Last(groupId, orderStatus,
			orderByComparator);
	}

	/**
	* Returns the last Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Shopping Order, or <code>null</code> if a matching Shopping Order could not be found
	*/
	public static ShoppingOrder fetchByGroupIdAndOrderStatus_Last(
		long groupId, java.lang.String orderStatus,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence()
				   .fetchByGroupIdAndOrderStatus_Last(groupId, orderStatus,
			orderByComparator);
	}

	/**
	* Returns the Shopping Orders before and after the current Shopping Order in the ordered set where groupId = &#63; and orderStatus = &#63;.
	*
	* @param orderId the primary key of the current Shopping Order
	* @param groupId the group ID
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Shopping Order
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder[] findByGroupIdAndOrderStatus_PrevAndNext(
		long orderId, long groupId, java.lang.String orderStatus,
		OrderByComparator<ShoppingOrder> orderByComparator)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence()
				   .findByGroupIdAndOrderStatus_PrevAndNext(orderId, groupId,
			orderStatus, orderByComparator);
	}

	/**
	* Removes all the Shopping Orders where groupId = &#63; and orderStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	*/
	public static void removeByGroupIdAndOrderStatus(long groupId,
		java.lang.String orderStatus) {
		getPersistence().removeByGroupIdAndOrderStatus(groupId, orderStatus);
	}

	/**
	* Returns the number of Shopping Orders where groupId = &#63; and orderStatus = &#63;.
	*
	* @param groupId the group ID
	* @param orderStatus the order status
	* @return the number of matching Shopping Orders
	*/
	public static int countByGroupIdAndOrderStatus(long groupId,
		java.lang.String orderStatus) {
		return getPersistence()
				   .countByGroupIdAndOrderStatus(groupId, orderStatus);
	}

	/**
	* Caches the Shopping Order in the entity cache if it is enabled.
	*
	* @param shoppingOrder the Shopping Order
	*/
	public static void cacheResult(ShoppingOrder shoppingOrder) {
		getPersistence().cacheResult(shoppingOrder);
	}

	/**
	* Caches the Shopping Orders in the entity cache if it is enabled.
	*
	* @param shoppingOrders the Shopping Orders
	*/
	public static void cacheResult(List<ShoppingOrder> shoppingOrders) {
		getPersistence().cacheResult(shoppingOrders);
	}

	/**
	* Creates a new Shopping Order with the primary key. Does not add the Shopping Order to the database.
	*
	* @param orderId the primary key for the new Shopping Order
	* @return the new Shopping Order
	*/
	public static ShoppingOrder create(long orderId) {
		return getPersistence().create(orderId);
	}

	/**
	* Removes the Shopping Order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderId the primary key of the Shopping Order
	* @return the Shopping Order that was removed
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder remove(long orderId)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().remove(orderId);
	}

	public static ShoppingOrder updateImpl(ShoppingOrder shoppingOrder) {
		return getPersistence().updateImpl(shoppingOrder);
	}

	/**
	* Returns the Shopping Order with the primary key or throws a {@link NoSuchShoppingOrderException} if it could not be found.
	*
	* @param orderId the primary key of the Shopping Order
	* @return the Shopping Order
	* @throws NoSuchShoppingOrderException if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder findByPrimaryKey(long orderId)
		throws com.rivetlogic.ecommerce.exception.NoSuchShoppingOrderException {
		return getPersistence().findByPrimaryKey(orderId);
	}

	/**
	* Returns the Shopping Order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderId the primary key of the Shopping Order
	* @return the Shopping Order, or <code>null</code> if a Shopping Order with the primary key could not be found
	*/
	public static ShoppingOrder fetchByPrimaryKey(long orderId) {
		return getPersistence().fetchByPrimaryKey(orderId);
	}

	public static java.util.Map<java.io.Serializable, ShoppingOrder> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Shopping Orders.
	*
	* @return the Shopping Orders
	*/
	public static List<ShoppingOrder> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Shopping Orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @return the range of Shopping Orders
	*/
	public static List<ShoppingOrder> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Shopping Orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Shopping Orders
	*/
	public static List<ShoppingOrder> findAll(int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Shopping Orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingOrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Shopping Orders
	* @param end the upper bound of the range of Shopping Orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Shopping Orders
	*/
	public static List<ShoppingOrder> findAll(int start, int end,
		OrderByComparator<ShoppingOrder> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Shopping Orders from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Shopping Orders.
	*
	* @return the number of Shopping Orders
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ShoppingOrderPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ShoppingOrderPersistence, ShoppingOrderPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ShoppingOrderPersistence.class);
}