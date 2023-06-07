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
 * struct XCirculateRequestEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window parent;
 *     Window window;
 *     int {@link #place};
 * }</code></pre>
 */
public class XCirculateRequestEvent extends Struct<XCirculateRequestEvent> implements NativeResource {

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
        PARENT,
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
        PARENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
        PLACE = layout.offsetof(6);
    }

    protected XCirculateRequestEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XCirculateRequestEvent create(long address, @Nullable ByteBuffer container) {
        return new XCirculateRequestEvent(address, container);
    }

    /**
     * Creates a {@code XCirculateRequestEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XCirculateRequestEvent(ByteBuffer container) {
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
    /** @return the value of the {@code parent} field. */
    @NativeType("Window")
    public long parent() { return nparent(address()); }
    /** @return the value of the {@code window} field. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** one of:<br><table><tr><td>{@link X11#PlaceOnTop}</td><td>{@link X11#PlaceOnBottom}</td></tr></table> */
    public int place() { return nplace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XCirculateRequestEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XCirculateRequestEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XCirculateRequestEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XCirculateRequestEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code parent} field. */
    public XCirculateRequestEvent parent(@NativeType("Window") long value) { nparent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XCirculateRequestEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #place} field. */
    public XCirculateRequestEvent place(int value) { nplace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XCirculateRequestEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long parent,
        long window,
        int place
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        parent(parent);
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
    public XCirculateRequestEvent set(XCirculateRequestEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XCirculateRequestEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XCirculateRequestEvent malloc() {
        return new XCirculateRequestEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XCirculateRequestEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XCirculateRequestEvent calloc() {
        return new XCirculateRequestEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XCirculateRequestEvent} instance allocated with {@link BufferUtils}. */
    public static XCirculateRequestEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XCirculateRequestEvent(memAddress(container), container);
    }

    /** Returns a new {@code XCirculateRequestEvent} instance for the specified memory address. */
    public static XCirculateRequestEvent create(long address) {
        return new XCirculateRequestEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCirculateRequestEvent createSafe(long address) {
        return address == NULL ? null : new XCirculateRequestEvent(address, null);
    }

    /**
     * Returns a new {@link XCirculateRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCirculateRequestEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XCirculateRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCirculateRequestEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCirculateRequestEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XCirculateRequestEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XCirculateRequestEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XCirculateRequestEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCirculateRequestEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCirculateRequestEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XCirculateRequestEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XCirculateRequestEvent malloc(MemoryStack stack) {
        return new XCirculateRequestEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XCirculateRequestEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XCirculateRequestEvent calloc(MemoryStack stack) {
        return new XCirculateRequestEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XCirculateRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCirculateRequestEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCirculateRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCirculateRequestEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XCirculateRequestEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XCirculateRequestEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XCirculateRequestEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XCirculateRequestEvent.DISPLAY); }
    /** Unsafe version of {@link #parent}. */
    public static long nparent(long struct) { return memGetCLong(struct + XCirculateRequestEvent.PARENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XCirculateRequestEvent.WINDOW); }
    /** Unsafe version of {@link #place}. */
    public static int nplace(long struct) { return UNSAFE.getInt(null, struct + XCirculateRequestEvent.PLACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XCirculateRequestEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XCirculateRequestEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XCirculateRequestEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XCirculateRequestEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #parent(long) parent}. */
    public static void nparent(long struct, long value) { memPutCLong(struct + XCirculateRequestEvent.PARENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XCirculateRequestEvent.WINDOW, value); }
    /** Unsafe version of {@link #place(int) place}. */
    public static void nplace(long struct, int value) { UNSAFE.putInt(null, struct + XCirculateRequestEvent.PLACE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XCirculateRequestEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XCirculateRequestEvent} structs. */
    public static class Buffer extends StructBuffer<XCirculateRequestEvent, Buffer> implements NativeResource {

        private static final XCirculateRequestEvent ELEMENT_FACTORY = XCirculateRequestEvent.create(-1L);

        /**
         * Creates a new {@code XCirculateRequestEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XCirculateRequestEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XCirculateRequestEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XCirculateRequestEvent.ntype(address()); }
        /** @return the value of the {@link XCirculateRequestEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XCirculateRequestEvent.nserial(address()); }
        /** @return the value of the {@link XCirculateRequestEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XCirculateRequestEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XCirculateRequestEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XCirculateRequestEvent.ndisplay(address()); }
        /** @return the value of the {@code parent} field. */
        @NativeType("Window")
        public long parent() { return XCirculateRequestEvent.nparent(address()); }
        /** @return the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XCirculateRequestEvent.nwindow(address()); }
        /** @return the value of the {@link XCirculateRequestEvent#place} field. */
        public int place() { return XCirculateRequestEvent.nplace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XCirculateRequestEvent.Buffer type(int value) { XCirculateRequestEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XCirculateRequestEvent#serial} field. */
        public XCirculateRequestEvent.Buffer serial(@NativeType("unsigned long") long value) { XCirculateRequestEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XCirculateRequestEvent#send_event} field. */
        public XCirculateRequestEvent.Buffer send_event(@NativeType("Bool") boolean value) { XCirculateRequestEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XCirculateRequestEvent#display} field. */
        public XCirculateRequestEvent.Buffer display(@NativeType("Display *") long value) { XCirculateRequestEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code parent} field. */
        public XCirculateRequestEvent.Buffer parent(@NativeType("Window") long value) { XCirculateRequestEvent.nparent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XCirculateRequestEvent.Buffer window(@NativeType("Window") long value) { XCirculateRequestEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XCirculateRequestEvent#place} field. */
        public XCirculateRequestEvent.Buffer place(int value) { XCirculateRequestEvent.nplace(address(), value); return this; }

    }

}