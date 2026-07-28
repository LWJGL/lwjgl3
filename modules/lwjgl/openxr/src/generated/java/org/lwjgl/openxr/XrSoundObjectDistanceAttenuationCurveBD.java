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
 * struct XrSoundObjectDistanceAttenuationCurveBD {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t curvePointCount;
 *     {@link XrAttenuationCurvePointBD XrAttenuationCurvePointBD} * curvePoints;
 * }</code></pre>
 */
public class XrSoundObjectDistanceAttenuationCurveBD extends Struct<XrSoundObjectDistanceAttenuationCurveBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CURVEPOINTCOUNT,
        CURVEPOINTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CURVEPOINTCOUNT = layout.offsetof(2);
        CURVEPOINTS = layout.offsetof(3);
    }

    protected XrSoundObjectDistanceAttenuationCurveBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundObjectDistanceAttenuationCurveBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundObjectDistanceAttenuationCurveBD(address, container);
    }

    /**
     * Creates a {@code XrSoundObjectDistanceAttenuationCurveBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundObjectDistanceAttenuationCurveBD(ByteBuffer container) {
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
    /** @return the value of the {@code curvePointCount} field. */
    @NativeType("uint32_t")
    public int curvePointCount() { return ncurvePointCount(address()); }
    /** @return a {@link XrAttenuationCurvePointBD.Buffer} view of the struct array pointed to by the {@code curvePoints} field. */
    @NativeType("XrAttenuationCurvePointBD *")
    public XrAttenuationCurvePointBD.Buffer curvePoints() { return ncurvePoints(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundObjectDistanceAttenuationCurveBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD} value to the {@code type} field. */
    public XrSoundObjectDistanceAttenuationCurveBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundObjectDistanceAttenuationCurveBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrAttenuationCurvePointBD.Buffer} to the {@code curvePoints} field. */
    public XrSoundObjectDistanceAttenuationCurveBD curvePoints(@NativeType("XrAttenuationCurvePointBD *") XrAttenuationCurvePointBD.Buffer value) { ncurvePoints(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundObjectDistanceAttenuationCurveBD set(
        int type,
        long next,
        XrAttenuationCurvePointBD.Buffer curvePoints
    ) {
        type(type);
        next(next);
        curvePoints(curvePoints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundObjectDistanceAttenuationCurveBD set(XrSoundObjectDistanceAttenuationCurveBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundObjectDistanceAttenuationCurveBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundObjectDistanceAttenuationCurveBD malloc() {
        return new XrSoundObjectDistanceAttenuationCurveBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectDistanceAttenuationCurveBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundObjectDistanceAttenuationCurveBD calloc() {
        return new XrSoundObjectDistanceAttenuationCurveBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectDistanceAttenuationCurveBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundObjectDistanceAttenuationCurveBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundObjectDistanceAttenuationCurveBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundObjectDistanceAttenuationCurveBD} instance for the specified memory address. */
    public static XrSoundObjectDistanceAttenuationCurveBD create(long address) {
        return new XrSoundObjectDistanceAttenuationCurveBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundObjectDistanceAttenuationCurveBD createSafe(long address) {
        return address == NULL ? null : new XrSoundObjectDistanceAttenuationCurveBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationCurveBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationCurveBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationCurveBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationCurveBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationCurveBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationCurveBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundObjectDistanceAttenuationCurveBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationCurveBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundObjectDistanceAttenuationCurveBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundObjectDistanceAttenuationCurveBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectDistanceAttenuationCurveBD malloc(MemoryStack stack) {
        return new XrSoundObjectDistanceAttenuationCurveBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundObjectDistanceAttenuationCurveBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectDistanceAttenuationCurveBD calloc(MemoryStack stack) {
        return new XrSoundObjectDistanceAttenuationCurveBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationCurveBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationCurveBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationCurveBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationCurveBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundObjectDistanceAttenuationCurveBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundObjectDistanceAttenuationCurveBD.NEXT); }
    /** Unsafe version of {@link #curvePointCount}. */
    public static int ncurvePointCount(long struct) { return memGetInt(struct + XrSoundObjectDistanceAttenuationCurveBD.CURVEPOINTCOUNT); }
    /** Unsafe version of {@link #curvePoints}. */
    public static XrAttenuationCurvePointBD.Buffer ncurvePoints(long struct) { return XrAttenuationCurvePointBD.create(memGetAddress(struct + XrSoundObjectDistanceAttenuationCurveBD.CURVEPOINTS), ncurvePointCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundObjectDistanceAttenuationCurveBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundObjectDistanceAttenuationCurveBD.NEXT, value); }
    /** Sets the specified value to the {@code curvePointCount} field of the specified {@code struct}. */
    public static void ncurvePointCount(long struct, int value) { memPutInt(struct + XrSoundObjectDistanceAttenuationCurveBD.CURVEPOINTCOUNT, value); }
    /** Unsafe version of {@link #curvePoints(XrAttenuationCurvePointBD.Buffer) curvePoints}. */
    public static void ncurvePoints(long struct, XrAttenuationCurvePointBD.Buffer value) { memPutAddress(struct + XrSoundObjectDistanceAttenuationCurveBD.CURVEPOINTS, value.address()); ncurvePointCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSoundObjectDistanceAttenuationCurveBD.CURVEPOINTS));
    }

    // -----------------------------------

    /** An array of {@link XrSoundObjectDistanceAttenuationCurveBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundObjectDistanceAttenuationCurveBD, Buffer> implements NativeResource {

        private static final XrSoundObjectDistanceAttenuationCurveBD ELEMENT_FACTORY = XrSoundObjectDistanceAttenuationCurveBD.create(-1L);

        /**
         * Creates a new {@code XrSoundObjectDistanceAttenuationCurveBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundObjectDistanceAttenuationCurveBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundObjectDistanceAttenuationCurveBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundObjectDistanceAttenuationCurveBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundObjectDistanceAttenuationCurveBD.nnext(address()); }
        /** @return the value of the {@code curvePointCount} field. */
        @NativeType("uint32_t")
        public int curvePointCount() { return XrSoundObjectDistanceAttenuationCurveBD.ncurvePointCount(address()); }
        /** @return a {@link XrAttenuationCurvePointBD.Buffer} view of the struct array pointed to by the {@code curvePoints} field. */
        @NativeType("XrAttenuationCurvePointBD *")
        public XrAttenuationCurvePointBD.Buffer curvePoints() { return XrSoundObjectDistanceAttenuationCurveBD.ncurvePoints(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundObjectDistanceAttenuationCurveBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundObjectDistanceAttenuationCurveBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD} value to the {@code type} field. */
        public XrSoundObjectDistanceAttenuationCurveBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_CURVE_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundObjectDistanceAttenuationCurveBD.Buffer next(@NativeType("void const *") long value) { XrSoundObjectDistanceAttenuationCurveBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrAttenuationCurvePointBD.Buffer} to the {@code curvePoints} field. */
        public XrSoundObjectDistanceAttenuationCurveBD.Buffer curvePoints(@NativeType("XrAttenuationCurvePointBD *") XrAttenuationCurvePointBD.Buffer value) { XrSoundObjectDistanceAttenuationCurveBD.ncurvePoints(address(), value); return this; }

    }

}