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
 * struct XrSpatialEntityLocationGetInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 * }}</pre>
 */
public class XrSpatialEntityLocationGetInfoBD extends Struct<XrSpatialEntityLocationGetInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
    }

    protected XrSpatialEntityLocationGetInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityLocationGetInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityLocationGetInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityLocationGetInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityLocationGetInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityLocationGetInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD} value to the {@code type} field. */
    public XrSpatialEntityLocationGetInfoBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityLocationGetInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSpatialEntityLocationGetInfoBD baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityLocationGetInfoBD set(
        int type,
        long next,
        XrSpace baseSpace
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityLocationGetInfoBD set(XrSpatialEntityLocationGetInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityLocationGetInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityLocationGetInfoBD malloc() {
        return new XrSpatialEntityLocationGetInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityLocationGetInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityLocationGetInfoBD calloc() {
        return new XrSpatialEntityLocationGetInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityLocationGetInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityLocationGetInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityLocationGetInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityLocationGetInfoBD} instance for the specified memory address. */
    public static XrSpatialEntityLocationGetInfoBD create(long address) {
        return new XrSpatialEntityLocationGetInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityLocationGetInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityLocationGetInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityLocationGetInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityLocationGetInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityLocationGetInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityLocationGetInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityLocationGetInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityLocationGetInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityLocationGetInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityLocationGetInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityLocationGetInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityLocationGetInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityLocationGetInfoBD malloc(MemoryStack stack) {
        return new XrSpatialEntityLocationGetInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityLocationGetInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityLocationGetInfoBD calloc(MemoryStack stack) {
        return new XrSpatialEntityLocationGetInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityLocationGetInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityLocationGetInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityLocationGetInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityLocationGetInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityLocationGetInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityLocationGetInfoBD.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSpatialEntityLocationGetInfoBD.BASESPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityLocationGetInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityLocationGetInfoBD.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialEntityLocationGetInfoBD.BASESPACE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialEntityLocationGetInfoBD.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityLocationGetInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityLocationGetInfoBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityLocationGetInfoBD ELEMENT_FACTORY = XrSpatialEntityLocationGetInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityLocationGetInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityLocationGetInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityLocationGetInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityLocationGetInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialEntityLocationGetInfoBD.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSpatialEntityLocationGetInfoBD.nbaseSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityLocationGetInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityLocationGetInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD} value to the {@code type} field. */
        public XrSpatialEntityLocationGetInfoBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityLocationGetInfoBD.Buffer next(@NativeType("void const *") long value) { XrSpatialEntityLocationGetInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSpatialEntityLocationGetInfoBD.Buffer baseSpace(XrSpace value) { XrSpatialEntityLocationGetInfoBD.nbaseSpace(address(), value); return this; }

    }

}