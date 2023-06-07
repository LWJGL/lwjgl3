/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Information about the device sample rate.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBHapticPcm XR_FB_haptic_pcm} extension <b>must</b> be enabled prior to using {@link XrDevicePcmSampleRateStateFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBHapticPcm#XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBHapticPcm#xrGetDeviceSampleRateFB GetDeviceSampleRateFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrDevicePcmSampleRateStateFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     float {@link #sampleRate};
 * }</code></pre>
 */
public class XrDevicePcmSampleRateStateFB extends Struct<XrDevicePcmSampleRateStateFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SAMPLERATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SAMPLERATE = layout.offsetof(2);
    }

    protected XrDevicePcmSampleRateStateFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDevicePcmSampleRateStateFB create(long address, @Nullable ByteBuffer container) {
        return new XrDevicePcmSampleRateStateFB(address, container);
    }

    /**
     * Creates a {@code XrDevicePcmSampleRateStateFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDevicePcmSampleRateStateFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the sample rate of the currently bound device which can play a haptic effect */
    public float sampleRate() { return nsampleRate(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrDevicePcmSampleRateStateFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHapticPcm#XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB} value to the {@link #type} field. */
    public XrDevicePcmSampleRateStateFB type$Default() { return type(FBHapticPcm.XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrDevicePcmSampleRateStateFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #sampleRate} field. */
    public XrDevicePcmSampleRateStateFB sampleRate(float value) { nsampleRate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDevicePcmSampleRateStateFB set(
        int type,
        long next,
        float sampleRate
    ) {
        type(type);
        next(next);
        sampleRate(sampleRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDevicePcmSampleRateStateFB set(XrDevicePcmSampleRateStateFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDevicePcmSampleRateStateFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDevicePcmSampleRateStateFB malloc() {
        return new XrDevicePcmSampleRateStateFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDevicePcmSampleRateStateFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDevicePcmSampleRateStateFB calloc() {
        return new XrDevicePcmSampleRateStateFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDevicePcmSampleRateStateFB} instance allocated with {@link BufferUtils}. */
    public static XrDevicePcmSampleRateStateFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDevicePcmSampleRateStateFB(memAddress(container), container);
    }

    /** Returns a new {@code XrDevicePcmSampleRateStateFB} instance for the specified memory address. */
    public static XrDevicePcmSampleRateStateFB create(long address) {
        return new XrDevicePcmSampleRateStateFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDevicePcmSampleRateStateFB createSafe(long address) {
        return address == NULL ? null : new XrDevicePcmSampleRateStateFB(address, null);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateStateFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateStateFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateStateFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateStateFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateStateFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateStateFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDevicePcmSampleRateStateFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateStateFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDevicePcmSampleRateStateFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDevicePcmSampleRateStateFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDevicePcmSampleRateStateFB malloc(MemoryStack stack) {
        return new XrDevicePcmSampleRateStateFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDevicePcmSampleRateStateFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDevicePcmSampleRateStateFB calloc(MemoryStack stack) {
        return new XrDevicePcmSampleRateStateFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateStateFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateStateFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateStateFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateStateFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrDevicePcmSampleRateStateFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDevicePcmSampleRateStateFB.NEXT); }
    /** Unsafe version of {@link #sampleRate}. */
    public static float nsampleRate(long struct) { return UNSAFE.getFloat(null, struct + XrDevicePcmSampleRateStateFB.SAMPLERATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrDevicePcmSampleRateStateFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDevicePcmSampleRateStateFB.NEXT, value); }
    /** Unsafe version of {@link #sampleRate(float) sampleRate}. */
    public static void nsampleRate(long struct, float value) { UNSAFE.putFloat(null, struct + XrDevicePcmSampleRateStateFB.SAMPLERATE, value); }

    // -----------------------------------

    /** An array of {@link XrDevicePcmSampleRateStateFB} structs. */
    public static class Buffer extends StructBuffer<XrDevicePcmSampleRateStateFB, Buffer> implements NativeResource {

        private static final XrDevicePcmSampleRateStateFB ELEMENT_FACTORY = XrDevicePcmSampleRateStateFB.create(-1L);

        /**
         * Creates a new {@code XrDevicePcmSampleRateStateFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDevicePcmSampleRateStateFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrDevicePcmSampleRateStateFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrDevicePcmSampleRateStateFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDevicePcmSampleRateStateFB.ntype(address()); }
        /** @return the value of the {@link XrDevicePcmSampleRateStateFB#next} field. */
        @NativeType("void *")
        public long next() { return XrDevicePcmSampleRateStateFB.nnext(address()); }
        /** @return the value of the {@link XrDevicePcmSampleRateStateFB#sampleRate} field. */
        public float sampleRate() { return XrDevicePcmSampleRateStateFB.nsampleRate(address()); }

        /** Sets the specified value to the {@link XrDevicePcmSampleRateStateFB#type} field. */
        public XrDevicePcmSampleRateStateFB.Buffer type(@NativeType("XrStructureType") int value) { XrDevicePcmSampleRateStateFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHapticPcm#XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB} value to the {@link XrDevicePcmSampleRateStateFB#type} field. */
        public XrDevicePcmSampleRateStateFB.Buffer type$Default() { return type(FBHapticPcm.XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB); }
        /** Sets the specified value to the {@link XrDevicePcmSampleRateStateFB#next} field. */
        public XrDevicePcmSampleRateStateFB.Buffer next(@NativeType("void *") long value) { XrDevicePcmSampleRateStateFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrDevicePcmSampleRateStateFB#sampleRate} field. */
        public XrDevicePcmSampleRateStateFB.Buffer sampleRate(float value) { XrDevicePcmSampleRateStateFB.nsampleRate(address(), value); return this; }

    }

}