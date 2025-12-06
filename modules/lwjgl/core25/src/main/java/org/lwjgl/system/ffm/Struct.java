/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;

/** A struct interface may extend this capability interface to expose {@link StructBinder} functionality at the instance level. */
public non-sealed interface Struct<T extends Struct<T>> extends Group<StructLayout, T> {
}

