/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

sealed interface Binder<T> permits GroupBinder, UpcallBinder {
}
