/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import java.lang.foreign.*;

/**
 * A mapping for a primitive layout.
 *
 * @param <L> the primitive layout type
 */
public sealed interface PrimitiveMapping<L extends ValueLayout> extends DataMapping<L>
    permits
    Mapping.Boolean,
    IntegerMapping,
    Mapping.Float,
    Mapping.Double {

    @Override
    PrimitiveMapping<L> withByteAlignment(long byteAlignment);

    @Override
    PrimitiveMapping<L> typedef(String name);
}