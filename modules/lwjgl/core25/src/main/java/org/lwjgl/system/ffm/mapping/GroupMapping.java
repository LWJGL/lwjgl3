/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import java.lang.foreign.*;

/**
 * A mapping for a group layout.
 *
 * @param <L> the group layout type
 */
public interface GroupMapping<L extends GroupLayout>
    extends DataMapping<L> {

    @Override GroupMapping<L> withByteAlignment(long byteAlignment);
    @Override GroupMapping<L> typedef(String name);
}