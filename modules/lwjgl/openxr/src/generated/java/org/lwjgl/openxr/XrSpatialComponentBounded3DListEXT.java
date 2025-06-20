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
 * struct XrSpatialComponentBounded3DListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t boundCount;
 *     {@link XrBoxf XrBoxf} * bounds;
 * }}</pre>
 */
public class XrSpatialComponentBounded3DListEXT extends Struct<XrSpatialComponentBounded3DListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BOUNDCOUNT,
        BOUNDS;

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
        BOUNDCOUNT = layout.offsetof(2);
        BOUNDS = layout.offsetof(3);
    }

    protected XrSpatialComponentBounded3DListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentBounded3DListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentBounded3DListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentBounded3DListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentBounded3DListEXT(ByteBuffer container) {
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
    /** @return the value of the {@code boundCount} field. */
    @NativeType("uint32_t")
    public int boundCount() { return nboundCount(address()); }
    /** @return a {@link XrBoxf.Buffer} view of the struct array pointed to by the {@code bounds} field. */
    @NativeType("XrBoxf *")
    public XrBoxf.Buffer bounds() { return nbounds(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentBounded3DListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentBounded3DListEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentBounded3DListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrBoxf.Buffer} to the {@code bounds} field. */
    public XrSpatialComponentBounded3DListEXT bounds(@NativeType("XrBoxf *") XrBoxf.Buffer value) { nbounds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentBounded3DListEXT set(
        int type,
        long next,
        XrBoxf.Buffer bounds
    ) {
        type(type);
        next(next);
        bounds(bounds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentBounded3DListEXT set(XrSpatialComponentBounded3DListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentBounded3DListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentBounded3DListEXT malloc() {
        return new XrSpatialComponentBounded3DListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentBounded3DListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentBounded3DListEXT calloc() {
        return new XrSpatialComponentBounded3DListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentBounded3DListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentBounded3DListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentBounded3DListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentBounded3DListEXT} instance for the specified memory address. */
    public static XrSpatialComponentBounded3DListEXT create(long address) {
        return new XrSpatialComponentBounded3DListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentBounded3DListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentBounded3DListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentBounded3DListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentBounded3DListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentBounded3DListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentBounded3DListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentBounded3DListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentBounded3DListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentBounded3DListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentBounded3DListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentBounded3DListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentBounded3DListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentBounded3DListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentBounded3DListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentBounded3DListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentBounded3DListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentBounded3DListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentBounded3DListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentBounded3DListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentBounded3DListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentBounded3DListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentBounded3DListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentBounded3DListEXT.NEXT); }
    /** Unsafe version of {@link #boundCount}. */
    public static int nboundCount(long struct) { return memGetInt(struct + XrSpatialComponentBounded3DListEXT.BOUNDCOUNT); }
    /** Unsafe version of {@link #bounds}. */
    public static XrBoxf.Buffer nbounds(long struct) { return XrBoxf.create(memGetAddress(struct + XrSpatialComponentBounded3DListEXT.BOUNDS), nboundCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentBounded3DListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentBounded3DListEXT.NEXT, value); }
    /** Sets the specified value to the {@code boundCount} field of the specified {@code struct}. */
    public static void nboundCount(long struct, int value) { memPutInt(struct + XrSpatialComponentBounded3DListEXT.BOUNDCOUNT, value); }
    /** Unsafe version of {@link #bounds(XrBoxf.Buffer) bounds}. */
    public static void nbounds(long struct, XrBoxf.Buffer value) { memPutAddress(struct + XrSpatialComponentBounded3DListEXT.BOUNDS, value.address()); nboundCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentBounded3DListEXT.BOUNDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentBounded3DListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentBounded3DListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentBounded3DListEXT ELEMENT_FACTORY = XrSpatialComponentBounded3DListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentBounded3DListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentBounded3DListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentBounded3DListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentBounded3DListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentBounded3DListEXT.nnext(address()); }
        /** @return the value of the {@code boundCount} field. */
        @NativeType("uint32_t")
        public int boundCount() { return XrSpatialComponentBounded3DListEXT.nboundCount(address()); }
        /** @return a {@link XrBoxf.Buffer} view of the struct array pointed to by the {@code bounds} field. */
        @NativeType("XrBoxf *")
        public XrBoxf.Buffer bounds() { return XrSpatialComponentBounded3DListEXT.nbounds(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentBounded3DListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentBounded3DListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentBounded3DListEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentBounded3DListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentBounded3DListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrBoxf.Buffer} to the {@code bounds} field. */
        public XrSpatialComponentBounded3DListEXT.Buffer bounds(@NativeType("XrBoxf *") XrBoxf.Buffer value) { XrSpatialComponentBounded3DListEXT.nbounds(address(), value); return this; }

    }

}