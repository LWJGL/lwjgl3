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
 * struct XrActionStateBoolean {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 currentState;
 *     XrBool32 changedSinceLastSync;
 *     XrTime lastChangeTime;
 *     XrBool32 isActive;
 * }}</pre>
 */
public class XrActionStateBoolean extends Struct<XrActionStateBoolean> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CURRENTSTATE,
        CHANGEDSINCELASTSYNC,
        LASTCHANGETIME,
        ISACTIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CURRENTSTATE = layout.offsetof(2);
        CHANGEDSINCELASTSYNC = layout.offsetof(3);
        LASTCHANGETIME = layout.offsetof(4);
        ISACTIVE = layout.offsetof(5);
    }

    protected XrActionStateBoolean(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrActionStateBoolean create(long address, @Nullable ByteBuffer container) {
        return new XrActionStateBoolean(address, container);
    }

    /**
     * Creates a {@code XrActionStateBoolean} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionStateBoolean(ByteBuffer container) {
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
    /** @return the value of the {@code currentState} field. */
    @NativeType("XrBool32")
    public boolean currentState() { return ncurrentState(address()) != 0; }
    /** @return the value of the {@code changedSinceLastSync} field. */
    @NativeType("XrBool32")
    public boolean changedSinceLastSync() { return nchangedSinceLastSync(address()) != 0; }
    /** @return the value of the {@code lastChangeTime} field. */
    @NativeType("XrTime")
    public long lastChangeTime() { return nlastChangeTime(address()); }
    /** @return the value of the {@code isActive} field. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrActionStateBoolean type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_BOOLEAN TYPE_ACTION_STATE_BOOLEAN} value to the {@code type} field. */
    public XrActionStateBoolean type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_BOOLEAN); }
    /** Sets the specified value to the {@code next} field. */
    public XrActionStateBoolean next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code currentState} field. */
    public XrActionStateBoolean currentState(@NativeType("XrBool32") boolean value) { ncurrentState(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code changedSinceLastSync} field. */
    public XrActionStateBoolean changedSinceLastSync(@NativeType("XrBool32") boolean value) { nchangedSinceLastSync(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code lastChangeTime} field. */
    public XrActionStateBoolean lastChangeTime(@NativeType("XrTime") long value) { nlastChangeTime(address(), value); return this; }
    /** Sets the specified value to the {@code isActive} field. */
    public XrActionStateBoolean isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionStateBoolean set(
        int type,
        long next,
        boolean currentState,
        boolean changedSinceLastSync,
        long lastChangeTime,
        boolean isActive
    ) {
        type(type);
        next(next);
        currentState(currentState);
        changedSinceLastSync(changedSinceLastSync);
        lastChangeTime(lastChangeTime);
        isActive(isActive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionStateBoolean set(XrActionStateBoolean src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionStateBoolean} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionStateBoolean malloc() {
        return new XrActionStateBoolean(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrActionStateBoolean} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionStateBoolean calloc() {
        return new XrActionStateBoolean(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrActionStateBoolean} instance allocated with {@link BufferUtils}. */
    public static XrActionStateBoolean create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrActionStateBoolean(memAddress(container), container);
    }

    /** Returns a new {@code XrActionStateBoolean} instance for the specified memory address. */
    public static XrActionStateBoolean create(long address) {
        return new XrActionStateBoolean(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrActionStateBoolean createSafe(long address) {
        return address == NULL ? null : new XrActionStateBoolean(address, null);
    }

    /**
     * Returns a new {@link XrActionStateBoolean.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateBoolean.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionStateBoolean.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateBoolean.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateBoolean.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateBoolean.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrActionStateBoolean.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionStateBoolean.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrActionStateBoolean.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrActionStateBoolean} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateBoolean malloc(MemoryStack stack) {
        return new XrActionStateBoolean(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrActionStateBoolean} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateBoolean calloc(MemoryStack stack) {
        return new XrActionStateBoolean(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrActionStateBoolean.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateBoolean.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateBoolean.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateBoolean.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrActionStateBoolean.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionStateBoolean.NEXT); }
    /** Unsafe version of {@link #currentState}. */
    public static int ncurrentState(long struct) { return memGetInt(struct + XrActionStateBoolean.CURRENTSTATE); }
    /** Unsafe version of {@link #changedSinceLastSync}. */
    public static int nchangedSinceLastSync(long struct) { return memGetInt(struct + XrActionStateBoolean.CHANGEDSINCELASTSYNC); }
    /** Unsafe version of {@link #lastChangeTime}. */
    public static long nlastChangeTime(long struct) { return memGetLong(struct + XrActionStateBoolean.LASTCHANGETIME); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return memGetInt(struct + XrActionStateBoolean.ISACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrActionStateBoolean.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionStateBoolean.NEXT, value); }
    /** Unsafe version of {@link #currentState(boolean) currentState}. */
    public static void ncurrentState(long struct, int value) { memPutInt(struct + XrActionStateBoolean.CURRENTSTATE, value); }
    /** Unsafe version of {@link #changedSinceLastSync(boolean) changedSinceLastSync}. */
    public static void nchangedSinceLastSync(long struct, int value) { memPutInt(struct + XrActionStateBoolean.CHANGEDSINCELASTSYNC, value); }
    /** Unsafe version of {@link #lastChangeTime(long) lastChangeTime}. */
    public static void nlastChangeTime(long struct, long value) { memPutLong(struct + XrActionStateBoolean.LASTCHANGETIME, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { memPutInt(struct + XrActionStateBoolean.ISACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrActionStateBoolean} structs. */
    public static class Buffer extends StructBuffer<XrActionStateBoolean, Buffer> implements NativeResource {

        private static final XrActionStateBoolean ELEMENT_FACTORY = XrActionStateBoolean.create(-1L);

        /**
         * Creates a new {@code XrActionStateBoolean.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionStateBoolean#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrActionStateBoolean getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionStateBoolean.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrActionStateBoolean.nnext(address()); }
        /** @return the value of the {@code currentState} field. */
        @NativeType("XrBool32")
        public boolean currentState() { return XrActionStateBoolean.ncurrentState(address()) != 0; }
        /** @return the value of the {@code changedSinceLastSync} field. */
        @NativeType("XrBool32")
        public boolean changedSinceLastSync() { return XrActionStateBoolean.nchangedSinceLastSync(address()) != 0; }
        /** @return the value of the {@code lastChangeTime} field. */
        @NativeType("XrTime")
        public long lastChangeTime() { return XrActionStateBoolean.nlastChangeTime(address()); }
        /** @return the value of the {@code isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrActionStateBoolean.nisActive(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrActionStateBoolean.Buffer type(@NativeType("XrStructureType") int value) { XrActionStateBoolean.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_BOOLEAN TYPE_ACTION_STATE_BOOLEAN} value to the {@code type} field. */
        public XrActionStateBoolean.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_BOOLEAN); }
        /** Sets the specified value to the {@code next} field. */
        public XrActionStateBoolean.Buffer next(@NativeType("void *") long value) { XrActionStateBoolean.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code currentState} field. */
        public XrActionStateBoolean.Buffer currentState(@NativeType("XrBool32") boolean value) { XrActionStateBoolean.ncurrentState(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code changedSinceLastSync} field. */
        public XrActionStateBoolean.Buffer changedSinceLastSync(@NativeType("XrBool32") boolean value) { XrActionStateBoolean.nchangedSinceLastSync(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code lastChangeTime} field. */
        public XrActionStateBoolean.Buffer lastChangeTime(@NativeType("XrTime") long value) { XrActionStateBoolean.nlastChangeTime(address(), value); return this; }
        /** Sets the specified value to the {@code isActive} field. */
        public XrActionStateBoolean.Buffer isActive(@NativeType("XrBool32") boolean value) { XrActionStateBoolean.nisActive(address(), value ? 1 : 0); return this; }

    }

}