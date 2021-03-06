
package org.glyptodon.guacamole.net.auth.permission;

/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is guacamole-ext.
 *
 * The Initial Developer of the Original Code is
 * Michael Jumper.
 * Portions created by the Initial Developer are Copyright (C) 2010
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */


/**
 * A permission which affects a specific object, rather than the system as a
 * whole.
 *
 * @author Michael Jumper
 * @param <T> The type of identifier used by the object this permission affects.
 */
public interface ObjectPermission<T> extends Permission<ObjectPermission.Type> {

    /**
     * Specific types of object-level permissions. Each permission type is
     * related to a specific class of object-level operation.
     */
    public enum Type {

        /**
         * Read data within an object.
         */
        READ,

        /**
         * Update data within an object.
         */
        UPDATE,

        /**
         * Delete an object.
         */
        DELETE,

        /**
         * Change who has access to an object.
         */
        ADMINISTER

    }

    /**
     * Returns the identifier of the specific object affected by this
     * permission.
     *
     * @return The identifier of the specific object affected by this
     *         permission.
     */
    public T getObjectIdentifier();

}
