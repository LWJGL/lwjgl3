/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrHapticParametricPropertiesEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrDuration idealFrameSubmissionRate;
 *     XrDuration minimumFirstFrameDuration;
 *     float minFrequencyHz;
 *     float maxFrequencyHz;
 * }}</pre>
 */
public class XrHapticParametricPropertiesEXT extends Struct<XrHapticParametricPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        IDEALFRAMESUBMISSIONRATE,
        MINIMUMFIRSTFRAMEDURATION,
        MINFREQUENCYHZ,
        MAXFREQUENCYHZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        IDEALFRAMESUBMISSIONRATE = layout.offsetof(2);
        MINIMUMFIRSTFRAMEDURATION = layout.offsetof(3);
        MINFREQUENCYHZ = layout.offsetof(4);
        MAXFREQUENCYHZ = layout.offsetof(5);
    }

    protected XrHapticParametricPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHapticParametricPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHapticParametricPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrHapticParametricPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticParametricPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code idealFrameSubmissionRate} field. */
    @NativeType("XrDuration")
    public long idealFrameSubmissionRate() { return nidealFrameSubmissionRate(address()); }
    /** @return the value of the {@code minimumFirstFrameDuration} field. */
    @NativeType("XrDuration")
    public long minimumFirstFrameDuration() { return nminimumFirstFrameDuration(address()); }
    /** @return the value of the {@code minFrequencyHz} field. */
    public float minFrequencyHz() { return nminFrequencyHz(address()); }
    /** @return the value of the {@code maxFrequencyHz} field. */
    public float maxFrequencyHz() { return nmaxFrequencyHz(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHapticParametricPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHapticParametric#XR_TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT} value to the {@code type} field. */
    public XrHapticParametricPropertiesEXT type$Default() { return type(EXTHapticParametric.XR_TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrHapticParametricPropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code idealFrameSubmissionRate} field. */
    public XrHapticParametricPropertiesEXT idealFrameSubmissionRate(@NativeType("XrDuration") long value) { nidealFrameSubmissionRate(address(), value); return this; }
    /** Sets the specified value to the {@code minimumFirstFrameDuration} field. */
    public XrHapticParametricPropertiesEXT minimumFirstFrameDuration(@NativeType("XrDuration") long value) { nminimumFirstFrameDuration(address(), value); return this; }
    /** Sets the specified value to the {@code minFrequencyHz} field. */
    public XrHapticParametricPropertiesEXT minFrequencyHz(float value) { nminFrequencyHz(address(), value); return this; }
    /** Sets the specified value to the {@code maxFrequencyHz} field. */
    public XrHapticParametricPropertiesEXT maxFrequencyHz(float value) { nmaxFrequencyHz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticParametricPropertiesEXT set(
        int type,
        long next,
        long idealFrameSubmissionRate,
        long minimumFirstFrameDuration,
        float minFrequencyHz,
        float maxFrequencyHz
    ) {
        type(type);
        next(next);
        idealFrameSubmissionRate(idealFrameSubmissionRate);
        minimumFirstFrameDuration(minimumFirstFrameDuration);
        minFrequencyHz(minFrequencyHz);
        maxFrequencyHz(maxFrequencyHz);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticParametricPropertiesEXT set(XrHapticParametricPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticParametricPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticParametricPropertiesEXT malloc() {
        return new XrHapticParametricPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticParametricPropertiesEXT calloc() {
        return new XrHapticParametricPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrHapticParametricPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHapticParametricPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHapticParametricPropertiesEXT} instance for the specified memory address. */
    public static XrHapticParametricPropertiesEXT create(long address) {
        return new XrHapticParametricPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHapticParametricPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrHapticParametricPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrHapticParametricPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHapticParametricPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHapticParametricPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHapticParametricPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricPropertiesEXT malloc(MemoryStack stack) {
        return new XrHapticParametricPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHapticParametricPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricPropertiesEXT calloc(MemoryStack stack) {
        return new XrHapticParametricPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHapticParametricPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHapticParametricPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticParametricPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #idealFrameSubmissionRate}. */
    public static long nidealFrameSubmissionRate(long struct) { return memGetLong(struct + XrHapticParametricPropertiesEXT.IDEALFRAMESUBMISSIONRATE); }
    /** Unsafe version of {@link #minimumFirstFrameDuration}. */
    public static long nminimumFirstFrameDuration(long struct) { return memGetLong(struct + XrHapticParametricPropertiesEXT.MINIMUMFIRSTFRAMEDURATION); }
    /** Unsafe version of {@link #minFrequencyHz}. */
    public static float nminFrequencyHz(long struct) { return memGetFloat(struct + XrHapticParametricPropertiesEXT.MINFREQUENCYHZ); }
    /** Unsafe version of {@link #maxFrequencyHz}. */
    public static float nmaxFrequencyHz(long struct) { return memGetFloat(struct + XrHapticParametricPropertiesEXT.MAXFREQUENCYHZ); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHapticParametricPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticParametricPropertiesEXT.NEXT, value); }
    /** Unsafe version of {@link #idealFrameSubmissionRate(long) idealFrameSubmissionRate}. */
    public static void nidealFrameSubmissionRate(long struct, long value) { memPutLong(struct + XrHapticParametricPropertiesEXT.IDEALFRAMESUBMISSIONRATE, value); }
    /** Unsafe version of {@link #minimumFirstFrameDuration(long) minimumFirstFrameDuration}. */
    public static void nminimumFirstFrameDuration(long struct, long value) { memPutLong(struct + XrHapticParametricPropertiesEXT.MINIMUMFIRSTFRAMEDURATION, value); }
    /** Unsafe version of {@link #minFrequencyHz(float) minFrequencyHz}. */
    public static void nminFrequencyHz(long struct, float value) { memPutFloat(struct + XrHapticParametricPropertiesEXT.MINFREQUENCYHZ, value); }
    /** Unsafe version of {@link #maxFrequencyHz(float) maxFrequencyHz}. */
    public static void nmaxFrequencyHz(long struct, float value) { memPutFloat(struct + XrHapticParametricPropertiesEXT.MAXFREQUENCYHZ, value); }

    // -----------------------------------

    /** An array of {@link XrHapticParametricPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrHapticParametricPropertiesEXT, Buffer> implements NativeResource {

        private static final XrHapticParametricPropertiesEXT ELEMENT_FACTORY = XrHapticParametricPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrHapticParametricPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticParametricPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrHapticParametricPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticParametricPropertiesEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrHapticParametricPropertiesEXT.nnext(address()); }
        /** @return the value of the {@code idealFrameSubmissionRate} field. */
        @NativeType("XrDuration")
        public long idealFrameSubmissionRate() { return XrHapticParametricPropertiesEXT.nidealFrameSubmissionRate(address()); }
        /** @return the value of the {@code minimumFirstFrameDuration} field. */
        @NativeType("XrDuration")
        public long minimumFirstFrameDuration() { return XrHapticParametricPropertiesEXT.nminimumFirstFrameDuration(address()); }
        /** @return the value of the {@code minFrequencyHz} field. */
        public float minFrequencyHz() { return XrHapticParametricPropertiesEXT.nminFrequencyHz(address()); }
        /** @return the value of the {@code maxFrequencyHz} field. */
        public float maxFrequencyHz() { return XrHapticParametricPropertiesEXT.nmaxFrequencyHz(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHapticParametricPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHapticParametricPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHapticParametric#XR_TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT} value to the {@code type} field. */
        public XrHapticParametricPropertiesEXT.Buffer type$Default() { return type(EXTHapticParametric.XR_TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrHapticParametricPropertiesEXT.Buffer next(@NativeType("void *") long value) { XrHapticParametricPropertiesEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code idealFrameSubmissionRate} field. */
        public XrHapticParametricPropertiesEXT.Buffer idealFrameSubmissionRate(@NativeType("XrDuration") long value) { XrHapticParametricPropertiesEXT.nidealFrameSubmissionRate(address(), value); return this; }
        /** Sets the specified value to the {@code minimumFirstFrameDuration} field. */
        public XrHapticParametricPropertiesEXT.Buffer minimumFirstFrameDuration(@NativeType("XrDuration") long value) { XrHapticParametricPropertiesEXT.nminimumFirstFrameDuration(address(), value); return this; }
        /** Sets the specified value to the {@code minFrequencyHz} field. */
        public XrHapticParametricPropertiesEXT.Buffer minFrequencyHz(float value) { XrHapticParametricPropertiesEXT.nminFrequencyHz(address(), value); return this; }
        /** Sets the specified value to the {@code maxFrequencyHz} field. */
        public XrHapticParametricPropertiesEXT.Buffer maxFrequencyHz(float value) { XrHapticParametricPropertiesEXT.nmaxFrequencyHz(address(), value); return this; }

    }

}