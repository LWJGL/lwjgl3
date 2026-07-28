/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

/**
 * Common superinterface for all binder types.
 *
 * @see UpcallBinder
 * @see GroupBinder
 * @see StructBinder
 * @see UnionBinder
 */
sealed interface Binder<T> permits GroupBinder, UpcallBinder {
}
