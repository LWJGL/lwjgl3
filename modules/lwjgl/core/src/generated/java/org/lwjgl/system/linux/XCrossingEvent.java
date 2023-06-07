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
 * struct XCrossingEvent {
 *     int {@link #type};
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     Window {@link #root};
 *     Window {@link #subwindow};
 *     Time {@link #time};
 *     int {@link #x};
 *     int {@link #y};
 *     int {@link #x_root};
 *     int {@link #y_root};
 *     int {@link #mode};
 *     int detail;
 *     int {@link #same_screen};
 *     int {@link #focus};
 *     unsigned int {@link #state};
 * }</code></pre>
 */
public class XCrossingEvent extends Struct<XCrossingEvent> implements NativeResource {

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
        ROOT,
        SUBWINDOW,
        TIME,
        X,
        Y,
        X_ROOT,
        Y_ROOT,
        MODE,
        DETAIL,
        SAME_SCREEN,
        FOCUS,
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
            __member(CLONG_SIZE),
            __member(4),
            __member(4),
            __member(4),
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
        WINDOW = layout.offsetof(4);
        ROOT = layout.offsetof(5);
        SUBWINDOW = layout.offsetof(6);
        TIME = layout.offsetof(7);
        X = layout.offsetof(8);
        Y = layout.offsetof(9);
        X_ROOT = layout.offsetof(10);
        Y_ROOT = layout.offsetof(11);
        MODE = layout.offsetof(12);
        DETAIL = layout.offsetof(13);
        SAME_SCREEN = layout.offsetof(14);
        FOCUS = layout.offsetof(15);
        STATE = layout.offsetof(16);
    }

    protected XCrossingEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XCrossingEvent create(long address, @Nullable ByteBuffer container) {
        return new XCrossingEvent(address, container);
    }

    /**
     * Creates a {@code XCrossingEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XCrossingEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** of event */
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
    /** root window that the event occurred on */
    @NativeType("Window")
    public long root() { return nroot(address()); }
    /** child window */
    @NativeType("Window")
    public long subwindow() { return nsubwindow(address()); }
    /** milliseconds */
    @NativeType("Time")
    public long time() { return ntime(address()); }
    /** pointer x coordinate in event window */
    public int x() { return nx(address()); }
    /** pointer y coordinate in event window */
    public int y() { return ny(address()); }
    /** x coordinate relative to {@code root} */
    public int x_root() { return nx_root(address()); }
    /** y coordinate relative to {@code root} */
    public int y_root() { return ny_root(address()); }
    /** one of:<br><table><tr><td>{@link X11#NotifyNormal}</td><td>{@link X11#NotifyGrab}</td><td>{@link X11#NotifyUngrab}</td></tr></table> */
    public int mode() { return nmode(address()); }
    /** @return the value of the {@code detail} field. */
    public int detail() { return ndetail(address()); }
    /** same screen flag */
    public int same_screen() { return nsame_screen(address()); }
    /** boolean focus */
    public int focus() { return nfocus(address()); }
    /** key or button mask */
    @NativeType("unsigned int")
    public int state() { return nstate(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XCrossingEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XCrossingEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XCrossingEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XCrossingEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XCrossingEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #root} field. */
    public XCrossingEvent root(@NativeType("Window") long value) { nroot(address(), value); return this; }
    /** Sets the specified value to the {@link #subwindow} field. */
    public XCrossingEvent subwindow(@NativeType("Window") long value) { nsubwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XCrossingEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #x} field. */
    public XCrossingEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XCrossingEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #x_root} field. */
    public XCrossingEvent x_root(int value) { nx_root(address(), value); return this; }
    /** Sets the specified value to the {@link #y_root} field. */
    public XCrossingEvent y_root(int value) { ny_root(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public XCrossingEvent mode(int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code detail} field. */
    public XCrossingEvent detail(int value) { ndetail(address(), value); return this; }
    /** Sets the specified value to the {@link #same_screen} field. */
    public XCrossingEvent same_screen(int value) { nsame_screen(address(), value); return this; }
    /** Sets the specified value to the {@link #focus} field. */
    public XCrossingEvent focus(int value) { nfocus(address(), value); return this; }
    /** Sets the specified value to the {@link #state} field. */
    public XCrossingEvent state(@NativeType("unsigned int") int value) { nstate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XCrossingEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        long root,
        long subwindow,
        long time,
        int x,
        int y,
        int x_root,
        int y_root,
        int mode,
        int detail,
        int same_screen,
        int focus,
        int state
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        root(root);
        subwindow(subwindow);
        time(time);
        x(x);
        y(y);
        x_root(x_root);
        y_root(y_root);
        mode(mode);
        detail(detail);
        same_screen(same_screen);
        focus(focus);
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
    public XCrossingEvent set(XCrossingEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XCrossingEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XCrossingEvent malloc() {
        return new XCrossingEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XCrossingEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XCrossingEvent calloc() {
        return new XCrossingEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XCrossingEvent} instance allocated with {@link BufferUtils}. */
    public static XCrossingEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XCrossingEvent(memAddress(container), container);
    }

    /** Returns a new {@code XCrossingEvent} instance for the specified memory address. */
    public static XCrossingEvent create(long address) {
        return new XCrossingEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCrossingEvent createSafe(long address) {
        return address == NULL ? null : new XCrossingEvent(address, null);
    }

    /**
     * Returns a new {@link XCrossingEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCrossingEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XCrossingEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XCrossingEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCrossingEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XCrossingEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XCrossingEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XCrossingEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XCrossingEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XCrossingEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XCrossingEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XCrossingEvent malloc(MemoryStack stack) {
        return new XCrossingEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XCrossingEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XCrossingEvent calloc(MemoryStack stack) {
        return new XCrossingEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XCrossingEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCrossingEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XCrossingEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XCrossingEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XCrossingEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XCrossingEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XCrossingEvent.WINDOW); }
    /** Unsafe version of {@link #root}. */
    public static long nroot(long struct) { return memGetCLong(struct + XCrossingEvent.ROOT); }
    /** Unsafe version of {@link #subwindow}. */
    public static long nsubwindow(long struct) { return memGetCLong(struct + XCrossingEvent.SUBWINDOW); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XCrossingEvent.TIME); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.Y); }
    /** Unsafe version of {@link #x_root}. */
    public static int nx_root(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.X_ROOT); }
    /** Unsafe version of {@link #y_root}. */
    public static int ny_root(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.Y_ROOT); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.MODE); }
    /** Unsafe version of {@link #detail}. */
    public static int ndetail(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.DETAIL); }
    /** Unsafe version of {@link #same_screen}. */
    public static int nsame_screen(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.SAME_SCREEN); }
    /** Unsafe version of {@link #focus}. */
    public static int nfocus(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.FOCUS); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XCrossingEvent.STATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XCrossingEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XCrossingEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XCrossingEvent.WINDOW, value); }
    /** Unsafe version of {@link #root(long) root}. */
    public static void nroot(long struct, long value) { memPutCLong(struct + XCrossingEvent.ROOT, value); }
    /** Unsafe version of {@link #subwindow(long) subwindow}. */
    public static void nsubwindow(long struct, long value) { memPutCLong(struct + XCrossingEvent.SUBWINDOW, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XCrossingEvent.TIME, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.Y, value); }
    /** Unsafe version of {@link #x_root(int) x_root}. */
    public static void nx_root(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.X_ROOT, value); }
    /** Unsafe version of {@link #y_root(int) y_root}. */
    public static void ny_root(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.Y_ROOT, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.MODE, value); }
    /** Unsafe version of {@link #detail(int) detail}. */
    public static void ndetail(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.DETAIL, value); }
    /** Unsafe version of {@link #same_screen(int) same_screen}. */
    public static void nsame_screen(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.SAME_SCREEN, value); }
    /** Unsafe version of {@link #focus(int) focus}. */
    public static void nfocus(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.FOCUS, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XCrossingEvent.STATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XCrossingEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XCrossingEvent} structs. */
    public static class Buffer extends StructBuffer<XCrossingEvent, Buffer> implements NativeResource {

        private static final XCrossingEvent ELEMENT_FACTORY = XCrossingEvent.create(-1L);

        /**
         * Creates a new {@code XCrossingEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XCrossingEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XCrossingEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XCrossingEvent#type} field. */
        public int type() { return XCrossingEvent.ntype(address()); }
        /** @return the value of the {@link XCrossingEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XCrossingEvent.nserial(address()); }
        /** @return the value of the {@link XCrossingEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XCrossingEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XCrossingEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XCrossingEvent.ndisplay(address()); }
        /** @return the value of the {@link XCrossingEvent#window} field. */
        @NativeType("Window")
        public long window() { return XCrossingEvent.nwindow(address()); }
        /** @return the value of the {@link XCrossingEvent#root} field. */
        @NativeType("Window")
        public long root() { return XCrossingEvent.nroot(address()); }
        /** @return the value of the {@link XCrossingEvent#subwindow} field. */
        @NativeType("Window")
        public long subwindow() { return XCrossingEvent.nsubwindow(address()); }
        /** @return the value of the {@link XCrossingEvent#time} field. */
        @NativeType("Time")
        public long time() { return XCrossingEvent.ntime(address()); }
        /** @return the value of the {@link XCrossingEvent#x} field. */
        public int x() { return XCrossingEvent.nx(address()); }
        /** @return the value of the {@link XCrossingEvent#y} field. */
        public int y() { return XCrossingEvent.ny(address()); }
        /** @return the value of the {@link XCrossingEvent#x_root} field. */
        public int x_root() { return XCrossingEvent.nx_root(address()); }
        /** @return the value of the {@link XCrossingEvent#y_root} field. */
        public int y_root() { return XCrossingEvent.ny_root(address()); }
        /** @return the value of the {@link XCrossingEvent#mode} field. */
        public int mode() { return XCrossingEvent.nmode(address()); }
        /** @return the value of the {@code detail} field. */
        public int detail() { return XCrossingEvent.ndetail(address()); }
        /** @return the value of the {@link XCrossingEvent#same_screen} field. */
        public int same_screen() { return XCrossingEvent.nsame_screen(address()); }
        /** @return the value of the {@link XCrossingEvent#focus} field. */
        public int focus() { return XCrossingEvent.nfocus(address()); }
        /** @return the value of the {@link XCrossingEvent#state} field. */
        @NativeType("unsigned int")
        public int state() { return XCrossingEvent.nstate(address()); }

        /** Sets the specified value to the {@link XCrossingEvent#type} field. */
        public XCrossingEvent.Buffer type(int value) { XCrossingEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#serial} field. */
        public XCrossingEvent.Buffer serial(@NativeType("unsigned long") long value) { XCrossingEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#send_event} field. */
        public XCrossingEvent.Buffer send_event(@NativeType("Bool") boolean value) { XCrossingEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#display} field. */
        public XCrossingEvent.Buffer display(@NativeType("Display *") long value) { XCrossingEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#window} field. */
        public XCrossingEvent.Buffer window(@NativeType("Window") long value) { XCrossingEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#root} field. */
        public XCrossingEvent.Buffer root(@NativeType("Window") long value) { XCrossingEvent.nroot(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#subwindow} field. */
        public XCrossingEvent.Buffer subwindow(@NativeType("Window") long value) { XCrossingEvent.nsubwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#time} field. */
        public XCrossingEvent.Buffer time(@NativeType("Time") long value) { XCrossingEvent.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#x} field. */
        public XCrossingEvent.Buffer x(int value) { XCrossingEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#y} field. */
        public XCrossingEvent.Buffer y(int value) { XCrossingEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#x_root} field. */
        public XCrossingEvent.Buffer x_root(int value) { XCrossingEvent.nx_root(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#y_root} field. */
        public XCrossingEvent.Buffer y_root(int value) { XCrossingEvent.ny_root(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#mode} field. */
        public XCrossingEvent.Buffer mode(int value) { XCrossingEvent.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code detail} field. */
        public XCrossingEvent.Buffer detail(int value) { XCrossingEvent.ndetail(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#same_screen} field. */
        public XCrossingEvent.Buffer same_screen(int value) { XCrossingEvent.nsame_screen(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#focus} field. */
        public XCrossingEvent.Buffer focus(int value) { XCrossingEvent.nfocus(address(), value); return this; }
        /** Sets the specified value to the {@link XCrossingEvent#state} field. */
        public XCrossingEvent.Buffer state(@NativeType("unsigned int") int value) { XCrossingEvent.nstate(address(), value); return this; }

    }

}