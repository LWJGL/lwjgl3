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
 * struct XrSpatialAnchorCompletionResultML {
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 *     XrResult result;
 * }}</pre>
 */
public class XrSpatialAnchorCompletionResultML extends Struct<XrSpatialAnchorCompletionResultML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UUID,
        RESULT;

    static {
        Layout layout = __struct(
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UUID = layout.offsetof(0);
        RESULT = layout.offsetof(1);
    }

    protected XrSpatialAnchorCompletionResultML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorCompletionResultML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorCompletionResultML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorCompletionResultML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorCompletionResultML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
    public XrUuidEXT uuid() { return nuuid(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
    public XrSpatialAnchorCompletionResultML uuid(XrUuidEXT value) { nuuid(address(), value); return this; }
    /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorCompletionResultML uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
    /** Sets the specified value to the {@code result} field. */
    public XrSpatialAnchorCompletionResultML result(@NativeType("XrResult") int value) { nresult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorCompletionResultML set(
        XrUuidEXT uuid,
        int result
    ) {
        uuid(uuid);
        result(result);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorCompletionResultML set(XrSpatialAnchorCompletionResultML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorCompletionResultML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCompletionResultML malloc() {
        return new XrSpatialAnchorCompletionResultML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCompletionResultML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCompletionResultML calloc() {
        return new XrSpatialAnchorCompletionResultML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCompletionResultML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorCompletionResultML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorCompletionResultML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorCompletionResultML} instance for the specified memory address. */
    public static XrSpatialAnchorCompletionResultML create(long address) {
        return new XrSpatialAnchorCompletionResultML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorCompletionResultML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorCompletionResultML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCompletionResultML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCompletionResultML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCompletionResultML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCompletionResultML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCompletionResultML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCompletionResultML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorCompletionResultML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCompletionResultML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorCompletionResultML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCompletionResultML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCompletionResultML malloc(MemoryStack stack) {
        return new XrSpatialAnchorCompletionResultML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCompletionResultML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCompletionResultML calloc(MemoryStack stack) {
        return new XrSpatialAnchorCompletionResultML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCompletionResultML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCompletionResultML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCompletionResultML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCompletionResultML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrSpatialAnchorCompletionResultML.UUID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrSpatialAnchorCompletionResultML.RESULT); }

    /** Unsafe version of {@link #uuid(XrUuidEXT) uuid}. */
    public static void nuuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrSpatialAnchorCompletionResultML.UUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { memPutInt(struct + XrSpatialAnchorCompletionResultML.RESULT, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorCompletionResultML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorCompletionResultML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorCompletionResultML ELEMENT_FACTORY = XrSpatialAnchorCompletionResultML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorCompletionResultML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorCompletionResultML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorCompletionResultML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrSpatialAnchorCompletionResultML.nuuid(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrSpatialAnchorCompletionResultML.nresult(address()); }

        /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
        public XrSpatialAnchorCompletionResultML.Buffer uuid(XrUuidEXT value) { XrSpatialAnchorCompletionResultML.nuuid(address(), value); return this; }
        /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorCompletionResultML.Buffer uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
        /** Sets the specified value to the {@code result} field. */
        public XrSpatialAnchorCompletionResultML.Buffer result(@NativeType("XrResult") int value) { XrSpatialAnchorCompletionResultML.nresult(address(), value); return this; }

    }

}