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
 * struct XFocusChangeEvent {
 *     int {@link #type};
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     int {@link #mode};
 *     int {@link #detail};
 * }</code></pre>
 */
public class XFocusChangeEvent extends Struct<XFocusChangeEvent> implements NativeResource {

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
        MODE,
        DETAIL;

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
        MODE = layout.offsetof(5);
        DETAIL = layout.offsetof(6);
    }

    protected XFocusChangeEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XFocusChangeEvent create(long address, @Nullable ByteBuffer container) {
        return new XFocusChangeEvent(address, container);
    }

    /**
     * Creates a {@code XFocusChangeEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XFocusChangeEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** one of:<br><table><tr><td>{@link X11#FocusIn}</td><td>{@link X11#FocusOut}</td></tr></table> */
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
    /** one of:<br><table><tr><td>{@link X11#NotifyNormal}</td><td>{@link X11#NotifyWhileGrabbed}</td><td>{@link X11#NotifyGrab}</td><td>{@link X11#NotifyUngrab}</td></tr></table> */
    public int mode() { return nmode(address()); }
    /** one of:<br><table><tr><td>{@link X11#NotifyAncestor}</td><td>{@link X11#NotifyVirtual}</td><td>{@link X11#NotifyInferior}</td><td>{@link X11#NotifyNonlinear}</td><td>{@link X11#NotifyNonlinearVirtual}</td></tr><tr><td>{@link X11#NotifyPointer}</td><td>{@link X11#NotifyPointerRoot}</td><td>{@link X11#NotifyDetailNone}</td></tr></table> */
    public int detail() { return ndetail(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XFocusChangeEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XFocusChangeEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XFocusChangeEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XFocusChangeEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XFocusChangeEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public XFocusChangeEvent mode(int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@link #detail} field. */
    public XFocusChangeEvent detail(int value) { ndetail(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XFocusChangeEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        int mode,
        int detail
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        mode(mode);
        detail(detail);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XFocusChangeEvent set(XFocusChangeEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XFocusChangeEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XFocusChangeEvent malloc() {
        return new XFocusChangeEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XFocusChangeEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XFocusChangeEvent calloc() {
        return new XFocusChangeEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XFocusChangeEvent} instance allocated with {@link BufferUtils}. */
    public static XFocusChangeEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XFocusChangeEvent(memAddress(container), container);
    }

    /** Returns a new {@code XFocusChangeEvent} instance for the specified memory address. */
    public static XFocusChangeEvent create(long address) {
        return new XFocusChangeEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XFocusChangeEvent createSafe(long address) {
        return address == NULL ? null : new XFocusChangeEvent(address, null);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XFocusChangeEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XFocusChangeEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XFocusChangeEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XFocusChangeEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XFocusChangeEvent malloc(MemoryStack stack) {
        return new XFocusChangeEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XFocusChangeEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XFocusChangeEvent calloc(MemoryStack stack) {
        return new XFocusChangeEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XFocusChangeEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XFocusChangeEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XFocusChangeEvent.WINDOW); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.MODE); }
    /** Unsafe version of {@link #detail}. */
    public static int ndetail(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.DETAIL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XFocusChangeEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XFocusChangeEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XFocusChangeEvent.WINDOW, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.MODE, value); }
    /** Unsafe version of {@link #detail(int) detail}. */
    public static void ndetail(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.DETAIL, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XFocusChangeEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XFocusChangeEvent} structs. */
    public static class Buffer extends StructBuffer<XFocusChangeEvent, Buffer> implements NativeResource {

        private static final XFocusChangeEvent ELEMENT_FACTORY = XFocusChangeEvent.create(-1L);

        /**
         * Creates a new {@code XFocusChangeEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XFocusChangeEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XFocusChangeEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XFocusChangeEvent#type} field. */
        public int type() { return XFocusChangeEvent.ntype(address()); }
        /** @return the value of the {@link XFocusChangeEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XFocusChangeEvent.nserial(address()); }
        /** @return the value of the {@link XFocusChangeEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XFocusChangeEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XFocusChangeEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XFocusChangeEvent.ndisplay(address()); }
        /** @return the value of the {@link XFocusChangeEvent#window} field. */
        @NativeType("Window")
        public long window() { return XFocusChangeEvent.nwindow(address()); }
        /** @return the value of the {@link XFocusChangeEvent#mode} field. */
        public int mode() { return XFocusChangeEvent.nmode(address()); }
        /** @return the value of the {@link XFocusChangeEvent#detail} field. */
        public int detail() { return XFocusChangeEvent.ndetail(address()); }

        /** Sets the specified value to the {@link XFocusChangeEvent#type} field. */
        public XFocusChangeEvent.Buffer type(int value) { XFocusChangeEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XFocusChangeEvent#serial} field. */
        public XFocusChangeEvent.Buffer serial(@NativeType("unsigned long") long value) { XFocusChangeEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XFocusChangeEvent#send_event} field. */
        public XFocusChangeEvent.Buffer send_event(@NativeType("Bool") boolean value) { XFocusChangeEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XFocusChangeEvent#display} field. */
        public XFocusChangeEvent.Buffer display(@NativeType("Display *") long value) { XFocusChangeEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XFocusChangeEvent#window} field. */
        public XFocusChangeEvent.Buffer window(@NativeType("Window") long value) { XFocusChangeEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XFocusChangeEvent#mode} field. */
        public XFocusChangeEvent.Buffer mode(int value) { XFocusChangeEvent.nmode(address(), value); return this; }
        /** Sets the specified value to the {@link XFocusChangeEvent#detail} field. */
        public XFocusChangeEvent.Buffer detail(int value) { XFocusChangeEvent.ndetail(address(), value); return this; }

    }

}