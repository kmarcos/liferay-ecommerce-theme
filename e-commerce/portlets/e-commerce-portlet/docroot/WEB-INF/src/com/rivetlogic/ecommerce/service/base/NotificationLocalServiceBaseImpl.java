/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.ecommerce.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.rivetlogic.ecommerce.model.Notification;
import com.rivetlogic.ecommerce.service.NotificationLocalService;
import com.rivetlogic.ecommerce.service.persistence.NotificationPK;
import com.rivetlogic.ecommerce.service.persistence.NotificationPersistence;
import com.rivetlogic.ecommerce.service.persistence.ShoppingOrderItemPersistence;
import com.rivetlogic.ecommerce.service.persistence.ShoppingOrderPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the notification local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.rivetlogic.ecommerce.service.impl.NotificationLocalServiceImpl}.
 * </p>
 *
 * @author isaiulate
 * @see com.rivetlogic.ecommerce.service.impl.NotificationLocalServiceImpl
 * @see com.rivetlogic.ecommerce.service.NotificationLocalServiceUtil
 * @generated
 */
public abstract class NotificationLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements NotificationLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.rivetlogic.ecommerce.service.NotificationLocalServiceUtil} to access the notification local service.
	 */

	/**
	 * Adds the notification to the database. Also notifies the appropriate model listeners.
	 *
	 * @param notification the notification
	 * @return the notification that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Notification addNotification(Notification notification)
		throws SystemException {
		notification.setNew(true);

		return notificationPersistence.update(notification);
	}

	/**
	 * Creates a new notification with the primary key. Does not add the notification to the database.
	 *
	 * @param notificationPK the primary key for the new notification
	 * @return the new notification
	 */
	@Override
	public Notification createNotification(NotificationPK notificationPK) {
		return notificationPersistence.create(notificationPK);
	}

	/**
	 * Deletes the notification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notificationPK the primary key of the notification
	 * @return the notification that was removed
	 * @throws PortalException if a notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Notification deleteNotification(NotificationPK notificationPK)
		throws PortalException, SystemException {
		return notificationPersistence.remove(notificationPK);
	}

	/**
	 * Deletes the notification from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notification the notification
	 * @return the notification that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Notification deleteNotification(Notification notification)
		throws SystemException {
		return notificationPersistence.remove(notification);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Notification.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return notificationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.NotificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return notificationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.NotificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return notificationPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return notificationPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return notificationPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Notification fetchNotification(NotificationPK notificationPK)
		throws SystemException {
		return notificationPersistence.fetchByPrimaryKey(notificationPK);
	}

	/**
	 * Returns the notification with the primary key.
	 *
	 * @param notificationPK the primary key of the notification
	 * @return the notification
	 * @throws PortalException if a notification with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Notification getNotification(NotificationPK notificationPK)
		throws PortalException, SystemException {
		return notificationPersistence.findByPrimaryKey(notificationPK);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return notificationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the notifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.NotificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifications
	 * @param end the upper bound of the range of notifications (not inclusive)
	 * @return the range of notifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Notification> getNotifications(int start, int end)
		throws SystemException {
		return notificationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of notifications.
	 *
	 * @return the number of notifications
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getNotificationsCount() throws SystemException {
		return notificationPersistence.countAll();
	}

	/**
	 * Updates the notification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param notification the notification
	 * @return the notification that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Notification updateNotification(Notification notification)
		throws SystemException {
		return notificationPersistence.update(notification);
	}

	/**
	 * Returns the notification local service.
	 *
	 * @return the notification local service
	 */
	public com.rivetlogic.ecommerce.service.NotificationLocalService getNotificationLocalService() {
		return notificationLocalService;
	}

	/**
	 * Sets the notification local service.
	 *
	 * @param notificationLocalService the notification local service
	 */
	public void setNotificationLocalService(
		com.rivetlogic.ecommerce.service.NotificationLocalService notificationLocalService) {
		this.notificationLocalService = notificationLocalService;
	}

	/**
	 * Returns the notification persistence.
	 *
	 * @return the notification persistence
	 */
	public NotificationPersistence getNotificationPersistence() {
		return notificationPersistence;
	}

	/**
	 * Sets the notification persistence.
	 *
	 * @param notificationPersistence the notification persistence
	 */
	public void setNotificationPersistence(
		NotificationPersistence notificationPersistence) {
		this.notificationPersistence = notificationPersistence;
	}

	/**
	 * Returns the Shopping Order local service.
	 *
	 * @return the Shopping Order local service
	 */
	public com.rivetlogic.ecommerce.service.ShoppingOrderLocalService getShoppingOrderLocalService() {
		return shoppingOrderLocalService;
	}

	/**
	 * Sets the Shopping Order local service.
	 *
	 * @param shoppingOrderLocalService the Shopping Order local service
	 */
	public void setShoppingOrderLocalService(
		com.rivetlogic.ecommerce.service.ShoppingOrderLocalService shoppingOrderLocalService) {
		this.shoppingOrderLocalService = shoppingOrderLocalService;
	}

	/**
	 * Returns the Shopping Order persistence.
	 *
	 * @return the Shopping Order persistence
	 */
	public ShoppingOrderPersistence getShoppingOrderPersistence() {
		return shoppingOrderPersistence;
	}

	/**
	 * Sets the Shopping Order persistence.
	 *
	 * @param shoppingOrderPersistence the Shopping Order persistence
	 */
	public void setShoppingOrderPersistence(
		ShoppingOrderPersistence shoppingOrderPersistence) {
		this.shoppingOrderPersistence = shoppingOrderPersistence;
	}

	/**
	 * Returns the Shopping Order Item local service.
	 *
	 * @return the Shopping Order Item local service
	 */
	public com.rivetlogic.ecommerce.service.ShoppingOrderItemLocalService getShoppingOrderItemLocalService() {
		return shoppingOrderItemLocalService;
	}

	/**
	 * Sets the Shopping Order Item local service.
	 *
	 * @param shoppingOrderItemLocalService the Shopping Order Item local service
	 */
	public void setShoppingOrderItemLocalService(
		com.rivetlogic.ecommerce.service.ShoppingOrderItemLocalService shoppingOrderItemLocalService) {
		this.shoppingOrderItemLocalService = shoppingOrderItemLocalService;
	}

	/**
	 * Returns the Shopping Order Item persistence.
	 *
	 * @return the Shopping Order Item persistence
	 */
	public ShoppingOrderItemPersistence getShoppingOrderItemPersistence() {
		return shoppingOrderItemPersistence;
	}

	/**
	 * Sets the Shopping Order Item persistence.
	 *
	 * @param shoppingOrderItemPersistence the Shopping Order Item persistence
	 */
	public void setShoppingOrderItemPersistence(
		ShoppingOrderItemPersistence shoppingOrderItemPersistence) {
		this.shoppingOrderItemPersistence = shoppingOrderItemPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.rivetlogic.ecommerce.model.Notification",
			notificationLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.rivetlogic.ecommerce.model.Notification");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Notification.class;
	}

	protected String getModelClassName() {
		return Notification.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = notificationPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.rivetlogic.ecommerce.service.NotificationLocalService.class)
	protected com.rivetlogic.ecommerce.service.NotificationLocalService notificationLocalService;
	@BeanReference(type = NotificationPersistence.class)
	protected NotificationPersistence notificationPersistence;
	@BeanReference(type = com.rivetlogic.ecommerce.service.ShoppingOrderLocalService.class)
	protected com.rivetlogic.ecommerce.service.ShoppingOrderLocalService shoppingOrderLocalService;
	@BeanReference(type = ShoppingOrderPersistence.class)
	protected ShoppingOrderPersistence shoppingOrderPersistence;
	@BeanReference(type = com.rivetlogic.ecommerce.service.ShoppingOrderItemLocalService.class)
	protected com.rivetlogic.ecommerce.service.ShoppingOrderItemLocalService shoppingOrderItemLocalService;
	@BeanReference(type = ShoppingOrderItemPersistence.class)
	protected ShoppingOrderItemPersistence shoppingOrderItemPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private NotificationLocalServiceClpInvoker _clpInvoker = new NotificationLocalServiceClpInvoker();
}