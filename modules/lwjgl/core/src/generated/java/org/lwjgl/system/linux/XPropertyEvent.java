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
 * Property event.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XPropertyEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     Atom atom;
 *     Time time;
 *     int {@link #state};
 * }</code></pre>
 */
public class XPropertyEvent extends Struct<XPropertyEvent> implements NativeResource {

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
        ATOM,
        TIME,
        STATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
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
        ATOM = layout.offsetof(5);
        TIME = layout.offsetof(6);
        STATE = layout.offsetof(7);
    }

    protected XPropertyEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XPropertyEvent create(long address, @Nullable ByteBuffer container) {
        return new XPropertyEvent(address, container);
    }

    /**
     * Creates a {@code XPropertyEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XPropertyEvent(ByteBuffer container) {
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
    /** @return the value of the {@code atom} field. */
    @NativeType("Atom")
    public long atom() { return natom(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("Time")
    public long time() { return ntime(address()); }
    /** one of:<br><table><tr><td>{@link X11#PropertyNewValue}</td><td>{@link X11#PropertyDelete}</td></tr></table> */
    public int state() { return nstate(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XPropertyEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XPropertyEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XPropertyEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XPropertyEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XPropertyEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code atom} field. */
    public XPropertyEvent atom(@NativeType("Atom") long value) { natom(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XPropertyEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #state} field. */
    public XPropertyEvent state(int value) { nstate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XPropertyEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        long atom,
        long time,
        int state
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        atom(atom);
        time(time);
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
    public XPropertyEvent set(XPropertyEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XPropertyEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XPropertyEvent malloc() {
        return new XPropertyEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XPropertyEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XPropertyEvent calloc() {
        return new XPropertyEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XPropertyEvent} instance allocated with {@link BufferUtils}. */
    public static XPropertyEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XPropertyEvent(memAddress(container), container);
    }

    /** Returns a new {@code XPropertyEvent} instance for the specified memory address. */
    public static XPropertyEvent create(long address) {
        return new XPropertyEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XPropertyEvent createSafe(long address) {
        return address == NULL ? null : new XPropertyEvent(address, null);
    }

    /**
     * Returns a new {@link XPropertyEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XPropertyEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XPropertyEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XPropertyEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XPropertyEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XPropertyEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XPropertyEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XPropertyEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XPropertyEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XPropertyEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XPropertyEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XPropertyEvent malloc(MemoryStack stack) {
        return new XPropertyEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XPropertyEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XPropertyEvent calloc(MemoryStack stack) {
        return new XPropertyEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XPropertyEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XPropertyEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XPropertyEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XPropertyEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XPropertyEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XPropertyEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XPropertyEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XPropertyEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XPropertyEvent.WINDOW); }
    /** Unsafe version of {@link #atom}. */
    public static long natom(long struct) { return memGetCLong(struct + XPropertyEvent.ATOM); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XPropertyEvent.TIME); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XPropertyEvent.STATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XPropertyEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XPropertyEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XPropertyEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XPropertyEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XPropertyEvent.WINDOW, value); }
    /** Unsafe version of {@link #atom(long) atom}. */
    public static void natom(long struct, long value) { memPutCLong(struct + XPropertyEvent.ATOM, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XPropertyEvent.TIME, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XPropertyEvent.STATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XPropertyEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XPropertyEvent} structs. */
    public static class Buffer extends StructBuffer<XPropertyEvent, Buffer> implements NativeResource {

        private static final XPropertyEvent ELEMENT_FACTORY = XPropertyEvent.create(-1L);

        /**
         * Creates a new {@code XPropertyEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XPropertyEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XPropertyEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XPropertyEvent.ntype(address()); }
        /** @return the value of the {@link XPropertyEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XPropertyEvent.nserial(address()); }
        /** @return the value of the {@link XPropertyEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XPropertyEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XPropertyEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XPropertyEvent.ndisplay(address()); }
        /** @return the value of the {@link XPropertyEvent#window} field. */
        @NativeType("Window")
        public long window() { return XPropertyEvent.nwindow(address()); }
        /** @return the value of the {@code atom} field. */
        @NativeType("Atom")
        public long atom() { return XPropertyEvent.natom(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XPropertyEvent.ntime(address()); }
        /** @return the value of the {@link XPropertyEvent#state} field. */
        public int state() { return XPropertyEvent.nstate(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XPropertyEvent.Buffer type(int value) { XPropertyEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XPropertyEvent#serial} field. */
        public XPropertyEvent.Buffer serial(@NativeType("unsigned long") long value) { XPropertyEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XPropertyEvent#send_event} field. */
        public XPropertyEvent.Buffer send_event(@NativeType("Bool") boolean value) { XPropertyEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XPropertyEvent#display} field. */
        public XPropertyEvent.Buffer display(@NativeType("Display *") long value) { XPropertyEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XPropertyEvent#window} field. */
        public XPropertyEvent.Buffer window(@NativeType("Window") long value) { XPropertyEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code atom} field. */
        public XPropertyEvent.Buffer atom(@NativeType("Atom") long value) { XPropertyEvent.natom(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XPropertyEvent.Buffer time(@NativeType("Time") long value) { XPropertyEvent.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link XPropertyEvent#state} field. */
        public XPropertyEvent.Buffer state(int value) { XPropertyEvent.nstate(address(), value); return this; }

    }

}