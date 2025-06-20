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
 * struct XrSpatialPersistenceDataEXT {
 *     {@link XrUuid XrUuid} persistUuid;
 *     XrSpatialPersistenceStateEXT persistState;
 * }}</pre>
 */
public class XrSpatialPersistenceDataEXT extends Struct<XrSpatialPersistenceDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PERSISTUUID,
        PERSISTSTATE;

    static {
        Layout layout = __struct(
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PERSISTUUID = layout.offsetof(0);
        PERSISTSTATE = layout.offsetof(1);
    }

    protected XrSpatialPersistenceDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialPersistenceDataEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialPersistenceDataEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialPersistenceDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialPersistenceDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrUuid} view of the {@code persistUuid} field. */
    public XrUuid persistUuid() { return npersistUuid(address()); }
    /** @return the value of the {@code persistState} field. */
    @NativeType("XrSpatialPersistenceStateEXT")
    public int persistState() { return npersistState(address()); }

    /** Copies the specified {@link XrUuid} to the {@code persistUuid} field. */
    public XrSpatialPersistenceDataEXT persistUuid(XrUuid value) { npersistUuid(address(), value); return this; }
    /** Passes the {@code persistUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialPersistenceDataEXT persistUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(persistUuid()); return this; }
    /** Sets the specified value to the {@code persistState} field. */
    public XrSpatialPersistenceDataEXT persistState(@NativeType("XrSpatialPersistenceStateEXT") int value) { npersistState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialPersistenceDataEXT set(
        XrUuid persistUuid,
        int persistState
    ) {
        persistUuid(persistUuid);
        persistState(persistState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialPersistenceDataEXT set(XrSpatialPersistenceDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialPersistenceDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialPersistenceDataEXT malloc() {
        return new XrSpatialPersistenceDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialPersistenceDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialPersistenceDataEXT calloc() {
        return new XrSpatialPersistenceDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialPersistenceDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialPersistenceDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialPersistenceDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialPersistenceDataEXT} instance for the specified memory address. */
    public static XrSpatialPersistenceDataEXT create(long address) {
        return new XrSpatialPersistenceDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialPersistenceDataEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialPersistenceDataEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialPersistenceDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialPersistenceDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialPersistenceDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialPersistenceDataEXT malloc(MemoryStack stack) {
        return new XrSpatialPersistenceDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialPersistenceDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialPersistenceDataEXT calloc(MemoryStack stack) {
        return new XrSpatialPersistenceDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialPersistenceDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialPersistenceDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #persistUuid}. */
    public static XrUuid npersistUuid(long struct) { return XrUuid.create(struct + XrSpatialPersistenceDataEXT.PERSISTUUID); }
    /** Unsafe version of {@link #persistState}. */
    public static int npersistState(long struct) { return memGetInt(struct + XrSpatialPersistenceDataEXT.PERSISTSTATE); }

    /** Unsafe version of {@link #persistUuid(XrUuid) persistUuid}. */
    public static void npersistUuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrSpatialPersistenceDataEXT.PERSISTUUID, XrUuid.SIZEOF); }
    /** Unsafe version of {@link #persistState(int) persistState}. */
    public static void npersistState(long struct, int value) { memPutInt(struct + XrSpatialPersistenceDataEXT.PERSISTSTATE, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialPersistenceDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialPersistenceDataEXT, Buffer> implements NativeResource {

        private static final XrSpatialPersistenceDataEXT ELEMENT_FACTORY = XrSpatialPersistenceDataEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialPersistenceDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialPersistenceDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialPersistenceDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrUuid} view of the {@code persistUuid} field. */
        public XrUuid persistUuid() { return XrSpatialPersistenceDataEXT.npersistUuid(address()); }
        /** @return the value of the {@code persistState} field. */
        @NativeType("XrSpatialPersistenceStateEXT")
        public int persistState() { return XrSpatialPersistenceDataEXT.npersistState(address()); }

        /** Copies the specified {@link XrUuid} to the {@code persistUuid} field. */
        public XrSpatialPersistenceDataEXT.Buffer persistUuid(XrUuid value) { XrSpatialPersistenceDataEXT.npersistUuid(address(), value); return this; }
        /** Passes the {@code persistUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialPersistenceDataEXT.Buffer persistUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(persistUuid()); return this; }
        /** Sets the specified value to the {@code persistState} field. */
        public XrSpatialPersistenceDataEXT.Buffer persistState(@NativeType("XrSpatialPersistenceStateEXT") int value) { XrSpatialPersistenceDataEXT.npersistState(address(), value); return this; }

    }

}