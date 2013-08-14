/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package runjettyrun.tabs.classpath;


public interface IRJRClasspathEntry {

	/**
	 * Returns the classpath entries that are the children of this classpath entry
	 *
	 * @return the child classpath entries of this entry
	 */
	public IRJRClasspathEntry[] getEntries();

	public String getRealPath();
	/**
	 * Returns whether this classpath entries has child entries.
	 *
	 * @return whether <code>true</code> if this classpath entry has childern, <code>false</code> otherwise.
	 */
	public boolean hasEntries();

	/**
	 * Returns the parent of this classpath entry
	 *
	 * @return the parent of this classpath entry, or <code>null</code> if none.
	 */
	public IRJRClasspathEntry getParent();

	/**
	 * Move this entries child entry in the direction indicated.
	 * @param up if <code>true</code> move the child up one position in the order of the entries.
	 * Otherwise, move the child down one position.
	 * @param child the child entry to move
	 */
	public void moveChild(boolean up, IRJRClasspathEntry child);

	/**
	 * Returns whether this entry is editable.
	 *
	 * @return whether this entry is editable
	 */
	public boolean isEditable();

	public boolean isCustom();

	public boolean isDefaultChecked();

	public boolean isDefaultGrayed();

	public boolean isContainer();

	public String getKey();
}
