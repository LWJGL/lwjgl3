/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

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
 * struct XVisibilityEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     int {@link #state};
 * }</code></pre>
 */
public class XVisibilityEvent extends Struct<XVisibilityEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        SERIAL,
        SEND_EVENT,
        DISPLAY,
        WINDOW,
        STATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        STATE = layout.offsetof(5);
    }

    protected XVisibilityEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XVisibilityEvent create(long address, @Nullable ByteBuffer container) {
        return new XVisibilityEvent(address, container);
    }

    /**
     * Creates a {@code XVisibilityEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XVisibilityEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** # of last request processed by server */
    @NativeType("unsigned long")
    public long serial() { return nserial(address()); }
    /** true if this came from an {@link X11#XSendEvent} request */
    @NativeType("Bool")
    public boolean send_event() { return nsend_event(address()) != 0; }
    /** {@code Display} the event was read from */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** window it reported relative to */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** visibility state */
    public int state() { return nstate(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XVisibilityEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XVisibilityEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XVisibilityEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XVisibilityEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XVisibilityEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #state} field. */
    public XVisibilityEvent state(int value) { nstate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XVisibilityEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        int state
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        state(state);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XVisibilityEvent set(XVisibilityEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XVisibilityEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XVisibilityEvent malloc() {
        return new XVisibilityEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XVisibilityEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XVisibilityEvent calloc() {
        return new XVisibilityEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XVisibilityEvent} instance allocated with {@link BufferUtils}. */
    public static XVisibilityEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XVisibilityEvent(memAddress(container), container);
    }

    /** Returns a new {@code XVisibilityEvent} instance for the specified memory address. */
    public static XVisibilityEvent create(long address) {
        return new XVisibilityEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XVisibilityEvent createSafe(long address) {
        return address == NULL ? null : new XVisibilityEvent(address, null);
    }

    /**
     * Returns a new {@link XVisibilityEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XVisibilityEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XVisibilityEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XVisibilityEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XVisibilityEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XVisibilityEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XVisibilityEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XVisibilityEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XVisibilityEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XVisibilityEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XVisibilityEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XVisibilityEvent malloc(MemoryStack stack) {
        return new XVisibilityEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XVisibilityEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XVisibilityEvent calloc(MemoryStack stack) {
        return new XVisibilityEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XVisibilityEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XVisibilityEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XVisibilityEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XVisibilityEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XVisibilityEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XVisibilityEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XVisibilityEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XVisibilityEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XVisibilityEvent.WINDOW); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XVisibilityEvent.STATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XVisibilityEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XVisibilityEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XVisibilityEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XVisibilityEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XVisibilityEvent.WINDOW, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XVisibilityEvent.STATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XVisibilityEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XVisibilityEvent} structs. */
    public static class Buffer extends StructBuffer<XVisibilityEvent, Buffer> implements NativeResource {

        private static final XVisibilityEvent ELEMENT_FACTORY = XVisibilityEvent.create(-1L);

        /**
         * Creates a new {@code XVisibilityEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XVisibilityEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XVisibilityEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XVisibilityEvent.ntype(address()); }
        /** @return the value of the {@link XVisibilityEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XVisibilityEvent.nserial(address()); }
        /** @return the value of the {@link XVisibilityEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XVisibilityEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XVisibilityEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XVisibilityEvent.ndisplay(address()); }
        /** @return the value of the {@link XVisibilityEvent#window} field. */
        @NativeType("Window")
        public long window() { return XVisibilityEvent.nwindow(address()); }
        /** @return the value of the {@link XVisibilityEvent#state} field. */
        public int state() { return XVisibilityEvent.nstate(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XVisibilityEvent.Buffer type(int value) { XVisibilityEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XVisibilityEvent#serial} field. */
        public XVisibilityEvent.Buffer serial(@NativeType("unsigned long") long value) { XVisibilityEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XVisibilityEvent#send_event} field. */
        public XVisibilityEvent.Buffer send_event(@NativeType("Bool") boolean value) { XVisibilityEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XVisibilityEvent#display} field. */
        public XVisibilityEvent.Buffer display(@NativeType("Display *") long value) { XVisibilityEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XVisibilityEvent#window} field. */
        public XVisibilityEvent.Buffer window(@NativeType("Window") long value) { XVisibilityEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XVisibilityEvent#state} field. */
        public XVisibilityEvent.Buffer state(int value) { XVisibilityEvent.nstate(address(), value); return this; }

    }

}