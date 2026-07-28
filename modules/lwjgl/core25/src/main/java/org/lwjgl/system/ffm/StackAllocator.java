/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.foreign.*;

/** A {@link SegmentAllocator} that supports stack-like push/pop functionality. */
public interface StackAllocator<T extends StackAllocator<T>> extends SegmentAllocator {

    /** Pushes a new stack frame and returns this allocator. */
    T push();

    /** Pops the current stack frame and returns this allocator. */
    T pop();

}