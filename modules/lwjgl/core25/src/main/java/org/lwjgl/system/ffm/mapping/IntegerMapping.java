/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import java.lang.foreign.*;

/**
 * A mapping for an integer layout.
 *
 * @param <L> the integer layout type
 */
public sealed interface IntegerMapping<L extends ValueLayout> extends PrimitiveMapping<L>
    permits
    Mapping.Byte,
    Mapping.Char,
    Mapping.Short,
    Mapping.Int,
    Mapping.Long,
    Mapping.CLong,
    Mapping.Size {

    /**
     * Returns whether the integer is signed (true) or unsigned (false).
     *
     * @return whether the integer is signed
     */
    boolean signed();

    @Override
    IntegerMapping<L> typedef(String name);
}