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
 * struct XrSpaceFilterComponentMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpaceComponentTypeFB componentType;
 * }}</pre>
 */
public class XrSpaceFilterComponentMETA extends Struct<XrSpaceFilterComponentMETA> implements NativeResource {

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

    protected XrSpaceFilterComponentMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceFilterComponentMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceFilterComponentMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceFilterComponentMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceFilterComponentMETA(ByteBuffer container) {
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
    public XrSpaceFilterComponentMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SPACE_FILTER_COMPONENT_META TYPE_SPACE_FILTER_COMPONENT_META} value to the {@code type} field. */
    public XrSpaceFilterComponentMETA type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SPACE_FILTER_COMPONENT_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceFilterComponentMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code componentType} field. */
    public XrSpaceFilterComponentMETA componentType(@NativeType("XrSpaceComponentTypeFB") int value) { ncomponentType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceFilterComponentMETA set(
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
    public XrSpaceFilterComponentMETA set(XrSpaceFilterComponentMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceFilterComponentMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceFilterComponentMETA malloc() {
        return new XrSpaceFilterComponentMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceFilterComponentMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceFilterComponentMETA calloc() {
        return new XrSpaceFilterComponentMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceFilterComponentMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceFilterComponentMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceFilterComponentMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceFilterComponentMETA} instance for the specified memory address. */
    public static XrSpaceFilterComponentMETA create(long address) {
        return new XrSpaceFilterComponentMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceFilterComponentMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceFilterComponentMETA(address, null);
    }

    /** Downcasts the specified {@code XrSpaceFilterBaseHeaderMETA} instance to {@code XrSpaceFilterComponentMETA}. */
    public static XrSpaceFilterComponentMETA create(XrSpaceFilterBaseHeaderMETA value) {
        return new XrSpaceFilterComponentMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpaceFilterComponentMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterComponentMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterComponentMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterComponentMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterComponentMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterComponentMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceFilterComponentMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterComponentMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceFilterComponentMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpaceFilterBaseHeaderMETA.Buffer} instance to {@code XrSpaceFilterComponentMETA.Buffer}. */
    public static XrSpaceFilterComponentMETA.Buffer create(XrSpaceFilterBaseHeaderMETA.Buffer value) {
        return new XrSpaceFilterComponentMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpaceFilterComponentMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceFilterComponentMETA malloc(MemoryStack stack) {
        return new XrSpaceFilterComponentMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceFilterComponentMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceFilterComponentMETA calloc(MemoryStack stack) {
        return new XrSpaceFilterComponentMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceFilterComponentMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterComponentMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceFilterComponentMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceFilterComponentMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceFilterComponentMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceFilterComponentMETA.NEXT); }
    /** Unsafe version of {@link #componentType}. */
    public static int ncomponentType(long struct) { return memGetInt(struct + XrSpaceFilterComponentMETA.COMPONENTTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceFilterComponentMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceFilterComponentMETA.NEXT, value); }
    /** Unsafe version of {@link #componentType(int) componentType}. */
    public static void ncomponentType(long struct, int value) { memPutInt(struct + XrSpaceFilterComponentMETA.COMPONENTTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceFilterComponentMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceFilterComponentMETA, Buffer> implements NativeResource {

        private static final XrSpaceFilterComponentMETA ELEMENT_FACTORY = XrSpaceFilterComponentMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceFilterComponentMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceFilterComponentMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceFilterComponentMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceFilterComponentMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceFilterComponentMETA.nnext(address()); }
        /** @return the value of the {@code componentType} field. */
        @NativeType("XrSpaceComponentTypeFB")
        public int componentType() { return XrSpaceFilterComponentMETA.ncomponentType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceFilterComponentMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceFilterComponentMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_SPACE_FILTER_COMPONENT_META TYPE_SPACE_FILTER_COMPONENT_META} value to the {@code type} field. */
        public XrSpaceFilterComponentMETA.Buffer type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_SPACE_FILTER_COMPONENT_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceFilterComponentMETA.Buffer next(@NativeType("void const *") long value) { XrSpaceFilterComponentMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code componentType} field. */
        public XrSpaceFilterComponentMETA.Buffer componentType(@NativeType("XrSpaceComponentTypeFB") int value) { XrSpaceFilterComponentMETA.ncomponentType(address(), value); return this; }

    }

}