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

package com.rivetlogic.ecommerce.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NotificationLocalService}.
 *
 * @author rivetlogic
 * @see NotificationLocalService
 * @generated
 */
@ProviderType
public class NotificationLocalServiceWrapper implements NotificationLocalService,
	ServiceWrapper<NotificationLocalService> {
	public NotificationLocalServiceWrapper(
		NotificationLocalService notificationLocalService) {
		_notificationLocalService = notificationLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _notificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _notificationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _notificationLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _notificationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _notificationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _notificationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the notification to the database. Also notifies the appropriate model listeners.
	*
	* @param notification the notification
	* @return the notification that was added
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification addNotification(
		com.rivetlogic.ecommerce.model.Notification notification) {
		return _notificationLocalService.addNotification(notification);
	}

	@Override
	public com.rivetlogic.ecommerce.model.Notification create(long orderId,
		java.lang.String recipients,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _notificationLocalService.create(orderId, recipients,
			serviceContext);
	}

	/**
	* Creates a new notification with the primary key. Does not add the notification to the database.
	*
	* @param notificationId the primary key for the new notification
	* @return the new notification
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification createNotification(
		long notificationId) {
		return _notificationLocalService.createNotification(notificationId);
	}

	/**
	* Deletes the notification from the database. Also notifies the appropriate model listeners.
	*
	* @param notification the notification
	* @return the notification that was removed
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification deleteNotification(
		com.rivetlogic.ecommerce.model.Notification notification) {
		return _notificationLocalService.deleteNotification(notification);
	}

	/**
	* Deletes the notification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param notificationId the primary key of the notification
	* @return the notification that was removed
	* @throws PortalException if a notification with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification deleteNotification(
		long notificationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _notificationLocalService.deleteNotification(notificationId);
	}

	@Override
	public com.rivetlogic.ecommerce.model.Notification fetchNotification(
		long notificationId) {
		return _notificationLocalService.fetchNotification(notificationId);
	}

	/**
	* Returns the notification matching the UUID and group.
	*
	* @param uuid the notification's UUID
	* @param groupId the primary key of the group
	* @return the matching notification, or <code>null</code> if a matching notification could not be found
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification fetchNotificationByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _notificationLocalService.fetchNotificationByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the notification with the primary key.
	*
	* @param notificationId the primary key of the notification
	* @return the notification
	* @throws PortalException if a notification with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification getNotification(
		long notificationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _notificationLocalService.getNotification(notificationId);
	}

	/**
	* Returns the notification matching the UUID and group.
	*
	* @param uuid the notification's UUID
	* @param groupId the primary key of the group
	* @return the matching notification
	* @throws PortalException if a matching notification could not be found
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification getNotificationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _notificationLocalService.getNotificationByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the notification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param notification the notification
	* @return the notification that was updated
	*/
	@Override
	public com.rivetlogic.ecommerce.model.Notification updateNotification(
		com.rivetlogic.ecommerce.model.Notification notification) {
		return _notificationLocalService.updateNotification(notification);
	}

	/**
	* Returns the number of notifications.
	*
	* @return the number of notifications
	*/
	@Override
	public int getNotificationsCount() {
		return _notificationLocalService.getNotificationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _notificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _notificationLocalService.dynamicQuery(dynamicQuery);
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
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _notificationLocalService.dynamicQuery(dynamicQuery, start, end);
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
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _notificationLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.rivetlogic.ecommerce.model.Notification> findByOrderId(
		long orderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _notificationLocalService.findByOrderId(orderId);
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
	*/
	@Override
	public java.util.List<com.rivetlogic.ecommerce.model.Notification> getNotifications(
		int start, int end) {
		return _notificationLocalService.getNotifications(start, end);
	}

	/**
	* Returns all the notifications matching the UUID and company.
	*
	* @param uuid the UUID of the notifications
	* @param companyId the primary key of the company
	* @return the matching notifications, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.rivetlogic.ecommerce.model.Notification> getNotificationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _notificationLocalService.getNotificationsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of notifications matching the UUID and company.
	*
	* @param uuid the UUID of the notifications
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of notifications
	* @param end the upper bound of the range of notifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching notifications, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.rivetlogic.ecommerce.model.Notification> getNotificationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.rivetlogic.ecommerce.model.Notification> orderByComparator) {
		return _notificationLocalService.getNotificationsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _notificationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _notificationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void removeByOrderId(long orderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notificationLocalService.removeByOrderId(orderId);
	}

	@Override
	public void storeNotification(
		com.rivetlogic.ecommerce.model.Notification notification,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		_notificationLocalService.storeNotification(notification, serviceContext);
	}

	@Override
	public NotificationLocalService getWrappedService() {
		return _notificationLocalService;
	}

	@Override
	public void setWrappedService(
		NotificationLocalService notificationLocalService) {
		_notificationLocalService = notificationLocalService;
	}

	private NotificationLocalService _notificationLocalService;
}