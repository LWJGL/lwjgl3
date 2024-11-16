/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.jspecify.annotations.*;

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
 * struct XResizeRequestEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     int width;
 *     int height;
 * }</code></pre>
 */
public class XResizeRequestEvent extends Struct<XResizeRequestEvent> implements NativeResource {

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
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        WIDTH = layout.offsetof(5);
        HEIGHT = layout.offsetof(6);
    }

    protected XResizeRequestEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XResizeRequestEvent create(long address, @Nullable ByteBuffer container) {
        return new XResizeRequestEvent(address, container);
    }

    /**
     * Creates a {@code XResizeRequestEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XResizeRequestEvent(ByteBuffer container) {
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
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XResizeRequestEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XResizeRequestEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XResizeRequestEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XResizeRequestEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XResizeRequestEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public XResizeRequestEvent width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XResizeRequestEvent height(int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XResizeRequestEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        int width,
        int height
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XResizeRequestEvent set(XResizeRequestEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XResizeRequestEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XResizeRequestEvent malloc() {
        return new XResizeRequestEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XResizeRequestEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XResizeRequestEvent calloc() {
        return new XResizeRequestEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XResizeRequestEvent} instance allocated with {@link BufferUtils}. */
    public static XResizeRequestEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XResizeRequestEvent(memAddress(container), container);
    }

    /** Returns a new {@code XResizeRequestEvent} instance for the specified memory address. */
    public static XResizeRequestEvent create(long address) {
        return new XResizeRequestEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XResizeRequestEvent createSafe(long address) {
        return address == NULL ? null : new XResizeRequestEvent(address, null);
    }

    /**
     * Returns a new {@link XResizeRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XResizeRequestEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XResizeRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XResizeRequestEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XResizeRequestEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XResizeRequestEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XResizeRequestEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XResizeRequestEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XResizeRequestEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XResizeRequestEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XResizeRequestEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XResizeRequestEvent malloc(MemoryStack stack) {
        return new XResizeRequestEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XResizeRequestEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XResizeRequestEvent calloc(MemoryStack stack) {
        return new XResizeRequestEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XResizeRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XResizeRequestEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XResizeRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XResizeRequestEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XResizeRequestEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XResizeRequestEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return memGetInt(struct + XResizeRequestEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XResizeRequestEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XResizeRequestEvent.WINDOW); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + XResizeRequestEvent.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + XResizeRequestEvent.HEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XResizeRequestEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XResizeRequestEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { memPutInt(struct + XResizeRequestEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XResizeRequestEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XResizeRequestEvent.WINDOW, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + XResizeRequestEvent.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + XResizeRequestEvent.HEIGHT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XResizeRequestEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XResizeRequestEvent} structs. */
    public static class Buffer extends StructBuffer<XResizeRequestEvent, Buffer> implements NativeResource {

        private static final XResizeRequestEvent ELEMENT_FACTORY = XResizeRequestEvent.create(-1L);

        /**
         * Creates a new {@code XResizeRequestEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XResizeRequestEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XResizeRequestEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XResizeRequestEvent.ntype(address()); }
        /** @return the value of the {@link XResizeRequestEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XResizeRequestEvent.nserial(address()); }
        /** @return the value of the {@link XResizeRequestEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XResizeRequestEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XResizeRequestEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XResizeRequestEvent.ndisplay(address()); }
        /** @return the value of the {@link XResizeRequestEvent#window} field. */
        @NativeType("Window")
        public long window() { return XResizeRequestEvent.nwindow(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return XResizeRequestEvent.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return XResizeRequestEvent.nheight(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XResizeRequestEvent.Buffer type(int value) { XResizeRequestEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XResizeRequestEvent#serial} field. */
        public XResizeRequestEvent.Buffer serial(@NativeType("unsigned long") long value) { XResizeRequestEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XResizeRequestEvent#send_event} field. */
        public XResizeRequestEvent.Buffer send_event(@NativeType("Bool") boolean value) { XResizeRequestEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XResizeRequestEvent#display} field. */
        public XResizeRequestEvent.Buffer display(@NativeType("Display *") long value) { XResizeRequestEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XResizeRequestEvent#window} field. */
        public XResizeRequestEvent.Buffer window(@NativeType("Window") long value) { XResizeRequestEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public XResizeRequestEvent.Buffer width(int value) { XResizeRequestEvent.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XResizeRequestEvent.Buffer height(int value) { XResizeRequestEvent.nheight(address(), value); return this; }

    }

}