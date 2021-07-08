/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataSessionStateChanged {
 *     XrStructureType type;
 *     void const * next;
 *     XrSession session;
 *     XrSessionState state;
 *     XrTime time;
 * }</code></pre>
 */
public class XrEventDataSessionStateChanged extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SESSION,
        STATE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        STATE = layout.offsetof(3);
        TIME = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrEventDataSessionStateChanged} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSessionStateChanged(ByteBuffer container) {
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
    /** @return the value of the {@code state} field. */
    @NativeType("XrSessionState")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSessionStateChanged type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSessionStateChanged next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code session} field. */
    public XrEventDataSessionStateChanged session(XrSession value) { nsession(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public XrEventDataSessionStateChanged state(@NativeType("XrSessionState") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrEventDataSessionStateChanged time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSessionStateChanged set(
        int type,
        long next,
        XrSession session,
        int state,
        long time
    ) {
        type(type);
        next(next);
        session(session);
        state(state);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataSessionStateChanged set(XrEventDataSessionStateChanged src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSessionStateChanged malloc() {
        return wrap(XrEventDataSessionStateChanged.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSessionStateChanged calloc() {
        return wrap(XrEventDataSessionStateChanged.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSessionStateChanged create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataSessionStateChanged.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSessionStateChanged} instance for the specified memory address. */
    public static XrEventDataSessionStateChanged create(long address) {
        return wrap(XrEventDataSessionStateChanged.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSessionStateChanged createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataSessionStateChanged.class, address);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataSessionStateChanged.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSessionStateChanged.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrEventDataSessionStateChanged mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrEventDataSessionStateChanged} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrEventDataSessionStateChanged callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrEventDataSessionStateChanged} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSessionStateChanged mallocStack(MemoryStack stack) {
        return wrap(XrEventDataSessionStateChanged.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataSessionStateChanged} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSessionStateChanged callocStack(MemoryStack stack) {
        return wrap(XrEventDataSessionStateChanged.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSessionStateChanged.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSessionStateChanged.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSessionStateChanged.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSessionStateChanged.NEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetAddress(struct + XrEventDataSessionStateChanged.SESSION); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSessionStateChanged.STATE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrEventDataSessionStateChanged.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSessionStateChanged.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSessionStateChanged.NEXT, value); }
    /** Unsafe version of {@link #session(XrSession) session}. */
    public static void nsession(long struct, XrSession value) { memPutAddress(struct + XrEventDataSessionStateChanged.SESSION, value.address()); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSessionStateChanged.STATE, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataSessionStateChanged.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataSessionStateChanged.SESSION));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrEventDataSessionStateChanged} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSessionStateChanged, Buffer> implements NativeResource {

        private static final XrEventDataSessionStateChanged ELEMENT_FACTORY = XrEventDataSessionStateChanged.create(-1L);

        /**
         * Creates a new {@code XrEventDataSessionStateChanged.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSessionStateChanged#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataSessionStateChanged getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSessionStateChanged.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSessionStateChanged.nnext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("XrSession")
        public long session() { return XrEventDataSessionStateChanged.nsession(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrSessionState")
        public int state() { return XrEventDataSessionStateChanged.nstate(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrEventDataSessionStateChanged.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSessionStateChanged.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSessionStateChanged.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSessionStateChanged.Buffer next(@NativeType("void const *") long value) { XrEventDataSessionStateChanged.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code session} field. */
        public XrEventDataSessionStateChanged.Buffer session(XrSession value) { XrEventDataSessionStateChanged.nsession(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public XrEventDataSessionStateChanged.Buffer state(@NativeType("XrSessionState") int value) { XrEventDataSessionStateChanged.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrEventDataSessionStateChanged.Buffer time(@NativeType("XrTime") long value) { XrEventDataSessionStateChanged.ntime(address(), value); return this; }

    }

}