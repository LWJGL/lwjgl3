/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * State of the Haptics playback for Touch vibration.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrHapticsPlaybackState {
 *     int {@link #RemainingQueueSpace};
 *     int {@link #SamplesQueued};
 * }</code></pre>
 */
@NativeType("struct ovrHapticsPlaybackState")
public class OVRHapticsPlaybackState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REMAININGQUEUESPACE,
        SAMPLESQUEUED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REMAININGQUEUESPACE = layout.offsetof(0);
        SAMPLESQUEUED = layout.offsetof(1);
    }

    /**
     * Creates a {@code OVRHapticsPlaybackState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRHapticsPlaybackState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Remaining space available to queue more samples */
    public int RemainingQueueSpace() { return nRemainingQueueSpace(address()); }
    /** Number of samples currently queued */
    public int SamplesQueued() { return nSamplesQueued(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRHapticsPlaybackState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRHapticsPlaybackState malloc() {
        return wrap(OVRHapticsPlaybackState.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRHapticsPlaybackState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRHapticsPlaybackState calloc() {
        return wrap(OVRHapticsPlaybackState.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRHapticsPlaybackState} instance allocated with {@link BufferUtils}. */
    public static OVRHapticsPlaybackState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRHapticsPlaybackState.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRHapticsPlaybackState} instance for the specified memory address. */
    public static OVRHapticsPlaybackState create(long address) {
        return wrap(OVRHapticsPlaybackState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHapticsPlaybackState createSafe(long address) {
        return address == NULL ? null : wrap(OVRHapticsPlaybackState.class, address);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsPlaybackState.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsPlaybackState.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsPlaybackState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRHapticsPlaybackState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRHapticsPlaybackState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHapticsPlaybackState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsPlaybackState.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRHapticsPlaybackState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsPlaybackState malloc(MemoryStack stack) {
        return wrap(OVRHapticsPlaybackState.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRHapticsPlaybackState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsPlaybackState calloc(MemoryStack stack) {
        return wrap(OVRHapticsPlaybackState.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHapticsPlaybackState.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHapticsPlaybackState.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #RemainingQueueSpace}. */
    public static int nRemainingQueueSpace(long struct) { return UNSAFE.getInt(null, struct + OVRHapticsPlaybackState.REMAININGQUEUESPACE); }
    /** Unsafe version of {@link #SamplesQueued}. */
    public static int nSamplesQueued(long struct) { return UNSAFE.getInt(null, struct + OVRHapticsPlaybackState.SAMPLESQUEUED); }

    // -----------------------------------

    /** An array of {@link OVRHapticsPlaybackState} structs. */
    public static class Buffer extends StructBuffer<OVRHapticsPlaybackState, Buffer> implements NativeResource {

        private static final OVRHapticsPlaybackState ELEMENT_FACTORY = OVRHapticsPlaybackState.create(-1L);

        /**
         * Creates a new {@code OVRHapticsPlaybackState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRHapticsPlaybackState#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected OVRHapticsPlaybackState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRHapticsPlaybackState#RemainingQueueSpace} field. */
        public int RemainingQueueSpace() { return OVRHapticsPlaybackState.nRemainingQueueSpace(address()); }
        /** @return the value of the {@link OVRHapticsPlaybackState#SamplesQueued} field. */
        public int SamplesQueued() { return OVRHapticsPlaybackState.nSamplesQueued(address()); }

    }

}