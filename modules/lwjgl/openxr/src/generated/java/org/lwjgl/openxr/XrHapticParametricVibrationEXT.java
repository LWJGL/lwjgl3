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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct XrHapticParametricVibrationEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t amplitudePointCount;
 *     {@link XrHapticParametricPointEXT XrHapticParametricPointEXT} const * amplitudePoints;
 *     uint32_t frequencyPointCount;
 *     {@link XrHapticParametricPointEXT XrHapticParametricPointEXT} const * frequencyPoints;
 *     uint32_t transientCount;
 *     {@link XrHapticParametricTransientEXT XrHapticParametricTransientEXT} const * transients;
 *     float minFrequencyHz;
 *     float maxFrequencyHz;
 *     XrHapticParametricStreamFrameTypeEXT streamFrameType;
 * }</code></pre>
 */
public class XrHapticParametricVibrationEXT extends Struct<XrHapticParametricVibrationEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        AMPLITUDEPOINTCOUNT,
        AMPLITUDEPOINTS,
        FREQUENCYPOINTCOUNT,
        FREQUENCYPOINTS,
        TRANSIENTCOUNT,
        TRANSIENTS,
        MINFREQUENCYHZ,
        MAXFREQUENCYHZ,
        STREAMFRAMETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        AMPLITUDEPOINTCOUNT = layout.offsetof(2);
        AMPLITUDEPOINTS = layout.offsetof(3);
        FREQUENCYPOINTCOUNT = layout.offsetof(4);
        FREQUENCYPOINTS = layout.offsetof(5);
        TRANSIENTCOUNT = layout.offsetof(6);
        TRANSIENTS = layout.offsetof(7);
        MINFREQUENCYHZ = layout.offsetof(8);
        MAXFREQUENCYHZ = layout.offsetof(9);
        STREAMFRAMETYPE = layout.offsetof(10);
    }

    protected XrHapticParametricVibrationEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHapticParametricVibrationEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHapticParametricVibrationEXT(address, container);
    }

    /**
     * Creates a {@code XrHapticParametricVibrationEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticParametricVibrationEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code amplitudePointCount} field. */
    @NativeType("uint32_t")
    public int amplitudePointCount() { return namplitudePointCount(address()); }
    /** @return a {@link XrHapticParametricPointEXT.Buffer} view of the struct array pointed to by the {@code amplitudePoints} field. */
    @NativeType("XrHapticParametricPointEXT const *")
    public XrHapticParametricPointEXT.Buffer amplitudePoints() { return namplitudePoints(address()); }
    /** @return the value of the {@code frequencyPointCount} field. */
    @NativeType("uint32_t")
    public int frequencyPointCount() { return nfrequencyPointCount(address()); }
    /** @return a {@link XrHapticParametricPointEXT.Buffer} view of the struct array pointed to by the {@code frequencyPoints} field. */
    @NativeType("XrHapticParametricPointEXT const *")
    public XrHapticParametricPointEXT.@Nullable Buffer frequencyPoints() { return nfrequencyPoints(address()); }
    /** @return the value of the {@code transientCount} field. */
    @NativeType("uint32_t")
    public int transientCount() { return ntransientCount(address()); }
    /** @return a {@link XrHapticParametricTransientEXT.Buffer} view of the struct array pointed to by the {@code transients} field. */
    @NativeType("XrHapticParametricTransientEXT const *")
    public XrHapticParametricTransientEXT.@Nullable Buffer transients() { return ntransients(address()); }
    /** @return the value of the {@code minFrequencyHz} field. */
    public float minFrequencyHz() { return nminFrequencyHz(address()); }
    /** @return the value of the {@code maxFrequencyHz} field. */
    public float maxFrequencyHz() { return nmaxFrequencyHz(address()); }
    /** @return the value of the {@code streamFrameType} field. */
    @NativeType("XrHapticParametricStreamFrameTypeEXT")
    public int streamFrameType() { return nstreamFrameType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHapticParametricVibrationEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHapticParametric#XR_TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT} value to the {@code type} field. */
    public XrHapticParametricVibrationEXT type$Default() { return type(EXTHapticParametric.XR_TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrHapticParametricVibrationEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticParametricPointEXT.Buffer} to the {@code amplitudePoints} field. */
    public XrHapticParametricVibrationEXT amplitudePoints(@NativeType("XrHapticParametricPointEXT const *") XrHapticParametricPointEXT.Buffer value) { namplitudePoints(address(), value); return this; }
    /** Sets the specified value to the {@code frequencyPointCount} field. */
    public XrHapticParametricVibrationEXT frequencyPointCount(@NativeType("uint32_t") int value) { nfrequencyPointCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticParametricPointEXT.Buffer} to the {@code frequencyPoints} field. */
    public XrHapticParametricVibrationEXT frequencyPoints(@NativeType("XrHapticParametricPointEXT const *") XrHapticParametricPointEXT.@Nullable Buffer value) { nfrequencyPoints(address(), value); return this; }
    /** Sets the specified value to the {@code transientCount} field. */
    public XrHapticParametricVibrationEXT transientCount(@NativeType("uint32_t") int value) { ntransientCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticParametricTransientEXT.Buffer} to the {@code transients} field. */
    public XrHapticParametricVibrationEXT transients(@NativeType("XrHapticParametricTransientEXT const *") XrHapticParametricTransientEXT.@Nullable Buffer value) { ntransients(address(), value); return this; }
    /** Sets the specified value to the {@code minFrequencyHz} field. */
    public XrHapticParametricVibrationEXT minFrequencyHz(float value) { nminFrequencyHz(address(), value); return this; }
    /** Sets the specified value to the {@code maxFrequencyHz} field. */
    public XrHapticParametricVibrationEXT maxFrequencyHz(float value) { nmaxFrequencyHz(address(), value); return this; }
    /** Sets the specified value to the {@code streamFrameType} field. */
    public XrHapticParametricVibrationEXT streamFrameType(@NativeType("XrHapticParametricStreamFrameTypeEXT") int value) { nstreamFrameType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticParametricVibrationEXT set(
        int type,
        long next,
        XrHapticParametricPointEXT.Buffer amplitudePoints,
        int frequencyPointCount,
        XrHapticParametricPointEXT.@Nullable Buffer frequencyPoints,
        int transientCount,
        XrHapticParametricTransientEXT.@Nullable Buffer transients,
        float minFrequencyHz,
        float maxFrequencyHz,
        int streamFrameType
    ) {
        type(type);
        next(next);
        amplitudePoints(amplitudePoints);
        frequencyPointCount(frequencyPointCount);
        frequencyPoints(frequencyPoints);
        transientCount(transientCount);
        transients(transients);
        minFrequencyHz(minFrequencyHz);
        maxFrequencyHz(maxFrequencyHz);
        streamFrameType(streamFrameType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticParametricVibrationEXT set(XrHapticParametricVibrationEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticParametricVibrationEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticParametricVibrationEXT malloc() {
        return new XrHapticParametricVibrationEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricVibrationEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticParametricVibrationEXT calloc() {
        return new XrHapticParametricVibrationEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricVibrationEXT} instance allocated with {@link BufferUtils}. */
    public static XrHapticParametricVibrationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHapticParametricVibrationEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHapticParametricVibrationEXT} instance for the specified memory address. */
    public static XrHapticParametricVibrationEXT create(long address) {
        return new XrHapticParametricVibrationEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHapticParametricVibrationEXT createSafe(long address) {
        return address == NULL ? null : new XrHapticParametricVibrationEXT(address, null);
    }

    /** Downcasts the specified {@code XrHapticBaseHeader} instance to {@code XrHapticParametricVibrationEXT}. */
    public static XrHapticParametricVibrationEXT create(XrHapticBaseHeader value) {
        return new XrHapticParametricVibrationEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrHapticParametricVibrationEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricVibrationEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricVibrationEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricVibrationEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricVibrationEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricVibrationEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHapticParametricVibrationEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricVibrationEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHapticParametricVibrationEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrHapticBaseHeader.Buffer} instance to {@code XrHapticParametricVibrationEXT.Buffer}. */
    public static XrHapticParametricVibrationEXT.Buffer create(XrHapticBaseHeader.Buffer value) {
        return new XrHapticParametricVibrationEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrHapticParametricVibrationEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricVibrationEXT malloc(MemoryStack stack) {
        return new XrHapticParametricVibrationEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHapticParametricVibrationEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricVibrationEXT calloc(MemoryStack stack) {
        return new XrHapticParametricVibrationEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHapticParametricVibrationEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricVibrationEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricVibrationEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricVibrationEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHapticParametricVibrationEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticParametricVibrationEXT.NEXT); }
    /** Unsafe version of {@link #amplitudePointCount}. */
    public static int namplitudePointCount(long struct) { return memGetInt(struct + XrHapticParametricVibrationEXT.AMPLITUDEPOINTCOUNT); }
    /** Unsafe version of {@link #amplitudePoints}. */
    public static XrHapticParametricPointEXT.Buffer namplitudePoints(long struct) { return XrHapticParametricPointEXT.create(memGetAddress(struct + XrHapticParametricVibrationEXT.AMPLITUDEPOINTS), namplitudePointCount(struct)); }
    /** Unsafe version of {@link #frequencyPointCount}. */
    public static int nfrequencyPointCount(long struct) { return memGetInt(struct + XrHapticParametricVibrationEXT.FREQUENCYPOINTCOUNT); }
    /** Unsafe version of {@link #frequencyPoints}. */
    public static XrHapticParametricPointEXT.@Nullable Buffer nfrequencyPoints(long struct) { return XrHapticParametricPointEXT.createSafe(memGetAddress(struct + XrHapticParametricVibrationEXT.FREQUENCYPOINTS), nfrequencyPointCount(struct)); }
    /** Unsafe version of {@link #transientCount}. */
    public static int ntransientCount(long struct) { return memGetInt(struct + XrHapticParametricVibrationEXT.TRANSIENTCOUNT); }
    /** Unsafe version of {@link #transients}. */
    public static XrHapticParametricTransientEXT.@Nullable Buffer ntransients(long struct) { return XrHapticParametricTransientEXT.createSafe(memGetAddress(struct + XrHapticParametricVibrationEXT.TRANSIENTS), ntransientCount(struct)); }
    /** Unsafe version of {@link #minFrequencyHz}. */
    public static float nminFrequencyHz(long struct) { return memGetFloat(struct + XrHapticParametricVibrationEXT.MINFREQUENCYHZ); }
    /** Unsafe version of {@link #maxFrequencyHz}. */
    public static float nmaxFrequencyHz(long struct) { return memGetFloat(struct + XrHapticParametricVibrationEXT.MAXFREQUENCYHZ); }
    /** Unsafe version of {@link #streamFrameType}. */
    public static int nstreamFrameType(long struct) { return memGetInt(struct + XrHapticParametricVibrationEXT.STREAMFRAMETYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHapticParametricVibrationEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticParametricVibrationEXT.NEXT, value); }
    /** Sets the specified value to the {@code amplitudePointCount} field of the specified {@code struct}. */
    public static void namplitudePointCount(long struct, int value) { memPutInt(struct + XrHapticParametricVibrationEXT.AMPLITUDEPOINTCOUNT, value); }
    /** Unsafe version of {@link #amplitudePoints(XrHapticParametricPointEXT.Buffer) amplitudePoints}. */
    public static void namplitudePoints(long struct, XrHapticParametricPointEXT.Buffer value) { memPutAddress(struct + XrHapticParametricVibrationEXT.AMPLITUDEPOINTS, value.address()); namplitudePointCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code frequencyPointCount} field of the specified {@code struct}. */
    public static void nfrequencyPointCount(long struct, int value) { memPutInt(struct + XrHapticParametricVibrationEXT.FREQUENCYPOINTCOUNT, value); }
    /** Unsafe version of {@link #frequencyPoints(XrHapticParametricPointEXT.Buffer) frequencyPoints}. */
    public static void nfrequencyPoints(long struct, XrHapticParametricPointEXT.@Nullable Buffer value) { memPutAddress(struct + XrHapticParametricVibrationEXT.FREQUENCYPOINTS, memAddressSafe(value)); if (value != null) { nfrequencyPointCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code transientCount} field of the specified {@code struct}. */
    public static void ntransientCount(long struct, int value) { memPutInt(struct + XrHapticParametricVibrationEXT.TRANSIENTCOUNT, value); }
    /** Unsafe version of {@link #transients(XrHapticParametricTransientEXT.Buffer) transients}. */
    public static void ntransients(long struct, XrHapticParametricTransientEXT.@Nullable Buffer value) { memPutAddress(struct + XrHapticParametricVibrationEXT.TRANSIENTS, memAddressSafe(value)); if (value != null) { ntransientCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #minFrequencyHz(float) minFrequencyHz}. */
    public static void nminFrequencyHz(long struct, float value) { memPutFloat(struct + XrHapticParametricVibrationEXT.MINFREQUENCYHZ, value); }
    /** Unsafe version of {@link #maxFrequencyHz(float) maxFrequencyHz}. */
    public static void nmaxFrequencyHz(long struct, float value) { memPutFloat(struct + XrHapticParametricVibrationEXT.MAXFREQUENCYHZ, value); }
    /** Unsafe version of {@link #streamFrameType(int) streamFrameType}. */
    public static void nstreamFrameType(long struct, int value) { memPutInt(struct + XrHapticParametricVibrationEXT.STREAMFRAMETYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHapticParametricVibrationEXT.AMPLITUDEPOINTS));
    }

    // -----------------------------------

    /** An array of {@link XrHapticParametricVibrationEXT} structs. */
    public static class Buffer extends StructBuffer<XrHapticParametricVibrationEXT, Buffer> implements NativeResource {

        private static final XrHapticParametricVibrationEXT ELEMENT_FACTORY = XrHapticParametricVibrationEXT.create(-1L);

        /**
         * Creates a new {@code XrHapticParametricVibrationEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticParametricVibrationEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHapticParametricVibrationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticParametricVibrationEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticParametricVibrationEXT.nnext(address()); }
        /** @return the value of the {@code amplitudePointCount} field. */
        @NativeType("uint32_t")
        public int amplitudePointCount() { return XrHapticParametricVibrationEXT.namplitudePointCount(address()); }
        /** @return a {@link XrHapticParametricPointEXT.Buffer} view of the struct array pointed to by the {@code amplitudePoints} field. */
        @NativeType("XrHapticParametricPointEXT const *")
        public XrHapticParametricPointEXT.Buffer amplitudePoints() { return XrHapticParametricVibrationEXT.namplitudePoints(address()); }
        /** @return the value of the {@code frequencyPointCount} field. */
        @NativeType("uint32_t")
        public int frequencyPointCount() { return XrHapticParametricVibrationEXT.nfrequencyPointCount(address()); }
        /** @return a {@link XrHapticParametricPointEXT.Buffer} view of the struct array pointed to by the {@code frequencyPoints} field. */
        @NativeType("XrHapticParametricPointEXT const *")
        public XrHapticParametricPointEXT.@Nullable Buffer frequencyPoints() { return XrHapticParametricVibrationEXT.nfrequencyPoints(address()); }
        /** @return the value of the {@code transientCount} field. */
        @NativeType("uint32_t")
        public int transientCount() { return XrHapticParametricVibrationEXT.ntransientCount(address()); }
        /** @return a {@link XrHapticParametricTransientEXT.Buffer} view of the struct array pointed to by the {@code transients} field. */
        @NativeType("XrHapticParametricTransientEXT const *")
        public XrHapticParametricTransientEXT.@Nullable Buffer transients() { return XrHapticParametricVibrationEXT.ntransients(address()); }
        /** @return the value of the {@code minFrequencyHz} field. */
        public float minFrequencyHz() { return XrHapticParametricVibrationEXT.nminFrequencyHz(address()); }
        /** @return the value of the {@code maxFrequencyHz} field. */
        public float maxFrequencyHz() { return XrHapticParametricVibrationEXT.nmaxFrequencyHz(address()); }
        /** @return the value of the {@code streamFrameType} field. */
        @NativeType("XrHapticParametricStreamFrameTypeEXT")
        public int streamFrameType() { return XrHapticParametricVibrationEXT.nstreamFrameType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHapticParametricVibrationEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHapticParametricVibrationEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHapticParametric#XR_TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT} value to the {@code type} field. */
        public XrHapticParametricVibrationEXT.Buffer type$Default() { return type(EXTHapticParametric.XR_TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrHapticParametricVibrationEXT.Buffer next(@NativeType("void const *") long value) { XrHapticParametricVibrationEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticParametricPointEXT.Buffer} to the {@code amplitudePoints} field. */
        public XrHapticParametricVibrationEXT.Buffer amplitudePoints(@NativeType("XrHapticParametricPointEXT const *") XrHapticParametricPointEXT.Buffer value) { XrHapticParametricVibrationEXT.namplitudePoints(address(), value); return this; }
        /** Sets the specified value to the {@code frequencyPointCount} field. */
        public XrHapticParametricVibrationEXT.Buffer frequencyPointCount(@NativeType("uint32_t") int value) { XrHapticParametricVibrationEXT.nfrequencyPointCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticParametricPointEXT.Buffer} to the {@code frequencyPoints} field. */
        public XrHapticParametricVibrationEXT.Buffer frequencyPoints(@NativeType("XrHapticParametricPointEXT const *") XrHapticParametricPointEXT.@Nullable Buffer value) { XrHapticParametricVibrationEXT.nfrequencyPoints(address(), value); return this; }
        /** Sets the specified value to the {@code transientCount} field. */
        public XrHapticParametricVibrationEXT.Buffer transientCount(@NativeType("uint32_t") int value) { XrHapticParametricVibrationEXT.ntransientCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticParametricTransientEXT.Buffer} to the {@code transients} field. */
        public XrHapticParametricVibrationEXT.Buffer transients(@NativeType("XrHapticParametricTransientEXT const *") XrHapticParametricTransientEXT.@Nullable Buffer value) { XrHapticParametricVibrationEXT.ntransients(address(), value); return this; }
        /** Sets the specified value to the {@code minFrequencyHz} field. */
        public XrHapticParametricVibrationEXT.Buffer minFrequencyHz(float value) { XrHapticParametricVibrationEXT.nminFrequencyHz(address(), value); return this; }
        /** Sets the specified value to the {@code maxFrequencyHz} field. */
        public XrHapticParametricVibrationEXT.Buffer maxFrequencyHz(float value) { XrHapticParametricVibrationEXT.nmaxFrequencyHz(address(), value); return this; }
        /** Sets the specified value to the {@code streamFrameType} field. */
        public XrHapticParametricVibrationEXT.Buffer streamFrameType(@NativeType("XrHapticParametricStreamFrameTypeEXT") int value) { XrHapticParametricVibrationEXT.nstreamFrameType(address(), value); return this; }

    }

}