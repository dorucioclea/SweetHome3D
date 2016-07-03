/*
 * CollectionListener.java 27 oct. 2008
 *
 * Sweet Home 3D, Copyright (c) 2008 Emmanuel PUYBARET / eTeks <info@eteks.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.eteks.sweethome3d.model;

import java.util.EventListener;

/**
 * A listener notified when items are added or removed from a collection.
 * <code>T</code> is the type of item stored in the collection.
 * @author Emmanuel Puybaret
 */
public interface CollectionListener<T> extends EventListener
{
	/**
	 * Called when an item is added or deleted from a collection.
	 */
	public void collectionChanged(CollectionEvent<T> ev);
}
