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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Haptics buffer descriptor, contains amplitude samples used for Touch vibration.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrHapticsBuffer {
 *     void * {@link #Samples};
 *     int {@link #SamplesCount};
 *     ovrHapticsBufferSubmitMode {@link #SubmitMode};
 * }</code></pre>
 */
@NativeType("struct ovrHapticsBuffer")
public class OVRHapticsBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLES,
        SAMPLESCOUNT,
        SUBMITMODE;

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
        SUBMITMODE = layout.offsetof(2);
    }

    /**
     * Creates a {@code OVRHapticsBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRHapticsBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return samples stored in opaque format
     */
    @NativeType("void *")
    public ByteBuffer Samples(int capacity) { return nSamples(address(), capacity); }
    /** number of samples (up to {@link OVR#OVR_HAPTICS_BUFFER_SAMPLES_MAX}) */
    public int SamplesCount() { return nSamplesCount(address()); }
    /** how samples are submitted to the hardware. Must be:<br><table><tr><td>{@link OVR#ovrHapticsBufferSubmit_Enqueue HapticsBufferSubmit_Enqueue}</td></tr></table> */
    @NativeType("ovrHapticsBufferSubmitMode")
    public int SubmitMode() { return nSubmitMode(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #Samples} field. */
    public OVRHapticsBuffer Samples(@NativeType("void *") ByteBuffer value) { nSamples(address(), value); return this; }
    /** Sets the specified value to the {@link #SamplesCount} field. */
    public OVRHapticsBuffer SamplesCount(int value) { nSamplesCount(address(), value); return this; }
    /** Sets the specified value to the {@link #SubmitMode} field. */
    public OVRHapticsBuffer SubmitMode(@NativeType("ovrHapticsBufferSubmitMode") int value) { nSubmitMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRHapticsBuffer set(
        ByteBuffer Samples,
        int SamplesCount,
        int SubmitMode
    ) {
        Samples(Samples);
        SamplesCount(SamplesCount);
        SubmitMode(SubmitMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRHapticsBuffer set(OVRHapticsBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRHapticsBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRHapticsBuffer malloc() {
        return wrap(OVRHapticsBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRHapticsBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRHapticsBuffer calloc() {
        return wrap(OVRHapticsBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRHapticsBuffer} instance allocated with {@link BufferUtils}. */
    public static OVRHapticsBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRHapticsBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRHapticsBuffer} instance for the specified memory address. */
    public static OVRHapticsBuffer create(long address) {
        return wrap(OVRHapticsBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHapticsBuffer createSafe(long address) {
        return address == NULL ? null : wrap(OVRHapticsBuffer.class, address);
    }

    /**
     * Returns a new {@link OVRHapticsBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRHapticsBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRHapticsBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRHapticsBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRHapticsBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRHapticsBuffer.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRHapticsBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsBuffer malloc(MemoryStack stack) {
        return wrap(OVRHapticsBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRHapticsBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsBuffer calloc(MemoryStack stack) {
        return wrap(OVRHapticsBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHapticsBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHapticsBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRHapticsBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Samples(int) Samples}. */
    public static ByteBuffer nSamples(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + OVRHapticsBuffer.SAMPLES), capacity); }
    /** Unsafe version of {@link #SamplesCount}. */
    public static int nSamplesCount(long struct) { return UNSAFE.getInt(null, struct + OVRHapticsBuffer.SAMPLESCOUNT); }
    /** Unsafe version of {@link #SubmitMode}. */
    public static int nSubmitMode(long struct) { return UNSAFE.getInt(null, struct + OVRHapticsBuffer.SUBMITMODE); }

    /** Unsafe version of {@link #Samples(ByteBuffer) Samples}. */
    public static void nSamples(long struct, ByteBuffer value) { memPutAddress(struct + OVRHapticsBuffer.SAMPLES, memAddress(value)); }
    /** Unsafe version of {@link #SamplesCount(int) SamplesCount}. */
    public static void nSamplesCount(long struct, int value) { UNSAFE.putInt(null, struct + OVRHapticsBuffer.SAMPLESCOUNT, value); }
    /** Unsafe version of {@link #SubmitMode(int) SubmitMode}. */
    public static void nSubmitMode(long struct, int value) { UNSAFE.putInt(null, struct + OVRHapticsBuffer.SUBMITMODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRHapticsBuffer.SAMPLES));
    }

    // -----------------------------------

    /** An array of {@link OVRHapticsBuffer} structs. */
    public static class Buffer extends StructBuffer<OVRHapticsBuffer, Buffer> implements NativeResource {

        private static final OVRHapticsBuffer ELEMENT_FACTORY = OVRHapticsBuffer.create(-1L);

        /**
         * Creates a new {@code OVRHapticsBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRHapticsBuffer#SIZEOF}, and its mark will be undefined.
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
        protected OVRHapticsBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link OVRHapticsBuffer#Samples} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer Samples(int capacity) { return OVRHapticsBuffer.nSamples(address(), capacity); }
        /** @return the value of the {@link OVRHapticsBuffer#SamplesCount} field. */
        public int SamplesCount() { return OVRHapticsBuffer.nSamplesCount(address()); }
        /** @return the value of the {@link OVRHapticsBuffer#SubmitMode} field. */
        @NativeType("ovrHapticsBufferSubmitMode")
        public int SubmitMode() { return OVRHapticsBuffer.nSubmitMode(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link OVRHapticsBuffer#Samples} field. */
        public OVRHapticsBuffer.Buffer Samples(@NativeType("void *") ByteBuffer value) { OVRHapticsBuffer.nSamples(address(), value); return this; }
        /** Sets the specified value to the {@link OVRHapticsBuffer#SamplesCount} field. */
        public OVRHapticsBuffer.Buffer SamplesCount(int value) { OVRHapticsBuffer.nSamplesCount(address(), value); return this; }
        /** Sets the specified value to the {@link OVRHapticsBuffer#SubmitMode} field. */
        public OVRHapticsBuffer.Buffer SubmitMode(@NativeType("ovrHapticsBufferSubmitMode") int value) { OVRHapticsBuffer.nSubmitMode(address(), value); return this; }

    }

}