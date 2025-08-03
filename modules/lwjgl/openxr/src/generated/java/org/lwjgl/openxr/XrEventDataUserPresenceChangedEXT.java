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
 * struct XrEventDataUserPresenceChangedEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 *     XrBool32 isUserPresent;
 * }}</pre>
 */
public class XrEventDataUserPresenceChangedEXT extends Struct<XrEventDataUserPresenceChangedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        ISUSERPRESENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        ISUSERPRESENT = layout.offsetof(3);
    }

    protected XrEventDataUserPresenceChangedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataUserPresenceChangedEXT create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataUserPresenceChangedEXT(address, container);
    }

    /**
     * Creates a {@code XrEventDataUserPresenceChangedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataUserPresenceChangedEXT(ByteBuffer container) {
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
    /** @return the value of the {@code session} field. */
    @NativeType("XrSession")
    public long session() { return nsession(address()); }
    /** @return the value of the {@code isUserPresent} field. */
    @NativeType("XrBool32")
    public boolean isUserPresent() { return nisUserPresent(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataUserPresenceChangedEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTUserPresence#XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT} value to the {@code type} field. */
    public XrEventDataUserPresenceChangedEXT type$Default() { return type(EXTUserPresence.XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataUserPresenceChangedEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataUserPresenceChangedEXT set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataUserPresenceChangedEXT set(XrEventDataUserPresenceChangedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataUserPresenceChangedEXT malloc() {
        return new XrEventDataUserPresenceChangedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataUserPresenceChangedEXT calloc() {
        return new XrEventDataUserPresenceChangedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated with {@link BufferUtils}. */
    public static XrEventDataUserPresenceChangedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataUserPresenceChangedEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataUserPresenceChangedEXT} instance for the specified memory address. */
    public static XrEventDataUserPresenceChangedEXT create(long address) {
        return new XrEventDataUserPresenceChangedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataUserPresenceChangedEXT createSafe(long address) {
        return address == NULL ? null : new XrEventDataUserPresenceChangedEXT(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataUserPresenceChangedEXT}. */
    public static XrEventDataUserPresenceChangedEXT create(XrEventDataBaseHeader value) {
        return new XrEventDataUserPresenceChangedEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataUserPresenceChangedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataUserPresenceChangedEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataUserPresenceChangedEXT.Buffer}. */
    public static XrEventDataUserPresenceChangedEXT.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataUserPresenceChangedEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataUserPresenceChangedEXT malloc(MemoryStack stack) {
        return new XrEventDataUserPresenceChangedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataUserPresenceChangedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataUserPresenceChangedEXT calloc(MemoryStack stack) {
        return new XrEventDataUserPresenceChangedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataUserPresenceChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataUserPresenceChangedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataUserPresenceChangedEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataUserPresenceChangedEXT.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataUserPresenceChangedEXT.SESSION); }
    /** Unsafe version of {@link #isUserPresent}. */
    public static int nisUserPresent(long struct) { return memGetInt(struct + XrEventDataUserPresenceChangedEXT.ISUSERPRESENT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataUserPresenceChangedEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataUserPresenceChangedEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataUserPresenceChangedEXT} structs. */
    public static class Buffer extends StructBuffer<XrEventDataUserPresenceChangedEXT, Buffer> implements NativeResource {

        private static final XrEventDataUserPresenceChangedEXT ELEMENT_FACTORY = XrEventDataUserPresenceChangedEXT.create(-1L);

        /**
         * Creates a new {@code XrEventDataUserPresenceChangedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataUserPresenceChangedEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataUserPresenceChangedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataUserPresenceChangedEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataUserPresenceChangedEXT.nnext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataUserPresenceChangedEXT.nsession(address()); }
        /** @return the value of the {@code isUserPresent} field. */
        @NativeType("XrBool32")
        public boolean isUserPresent() { return XrEventDataUserPresenceChangedEXT.nisUserPresent(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataUserPresenceChangedEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTUserPresence#XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT} value to the {@code type} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer type$Default() { return type(EXTUserPresence.XR_TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataUserPresenceChangedEXT.Buffer next(@NativeType("void const *") long value) { XrEventDataUserPresenceChangedEXT.nnext(address(), value); return this; }

    }

}