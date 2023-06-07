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
 * struct XCreateWindowEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #parent};
 *     Window {@link #window};
 *     int {@link #x};
 *     int {@link #y};
 *     int {@link #width};
 *     int {@link #height};
 *     int {@link #border_width};
 *     int {@link #override_redirect};
 * }</code></pre>
 */
public class XCreateWindowEvent extends Struct<XCreateWindowEvent> implements NativeResource {

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
        X,
        Y,
        WIDTH,
        HEIGHT,
        BORDER_WIDTH,
        OVERRIDE_REDIRECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        WIDTH = layout.offsetof(8);
        HEIGHT = layout.offsetof(9);
        BORDER_WIDTH = layout.offsetof(10);
        OVERRIDE_REDIRECT = layout.offsetof(11);
    }

    protected XCreateWindowEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XCreateWindowEvent create(long address, @Nullable ByteBuffer container) {
        return new XCreateWindowEvent(address, container);
    }

    /**
     * Creates a {@code XCreateWindowEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XCreateWindowEvent(ByteBuffer container) {
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
    /** parent of the window */
    @NativeType("Window")
    public long parent() { return nparent(address()); }
    /** window id of window created */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** window location */
    public int x() { return nx(address()); }
    /** window location */
    public int y() { return ny(address()); }
    /** size of window */
    public int width() { return nwidth(address()); }
    /** size of window */
    public int height() { return nheight(address()); }
    /** border width */
    public int border_width() { return nborder_width(address()); }
    /** creation should be overridden */
    public int override_redirect() { return noverride_redirect(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XCreateWindowEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XCreateWindowEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XCreateWindowEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XCreateWindowEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #parent} field. */
    public XCreateWindowEvent parent(@NativeType("Window") long value) { nparent(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XCreateWindowEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #x} field. */
    public XCreateWindowEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XCreateWindowEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public XCreateWindowEvent width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public XCreateWindowEvent height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #border_width} field. */
    public XCreateWindowEvent border_width(int value) { nborder_width(address(), value); return this; }
    /** Sets the specified value to the {@link #override_redirect} field. */
    public XCreateWindowEvent override_redirect(int value) { noverride_redirect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XCreateWindowEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long parent,
        long window,
        int x,
        int y,
        int width,
        int height,
        int border_width,
        int override_redirect
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        parent(parent);
        window(window);
        x(x);
        y(y);
        width(width);
        height(height);
        border_width(border_width);
        override_redirect(override_redirect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XCreateWindowEvent set(XCreateWindowEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XCreateWindowEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XCreateWindowEvent malloc() {
        return new XCreateWindowEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XCreateWindowEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XCreateWindowEvent calloc() {
        return new XCreateWindowEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XCreateWindowEvent} instance allocated with {@link BufferUtils}. */
    public static XCreateWindowEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XCreateWindowEvent(memAddress(container), container);
    }

    /** Returns a new {@code XCreateWindowEvent} instance for the specified memory address. */
    public static XCreateWindowEvent create(long address) {
        return new XCreateWindowEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCreateWindowEvent createSafe(long address) {
        return address == NULL ? null : new XCreateWindowEvent(address, null);
    }

    /**
     * Returns a new {@link XCreateWindowEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCreateWindowEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XCreateWindowEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCreateWindowEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCreateWindowEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XCreateWindowEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XCreateWindowEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XCreateWindowEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCreateWindowEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCreateWindowEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XCreateWindowEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XCreateWindowEvent malloc(MemoryStack stack) {
        return new XCreateWindowEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XCreateWindowEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XCreateWindowEvent calloc(MemoryStack stack) {
        return new XCreateWindowEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XCreateWindowEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCreateWindowEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCreateWindowEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCreateWindowEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XCreateWindowEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XCreateWindowEvent.DISPLAY); }
    /** Unsafe version of {@link #parent}. */
    public static long nparent(long struct) { return memGetCLong(struct + XCreateWindowEvent.PARENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XCreateWindowEvent.WINDOW); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.HEIGHT); }
    /** Unsafe version of {@link #border_width}. */
    public static int nborder_width(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.BORDER_WIDTH); }
    /** Unsafe version of {@link #override_redirect}. */
    public static int noverride_redirect(long struct) { return UNSAFE.getInt(null, struct + XCreateWindowEvent.OVERRIDE_REDIRECT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XCreateWindowEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XCreateWindowEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #parent(long) parent}. */
    public static void nparent(long struct, long value) { memPutCLong(struct + XCreateWindowEvent.PARENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XCreateWindowEvent.WINDOW, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.HEIGHT, value); }
    /** Unsafe version of {@link #border_width(int) border_width}. */
    public static void nborder_width(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.BORDER_WIDTH, value); }
    /** Unsafe version of {@link #override_redirect(int) override_redirect}. */
    public static void noverride_redirect(long struct, int value) { UNSAFE.putInt(null, struct + XCreateWindowEvent.OVERRIDE_REDIRECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XCreateWindowEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XCreateWindowEvent} structs. */
    public static class Buffer extends StructBuffer<XCreateWindowEvent, Buffer> implements NativeResource {

        private static final XCreateWindowEvent ELEMENT_FACTORY = XCreateWindowEvent.create(-1L);

        /**
         * Creates a new {@code XCreateWindowEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XCreateWindowEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XCreateWindowEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XCreateWindowEvent.ntype(address()); }
        /** @return the value of the {@link XCreateWindowEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XCreateWindowEvent.nserial(address()); }
        /** @return the value of the {@link XCreateWindowEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XCreateWindowEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XCreateWindowEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XCreateWindowEvent.ndisplay(address()); }
        /** @return the value of the {@link XCreateWindowEvent#parent} field. */
        @NativeType("Window")
        public long parent() { return XCreateWindowEvent.nparent(address()); }
        /** @return the value of the {@link XCreateWindowEvent#window} field. */
        @NativeType("Window")
        public long window() { return XCreateWindowEvent.nwindow(address()); }
        /** @return the value of the {@link XCreateWindowEvent#x} field. */
        public int x() { return XCreateWindowEvent.nx(address()); }
        /** @return the value of the {@link XCreateWindowEvent#y} field. */
        public int y() { return XCreateWindowEvent.ny(address()); }
        /** @return the value of the {@link XCreateWindowEvent#width} field. */
        public int width() { return XCreateWindowEvent.nwidth(address()); }
        /** @return the value of the {@link XCreateWindowEvent#height} field. */
        public int height() { return XCreateWindowEvent.nheight(address()); }
        /** @return the value of the {@link XCreateWindowEvent#border_width} field. */
        public int border_width() { return XCreateWindowEvent.nborder_width(address()); }
        /** @return the value of the {@link XCreateWindowEvent#override_redirect} field. */
        public int override_redirect() { return XCreateWindowEvent.noverride_redirect(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XCreateWindowEvent.Buffer type(int value) { XCreateWindowEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#serial} field. */
        public XCreateWindowEvent.Buffer serial(@NativeType("unsigned long") long value) { XCreateWindowEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#send_event} field. */
        public XCreateWindowEvent.Buffer send_event(@NativeType("Bool") boolean value) { XCreateWindowEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#display} field. */
        public XCreateWindowEvent.Buffer display(@NativeType("Display *") long value) { XCreateWindowEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#parent} field. */
        public XCreateWindowEvent.Buffer parent(@NativeType("Window") long value) { XCreateWindowEvent.nparent(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#window} field. */
        public XCreateWindowEvent.Buffer window(@NativeType("Window") long value) { XCreateWindowEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#x} field. */
        public XCreateWindowEvent.Buffer x(int value) { XCreateWindowEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#y} field. */
        public XCreateWindowEvent.Buffer y(int value) { XCreateWindowEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#width} field. */
        public XCreateWindowEvent.Buffer width(int value) { XCreateWindowEvent.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#height} field. */
        public XCreateWindowEvent.Buffer height(int value) { XCreateWindowEvent.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#border_width} field. */
        public XCreateWindowEvent.Buffer border_width(int value) { XCreateWindowEvent.nborder_width(address(), value); return this; }
        /** Sets the specified value to the {@link XCreateWindowEvent#override_redirect} field. */
        public XCreateWindowEvent.Buffer override_redirect(int value) { XCreateWindowEvent.noverride_redirect(address(), value); return this; }

    }

}