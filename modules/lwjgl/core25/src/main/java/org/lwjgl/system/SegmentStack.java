/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.*;

import java.lang.foreign.*;
import java.util.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.StackWalkUtil.*;

/**
 * An off-heap memory stack.
 *
 * <p>This class should be used in a thread-local manner for stack allocations.</p>
 *
 * @see Configuration#STACK_SIZE
 * @see Configuration#DEBUG_STACK
 */
public class SegmentStack implements StackAllocator<SegmentStack>, AutoCloseable {

    private static final long DEFAULT_STACK_SIZE   = Configuration.STACK_SIZE.get(64) * 1024L;
    private static final int  DEFAULT_STACK_FRAMES = 8;

    private static final ThreadLocal<SegmentStack> TLS = ThreadLocal.withInitial(SegmentStack::create);

    static {
        if (DEFAULT_STACK_SIZE < 0) {
            throw new IllegalStateException("Invalid stack size.");
        }
    }

    private final MemorySegment container;

    private final long size;

    private long pointer;

    private   long[] frames;
    protected int    frameIndex;

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory region.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param container the backing memory buffer, may be null
     */
    protected SegmentStack(MemorySegment container) {
        this.container = container;

        this.size = container.byteSize();
        this.pointer = container.byteSize();

        this.frames = new long[DEFAULT_STACK_FRAMES];
    }

    /**
     * Creates a new {@code MemoryStack} with the default size.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     */
    public static SegmentStack create() {
        return create(DEFAULT_STACK_SIZE);
    }

    /**
     * Creates a new {@code MemoryStack} with the specified size.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param capacity the maximum number of bytes that may be allocated on the stack
     */
    public static SegmentStack create(long capacity) {
        return create(Arena.ofAuto().allocate(capacity));
    }

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory segment.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param segment the backing memory segment
     */
    public static SegmentStack create(MemorySegment segment) {
        return Configuration.DEBUG_STACK.get(false)
            ? new DebugMemoryStack(segment)
            : new SegmentStack(segment);
    }

    /**
     * Stores the current stack pointer and pushes a new frame to the stack.
     *
     * <p>This method should be called when entering a method, before doing any stack allocations. When exiting a method, call the {@link #pop} method to
     * restore the previous stack frame.</p>
     *
     * <p>Pairs of push/pop calls may be nested. Care must be taken to:</p>
     * <ul>
     * <li>match every push with a pop</li>
     * <li>not call pop before push has been called at least once</li>
     * <li>not nest push calls to more than the maximum supported depth</li>
     * </ul>
     *
     * @return this stack
     */
    @Override
    public SegmentStack push() {
        if (frameIndex == frames.length) {
            frameOverflow();
        }

        frames[frameIndex++] = pointer;
        return this;
    }

    private void frameOverflow() {
        if (DEBUG) {
            apiLog("[WARNING] Out of frame stack space (" + frames.length + ") in thread: " + Thread.currentThread());
        }
        frames = Arrays.copyOf(frames, frames.length * 3 / 2);
    }

    /**
     * Pops the current stack frame and moves the stack pointer to the end of the previous stack frame.
     *
     * @return this stack
     */
    @Override
    public SegmentStack pop() {
        pointer = frames[--frameIndex];
        return this;
    }

    /**
     * Calls {@link #pop} on this {@code MemoryStack}.
     *
     * <p>This method should not be used directly. It is called automatically when the {@code MemoryStack} is used as a resource in a try-with-resources
     * statement.</p>
     */
    @Override
    public void close() {
        //noinspection resource
        pop();
    }

    /** Stores the method that pushed a frame and checks if it is the same method when the frame is popped. */
    private static class DebugMemoryStack extends SegmentStack {

        private @Nullable Object[] debugFrames;

        DebugMemoryStack(MemorySegment container) {
            super(container);
            debugFrames = new Object[DEFAULT_STACK_FRAMES];
        }

        @Override
        public SegmentStack push() {
            if (frameIndex == debugFrames.length) {
                frameOverflow();
            }

            debugFrames[frameIndex] = stackWalkGetMethod(SegmentStack.class);

            return super.push();
        }

        private void frameOverflow() {
            debugFrames = Arrays.copyOf(debugFrames, debugFrames.length * 3 / 2);
        }

        @Override
        public SegmentStack pop() {
            var pushed = Objects.requireNonNull(debugFrames[frameIndex - 1]);
            var popped = stackWalkCheckPop(SegmentStack.class, pushed);
            if (popped != null) {
                reportAsymmetricPop(pushed, popped);
            }

            debugFrames[frameIndex - 1] = null;
            return super.pop();
        }

        // No need to check pop in try-with-resources
        @Override
        public void close() {
            debugFrames[frameIndex - 1] = null;
            super.pop();
        }

        private static void reportAsymmetricPop(Object pushed, Object popped) {
            DEBUG_STREAM.format(
                "[LWJGL] Asymmetric pop detected:\n\tPUSHED: %s\n\tPOPPED: %s\n\tTHREAD: %s\n",
                pushed,
                popped,
                Thread.currentThread()
            );
        }

    }

    /**
     * Returns the address of the backing off-heap memory.
     *
     * <p>The stack grows "downwards", so the bottom of the stack is at {@code address + size}, while the top is at {@code address}.</p>
     */
    public long getAddress() {
        return container.address();
    }

    /**
     * Returns the size of the backing off-heap memory.
     *
     * <p>This is the maximum number of bytes that may be allocated on the stack.</p>
     */
    public long getSize() {
        return container.byteSize();
    }

    /**
     * Returns the current frame index.
     *
     * <p>This is the current number of nested {@link #push} calls.</p>
     */
    public int getFrameIndex() {
        return frameIndex;
    }

    /** Returns the memory address at the current stack pointer. */
    public long getPointerAddress() {
        return container.address() + pointer;
    }

    /**
     * Returns the current stack pointer.
     *
     * <p>The stack grows "downwards", so when the stack is empty {@code pointer} is equal to {@code size}. On every allocation {@code pointer} is reduced by
     * the allocated size (after alignment) and {@code address + pointer} points to the first byte of the last allocation.</p>
     *
     * <p>Effectively, this methods returns how many more bytes may be allocated on the stack.</p>
     */
    public long getPointer() {
        return pointer;
    }

    /**
     * Sets the current stack pointer.
     *
     * <p>This method directly manipulates the stack pointer. Using it irresponsibly may break the internal state of the stack. It should only be used in rare
     * cases or in auto-generated code.</p>
     */
    public void setPointer(long pointer) {
        if (CHECKS) {
            checkPointer(pointer);
        }

        this.pointer = pointer;
    }

    private void checkPointer(long pointer) {
        if (pointer < 0 || size < pointer) {
            throw new IndexOutOfBoundsException("Invalid stack pointer");
        }
    }

    private static void checkAlignment(long alignment) {
        if (Long.bitCount(alignment) != 1) {
            throw new IllegalArgumentException("Alignment must be a power-of-two value.");
        }
    }

    /** Same as {@link Arena#allocate(long)}, but with {@link ValueLayout#ADDRESS} alignment and no zero-initialization. */
    @Override
    public MemorySegment allocate(long byteSize) {
        return allocate(byteSize, ValueLayout.ADDRESS.byteAlignment()/* TODO: compatible with LWJGL3, restore to 1? */);
    }

    /** Same as {@link Arena#allocate(long, long)}, but without zero-initialization. */
    @Override
    public MemorySegment allocate(long byteSize, long byteAlignment) {
        if (DEBUG) {
            checkAlignment(byteAlignment);
        }

        var address = (container.address() + pointer - byteSize) & -byteAlignment;

        pointer = (address - container.address());
        if (CHECKS && pointer < 0) {
            throw new OutOfMemoryError("Out of stack space.");
        }

        return container.asSlice(pointer, byteSize, 1L);
    }

    // allocate(MemoryLayout) and allocate(MemoryLayout, long) below have the same implementation
    // as Arena, the overrides exist simply to document the lack of zero-initialization.

    /** Same as {@link Arena#allocate(MemoryLayout)}, but without zero-initialization. */
    @Override
    public MemorySegment allocate(MemoryLayout layout) {
        Objects.requireNonNull(layout);
        return allocate(layout.byteSize(), layout.byteAlignment());
    }

    /** Same as {@link Arena#allocate(MemoryLayout, long)}, but without zero-initialization. */
    @Override
    public MemorySegment allocate(MemoryLayout elementLayout, long count) {
        // TODO: these checks (and the ones in MemoryLayout.sequenceLayout) are overkill, consider eliminating in non-DEBUG mode. (bytecode-gen?)
        Objects.requireNonNull(elementLayout);
        if (count < 0) {
            throw new IllegalArgumentException("Negative array size");
        }
        var layout = MemoryLayout.sequenceLayout(count, elementLayout);
        return allocate(layout.byteSize(), layout.byteAlignment());
    }

    /** Same as {@link Arena#allocate(long)}. */
    public MemorySegment calloc(long byteSize) {
        return allocate(byteSize)
            .fill((byte)0);
    }

    /** Same as {@link Arena#allocate(long, long)}. */
    public MemorySegment calloc(long byteSize, long byteAlignment) {
        return allocate(byteSize, byteAlignment)
            .fill((byte)0);
    }

    /** Same as {@link Arena#allocate(MemoryLayout)}. */
    public MemorySegment calloc(MemoryLayout layout) {
        return allocate(layout)
            .fill((byte)0);
    }

    /** Same as {@link Arena#allocate(MemoryLayout, long)}. */
    public MemorySegment calloc(MemoryLayout elementLayout, long count) {
        return allocate(elementLayout, count)
            .fill((byte)0);
    }

    // -----------------------------------------------------
    // -----------------------------------------------------
    // -----------------------------------------------------

    /** Returns the stack of the current thread. */
    public static SegmentStack stackGet() {
        return TLS.get();
    }

    /**
     * Calls {@link #push} on the stack of the current thread.
     *
     * @return the stack of the current thread.
     */
    public static SegmentStack stackPush() {
        //noinspection resource
        return stackGet().push();
    }

}