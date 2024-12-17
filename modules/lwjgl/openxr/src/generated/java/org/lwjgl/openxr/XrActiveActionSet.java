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
 * struct XrActiveActionSet {
 *     XrActionSet actionSet;
 *     XrPath subactionPath;
 * }}</pre>
 */
public class XrActiveActionSet extends Struct<XrActiveActionSet> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACTIONSET,
        SUBACTIONPATH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACTIONSET = layout.offsetof(0);
        SUBACTIONPATH = layout.offsetof(1);
    }

    protected XrActiveActionSet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrActiveActionSet create(long address, @Nullable ByteBuffer container) {
        return new XrActiveActionSet(address, container);
    }

    /**
     * Creates a {@code XrActiveActionSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActiveActionSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code actionSet} field. */
    @NativeType("XrActionSet")
    public long actionSet() { return nactionSet(address()); }
    /** @return the value of the {@code subactionPath} field. */
    @NativeType("XrPath")
    public long subactionPath() { return nsubactionPath(address()); }

    /** Sets the specified value to the {@code actionSet} field. */
    public XrActiveActionSet actionSet(XrActionSet value) { nactionSet(address(), value); return this; }
    /** Sets the specified value to the {@code subactionPath} field. */
    public XrActiveActionSet subactionPath(@NativeType("XrPath") long value) { nsubactionPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActiveActionSet set(
        XrActionSet actionSet,
        long subactionPath
    ) {
        actionSet(actionSet);
        subactionPath(subactionPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActiveActionSet set(XrActiveActionSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActiveActionSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActiveActionSet malloc() {
        return new XrActiveActionSet(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActiveActionSet calloc() {
        return new XrActiveActionSet(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSet} instance allocated with {@link BufferUtils}. */
    public static XrActiveActionSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrActiveActionSet(memAddress(container), container);
    }

    /** Returns a new {@code XrActiveActionSet} instance for the specified memory address. */
    public static XrActiveActionSet create(long address) {
        return new XrActiveActionSet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrActiveActionSet createSafe(long address) {
        return address == NULL ? null : new XrActiveActionSet(address, null);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrActiveActionSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrActiveActionSet.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrActiveActionSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSet malloc(MemoryStack stack) {
        return new XrActiveActionSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrActiveActionSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSet calloc(MemoryStack stack) {
        return new XrActiveActionSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #actionSet}. */
    public static long nactionSet(long struct) { return memGetAddress(struct + XrActiveActionSet.ACTIONSET); }
    /** Unsafe version of {@link #subactionPath}. */
    public static long nsubactionPath(long struct) { return memGetLong(struct + XrActiveActionSet.SUBACTIONPATH); }

    /** Unsafe version of {@link #actionSet(XrActionSet) actionSet}. */
    public static void nactionSet(long struct, XrActionSet value) { memPutAddress(struct + XrActiveActionSet.ACTIONSET, value.address()); }
    /** Unsafe version of {@link #subactionPath(long) subactionPath}. */
    public static void nsubactionPath(long struct, long value) { memPutLong(struct + XrActiveActionSet.SUBACTIONPATH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrActiveActionSet.ACTIONSET));
    }

    // -----------------------------------

    /** An array of {@link XrActiveActionSet} structs. */
    public static class Buffer extends StructBuffer<XrActiveActionSet, Buffer> implements NativeResource {

        private static final XrActiveActionSet ELEMENT_FACTORY = XrActiveActionSet.create(-1L);

        /**
         * Creates a new {@code XrActiveActionSet.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActiveActionSet#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrActiveActionSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code actionSet} field. */
        @NativeType("XrActionSet")
        public long actionSet() { return XrActiveActionSet.nactionSet(address()); }
        /** @return the value of the {@code subactionPath} field. */
        @NativeType("XrPath")
        public long subactionPath() { return XrActiveActionSet.nsubactionPath(address()); }

        /** Sets the specified value to the {@code actionSet} field. */
        public XrActiveActionSet.Buffer actionSet(XrActionSet value) { XrActiveActionSet.nactionSet(address(), value); return this; }
        /** Sets the specified value to the {@code subactionPath} field. */
        public XrActiveActionSet.Buffer subactionPath(@NativeType("XrPath") long value) { XrActiveActionSet.nsubactionPath(address(), value); return this; }

    }

}