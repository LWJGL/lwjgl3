/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;

/** A union interface may extend this capability interface to expose {@link UnionBinder} functionality at the instance level. */
public non-sealed interface Union<T extends Union<T>> extends Group<UnionLayout, T> {
}
