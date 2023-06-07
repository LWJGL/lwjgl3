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
 * struct XConfigureRequestEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window parent;
 *     Window window;
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int border_width;
 *     Window above;
 *     int {@link #detail};
 *     unsigned long value_mask;
 * }</code></pre>
 */
public class XConfigureRequestEvent extends Struct<XConfigureRequestEvent> implements NativeResource {

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
        ABOVE,
        DETAIL,
        VALUE_MASK;

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
            __member(CLONG_SIZE),
            __member(4),
            __member(CLONG_SIZE)
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
        ABOVE = layout.offsetof(11);
        DETAIL = layout.offsetof(12);
        VALUE_MASK = layout.offsetof(13);
    }

    protected XConfigureRequestEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XConfigureRequestEvent create(long address, @Nullable ByteBuffer container) {
        return new XConfigureRequestEvent(address, container);
    }

    /**
     * Creates a {@code XConfigureRequestEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XConfigureRequestEvent(ByteBuffer container) {
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
    /** @return the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** @return the value of the {@code border_width} field. */
    public int border_width() { return nborder_width(address()); }
    /** @return the value of the {@code above} field. */
    @NativeType("Window")
    public long above() { return nabove(address()); }
    /** one of:<br><table><tr><td>{@link X11#Above}</td><td>{@link X11#Below}</td><td>{@link X11#TopIf}</td><td>{@link X11#BottomIf}</td><td>{@link X11#Opposite}</td></tr></table> */
    public int detail() { return ndetail(address()); }
    /** @return the value of the {@code value_mask} field. */
    @NativeType("unsigned long")
    public long value_mask() { return nvalue_mask(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XConfigureRequestEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XConfigureRequestEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XConfigureRequestEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XConfigureRequestEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code parent} field. */
    public XConfigureRequestEvent parent(@NativeType("Window") long value) { nparent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XConfigureRequestEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XConfigureRequestEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XConfigureRequestEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public XConfigureRequestEvent width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XConfigureRequestEvent height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code border_width} field. */
    public XConfigureRequestEvent border_width(int value) { nborder_width(address(), value); return this; }
    /** Sets the specified value to the {@code above} field. */
    public XConfigureRequestEvent above(@NativeType("Window") long value) { nabove(address(), value); return this; }
    /** Sets the specified value to the {@link #detail} field. */
    public XConfigureRequestEvent detail(int value) { ndetail(address(), value); return this; }
    /** Sets the specified value to the {@code value_mask} field. */
    public XConfigureRequestEvent value_mask(@NativeType("unsigned long") long value) { nvalue_mask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XConfigureRequestEvent set(
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
        long above,
        int detail,
        long value_mask
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
        above(above);
        detail(detail);
        value_mask(value_mask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XConfigureRequestEvent set(XConfigureRequestEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XConfigureRequestEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XConfigureRequestEvent malloc() {
        return new XConfigureRequestEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XConfigureRequestEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XConfigureRequestEvent calloc() {
        return new XConfigureRequestEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XConfigureRequestEvent} instance allocated with {@link BufferUtils}. */
    public static XConfigureRequestEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XConfigureRequestEvent(memAddress(container), container);
    }

    /** Returns a new {@code XConfigureRequestEvent} instance for the specified memory address. */
    public static XConfigureRequestEvent create(long address) {
        return new XConfigureRequestEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XConfigureRequestEvent createSafe(long address) {
        return address == NULL ? null : new XConfigureRequestEvent(address, null);
    }

    /**
     * Returns a new {@link XConfigureRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XConfigureRequestEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XConfigureRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XConfigureRequestEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XConfigureRequestEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XConfigureRequestEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XConfigureRequestEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XConfigureRequestEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XConfigureRequestEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureRequestEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XConfigureRequestEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XConfigureRequestEvent malloc(MemoryStack stack) {
        return new XConfigureRequestEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XConfigureRequestEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XConfigureRequestEvent calloc(MemoryStack stack) {
        return new XConfigureRequestEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XConfigureRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XConfigureRequestEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XConfigureRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XConfigureRequestEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XConfigureRequestEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XConfigureRequestEvent.DISPLAY); }
    /** Unsafe version of {@link #parent}. */
    public static long nparent(long struct) { return memGetCLong(struct + XConfigureRequestEvent.PARENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XConfigureRequestEvent.WINDOW); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.HEIGHT); }
    /** Unsafe version of {@link #border_width}. */
    public static int nborder_width(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.BORDER_WIDTH); }
    /** Unsafe version of {@link #above}. */
    public static long nabove(long struct) { return memGetCLong(struct + XConfigureRequestEvent.ABOVE); }
    /** Unsafe version of {@link #detail}. */
    public static int ndetail(long struct) { return UNSAFE.getInt(null, struct + XConfigureRequestEvent.DETAIL); }
    /** Unsafe version of {@link #value_mask}. */
    public static long nvalue_mask(long struct) { return memGetCLong(struct + XConfigureRequestEvent.VALUE_MASK); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XConfigureRequestEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XConfigureRequestEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #parent(long) parent}. */
    public static void nparent(long struct, long value) { memPutCLong(struct + XConfigureRequestEvent.PARENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XConfigureRequestEvent.WINDOW, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.HEIGHT, value); }
    /** Unsafe version of {@link #border_width(int) border_width}. */
    public static void nborder_width(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.BORDER_WIDTH, value); }
    /** Unsafe version of {@link #above(long) above}. */
    public static void nabove(long struct, long value) { memPutCLong(struct + XConfigureRequestEvent.ABOVE, value); }
    /** Unsafe version of {@link #detail(int) detail}. */
    public static void ndetail(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureRequestEvent.DETAIL, value); }
    /** Unsafe version of {@link #value_mask(long) value_mask}. */
    public static void nvalue_mask(long struct, long value) { memPutCLong(struct + XConfigureRequestEvent.VALUE_MASK, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XConfigureRequestEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XConfigureRequestEvent} structs. */
    public static class Buffer extends StructBuffer<XConfigureRequestEvent, Buffer> implements NativeResource {

        private static final XConfigureRequestEvent ELEMENT_FACTORY = XConfigureRequestEvent.create(-1L);

        /**
         * Creates a new {@code XConfigureRequestEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XConfigureRequestEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XConfigureRequestEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XConfigureRequestEvent.ntype(address()); }
        /** @return the value of the {@link XConfigureRequestEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XConfigureRequestEvent.nserial(address()); }
        /** @return the value of the {@link XConfigureRequestEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XConfigureRequestEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XConfigureRequestEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XConfigureRequestEvent.ndisplay(address()); }
        /** @return the value of the {@code parent} field. */
        @NativeType("Window")
        public long parent() { return XConfigureRequestEvent.nparent(address()); }
        /** @return the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XConfigureRequestEvent.nwindow(address()); }
        /** @return the value of the {@code x} field. */
        public int x() { return XConfigureRequestEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public int y() { return XConfigureRequestEvent.ny(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return XConfigureRequestEvent.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return XConfigureRequestEvent.nheight(address()); }
        /** @return the value of the {@code border_width} field. */
        public int border_width() { return XConfigureRequestEvent.nborder_width(address()); }
        /** @return the value of the {@code above} field. */
        @NativeType("Window")
        public long above() { return XConfigureRequestEvent.nabove(address()); }
        /** @return the value of the {@link XConfigureRequestEvent#detail} field. */
        public int detail() { return XConfigureRequestEvent.ndetail(address()); }
        /** @return the value of the {@code value_mask} field. */
        @NativeType("unsigned long")
        public long value_mask() { return XConfigureRequestEvent.nvalue_mask(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XConfigureRequestEvent.Buffer type(int value) { XConfigureRequestEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XConfigureRequestEvent#serial} field. */
        public XConfigureRequestEvent.Buffer serial(@NativeType("unsigned long") long value) { XConfigureRequestEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XConfigureRequestEvent#send_event} field. */
        public XConfigureRequestEvent.Buffer send_event(@NativeType("Bool") boolean value) { XConfigureRequestEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XConfigureRequestEvent#display} field. */
        public XConfigureRequestEvent.Buffer display(@NativeType("Display *") long value) { XConfigureRequestEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code parent} field. */
        public XConfigureRequestEvent.Buffer parent(@NativeType("Window") long value) { XConfigureRequestEvent.nparent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XConfigureRequestEvent.Buffer window(@NativeType("Window") long value) { XConfigureRequestEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XConfigureRequestEvent.Buffer x(int value) { XConfigureRequestEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XConfigureRequestEvent.Buffer y(int value) { XConfigureRequestEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public XConfigureRequestEvent.Buffer width(int value) { XConfigureRequestEvent.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XConfigureRequestEvent.Buffer height(int value) { XConfigureRequestEvent.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code border_width} field. */
        public XConfigureRequestEvent.Buffer border_width(int value) { XConfigureRequestEvent.nborder_width(address(), value); return this; }
        /** Sets the specified value to the {@code above} field. */
        public XConfigureRequestEvent.Buffer above(@NativeType("Window") long value) { XConfigureRequestEvent.nabove(address(), value); return this; }
        /** Sets the specified value to the {@link XConfigureRequestEvent#detail} field. */
        public XConfigureRequestEvent.Buffer detail(int value) { XConfigureRequestEvent.ndetail(address(), value); return this; }
        /** Sets the specified value to the {@code value_mask} field. */
        public XConfigureRequestEvent.Buffer value_mask(@NativeType("unsigned long") long value) { XConfigureRequestEvent.nvalue_mask(address(), value); return this; }

    }

}