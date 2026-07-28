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
 * struct XrSpatialComponentParentListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t parentCount;
 *     XrSpatialEntityIdEXT * parents;
 * }}</pre>
 */
public class XrSpatialComponentParentListEXT extends Struct<XrSpatialComponentParentListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PARENTCOUNT,
        PARENTS;

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
        PARENTCOUNT = layout.offsetof(2);
        PARENTS = layout.offsetof(3);
    }

    protected XrSpatialComponentParentListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentParentListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentParentListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentParentListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentParentListEXT(ByteBuffer container) {
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
    /** @return the value of the {@code parentCount} field. */
    @NativeType("uint32_t")
    public int parentCount() { return nparentCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code parents} field. */
    @NativeType("XrSpatialEntityIdEXT *")
    public LongBuffer parents() { return nparents(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentParentListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentParentListEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentParentListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code parents} field. */
    public XrSpatialComponentParentListEXT parents(@NativeType("XrSpatialEntityIdEXT *") LongBuffer value) { nparents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentParentListEXT set(
        int type,
        long next,
        LongBuffer parents
    ) {
        type(type);
        next(next);
        parents(parents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentParentListEXT set(XrSpatialComponentParentListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentParentListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentParentListEXT malloc() {
        return new XrSpatialComponentParentListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentParentListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentParentListEXT calloc() {
        return new XrSpatialComponentParentListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentParentListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentParentListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentParentListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentParentListEXT} instance for the specified memory address. */
    public static XrSpatialComponentParentListEXT create(long address) {
        return new XrSpatialComponentParentListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentParentListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentParentListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentParentListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentParentListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentParentListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentParentListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentParentListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentParentListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentParentListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentParentListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentParentListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentParentListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentParentListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentParentListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentParentListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentParentListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentParentListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentParentListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentParentListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentParentListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentParentListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentParentListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentParentListEXT.NEXT); }
    /** Unsafe version of {@link #parentCount}. */
    public static int nparentCount(long struct) { return memGetInt(struct + XrSpatialComponentParentListEXT.PARENTCOUNT); }
    /** Unsafe version of {@link #parents() parents}. */
    public static LongBuffer nparents(long struct) { return memLongBuffer(memGetAddress(struct + XrSpatialComponentParentListEXT.PARENTS), nparentCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentParentListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentParentListEXT.NEXT, value); }
    /** Sets the specified value to the {@code parentCount} field of the specified {@code struct}. */
    public static void nparentCount(long struct, int value) { memPutInt(struct + XrSpatialComponentParentListEXT.PARENTCOUNT, value); }
    /** Unsafe version of {@link #parents(LongBuffer) parents}. */
    public static void nparents(long struct, LongBuffer value) { memPutAddress(struct + XrSpatialComponentParentListEXT.PARENTS, memAddress(value)); nparentCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentParentListEXT.PARENTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentParentListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentParentListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentParentListEXT ELEMENT_FACTORY = XrSpatialComponentParentListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentParentListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentParentListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentParentListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentParentListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentParentListEXT.nnext(address()); }
        /** @return the value of the {@code parentCount} field. */
        @NativeType("uint32_t")
        public int parentCount() { return XrSpatialComponentParentListEXT.nparentCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code parents} field. */
        @NativeType("XrSpatialEntityIdEXT *")
        public LongBuffer parents() { return XrSpatialComponentParentListEXT.nparents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentParentListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentParentListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentParentListEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentParentListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentParentListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code parents} field. */
        public XrSpatialComponentParentListEXT.Buffer parents(@NativeType("XrSpatialEntityIdEXT *") LongBuffer value) { XrSpatialComponentParentListEXT.nparents(address(), value); return this; }

    }

}