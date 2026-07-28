/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;

/**
 * A struct or union interface may extend this capability interface to expose {@link GroupBinder} functionality at the instance level.
 *
 * @see Struct
 * @see Union
 */
public sealed interface Group<L extends GroupLayout, T extends Group<L, T>>
    permits Struct, Union {

    // core methods, bytecode generated at runtime

    /**
     * Returns the layout of this group.
     *
     * @return the layout
     */
    L layout(); // stored in trusted final field (i.e. effectively constant)

    /**
     * Returns the memory address of this group.
     *
     * @return the memory address
     */
    long address(); // returns field address

    /**
     * Copies the content of the specified source group to this group.
     *
     * @param src the source group
     *
     * @return this group
     */
    T copyFrom(T src); // inlined + optimized memcpy

    /**
     * Clears the content of this group.
     *
     * @return this group
     */
    T clear(); // inlined + optimized memset

    // these skip bounds/alignment checking when FFMConfig::checks is disabled

    /**
     * Copies the content of the specified memory segment to this group.
     *
     * @param segment the source memory segment
     *
     * @return this group
     */
    T get(MemorySegment segment);

    /**
     * Copies the content of the specified memory segment at the given offset to this group.
     *
     * @param segment the source memory segment
     * @param offset  the offset within the segment
     *
     * @return this group
     */
    T get(MemorySegment segment, long offset);

    /**
     * Copies the content of the specified memory segment at the given index to this group.
     *
     * @param segment the source memory segment
     * @param index   the index within the segment
     *
     * @return this group
     */
    T getAtIndex(MemorySegment segment, long index);

    /**
     * Copies the content of this group to the specified memory segment.
     *
     * @param segment the target memory segment
     *
     * @return this groupn
     */
    T set(MemorySegment segment);

    /**
     * Copies the content of this group to the specified memory segment at the given offset.
     *
     * @param array  the target memory segment
     * @param offset the offset within the segment
     *
     * @return this group
     */
    T set(MemorySegment array, long offset);

    /**
     * Copies the content of this group to the specified memory segment at the given index.
     *
     * @param array the target memory segment
     * @param index the index within the segment
     *
     * @return this group
     */
    T setAtIndex(MemorySegment array, long index);

    // helper methods, non-generated

    /**
     * Returns the size, in bytes, of this group.
     *
     * @return the size
     */
    default long sizeof() { return layout().byteSize(); }

    /**
     * Returns the alignment, in bytes, of this group.
     *
     * @return the alignment
     */
    default long alignof() { return layout().byteAlignment(); }

    /**
     * Returns a memory segment view of this group.
     *
     * @return the memory segment
     */
    default MemorySegment asSegment() {
        return MemorySegment
            .ofAddress(address())
            .reinterpret(layout().byteSize());
    }

}