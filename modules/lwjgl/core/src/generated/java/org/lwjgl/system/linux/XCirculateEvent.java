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
 * struct XCirculateEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window event;
 *     Window window;
 *     int {@link #place};
 * }</code></pre>
 */
public class XCirculateEvent extends Struct<XCirculateEvent> implements NativeResource {

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
        EVENT,
        WINDOW,
        PLACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
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
        EVENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
        PLACE = layout.offsetof(6);
    }

    protected XCirculateEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XCirculateEvent create(long address, @Nullable ByteBuffer container) {
        return new XCirculateEvent(address, container);
    }

    /**
     * Creates a {@code XCirculateEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XCirculateEvent(ByteBuffer container) {
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
    /** @return the value of the {@code event} field. */
    @NativeType("Window")
    public long event() { return nevent(address()); }
    /** @return the value of the {@code window} field. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** one of:<br><table><tr><td>{@link X11#PlaceOnTop}</td><td>{@link X11#PlaceOnBottom}</td></tr></table> */
    public int place() { return nplace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XCirculateEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XCirculateEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XCirculateEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XCirculateEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code event} field. */
    public XCirculateEvent event(@NativeType("Window") long value) { nevent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XCirculateEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #place} field. */
    public XCirculateEvent place(int value) { nplace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XCirculateEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long event,
        long window,
        int place
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        event(event);
        window(window);
        place(place);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XCirculateEvent set(XCirculateEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XCirculateEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XCirculateEvent malloc() {
        return new XCirculateEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XCirculateEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XCirculateEvent calloc() {
        return new XCirculateEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XCirculateEvent} instance allocated with {@link BufferUtils}. */
    public static XCirculateEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XCirculateEvent(memAddress(container), container);
    }

    /** Returns a new {@code XCirculateEvent} instance for the specified memory address. */
    public static XCirculateEvent create(long address) {
        return new XCirculateEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCirculateEvent createSafe(long address) {
        return address == NULL ? null : new XCirculateEvent(address, null);
    }

    /**
     * Returns a new {@link XCirculateEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCirculateEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XCirculateEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCirculateEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCirculateEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XCirculateEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XCirculateEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XCirculateEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCirculateEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XCirculateEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XCirculateEvent malloc(MemoryStack stack) {
        return new XCirculateEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XCirculateEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XCirculateEvent calloc(MemoryStack stack) {
        return new XCirculateEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XCirculateEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCirculateEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCirculateEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCirculateEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XCirculateEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XCirculateEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XCirculateEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XCirculateEvent.DISPLAY); }
    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return memGetCLong(struct + XCirculateEvent.EVENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XCirculateEvent.WINDOW); }
    /** Unsafe version of {@link #place}. */
    public static int nplace(long struct) { return UNSAFE.getInt(null, struct + XCirculateEvent.PLACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XCirculateEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XCirculateEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XCirculateEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XCirculateEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { memPutCLong(struct + XCirculateEvent.EVENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XCirculateEvent.WINDOW, value); }
    /** Unsafe version of {@link #place(int) place}. */
    public static void nplace(long struct, int value) { UNSAFE.putInt(null, struct + XCirculateEvent.PLACE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XCirculateEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XCirculateEvent} structs. */
    public static class Buffer extends StructBuffer<XCirculateEvent, Buffer> implements NativeResource {

        private static final XCirculateEvent ELEMENT_FACTORY = XCirculateEvent.create(-1L);

        /**
         * Creates a new {@code XCirculateEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XCirculateEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XCirculateEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XCirculateEvent.ntype(address()); }
        /** @return the value of the {@link XCirculateEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XCirculateEvent.nserial(address()); }
        /** @return the value of the {@link XCirculateEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XCirculateEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XCirculateEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XCirculateEvent.ndisplay(address()); }
        /** @return the value of the {@code event} field. */
        @NativeType("Window")
        public long event() { return XCirculateEvent.nevent(address()); }
        /** @return the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XCirculateEvent.nwindow(address()); }
        /** @return the value of the {@link XCirculateEvent#place} field. */
        public int place() { return XCirculateEvent.nplace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XCirculateEvent.Buffer type(int value) { XCirculateEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XCirculateEvent#serial} field. */
        public XCirculateEvent.Buffer serial(@NativeType("unsigned long") long value) { XCirculateEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XCirculateEvent#send_event} field. */
        public XCirculateEvent.Buffer send_event(@NativeType("Bool") boolean value) { XCirculateEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XCirculateEvent#display} field. */
        public XCirculateEvent.Buffer display(@NativeType("Display *") long value) { XCirculateEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code event} field. */
        public XCirculateEvent.Buffer event(@NativeType("Window") long value) { XCirculateEvent.nevent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XCirculateEvent.Buffer window(@NativeType("Window") long value) { XCirculateEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XCirculateEvent#place} field. */
        public XCirculateEvent.Buffer place(int value) { XCirculateEvent.nplace(address(), value); return this; }

    }

}