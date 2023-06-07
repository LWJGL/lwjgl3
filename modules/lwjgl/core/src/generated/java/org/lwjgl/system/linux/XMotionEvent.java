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
 * struct XMotionEvent {
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
 *     unsigned int {@link #state};
 *     char {@link #is_hint};
 *     Bool {@link #same_screen};
 * }</code></pre>
 */
public class XMotionEvent extends Struct<XMotionEvent> implements NativeResource {

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
        STATE,
        IS_HINT,
        SAME_SCREEN;

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
            __member(1),
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
        STATE = layout.offsetof(12);
        IS_HINT = layout.offsetof(13);
        SAME_SCREEN = layout.offsetof(14);
    }

    protected XMotionEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XMotionEvent create(long address, @Nullable ByteBuffer container) {
        return new XMotionEvent(address, container);
    }

    /**
     * Creates a {@code XMotionEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XMotionEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the event type. Must be:<br><table><tr><td>{@link X11#MotionNotify}</td></tr></table> */
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
    /** key or button mask */
    @NativeType("unsigned int")
    public int state() { return nstate(address()); }
    /** detail */
    @NativeType("char")
    public byte is_hint() { return nis_hint(address()); }
    /** same screen flag */
    @NativeType("Bool")
    public boolean same_screen() { return nsame_screen(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XMotionEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XMotionEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XMotionEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XMotionEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XMotionEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #root} field. */
    public XMotionEvent root(@NativeType("Window") long value) { nroot(address(), value); return this; }
    /** Sets the specified value to the {@link #subwindow} field. */
    public XMotionEvent subwindow(@NativeType("Window") long value) { nsubwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XMotionEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@link #x} field. */
    public XMotionEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XMotionEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #x_root} field. */
    public XMotionEvent x_root(int value) { nx_root(address(), value); return this; }
    /** Sets the specified value to the {@link #y_root} field. */
    public XMotionEvent y_root(int value) { ny_root(address(), value); return this; }
    /** Sets the specified value to the {@link #state} field. */
    public XMotionEvent state(@NativeType("unsigned int") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@link #is_hint} field. */
    public XMotionEvent is_hint(@NativeType("char") byte value) { nis_hint(address(), value); return this; }
    /** Sets the specified value to the {@link #same_screen} field. */
    public XMotionEvent same_screen(@NativeType("Bool") boolean value) { nsame_screen(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XMotionEvent set(
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
        int state,
        byte is_hint,
        boolean same_screen
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
        state(state);
        is_hint(is_hint);
        same_screen(same_screen);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XMotionEvent set(XMotionEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XMotionEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XMotionEvent malloc() {
        return new XMotionEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XMotionEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XMotionEvent calloc() {
        return new XMotionEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XMotionEvent} instance allocated with {@link BufferUtils}. */
    public static XMotionEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XMotionEvent(memAddress(container), container);
    }

    /** Returns a new {@code XMotionEvent} instance for the specified memory address. */
    public static XMotionEvent create(long address) {
        return new XMotionEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMotionEvent createSafe(long address) {
        return address == NULL ? null : new XMotionEvent(address, null);
    }

    /**
     * Returns a new {@link XMotionEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMotionEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XMotionEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMotionEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMotionEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XMotionEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XMotionEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XMotionEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMotionEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XMotionEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XMotionEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XMotionEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XMotionEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XMotionEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XMotionEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XMotionEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XMotionEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XMotionEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XMotionEvent malloc(MemoryStack stack) {
        return new XMotionEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XMotionEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XMotionEvent calloc(MemoryStack stack) {
        return new XMotionEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XMotionEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMotionEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMotionEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMotionEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XMotionEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XMotionEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XMotionEvent.WINDOW); }
    /** Unsafe version of {@link #root}. */
    public static long nroot(long struct) { return memGetCLong(struct + XMotionEvent.ROOT); }
    /** Unsafe version of {@link #subwindow}. */
    public static long nsubwindow(long struct) { return memGetCLong(struct + XMotionEvent.SUBWINDOW); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XMotionEvent.TIME); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.Y); }
    /** Unsafe version of {@link #x_root}. */
    public static int nx_root(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.X_ROOT); }
    /** Unsafe version of {@link #y_root}. */
    public static int ny_root(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.Y_ROOT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.STATE); }
    /** Unsafe version of {@link #is_hint}. */
    public static byte nis_hint(long struct) { return UNSAFE.getByte(null, struct + XMotionEvent.IS_HINT); }
    /** Unsafe version of {@link #same_screen}. */
    public static int nsame_screen(long struct) { return UNSAFE.getInt(null, struct + XMotionEvent.SAME_SCREEN); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XMotionEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XMotionEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XMotionEvent.WINDOW, value); }
    /** Unsafe version of {@link #root(long) root}. */
    public static void nroot(long struct, long value) { memPutCLong(struct + XMotionEvent.ROOT, value); }
    /** Unsafe version of {@link #subwindow(long) subwindow}. */
    public static void nsubwindow(long struct, long value) { memPutCLong(struct + XMotionEvent.SUBWINDOW, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XMotionEvent.TIME, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.Y, value); }
    /** Unsafe version of {@link #x_root(int) x_root}. */
    public static void nx_root(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.X_ROOT, value); }
    /** Unsafe version of {@link #y_root(int) y_root}. */
    public static void ny_root(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.Y_ROOT, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.STATE, value); }
    /** Unsafe version of {@link #is_hint(byte) is_hint}. */
    public static void nis_hint(long struct, byte value) { UNSAFE.putByte(null, struct + XMotionEvent.IS_HINT, value); }
    /** Unsafe version of {@link #same_screen(boolean) same_screen}. */
    public static void nsame_screen(long struct, int value) { UNSAFE.putInt(null, struct + XMotionEvent.SAME_SCREEN, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XMotionEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XMotionEvent} structs. */
    public static class Buffer extends StructBuffer<XMotionEvent, Buffer> implements NativeResource {

        private static final XMotionEvent ELEMENT_FACTORY = XMotionEvent.create(-1L);

        /**
         * Creates a new {@code XMotionEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XMotionEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XMotionEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XMotionEvent#type} field. */
        public int type() { return XMotionEvent.ntype(address()); }
        /** @return the value of the {@link XMotionEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XMotionEvent.nserial(address()); }
        /** @return the value of the {@link XMotionEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XMotionEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XMotionEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XMotionEvent.ndisplay(address()); }
        /** @return the value of the {@link XMotionEvent#window} field. */
        @NativeType("Window")
        public long window() { return XMotionEvent.nwindow(address()); }
        /** @return the value of the {@link XMotionEvent#root} field. */
        @NativeType("Window")
        public long root() { return XMotionEvent.nroot(address()); }
        /** @return the value of the {@link XMotionEvent#subwindow} field. */
        @NativeType("Window")
        public long subwindow() { return XMotionEvent.nsubwindow(address()); }
        /** @return the value of the {@link XMotionEvent#time} field. */
        @NativeType("Time")
        public long time() { return XMotionEvent.ntime(address()); }
        /** @return the value of the {@link XMotionEvent#x} field. */
        public int x() { return XMotionEvent.nx(address()); }
        /** @return the value of the {@link XMotionEvent#y} field. */
        public int y() { return XMotionEvent.ny(address()); }
        /** @return the value of the {@link XMotionEvent#x_root} field. */
        public int x_root() { return XMotionEvent.nx_root(address()); }
        /** @return the value of the {@link XMotionEvent#y_root} field. */
        public int y_root() { return XMotionEvent.ny_root(address()); }
        /** @return the value of the {@link XMotionEvent#state} field. */
        @NativeType("unsigned int")
        public int state() { return XMotionEvent.nstate(address()); }
        /** @return the value of the {@link XMotionEvent#is_hint} field. */
        @NativeType("char")
        public byte is_hint() { return XMotionEvent.nis_hint(address()); }
        /** @return the value of the {@link XMotionEvent#same_screen} field. */
        @NativeType("Bool")
        public boolean same_screen() { return XMotionEvent.nsame_screen(address()) != 0; }

        /** Sets the specified value to the {@link XMotionEvent#type} field. */
        public XMotionEvent.Buffer type(int value) { XMotionEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#serial} field. */
        public XMotionEvent.Buffer serial(@NativeType("unsigned long") long value) { XMotionEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#send_event} field. */
        public XMotionEvent.Buffer send_event(@NativeType("Bool") boolean value) { XMotionEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XMotionEvent#display} field. */
        public XMotionEvent.Buffer display(@NativeType("Display *") long value) { XMotionEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#window} field. */
        public XMotionEvent.Buffer window(@NativeType("Window") long value) { XMotionEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#root} field. */
        public XMotionEvent.Buffer root(@NativeType("Window") long value) { XMotionEvent.nroot(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#subwindow} field. */
        public XMotionEvent.Buffer subwindow(@NativeType("Window") long value) { XMotionEvent.nsubwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#time} field. */
        public XMotionEvent.Buffer time(@NativeType("Time") long value) { XMotionEvent.ntime(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#x} field. */
        public XMotionEvent.Buffer x(int value) { XMotionEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#y} field. */
        public XMotionEvent.Buffer y(int value) { XMotionEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#x_root} field. */
        public XMotionEvent.Buffer x_root(int value) { XMotionEvent.nx_root(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#y_root} field. */
        public XMotionEvent.Buffer y_root(int value) { XMotionEvent.ny_root(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#state} field. */
        public XMotionEvent.Buffer state(@NativeType("unsigned int") int value) { XMotionEvent.nstate(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#is_hint} field. */
        public XMotionEvent.Buffer is_hint(@NativeType("char") byte value) { XMotionEvent.nis_hint(address(), value); return this; }
        /** Sets the specified value to the {@link XMotionEvent#same_screen} field. */
        public XMotionEvent.Buffer same_screen(@NativeType("Bool") boolean value) { XMotionEvent.nsame_screen(address(), value ? 1 : 0); return this; }

    }

}