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
 * struct XrActionStateVector2f {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrVector2f XrVector2f} currentState;
 *     XrBool32 changedSinceLastSync;
 *     XrTime lastChangeTime;
 *     XrBool32 isActive;
 * }}</pre>
 */
public class XrActionStateVector2f extends Struct<XrActionStateVector2f> implements NativeResource {

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
            __member(XrVector2f.SIZEOF, XrVector2f.ALIGNOF),
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

    protected XrActionStateVector2f(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrActionStateVector2f create(long address, @Nullable ByteBuffer container) {
        return new XrActionStateVector2f(address, container);
    }

    /**
     * Creates a {@code XrActionStateVector2f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionStateVector2f(ByteBuffer container) {
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
    /** @return a {@link XrVector2f} view of the {@code currentState} field. */
    public XrVector2f currentState() { return ncurrentState(address()); }
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
    public XrActionStateVector2f type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_VECTOR2F TYPE_ACTION_STATE_VECTOR2F} value to the {@code type} field. */
    public XrActionStateVector2f type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_VECTOR2F); }
    /** Sets the specified value to the {@code next} field. */
    public XrActionStateVector2f next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrVector2f} to the {@code currentState} field. */
    public XrActionStateVector2f currentState(XrVector2f value) { ncurrentState(address(), value); return this; }
    /** Passes the {@code currentState} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrActionStateVector2f currentState(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(currentState()); return this; }
    /** Sets the specified value to the {@code changedSinceLastSync} field. */
    public XrActionStateVector2f changedSinceLastSync(@NativeType("XrBool32") boolean value) { nchangedSinceLastSync(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code lastChangeTime} field. */
    public XrActionStateVector2f lastChangeTime(@NativeType("XrTime") long value) { nlastChangeTime(address(), value); return this; }
    /** Sets the specified value to the {@code isActive} field. */
    public XrActionStateVector2f isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionStateVector2f set(
        int type,
        long next,
        XrVector2f currentState,
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
    public XrActionStateVector2f set(XrActionStateVector2f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionStateVector2f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionStateVector2f malloc() {
        return new XrActionStateVector2f(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrActionStateVector2f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionStateVector2f calloc() {
        return new XrActionStateVector2f(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrActionStateVector2f} instance allocated with {@link BufferUtils}. */
    public static XrActionStateVector2f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrActionStateVector2f(memAddress(container), container);
    }

    /** Returns a new {@code XrActionStateVector2f} instance for the specified memory address. */
    public static XrActionStateVector2f create(long address) {
        return new XrActionStateVector2f(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrActionStateVector2f createSafe(long address) {
        return address == NULL ? null : new XrActionStateVector2f(address, null);
    }

    /**
     * Returns a new {@link XrActionStateVector2f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateVector2f.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionStateVector2f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateVector2f.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateVector2f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateVector2f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrActionStateVector2f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionStateVector2f.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrActionStateVector2f.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrActionStateVector2f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateVector2f malloc(MemoryStack stack) {
        return new XrActionStateVector2f(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrActionStateVector2f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateVector2f calloc(MemoryStack stack) {
        return new XrActionStateVector2f(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrActionStateVector2f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateVector2f.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateVector2f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateVector2f.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrActionStateVector2f.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionStateVector2f.NEXT); }
    /** Unsafe version of {@link #currentState}. */
    public static XrVector2f ncurrentState(long struct) { return XrVector2f.create(struct + XrActionStateVector2f.CURRENTSTATE); }
    /** Unsafe version of {@link #changedSinceLastSync}. */
    public static int nchangedSinceLastSync(long struct) { return memGetInt(struct + XrActionStateVector2f.CHANGEDSINCELASTSYNC); }
    /** Unsafe version of {@link #lastChangeTime}. */
    public static long nlastChangeTime(long struct) { return memGetLong(struct + XrActionStateVector2f.LASTCHANGETIME); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return memGetInt(struct + XrActionStateVector2f.ISACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrActionStateVector2f.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionStateVector2f.NEXT, value); }
    /** Unsafe version of {@link #currentState(XrVector2f) currentState}. */
    public static void ncurrentState(long struct, XrVector2f value) { memCopy(value.address(), struct + XrActionStateVector2f.CURRENTSTATE, XrVector2f.SIZEOF); }
    /** Unsafe version of {@link #changedSinceLastSync(boolean) changedSinceLastSync}. */
    public static void nchangedSinceLastSync(long struct, int value) { memPutInt(struct + XrActionStateVector2f.CHANGEDSINCELASTSYNC, value); }
    /** Unsafe version of {@link #lastChangeTime(long) lastChangeTime}. */
    public static void nlastChangeTime(long struct, long value) { memPutLong(struct + XrActionStateVector2f.LASTCHANGETIME, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { memPutInt(struct + XrActionStateVector2f.ISACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrActionStateVector2f} structs. */
    public static class Buffer extends StructBuffer<XrActionStateVector2f, Buffer> implements NativeResource {

        private static final XrActionStateVector2f ELEMENT_FACTORY = XrActionStateVector2f.create(-1L);

        /**
         * Creates a new {@code XrActionStateVector2f.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionStateVector2f#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrActionStateVector2f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionStateVector2f.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrActionStateVector2f.nnext(address()); }
        /** @return a {@link XrVector2f} view of the {@code currentState} field. */
        public XrVector2f currentState() { return XrActionStateVector2f.ncurrentState(address()); }
        /** @return the value of the {@code changedSinceLastSync} field. */
        @NativeType("XrBool32")
        public boolean changedSinceLastSync() { return XrActionStateVector2f.nchangedSinceLastSync(address()) != 0; }
        /** @return the value of the {@code lastChangeTime} field. */
        @NativeType("XrTime")
        public long lastChangeTime() { return XrActionStateVector2f.nlastChangeTime(address()); }
        /** @return the value of the {@code isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrActionStateVector2f.nisActive(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrActionStateVector2f.Buffer type(@NativeType("XrStructureType") int value) { XrActionStateVector2f.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_VECTOR2F TYPE_ACTION_STATE_VECTOR2F} value to the {@code type} field. */
        public XrActionStateVector2f.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_VECTOR2F); }
        /** Sets the specified value to the {@code next} field. */
        public XrActionStateVector2f.Buffer next(@NativeType("void *") long value) { XrActionStateVector2f.nnext(address(), value); return this; }
        /** Copies the specified {@link XrVector2f} to the {@code currentState} field. */
        public XrActionStateVector2f.Buffer currentState(XrVector2f value) { XrActionStateVector2f.ncurrentState(address(), value); return this; }
        /** Passes the {@code currentState} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrActionStateVector2f.Buffer currentState(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(currentState()); return this; }
        /** Sets the specified value to the {@code changedSinceLastSync} field. */
        public XrActionStateVector2f.Buffer changedSinceLastSync(@NativeType("XrBool32") boolean value) { XrActionStateVector2f.nchangedSinceLastSync(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code lastChangeTime} field. */
        public XrActionStateVector2f.Buffer lastChangeTime(@NativeType("XrTime") long value) { XrActionStateVector2f.nlastChangeTime(address(), value); return this; }
        /** Sets the specified value to the {@code isActive} field. */
        public XrActionStateVector2f.Buffer isActive(@NativeType("XrBool32") boolean value) { XrActionStateVector2f.nisActive(address(), value ? 1 : 0); return this; }

    }

}