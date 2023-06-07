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
 * Motion event.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XConfigureEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int border_width;
 *     Window above;
 *     Bool override_redirect;
 * }</code></pre>
 */
public class XConfigureEvent extends Struct<XConfigureEvent> implements NativeResource {

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
        X,
        Y,
        WIDTH,
        HEIGHT,
        BORDER_WIDTH,
        ABOVE,
        OVERRIDE_REDIRECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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
        X = layout.offsetof(5);
        Y = layout.offsetof(6);
        WIDTH = layout.offsetof(7);
        HEIGHT = layout.offsetof(8);
        BORDER_WIDTH = layout.offsetof(9);
        ABOVE = layout.offsetof(10);
        OVERRIDE_REDIRECT = layout.offsetof(11);
    }

    protected XConfigureEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XConfigureEvent create(long address, @Nullable ByteBuffer container) {
        return new XConfigureEvent(address, container);
    }

    /**
     * Creates a {@code XConfigureEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XConfigureEvent(ByteBuffer container) {
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
    /** @return the value of the {@code override_redirect} field. */
    @NativeType("Bool")
    public boolean override_redirect() { return noverride_redirect(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XConfigureEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XConfigureEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XConfigureEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XConfigureEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XConfigureEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XConfigureEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XConfigureEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public XConfigureEvent width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XConfigureEvent height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code border_width} field. */
    public XConfigureEvent border_width(int value) { nborder_width(address(), value); return this; }
    /** Sets the specified value to the {@code above} field. */
    public XConfigureEvent above(@NativeType("Window") long value) { nabove(address(), value); return this; }
    /** Sets the specified value to the {@code override_redirect} field. */
    public XConfigureEvent override_redirect(@NativeType("Bool") boolean value) { noverride_redirect(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XConfigureEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        int x,
        int y,
        int width,
        int height,
        int border_width,
        long above,
        boolean override_redirect
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        x(x);
        y(y);
        width(width);
        height(height);
        border_width(border_width);
        above(above);
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
    public XConfigureEvent set(XConfigureEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XConfigureEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XConfigureEvent malloc() {
        return new XConfigureEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XConfigureEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XConfigureEvent calloc() {
        return new XConfigureEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XConfigureEvent} instance allocated with {@link BufferUtils}. */
    public static XConfigureEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XConfigureEvent(memAddress(container), container);
    }

    /** Returns a new {@code XConfigureEvent} instance for the specified memory address. */
    public static XConfigureEvent create(long address) {
        return new XConfigureEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XConfigureEvent createSafe(long address) {
        return address == NULL ? null : new XConfigureEvent(address, null);
    }

    /**
     * Returns a new {@link XConfigureEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XConfigureEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XConfigureEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XConfigureEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XConfigureEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XConfigureEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XConfigureEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XConfigureEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XConfigureEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XConfigureEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XConfigureEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XConfigureEvent malloc(MemoryStack stack) {
        return new XConfigureEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XConfigureEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XConfigureEvent calloc(MemoryStack stack) {
        return new XConfigureEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XConfigureEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XConfigureEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XConfigureEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XConfigureEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XConfigureEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XConfigureEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XConfigureEvent.WINDOW); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.HEIGHT); }
    /** Unsafe version of {@link #border_width}. */
    public static int nborder_width(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.BORDER_WIDTH); }
    /** Unsafe version of {@link #above}. */
    public static long nabove(long struct) { return memGetCLong(struct + XConfigureEvent.ABOVE); }
    /** Unsafe version of {@link #override_redirect}. */
    public static int noverride_redirect(long struct) { return UNSAFE.getInt(null, struct + XConfigureEvent.OVERRIDE_REDIRECT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XConfigureEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XConfigureEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XConfigureEvent.WINDOW, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.HEIGHT, value); }
    /** Unsafe version of {@link #border_width(int) border_width}. */
    public static void nborder_width(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.BORDER_WIDTH, value); }
    /** Unsafe version of {@link #above(long) above}. */
    public static void nabove(long struct, long value) { memPutCLong(struct + XConfigureEvent.ABOVE, value); }
    /** Unsafe version of {@link #override_redirect(boolean) override_redirect}. */
    public static void noverride_redirect(long struct, int value) { UNSAFE.putInt(null, struct + XConfigureEvent.OVERRIDE_REDIRECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XConfigureEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XConfigureEvent} structs. */
    public static class Buffer extends StructBuffer<XConfigureEvent, Buffer> implements NativeResource {

        private static final XConfigureEvent ELEMENT_FACTORY = XConfigureEvent.create(-1L);

        /**
         * Creates a new {@code XConfigureEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XConfigureEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XConfigureEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XConfigureEvent.ntype(address()); }
        /** @return the value of the {@link XConfigureEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XConfigureEvent.nserial(address()); }
        /** @return the value of the {@link XConfigureEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XConfigureEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XConfigureEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XConfigureEvent.ndisplay(address()); }
        /** @return the value of the {@link XConfigureEvent#window} field. */
        @NativeType("Window")
        public long window() { return XConfigureEvent.nwindow(address()); }
        /** @return the value of the {@code x} field. */
        public int x() { return XConfigureEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public int y() { return XConfigureEvent.ny(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return XConfigureEvent.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return XConfigureEvent.nheight(address()); }
        /** @return the value of the {@code border_width} field. */
        public int border_width() { return XConfigureEvent.nborder_width(address()); }
        /** @return the value of the {@code above} field. */
        @NativeType("Window")
        public long above() { return XConfigureEvent.nabove(address()); }
        /** @return the value of the {@code override_redirect} field. */
        @NativeType("Bool")
        public boolean override_redirect() { return XConfigureEvent.noverride_redirect(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XConfigureEvent.Buffer type(int value) { XConfigureEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XConfigureEvent#serial} field. */
        public XConfigureEvent.Buffer serial(@NativeType("unsigned long") long value) { XConfigureEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XConfigureEvent#send_event} field. */
        public XConfigureEvent.Buffer send_event(@NativeType("Bool") boolean value) { XConfigureEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XConfigureEvent#display} field. */
        public XConfigureEvent.Buffer display(@NativeType("Display *") long value) { XConfigureEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XConfigureEvent#window} field. */
        public XConfigureEvent.Buffer window(@NativeType("Window") long value) { XConfigureEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XConfigureEvent.Buffer x(int value) { XConfigureEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XConfigureEvent.Buffer y(int value) { XConfigureEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public XConfigureEvent.Buffer width(int value) { XConfigureEvent.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XConfigureEvent.Buffer height(int value) { XConfigureEvent.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code border_width} field. */
        public XConfigureEvent.Buffer border_width(int value) { XConfigureEvent.nborder_width(address(), value); return this; }
        /** Sets the specified value to the {@code above} field. */
        public XConfigureEvent.Buffer above(@NativeType("Window") long value) { XConfigureEvent.nabove(address(), value); return this; }
        /** Sets the specified value to the {@code override_redirect} field. */
        public XConfigureEvent.Buffer override_redirect(@NativeType("Bool") boolean value) { XConfigureEvent.noverride_redirect(address(), value ? 1 : 0); return this; }

    }

}