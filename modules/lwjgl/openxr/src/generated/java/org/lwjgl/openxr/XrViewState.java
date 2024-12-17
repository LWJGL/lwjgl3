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
 * struct XrViewState {
 *     XrStructureType type;
 *     void * next;
 *     XrViewStateFlags viewStateFlags;
 * }}</pre>
 */
public class XrViewState extends Struct<XrViewState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWSTATEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWSTATEFLAGS = layout.offsetof(2);
    }

    protected XrViewState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrViewState create(long address, @Nullable ByteBuffer container) {
        return new XrViewState(address, container);
    }

    /**
     * Creates a {@code XrViewState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewState(ByteBuffer container) {
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
    /** @return the value of the {@code viewStateFlags} field. */
    @NativeType("XrViewStateFlags")
    public long viewStateFlags() { return nviewStateFlags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrViewState type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_VIEW_STATE TYPE_VIEW_STATE} value to the {@code type} field. */
    public XrViewState type$Default() { return type(XR10.XR_TYPE_VIEW_STATE); }
    /** Sets the specified value to the {@code next} field. */
    public XrViewState next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code viewStateFlags} field. */
    public XrViewState viewStateFlags(@NativeType("XrViewStateFlags") long value) { nviewStateFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewState set(
        int type,
        long next,
        long viewStateFlags
    ) {
        type(type);
        next(next);
        viewStateFlags(viewStateFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewState set(XrViewState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewState malloc() {
        return new XrViewState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrViewState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewState calloc() {
        return new XrViewState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrViewState} instance allocated with {@link BufferUtils}. */
    public static XrViewState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrViewState(memAddress(container), container);
    }

    /** Returns a new {@code XrViewState} instance for the specified memory address. */
    public static XrViewState create(long address) {
        return new XrViewState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrViewState createSafe(long address) {
        return address == NULL ? null : new XrViewState(address, null);
    }

    /**
     * Returns a new {@link XrViewState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrViewState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrViewState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrViewState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewState malloc(MemoryStack stack) {
        return new XrViewState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrViewState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewState calloc(MemoryStack stack) {
        return new XrViewState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrViewState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrViewState.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewState.NEXT); }
    /** Unsafe version of {@link #viewStateFlags}. */
    public static long nviewStateFlags(long struct) { return memGetLong(struct + XrViewState.VIEWSTATEFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrViewState.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewState.NEXT, value); }
    /** Unsafe version of {@link #viewStateFlags(long) viewStateFlags}. */
    public static void nviewStateFlags(long struct, long value) { memPutLong(struct + XrViewState.VIEWSTATEFLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrViewState} structs. */
    public static class Buffer extends StructBuffer<XrViewState, Buffer> implements NativeResource {

        private static final XrViewState ELEMENT_FACTORY = XrViewState.create(-1L);

        /**
         * Creates a new {@code XrViewState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewState#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrViewState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewState.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrViewState.nnext(address()); }
        /** @return the value of the {@code viewStateFlags} field. */
        @NativeType("XrViewStateFlags")
        public long viewStateFlags() { return XrViewState.nviewStateFlags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrViewState.Buffer type(@NativeType("XrStructureType") int value) { XrViewState.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_VIEW_STATE TYPE_VIEW_STATE} value to the {@code type} field. */
        public XrViewState.Buffer type$Default() { return type(XR10.XR_TYPE_VIEW_STATE); }
        /** Sets the specified value to the {@code next} field. */
        public XrViewState.Buffer next(@NativeType("void *") long value) { XrViewState.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code viewStateFlags} field. */
        public XrViewState.Buffer viewStateFlags(@NativeType("XrViewStateFlags") long value) { XrViewState.nviewStateFlags(address(), value); return this; }

    }

}