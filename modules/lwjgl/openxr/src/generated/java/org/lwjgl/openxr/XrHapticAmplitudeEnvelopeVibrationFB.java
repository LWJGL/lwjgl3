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
 * <pre>{@code
 * struct XrHapticAmplitudeEnvelopeVibrationFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrDuration duration;
 *     uint32_t amplitudeCount;
 *     float const * amplitudes;
 * }}</pre>
 */
public class XrHapticAmplitudeEnvelopeVibrationFB extends Struct<XrHapticAmplitudeEnvelopeVibrationFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DURATION,
        AMPLITUDECOUNT,
        AMPLITUDES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DURATION = layout.offsetof(2);
        AMPLITUDECOUNT = layout.offsetof(3);
        AMPLITUDES = layout.offsetof(4);
    }

    protected XrHapticAmplitudeEnvelopeVibrationFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHapticAmplitudeEnvelopeVibrationFB create(long address, @Nullable ByteBuffer container) {
        return new XrHapticAmplitudeEnvelopeVibrationFB(address, container);
    }

    /**
     * Creates a {@code XrHapticAmplitudeEnvelopeVibrationFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticAmplitudeEnvelopeVibrationFB(ByteBuffer container) {
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
    /** @return the value of the {@code duration} field. */
    @NativeType("XrDuration")
    public long duration() { return nduration(address()); }
    /** @return the value of the {@code amplitudeCount} field. */
    @NativeType("uint32_t")
    public int amplitudeCount() { return namplitudeCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code amplitudes} field. */
    @NativeType("float const *")
    public FloatBuffer amplitudes() { return namplitudes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHapticAmplitudeEnvelopeVibrationFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHapticAmplitudeEnvelope#XR_TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB} value to the {@code type} field. */
    public XrHapticAmplitudeEnvelopeVibrationFB type$Default() { return type(FBHapticAmplitudeEnvelope.XR_TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrHapticAmplitudeEnvelopeVibrationFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code duration} field. */
    public XrHapticAmplitudeEnvelopeVibrationFB duration(@NativeType("XrDuration") long value) { nduration(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code amplitudes} field. */
    public XrHapticAmplitudeEnvelopeVibrationFB amplitudes(@NativeType("float const *") FloatBuffer value) { namplitudes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticAmplitudeEnvelopeVibrationFB set(
        int type,
        long next,
        long duration,
        FloatBuffer amplitudes
    ) {
        type(type);
        next(next);
        duration(duration);
        amplitudes(amplitudes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticAmplitudeEnvelopeVibrationFB set(XrHapticAmplitudeEnvelopeVibrationFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticAmplitudeEnvelopeVibrationFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticAmplitudeEnvelopeVibrationFB malloc() {
        return new XrHapticAmplitudeEnvelopeVibrationFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHapticAmplitudeEnvelopeVibrationFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticAmplitudeEnvelopeVibrationFB calloc() {
        return new XrHapticAmplitudeEnvelopeVibrationFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHapticAmplitudeEnvelopeVibrationFB} instance allocated with {@link BufferUtils}. */
    public static XrHapticAmplitudeEnvelopeVibrationFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHapticAmplitudeEnvelopeVibrationFB(memAddress(container), container);
    }

    /** Returns a new {@code XrHapticAmplitudeEnvelopeVibrationFB} instance for the specified memory address. */
    public static XrHapticAmplitudeEnvelopeVibrationFB create(long address) {
        return new XrHapticAmplitudeEnvelopeVibrationFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHapticAmplitudeEnvelopeVibrationFB createSafe(long address) {
        return address == NULL ? null : new XrHapticAmplitudeEnvelopeVibrationFB(address, null);
    }

    /** Downcasts the specified {@code XrHapticBaseHeader} instance to {@code XrHapticAmplitudeEnvelopeVibrationFB}. */
    public static XrHapticAmplitudeEnvelopeVibrationFB create(XrHapticBaseHeader value) {
        return new XrHapticAmplitudeEnvelopeVibrationFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrHapticAmplitudeEnvelopeVibrationFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticAmplitudeEnvelopeVibrationFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticAmplitudeEnvelopeVibrationFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHapticAmplitudeEnvelopeVibrationFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHapticAmplitudeEnvelopeVibrationFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrHapticBaseHeader.Buffer} instance to {@code XrHapticAmplitudeEnvelopeVibrationFB.Buffer}. */
    public static XrHapticAmplitudeEnvelopeVibrationFB.Buffer create(XrHapticBaseHeader.Buffer value) {
        return new XrHapticAmplitudeEnvelopeVibrationFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrHapticAmplitudeEnvelopeVibrationFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB malloc(MemoryStack stack) {
        return new XrHapticAmplitudeEnvelopeVibrationFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHapticAmplitudeEnvelopeVibrationFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB calloc(MemoryStack stack) {
        return new XrHapticAmplitudeEnvelopeVibrationFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHapticAmplitudeEnvelopeVibrationFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticAmplitudeEnvelopeVibrationFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticAmplitudeEnvelopeVibrationFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHapticAmplitudeEnvelopeVibrationFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticAmplitudeEnvelopeVibrationFB.NEXT); }
    /** Unsafe version of {@link #duration}. */
    public static long nduration(long struct) { return memGetLong(struct + XrHapticAmplitudeEnvelopeVibrationFB.DURATION); }
    /** Unsafe version of {@link #amplitudeCount}. */
    public static int namplitudeCount(long struct) { return memGetInt(struct + XrHapticAmplitudeEnvelopeVibrationFB.AMPLITUDECOUNT); }
    /** Unsafe version of {@link #amplitudes() amplitudes}. */
    public static FloatBuffer namplitudes(long struct) { return memFloatBuffer(memGetAddress(struct + XrHapticAmplitudeEnvelopeVibrationFB.AMPLITUDES), namplitudeCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHapticAmplitudeEnvelopeVibrationFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticAmplitudeEnvelopeVibrationFB.NEXT, value); }
    /** Unsafe version of {@link #duration(long) duration}. */
    public static void nduration(long struct, long value) { memPutLong(struct + XrHapticAmplitudeEnvelopeVibrationFB.DURATION, value); }
    /** Sets the specified value to the {@code amplitudeCount} field of the specified {@code struct}. */
    public static void namplitudeCount(long struct, int value) { memPutInt(struct + XrHapticAmplitudeEnvelopeVibrationFB.AMPLITUDECOUNT, value); }
    /** Unsafe version of {@link #amplitudes(FloatBuffer) amplitudes}. */
    public static void namplitudes(long struct, FloatBuffer value) { memPutAddress(struct + XrHapticAmplitudeEnvelopeVibrationFB.AMPLITUDES, memAddress(value)); namplitudeCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHapticAmplitudeEnvelopeVibrationFB.AMPLITUDES));
    }

    // -----------------------------------

    /** An array of {@link XrHapticAmplitudeEnvelopeVibrationFB} structs. */
    public static class Buffer extends StructBuffer<XrHapticAmplitudeEnvelopeVibrationFB, Buffer> implements NativeResource {

        private static final XrHapticAmplitudeEnvelopeVibrationFB ELEMENT_FACTORY = XrHapticAmplitudeEnvelopeVibrationFB.create(-1L);

        /**
         * Creates a new {@code XrHapticAmplitudeEnvelopeVibrationFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticAmplitudeEnvelopeVibrationFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHapticAmplitudeEnvelopeVibrationFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticAmplitudeEnvelopeVibrationFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticAmplitudeEnvelopeVibrationFB.nnext(address()); }
        /** @return the value of the {@code duration} field. */
        @NativeType("XrDuration")
        public long duration() { return XrHapticAmplitudeEnvelopeVibrationFB.nduration(address()); }
        /** @return the value of the {@code amplitudeCount} field. */
        @NativeType("uint32_t")
        public int amplitudeCount() { return XrHapticAmplitudeEnvelopeVibrationFB.namplitudeCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code amplitudes} field. */
        @NativeType("float const *")
        public FloatBuffer amplitudes() { return XrHapticAmplitudeEnvelopeVibrationFB.namplitudes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHapticAmplitudeEnvelopeVibrationFB.Buffer type(@NativeType("XrStructureType") int value) { XrHapticAmplitudeEnvelopeVibrationFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHapticAmplitudeEnvelope#XR_TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB} value to the {@code type} field. */
        public XrHapticAmplitudeEnvelopeVibrationFB.Buffer type$Default() { return type(FBHapticAmplitudeEnvelope.XR_TYPE_HAPTIC_AMPLITUDE_ENVELOPE_VIBRATION_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrHapticAmplitudeEnvelopeVibrationFB.Buffer next(@NativeType("void const *") long value) { XrHapticAmplitudeEnvelopeVibrationFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code duration} field. */
        public XrHapticAmplitudeEnvelopeVibrationFB.Buffer duration(@NativeType("XrDuration") long value) { XrHapticAmplitudeEnvelopeVibrationFB.nduration(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code amplitudes} field. */
        public XrHapticAmplitudeEnvelopeVibrationFB.Buffer amplitudes(@NativeType("float const *") FloatBuffer value) { XrHapticAmplitudeEnvelopeVibrationFB.namplitudes(address(), value); return this; }

    }

}