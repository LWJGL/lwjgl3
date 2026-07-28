/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm.mapping;

import org.lwjgl.system.*;

import java.lang.foreign.*;

/**
 * Mapping to a non-opaque layout.
 *
 * @param <L> the memory layout type
 */
public interface DataMapping<L extends MemoryLayout> extends Mapping<L> {

    /**
     * Returns a copy of this mapping with the specified byte alignment.
     *
     * @param byteAlignment the new byte alignment
     *
     * @return the new mapping
     */
    DataMapping<L> withByteAlignment(long byteAlignment);

    /**
     * Returns a sequence mapping for an array of elements of this mapping.
     *
     * @param elementCount the number of elements in the array
     *
     * @return the new mapping
     */
    default Sequence array(long elementCount) {
        return new Sequence(this, elementCount);
    }

    /**
     * Allocates a memory segment, without zero-initialization, for a single element on the specified segment stack.
     *
     * @param stack the segment stack
     *
     * @return the memory segment
     */
    default MemorySegment mallocSegment(SegmentStack stack) { return stack.allocate(layout()); }

    /**
     * Allocates a memory segment, without zero-initialization, for the specified number of elements on the specified segment stack.
     *
     * @param stack        the segment stack
     * @param elementCount the number of elements
     *
     * @return the memory segment
     */
    default MemorySegment mallocSegment(SegmentStack stack, long elementCount) { return stack.allocate(layout(), elementCount); }

    /**
     * Allocates a memory segment, with zero-initialization, for a single element on the specified segment stack.
     *
     * @param stack the segment stack
     *
     * @return the memory segment
     */
    default MemorySegment allocateSegment(SegmentStack stack) { return stack.calloc(layout()); }

    /**
     * Allocates a memory segment for a single element using the specified segment allocator.
     *
     * @param allocator the segment allocator
     *
     * @return the memory segment
     */
    default MemorySegment allocateSegment(SegmentAllocator allocator) {
        return allocator.allocate(layout()); // TODO: skip 1 inline level?
        /*var layout = layout();
        return DEBUG
            ? allocator.allocate(layout)
            : allocator.allocate(layout.byteSize(), layout.byteAlignment());*/
    }

    /**
     * Allocates a memory segment, with zero-initialization, for the specified number of elements on the specified segment stack.
     *
     * @param stack        the segment stack
     * @param elementCount the number of elements
     *
     * @return the memory segment
     */
    default MemorySegment allocateSegment(SegmentStack stack, long elementCount) { return stack.calloc(layout(), elementCount); }

    /**
     * Allocates a memory segment for the specified number of elements using the specified segment allocator.
     *
     * @param allocator    the segment allocator
     * @param elementCount the number of elements
     *
     * @return the memory segment
     */
    default MemorySegment allocateSegment(SegmentAllocator allocator, long elementCount) {
        return allocator.allocate(layout(), elementCount); // TODO: inefficient?
        /*var layout = layout();
        return DEBUG
            ? allocator.allocate(layout, elementCount)
            : allocator.allocate(elementCount * layout.byteSize(), layout.byteAlignment());*/
    }

}