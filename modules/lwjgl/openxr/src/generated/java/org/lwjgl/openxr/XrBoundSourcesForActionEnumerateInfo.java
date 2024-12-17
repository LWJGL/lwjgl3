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
 * struct XrBoundSourcesForActionEnumerateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrAction action;
 * }}</pre>
 */
public class XrBoundSourcesForActionEnumerateInfo extends Struct<XrBoundSourcesForActionEnumerateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTION;

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
        ACTION = layout.offsetof(2);
    }

    protected XrBoundSourcesForActionEnumerateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBoundSourcesForActionEnumerateInfo create(long address, @Nullable ByteBuffer container) {
        return new XrBoundSourcesForActionEnumerateInfo(address, container);
    }

    /**
     * Creates a {@code XrBoundSourcesForActionEnumerateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBoundSourcesForActionEnumerateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code action} field. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBoundSourcesForActionEnumerateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO} value to the {@code type} field. */
    public XrBoundSourcesForActionEnumerateInfo type$Default() { return type(XR10.XR_TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrBoundSourcesForActionEnumerateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code action} field. */
    public XrBoundSourcesForActionEnumerateInfo action(XrAction value) { naction(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBoundSourcesForActionEnumerateInfo set(
        int type,
        long next,
        XrAction action
    ) {
        type(type);
        next(next);
        action(action);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBoundSourcesForActionEnumerateInfo set(XrBoundSourcesForActionEnumerateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBoundSourcesForActionEnumerateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBoundSourcesForActionEnumerateInfo malloc() {
        return new XrBoundSourcesForActionEnumerateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBoundSourcesForActionEnumerateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBoundSourcesForActionEnumerateInfo calloc() {
        return new XrBoundSourcesForActionEnumerateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBoundSourcesForActionEnumerateInfo} instance allocated with {@link BufferUtils}. */
    public static XrBoundSourcesForActionEnumerateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBoundSourcesForActionEnumerateInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrBoundSourcesForActionEnumerateInfo} instance for the specified memory address. */
    public static XrBoundSourcesForActionEnumerateInfo create(long address) {
        return new XrBoundSourcesForActionEnumerateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBoundSourcesForActionEnumerateInfo createSafe(long address) {
        return address == NULL ? null : new XrBoundSourcesForActionEnumerateInfo(address, null);
    }

    /**
     * Returns a new {@link XrBoundSourcesForActionEnumerateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoundSourcesForActionEnumerateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBoundSourcesForActionEnumerateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoundSourcesForActionEnumerateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBoundSourcesForActionEnumerateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBoundSourcesForActionEnumerateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBoundSourcesForActionEnumerateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBoundSourcesForActionEnumerateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBoundSourcesForActionEnumerateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBoundSourcesForActionEnumerateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBoundSourcesForActionEnumerateInfo malloc(MemoryStack stack) {
        return new XrBoundSourcesForActionEnumerateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBoundSourcesForActionEnumerateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBoundSourcesForActionEnumerateInfo calloc(MemoryStack stack) {
        return new XrBoundSourcesForActionEnumerateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBoundSourcesForActionEnumerateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBoundSourcesForActionEnumerateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBoundSourcesForActionEnumerateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBoundSourcesForActionEnumerateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBoundSourcesForActionEnumerateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBoundSourcesForActionEnumerateInfo.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrBoundSourcesForActionEnumerateInfo.ACTION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBoundSourcesForActionEnumerateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBoundSourcesForActionEnumerateInfo.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrBoundSourcesForActionEnumerateInfo.ACTION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBoundSourcesForActionEnumerateInfo.ACTION));
    }

    // -----------------------------------

    /** An array of {@link XrBoundSourcesForActionEnumerateInfo} structs. */
    public static class Buffer extends StructBuffer<XrBoundSourcesForActionEnumerateInfo, Buffer> implements NativeResource {

        private static final XrBoundSourcesForActionEnumerateInfo ELEMENT_FACTORY = XrBoundSourcesForActionEnumerateInfo.create(-1L);

        /**
         * Creates a new {@code XrBoundSourcesForActionEnumerateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBoundSourcesForActionEnumerateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBoundSourcesForActionEnumerateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBoundSourcesForActionEnumerateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrBoundSourcesForActionEnumerateInfo.nnext(address()); }
        /** @return the value of the {@code action} field. */
        @NativeType("XrAction")
        public long action() { return XrBoundSourcesForActionEnumerateInfo.naction(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBoundSourcesForActionEnumerateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrBoundSourcesForActionEnumerateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO} value to the {@code type} field. */
        public XrBoundSourcesForActionEnumerateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_BOUND_SOURCES_FOR_ACTION_ENUMERATE_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrBoundSourcesForActionEnumerateInfo.Buffer next(@NativeType("void const *") long value) { XrBoundSourcesForActionEnumerateInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code action} field. */
        public XrBoundSourcesForActionEnumerateInfo.Buffer action(XrAction value) { XrBoundSourcesForActionEnumerateInfo.naction(address(), value); return this; }

    }

}