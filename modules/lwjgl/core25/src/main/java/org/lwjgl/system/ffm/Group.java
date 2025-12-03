/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;

// TODO: document
public sealed interface Group<L extends GroupLayout, T extends Group<L, T>>
    permits Struct, Union {

    // core methods, bytecode generated at runtime

    L layout(); // stored in trusted final field (i.e. effectively constant)

    long address(); // returns field address

    T copyFrom(T src); // inlined + optimized memcpy
    T clear(); // inlined + optimized memset

    // these skip bounds/alignment checking when FFMConfig::checks is disabled
    T get(MemorySegment segment);
    T get(MemorySegment segment, long offset);
    T getAtIndex(MemorySegment segment, long index);

    T set(MemorySegment segment);
    T set(MemorySegment array, long offset);
    T setAtIndex(MemorySegment array, long index);

    // helper methods, non-generated

    default long sizeof()  { return layout().byteSize(); }
    default long alignof() { return layout().byteAlignment(); }

    default MemorySegment asSegment() {
        return MemorySegment
            .ofAddress(address())
            .reinterpret(layout().byteSize());
    }

}