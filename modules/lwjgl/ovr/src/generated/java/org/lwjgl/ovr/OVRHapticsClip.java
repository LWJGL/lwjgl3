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
 * Store a full Haptics clip, which can be used as data source for multiple {@link OVRHapticsBuffer}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Samples} &ndash; samples stored in opaque format</li>
 * <li>{@code SamplesCount} &ndash; number of samples</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrHapticsClip {
 *     void const * Samples;
 *     int SamplesCount;
 * }</pre></code>
 */
@NativeType("struct ovrHapticsClip")
public class OVRHapticsClip extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLES,
        SAMPLESCOUNT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SAMPLES = layout.offsetof(0);
        SAMPLESCOUNT = layout.offsetof(1);
    }

    OVRHapticsClip(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRHapticsClip} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRHapticsClip(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code Samples} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void const *")
    public ByteBuffer Samples(int capacity) { return nSamples(address(), capacity); }
    /** Returns the value of the {@code SamplesCount} field. */
    public int SamplesCount() { return nSamplesCount(address()); }

    // -----------------------------------

    /** Returns a new {@link OVRHapticsClip} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRHapticsClip malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRHapticsClip} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRHapticsClip calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRHapticsClip} instance allocated with {@link BufferUtils}. */
    public static OVRHapticsClip create() {
        return new OVRHapticsClip(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRHapticsClip} instance for the specified memory address. */
    public static OVRHapticsClip create(long address) {
        return new OVRHapticsClip(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHapticsClip createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRHapticsClip.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsClip.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsClip.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRHapticsClip.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHapticsClip.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRHapticsClip} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRHapticsClip mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRHapticsClip} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRHapticsClip callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRHapticsClip} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsClip mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHapticsClip} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsClip callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHapticsClip.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRHapticsClip.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRHapticsClip.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsClip.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHapticsClip.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Samples(int) Samples}. */
    public static ByteBuffer nSamples(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + OVRHapticsClip.SAMPLES), capacity); }
    /** Unsafe version of {@link #SamplesCount}. */
    public static int nSamplesCount(long struct) { return memGetInt(struct + OVRHapticsClip.SAMPLESCOUNT); }

    // -----------------------------------

    /** An array of {@link OVRHapticsClip} structs. */
    public static class Buffer extends StructBuffer<OVRHapticsClip, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRHapticsClip.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRHapticsClip#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRHapticsClip newInstance(long address) {
            return new OVRHapticsClip(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code Samples} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void const *")
        public ByteBuffer Samples(int capacity) { return OVRHapticsClip.nSamples(address(), capacity); }
        /** Returns the value of the {@code SamplesCount} field. */
        public int SamplesCount() { return OVRHapticsClip.nSamplesCount(address()); }

    }

}