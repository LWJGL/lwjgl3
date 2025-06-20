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
 * struct XrSpatialComponentPlaneAlignmentListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t planeAlignmentCount;
 *     XrSpatialPlaneAlignmentEXT * planeAlignments;
 * }}</pre>
 */
public class XrSpatialComponentPlaneAlignmentListEXT extends Struct<XrSpatialComponentPlaneAlignmentListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PLANEALIGNMENTCOUNT,
        PLANEALIGNMENTS;

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
        PLANEALIGNMENTCOUNT = layout.offsetof(2);
        PLANEALIGNMENTS = layout.offsetof(3);
    }

    protected XrSpatialComponentPlaneAlignmentListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentPlaneAlignmentListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentPlaneAlignmentListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentPlaneAlignmentListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentPlaneAlignmentListEXT(ByteBuffer container) {
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
    /** @return the value of the {@code planeAlignmentCount} field. */
    @NativeType("uint32_t")
    public int planeAlignmentCount() { return nplaneAlignmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code planeAlignments} field. */
    @NativeType("XrSpatialPlaneAlignmentEXT *")
    public IntBuffer planeAlignments() { return nplaneAlignments(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentPlaneAlignmentListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentPlaneAlignmentListEXT type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentPlaneAlignmentListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code planeAlignments} field. */
    public XrSpatialComponentPlaneAlignmentListEXT planeAlignments(@NativeType("XrSpatialPlaneAlignmentEXT *") IntBuffer value) { nplaneAlignments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentPlaneAlignmentListEXT set(
        int type,
        long next,
        IntBuffer planeAlignments
    ) {
        type(type);
        next(next);
        planeAlignments(planeAlignments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentPlaneAlignmentListEXT set(XrSpatialComponentPlaneAlignmentListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentPlaneAlignmentListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPlaneAlignmentListEXT malloc() {
        return new XrSpatialComponentPlaneAlignmentListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPlaneAlignmentListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPlaneAlignmentListEXT calloc() {
        return new XrSpatialComponentPlaneAlignmentListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPlaneAlignmentListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentPlaneAlignmentListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentPlaneAlignmentListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentPlaneAlignmentListEXT} instance for the specified memory address. */
    public static XrSpatialComponentPlaneAlignmentListEXT create(long address) {
        return new XrSpatialComponentPlaneAlignmentListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentPlaneAlignmentListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentPlaneAlignmentListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneAlignmentListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneAlignmentListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneAlignmentListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneAlignmentListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneAlignmentListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneAlignmentListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentPlaneAlignmentListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneAlignmentListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentPlaneAlignmentListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentPlaneAlignmentListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPlaneAlignmentListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentPlaneAlignmentListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentPlaneAlignmentListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPlaneAlignmentListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentPlaneAlignmentListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneAlignmentListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneAlignmentListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneAlignmentListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneAlignmentListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentPlaneAlignmentListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentPlaneAlignmentListEXT.NEXT); }
    /** Unsafe version of {@link #planeAlignmentCount}. */
    public static int nplaneAlignmentCount(long struct) { return memGetInt(struct + XrSpatialComponentPlaneAlignmentListEXT.PLANEALIGNMENTCOUNT); }
    /** Unsafe version of {@link #planeAlignments() planeAlignments}. */
    public static IntBuffer nplaneAlignments(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialComponentPlaneAlignmentListEXT.PLANEALIGNMENTS), nplaneAlignmentCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentPlaneAlignmentListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentPlaneAlignmentListEXT.NEXT, value); }
    /** Sets the specified value to the {@code planeAlignmentCount} field of the specified {@code struct}. */
    public static void nplaneAlignmentCount(long struct, int value) { memPutInt(struct + XrSpatialComponentPlaneAlignmentListEXT.PLANEALIGNMENTCOUNT, value); }
    /** Unsafe version of {@link #planeAlignments(IntBuffer) planeAlignments}. */
    public static void nplaneAlignments(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialComponentPlaneAlignmentListEXT.PLANEALIGNMENTS, memAddress(value)); nplaneAlignmentCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentPlaneAlignmentListEXT.PLANEALIGNMENTS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentPlaneAlignmentListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentPlaneAlignmentListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentPlaneAlignmentListEXT ELEMENT_FACTORY = XrSpatialComponentPlaneAlignmentListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentPlaneAlignmentListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentPlaneAlignmentListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentPlaneAlignmentListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentPlaneAlignmentListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentPlaneAlignmentListEXT.nnext(address()); }
        /** @return the value of the {@code planeAlignmentCount} field. */
        @NativeType("uint32_t")
        public int planeAlignmentCount() { return XrSpatialComponentPlaneAlignmentListEXT.nplaneAlignmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code planeAlignments} field. */
        @NativeType("XrSpatialPlaneAlignmentEXT *")
        public IntBuffer planeAlignments() { return XrSpatialComponentPlaneAlignmentListEXT.nplaneAlignments(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentPlaneAlignmentListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentPlaneAlignmentListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentPlaneAlignmentListEXT.Buffer type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentPlaneAlignmentListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentPlaneAlignmentListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code planeAlignments} field. */
        public XrSpatialComponentPlaneAlignmentListEXT.Buffer planeAlignments(@NativeType("XrSpatialPlaneAlignmentEXT *") IntBuffer value) { XrSpatialComponentPlaneAlignmentListEXT.nplaneAlignments(address(), value); return this; }

    }

}