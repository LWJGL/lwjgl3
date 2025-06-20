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
 * struct XrSpatialComponentPolygon2DListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t polygonCount;
 *     {@link XrSpatialPolygon2DDataEXT XrSpatialPolygon2DDataEXT} * polygons;
 * }}</pre>
 */
public class XrSpatialComponentPolygon2DListEXT extends Struct<XrSpatialComponentPolygon2DListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        POLYGONCOUNT,
        POLYGONS;

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
        POLYGONCOUNT = layout.offsetof(2);
        POLYGONS = layout.offsetof(3);
    }

    protected XrSpatialComponentPolygon2DListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentPolygon2DListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentPolygon2DListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentPolygon2DListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentPolygon2DListEXT(ByteBuffer container) {
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
    /** @return the value of the {@code polygonCount} field. */
    @NativeType("uint32_t")
    public int polygonCount() { return npolygonCount(address()); }
    /** @return a {@link XrSpatialPolygon2DDataEXT.Buffer} view of the struct array pointed to by the {@code polygons} field. */
    @NativeType("XrSpatialPolygon2DDataEXT *")
    public XrSpatialPolygon2DDataEXT.Buffer polygons() { return npolygons(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentPolygon2DListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentPolygon2DListEXT type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentPolygon2DListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpatialPolygon2DDataEXT.Buffer} to the {@code polygons} field. */
    public XrSpatialComponentPolygon2DListEXT polygons(@NativeType("XrSpatialPolygon2DDataEXT *") XrSpatialPolygon2DDataEXT.Buffer value) { npolygons(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentPolygon2DListEXT set(
        int type,
        long next,
        XrSpatialPolygon2DDataEXT.Buffer polygons
    ) {
        type(type);
        next(next);
        polygons(polygons);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentPolygon2DListEXT set(XrSpatialComponentPolygon2DListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentPolygon2DListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPolygon2DListEXT malloc() {
        return new XrSpatialComponentPolygon2DListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPolygon2DListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPolygon2DListEXT calloc() {
        return new XrSpatialComponentPolygon2DListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPolygon2DListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentPolygon2DListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentPolygon2DListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentPolygon2DListEXT} instance for the specified memory address. */
    public static XrSpatialComponentPolygon2DListEXT create(long address) {
        return new XrSpatialComponentPolygon2DListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentPolygon2DListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentPolygon2DListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPolygon2DListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPolygon2DListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPolygon2DListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPolygon2DListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPolygon2DListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPolygon2DListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentPolygon2DListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPolygon2DListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentPolygon2DListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentPolygon2DListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPolygon2DListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentPolygon2DListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentPolygon2DListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPolygon2DListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentPolygon2DListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPolygon2DListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPolygon2DListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPolygon2DListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPolygon2DListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentPolygon2DListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentPolygon2DListEXT.NEXT); }
    /** Unsafe version of {@link #polygonCount}. */
    public static int npolygonCount(long struct) { return memGetInt(struct + XrSpatialComponentPolygon2DListEXT.POLYGONCOUNT); }
    /** Unsafe version of {@link #polygons}. */
    public static XrSpatialPolygon2DDataEXT.Buffer npolygons(long struct) { return XrSpatialPolygon2DDataEXT.create(memGetAddress(struct + XrSpatialComponentPolygon2DListEXT.POLYGONS), npolygonCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentPolygon2DListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentPolygon2DListEXT.NEXT, value); }
    /** Sets the specified value to the {@code polygonCount} field of the specified {@code struct}. */
    public static void npolygonCount(long struct, int value) { memPutInt(struct + XrSpatialComponentPolygon2DListEXT.POLYGONCOUNT, value); }
    /** Unsafe version of {@link #polygons(XrSpatialPolygon2DDataEXT.Buffer) polygons}. */
    public static void npolygons(long struct, XrSpatialPolygon2DDataEXT.Buffer value) { memPutAddress(struct + XrSpatialComponentPolygon2DListEXT.POLYGONS, value.address()); npolygonCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentPolygon2DListEXT.POLYGONS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentPolygon2DListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentPolygon2DListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentPolygon2DListEXT ELEMENT_FACTORY = XrSpatialComponentPolygon2DListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentPolygon2DListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentPolygon2DListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentPolygon2DListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentPolygon2DListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentPolygon2DListEXT.nnext(address()); }
        /** @return the value of the {@code polygonCount} field. */
        @NativeType("uint32_t")
        public int polygonCount() { return XrSpatialComponentPolygon2DListEXT.npolygonCount(address()); }
        /** @return a {@link XrSpatialPolygon2DDataEXT.Buffer} view of the struct array pointed to by the {@code polygons} field. */
        @NativeType("XrSpatialPolygon2DDataEXT *")
        public XrSpatialPolygon2DDataEXT.Buffer polygons() { return XrSpatialComponentPolygon2DListEXT.npolygons(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentPolygon2DListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentPolygon2DListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentPolygon2DListEXT.Buffer type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentPolygon2DListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentPolygon2DListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpatialPolygon2DDataEXT.Buffer} to the {@code polygons} field. */
        public XrSpatialComponentPolygon2DListEXT.Buffer polygons(@NativeType("XrSpatialPolygon2DDataEXT *") XrSpatialPolygon2DDataEXT.Buffer value) { XrSpatialComponentPolygon2DListEXT.npolygons(address(), value); return this; }

    }

}