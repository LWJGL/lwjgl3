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
 * Store audio PCM data (as 32b float samples) for an audio channel.
 * 
 * <p>Note: needs to be released with {@link OVRUtil#ovr_ReleaseAudioChannelData _ReleaseAudioChannelData} to avoid memory leak.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrAudioChannelData {
 *     float const * {@link #Samples};
 *     int {@link #SamplesCount};
 *     int {@link #Frequency};
 * }</code></pre>
 */
@NativeType("struct ovrAudioChannelData")
public class OVRAudioChannelData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLES,
        SAMPLESCOUNT,
        FREQUENCY;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SAMPLES = layout.offsetof(0);
        SAMPLESCOUNT = layout.offsetof(1);
        FREQUENCY = layout.offsetof(2);
    }

    /**
     * Creates a {@code OVRAudioChannelData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRAudioChannelData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** samples stored as floats {@code [-1.0f, 1.0f]} */
    @NativeType("float const *")
    public FloatBuffer Samples() { return nSamples(address()); }
    /** number of samples */
    public int SamplesCount() { return nSamplesCount(address()); }
    /** frequency (e.g. 44100) */
    public int Frequency() { return nFrequency(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRAudioChannelData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRAudioChannelData malloc() {
        return wrap(OVRAudioChannelData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRAudioChannelData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRAudioChannelData calloc() {
        return wrap(OVRAudioChannelData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRAudioChannelData} instance allocated with {@link BufferUtils}. */
    public static OVRAudioChannelData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRAudioChannelData.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRAudioChannelData} instance for the specified memory address. */
    public static OVRAudioChannelData create(long address) {
        return wrap(OVRAudioChannelData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRAudioChannelData createSafe(long address) {
        return address == NULL ? null : wrap(OVRAudioChannelData.class, address);
    }

    /**
     * Returns a new {@link OVRAudioChannelData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRAudioChannelData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRAudioChannelData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRAudioChannelData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRAudioChannelData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRAudioChannelData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRAudioChannelData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRAudioChannelData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRAudioChannelData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRAudioChannelData.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRAudioChannelData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRAudioChannelData malloc(MemoryStack stack) {
        return wrap(OVRAudioChannelData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRAudioChannelData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRAudioChannelData calloc(MemoryStack stack) {
        return wrap(OVRAudioChannelData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRAudioChannelData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRAudioChannelData.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRAudioChannelData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRAudioChannelData.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Samples() Samples}. */
    public static FloatBuffer nSamples(long struct) { return memFloatBuffer(memGetAddress(struct + OVRAudioChannelData.SAMPLES), nSamplesCount(struct)); }
    /** Unsafe version of {@link #SamplesCount}. */
    public static int nSamplesCount(long struct) { return UNSAFE.getInt(null, struct + OVRAudioChannelData.SAMPLESCOUNT); }
    /** Unsafe version of {@link #Frequency}. */
    public static int nFrequency(long struct) { return UNSAFE.getInt(null, struct + OVRAudioChannelData.FREQUENCY); }

    // -----------------------------------

    /** An array of {@link OVRAudioChannelData} structs. */
    public static class Buffer extends StructBuffer<OVRAudioChannelData, Buffer> implements NativeResource {

        private static final OVRAudioChannelData ELEMENT_FACTORY = OVRAudioChannelData.create(-1L);

        /**
         * Creates a new {@code OVRAudioChannelData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRAudioChannelData#SIZEOF}, and its mark will be undefined.
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
        protected OVRAudioChannelData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link OVRAudioChannelData#Samples} field. */
        @NativeType("float const *")
        public FloatBuffer Samples() { return OVRAudioChannelData.nSamples(address()); }
        /** @return the value of the {@link OVRAudioChannelData#SamplesCount} field. */
        public int SamplesCount() { return OVRAudioChannelData.nSamplesCount(address()); }
        /** @return the value of the {@link OVRAudioChannelData#Frequency} field. */
        public int Frequency() { return OVRAudioChannelData.nFrequency(address()); }

    }

}