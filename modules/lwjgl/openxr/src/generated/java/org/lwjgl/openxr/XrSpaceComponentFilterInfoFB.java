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
 * struct XrSpaceComponentFilterInfoFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpaceComponentTypeFB componentType;
 * }}</pre>
 */
public class XrSpaceComponentFilterInfoFB extends Struct<XrSpaceComponentFilterInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMPONENTTYPE;

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
        COMPONENTTYPE = layout.offsetof(2);
    }

    protected XrSpaceComponentFilterInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceComponentFilterInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceComponentFilterInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceComponentFilterInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceComponentFilterInfoFB(ByteBuffer container) {
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
    /** @return the value of the {@code componentType} field. */
    @NativeType("XrSpaceComponentTypeFB")
    public int componentType() { return ncomponentType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceComponentFilterInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_COMPONENT_FILTER_INFO_FB TYPE_SPACE_COMPONENT_FILTER_INFO_FB} value to the {@code type} field. */
    public XrSpaceComponentFilterInfoFB type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_COMPONENT_FILTER_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceComponentFilterInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code componentType} field. */
    public XrSpaceComponentFilterInfoFB componentType(@NativeType("XrSpaceComponentTypeFB") int value) { ncomponentType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceComponentFilterInfoFB set(
        int type,
        long next,
        int componentType
    ) {
        type(type);
        next(next);
        componentType(componentType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceComponentFilterInfoFB set(XrSpaceComponentFilterInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceComponentFilterInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceComponentFilterInfoFB malloc() {
        return new XrSpaceComponentFilterInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceComponentFilterInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceComponentFilterInfoFB calloc() {
        return new XrSpaceComponentFilterInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceComponentFilterInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceComponentFilterInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceComponentFilterInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceComponentFilterInfoFB} instance for the specified memory address. */
    public static XrSpaceComponentFilterInfoFB create(long address) {
        return new XrSpaceComponentFilterInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceComponentFilterInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceComponentFilterInfoFB(address, null);
    }

    /** Downcasts the specified {@code XrSpaceFilterInfoBaseHeaderFB} instance to {@code XrSpaceComponentFilterInfoFB}. */
    public static XrSpaceComponentFilterInfoFB create(XrSpaceFilterInfoBaseHeaderFB value) {
        return new XrSpaceComponentFilterInfoFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpaceComponentFilterInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentFilterInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentFilterInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentFilterInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentFilterInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentFilterInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceComponentFilterInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentFilterInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceComponentFilterInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpaceFilterInfoBaseHeaderFB.Buffer} instance to {@code XrSpaceComponentFilterInfoFB.Buffer}. */
    public static XrSpaceComponentFilterInfoFB.Buffer create(XrSpaceFilterInfoBaseHeaderFB.Buffer value) {
        return new XrSpaceComponentFilterInfoFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpaceComponentFilterInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceComponentFilterInfoFB malloc(MemoryStack stack) {
        return new XrSpaceComponentFilterInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceComponentFilterInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceComponentFilterInfoFB calloc(MemoryStack stack) {
        return new XrSpaceComponentFilterInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceComponentFilterInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentFilterInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentFilterInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentFilterInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceComponentFilterInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceComponentFilterInfoFB.NEXT); }
    /** Unsafe version of {@link #componentType}. */
    public static int ncomponentType(long struct) { return memGetInt(struct + XrSpaceComponentFilterInfoFB.COMPONENTTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceComponentFilterInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceComponentFilterInfoFB.NEXT, value); }
    /** Unsafe version of {@link #componentType(int) componentType}. */
    public static void ncomponentType(long struct, int value) { memPutInt(struct + XrSpaceComponentFilterInfoFB.COMPONENTTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceComponentFilterInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceComponentFilterInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceComponentFilterInfoFB ELEMENT_FACTORY = XrSpaceComponentFilterInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceComponentFilterInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceComponentFilterInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceComponentFilterInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceComponentFilterInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceComponentFilterInfoFB.nnext(address()); }
        /** @return the value of the {@code componentType} field. */
        @NativeType("XrSpaceComponentTypeFB")
        public int componentType() { return XrSpaceComponentFilterInfoFB.ncomponentType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceComponentFilterInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceComponentFilterInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_COMPONENT_FILTER_INFO_FB TYPE_SPACE_COMPONENT_FILTER_INFO_FB} value to the {@code type} field. */
        public XrSpaceComponentFilterInfoFB.Buffer type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_COMPONENT_FILTER_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceComponentFilterInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceComponentFilterInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code componentType} field. */
        public XrSpaceComponentFilterInfoFB.Buffer componentType(@NativeType("XrSpaceComponentTypeFB") int value) { XrSpaceComponentFilterInfoFB.ncomponentType(address(), value); return this; }

    }

}