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
 * <pre><code>
 * struct XrSpaceDiscoveryResultMETA {
 *     XrSpace space;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 * }</code></pre>
 */
public class XrSpaceDiscoveryResultMETA extends Struct<XrSpaceDiscoveryResultMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SPACE,
        UUID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SPACE = layout.offsetof(0);
        UUID = layout.offsetof(1);
    }

    protected XrSpaceDiscoveryResultMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceDiscoveryResultMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceDiscoveryResultMETA(address, container);
    }

    /**
     * Creates a {@code XrSpaceDiscoveryResultMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceDiscoveryResultMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
    public XrUuidEXT uuid() { return nuuid(address()); }

    // -----------------------------------

    /** Returns a new {@code XrSpaceDiscoveryResultMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceDiscoveryResultMETA malloc() {
        return new XrSpaceDiscoveryResultMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceDiscoveryResultMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceDiscoveryResultMETA calloc() {
        return new XrSpaceDiscoveryResultMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceDiscoveryResultMETA} instance allocated with {@link BufferUtils}. */
    public static XrSpaceDiscoveryResultMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceDiscoveryResultMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceDiscoveryResultMETA} instance for the specified memory address. */
    public static XrSpaceDiscoveryResultMETA create(long address) {
        return new XrSpaceDiscoveryResultMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceDiscoveryResultMETA createSafe(long address) {
        return address == NULL ? null : new XrSpaceDiscoveryResultMETA(address, null);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceDiscoveryResultMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceDiscoveryResultMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceDiscoveryResultMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceDiscoveryResultMETA malloc(MemoryStack stack) {
        return new XrSpaceDiscoveryResultMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceDiscoveryResultMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceDiscoveryResultMETA calloc(MemoryStack stack) {
        return new XrSpaceDiscoveryResultMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceDiscoveryResultMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceDiscoveryResultMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpaceDiscoveryResultMETA.SPACE); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrSpaceDiscoveryResultMETA.UUID); }

    // -----------------------------------

    /** An array of {@link XrSpaceDiscoveryResultMETA} structs. */
    public static class Buffer extends StructBuffer<XrSpaceDiscoveryResultMETA, Buffer> implements NativeResource {

        private static final XrSpaceDiscoveryResultMETA ELEMENT_FACTORY = XrSpaceDiscoveryResultMETA.create(-1L);

        /**
         * Creates a new {@code XrSpaceDiscoveryResultMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceDiscoveryResultMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceDiscoveryResultMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpaceDiscoveryResultMETA.nspace(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrSpaceDiscoveryResultMETA.nuuid(address()); }

    }

}