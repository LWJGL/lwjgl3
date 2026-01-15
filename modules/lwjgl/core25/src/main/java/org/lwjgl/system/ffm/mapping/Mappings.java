/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import java.lang.foreign.*;

final class Mappings {
    private Mappings() { }

    static String nameConst(MemoryLayout layout) {
        return layout.name().orElseThrow() + " const";
    }

    static void check(MemoryLayout layout) {
        if (layout.name().isEmpty()) {
            throw new IllegalArgumentException("Layout must be named");
        }
    }
}