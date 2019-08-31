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
 * Key event.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; the event type. One of:<br><table><tr><td>{@link X11#KeyPress}</td><td>{@link X11#KeyRelease}</td></tr></table></li>
 * <li>{@code serial} &ndash; # of last request processed by server</li>
 * <li>{@code send_event} &ndash; true if this came from an {@link X11#XSendEvent} request</li>
 * <li>{@code display} &ndash; {@code Display} the event was read from</li>
 * <li>{@code window} &ndash; window it reported relative to</li>
 * <li>{@code root} &ndash; root window that the event occurred on</li>
 * <li>{@code subwindow} &ndash; child window</li>
 * <li>{@code time} &ndash; milliseconds</li>
 * <li>{@code x} &ndash; pointer x coordinate in event window</li>
 * <li>{@code y} &ndash; pointer y coordinate in event window</li>
 * <li>{@code x_root} &ndash; x coordinate relative to {@code root}</li>
 * <li>{@code y_root} &ndash; y coordinate relative to {@code root}</li>
 * <li>{@code state} &ndash; key mask</li>
 * <li>{@code keycode} &ndash; detail</li>
 * <li>{@code same_screen} &ndash; same screen flag</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XKeyEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window window;
 *     Window root;
 *     Window subwindow;
 *     Time time;
 *     int x;
 *     int y;
 *     int x_root;
 *     int y_root;
 *     unsigned int state;
 *     unsigned int keycode;
 *     Bool same_screen;
 * }</code></pre>
 */
public class XKeyEvent extends Struct implements NativeResource {

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
        KEYCODE,
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
        STATE = layout.offsetof(12);
        KEYCODE = layout.offsetof(13);
        SAME_SCREEN = layout.offsetof(14);
    }

    /**
     * Creates a {@code XKeyEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XKeyEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code serial} field. */
    @NativeType("unsigned long")
    public long serial() { return nserial(address()); }
    /** Returns the value of the {@code send_event} field. */
    @NativeType("Bool")
    public boolean send_event() { return nsend_event(address()) != 0; }
    /** Returns the value of the {@code display} field. */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** Returns the value of the {@code window} field. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** Returns the value of the {@code root} field. */
    @NativeType("Window")
    public long root() { return nroot(address()); }
    /** Returns the value of the {@code subwindow} field. */
    @NativeType("Window")
    public long subwindow() { return nsubwindow(address()); }
    /** Returns the value of the {@code time} field. */
    @NativeType("Time")
    public long time() { return ntime(address()); }
    /** Returns the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** Returns the value of the {@code x_root} field. */
    public int x_root() { return nx_root(address()); }
    /** Returns the value of the {@code y_root} field. */
    public int y_root() { return ny_root(address()); }
    /** Returns the value of the {@code state} field. */
    @NativeType("unsigned int")
    public int state() { return nstate(address()); }
    /** Returns the value of the {@code keycode} field. */
    @NativeType("unsigned int")
    public int keycode() { return nkeycode(address()); }
    /** Returns the value of the {@code same_screen} field. */
    @NativeType("Bool")
    public boolean same_screen() { return nsame_screen(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XKeyEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XKeyEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XKeyEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XKeyEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XKeyEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code root} field. */
    public XKeyEvent root(@NativeType("Window") long value) { nroot(address(), value); return this; }
    /** Sets the specified value to the {@code subwindow} field. */
    public XKeyEvent subwindow(@NativeType("Window") long value) { nsubwindow(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XKeyEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XKeyEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XKeyEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code x_root} field. */
    public XKeyEvent x_root(int value) { nx_root(address(), value); return this; }
    /** Sets the specified value to the {@code y_root} field. */
    public XKeyEvent y_root(int value) { ny_root(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public XKeyEvent state(@NativeType("unsigned int") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code keycode} field. */
    public XKeyEvent keycode(@NativeType("unsigned int") int value) { nkeycode(address(), value); return this; }
    /** Sets the specified value to the {@code same_screen} field. */
    public XKeyEvent same_screen(@NativeType("Bool") boolean value) { nsame_screen(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XKeyEvent set(
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
        int keycode,
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
        keycode(keycode);
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
    public XKeyEvent set(XKeyEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XKeyEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XKeyEvent malloc() {
        return wrap(XKeyEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XKeyEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XKeyEvent calloc() {
        return wrap(XKeyEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XKeyEvent} instance allocated with {@link BufferUtils}. */
    public static XKeyEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XKeyEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XKeyEvent} instance for the specified memory address. */
    public static XKeyEvent create(long address) {
        return wrap(XKeyEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XKeyEvent createSafe(long address) {
        return address == NULL ? null : wrap(XKeyEvent.class, address);
    }

    /**
     * Returns a new {@link XKeyEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XKeyEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XKeyEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XKeyEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XKeyEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XKeyEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XKeyEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XKeyEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XKeyEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XKeyEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XKeyEvent mallocStack(MemoryStack stack) {
        return wrap(XKeyEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XKeyEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XKeyEvent callocStack(MemoryStack stack) {
        return wrap(XKeyEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XKeyEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XKeyEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XKeyEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XKeyEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XKeyEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XKeyEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XKeyEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XKeyEvent.WINDOW); }
    /** Unsafe version of {@link #root}. */
    public static long nroot(long struct) { return memGetCLong(struct + XKeyEvent.ROOT); }
    /** Unsafe version of {@link #subwindow}. */
    public static long nsubwindow(long struct) { return memGetCLong(struct + XKeyEvent.SUBWINDOW); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XKeyEvent.TIME); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.Y); }
    /** Unsafe version of {@link #x_root}. */
    public static int nx_root(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.X_ROOT); }
    /** Unsafe version of {@link #y_root}. */
    public static int ny_root(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.Y_ROOT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.STATE); }
    /** Unsafe version of {@link #keycode}. */
    public static int nkeycode(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.KEYCODE); }
    /** Unsafe version of {@link #same_screen}. */
    public static int nsame_screen(long struct) { return UNSAFE.getInt(null, struct + XKeyEvent.SAME_SCREEN); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XKeyEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XKeyEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XKeyEvent.WINDOW, value); }
    /** Unsafe version of {@link #root(long) root}. */
    public static void nroot(long struct, long value) { memPutCLong(struct + XKeyEvent.ROOT, value); }
    /** Unsafe version of {@link #subwindow(long) subwindow}. */
    public static void nsubwindow(long struct, long value) { memPutCLong(struct + XKeyEvent.SUBWINDOW, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XKeyEvent.TIME, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.Y, value); }
    /** Unsafe version of {@link #x_root(int) x_root}. */
    public static void nx_root(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.X_ROOT, value); }
    /** Unsafe version of {@link #y_root(int) y_root}. */
    public static void ny_root(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.Y_ROOT, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.STATE, value); }
    /** Unsafe version of {@link #keycode(int) keycode}. */
    public static void nkeycode(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.KEYCODE, value); }
    /** Unsafe version of {@link #same_screen(boolean) same_screen}. */
    public static void nsame_screen(long struct, int value) { UNSAFE.putInt(null, struct + XKeyEvent.SAME_SCREEN, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XKeyEvent.DISPLAY));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XKeyEvent} structs. */
    public static class Buffer extends StructBuffer<XKeyEvent, Buffer> implements NativeResource {

        private static final XKeyEvent ELEMENT_FACTORY = XKeyEvent.create(-1L);

        /**
         * Creates a new {@code XKeyEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XKeyEvent#SIZEOF}, and its mark will be undefined.
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
        protected XKeyEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XKeyEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XKeyEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XKeyEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XKeyEvent.ndisplay(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XKeyEvent.nwindow(address()); }
        /** Returns the value of the {@code root} field. */
        @NativeType("Window")
        public long root() { return XKeyEvent.nroot(address()); }
        /** Returns the value of the {@code subwindow} field. */
        @NativeType("Window")
        public long subwindow() { return XKeyEvent.nsubwindow(address()); }
        /** Returns the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XKeyEvent.ntime(address()); }
        /** Returns the value of the {@code x} field. */
        public int x() { return XKeyEvent.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public int y() { return XKeyEvent.ny(address()); }
        /** Returns the value of the {@code x_root} field. */
        public int x_root() { return XKeyEvent.nx_root(address()); }
        /** Returns the value of the {@code y_root} field. */
        public int y_root() { return XKeyEvent.ny_root(address()); }
        /** Returns the value of the {@code state} field. */
        @NativeType("unsigned int")
        public int state() { return XKeyEvent.nstate(address()); }
        /** Returns the value of the {@code keycode} field. */
        @NativeType("unsigned int")
        public int keycode() { return XKeyEvent.nkeycode(address()); }
        /** Returns the value of the {@code same_screen} field. */
        @NativeType("Bool")
        public boolean same_screen() { return XKeyEvent.nsame_screen(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XKeyEvent.Buffer type(int value) { XKeyEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XKeyEvent.Buffer serial(@NativeType("unsigned long") long value) { XKeyEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XKeyEvent.Buffer send_event(@NativeType("Bool") boolean value) { XKeyEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XKeyEvent.Buffer display(@NativeType("Display *") long value) { XKeyEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XKeyEvent.Buffer window(@NativeType("Window") long value) { XKeyEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code root} field. */
        public XKeyEvent.Buffer root(@NativeType("Window") long value) { XKeyEvent.nroot(address(), value); return this; }
        /** Sets the specified value to the {@code subwindow} field. */
        public XKeyEvent.Buffer subwindow(@NativeType("Window") long value) { XKeyEvent.nsubwindow(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XKeyEvent.Buffer time(@NativeType("Time") long value) { XKeyEvent.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XKeyEvent.Buffer x(int value) { XKeyEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XKeyEvent.Buffer y(int value) { XKeyEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code x_root} field. */
        public XKeyEvent.Buffer x_root(int value) { XKeyEvent.nx_root(address(), value); return this; }
        /** Sets the specified value to the {@code y_root} field. */
        public XKeyEvent.Buffer y_root(int value) { XKeyEvent.ny_root(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public XKeyEvent.Buffer state(@NativeType("unsigned int") int value) { XKeyEvent.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code keycode} field. */
        public XKeyEvent.Buffer keycode(@NativeType("unsigned int") int value) { XKeyEvent.nkeycode(address(), value); return this; }
        /** Sets the specified value to the {@code same_screen} field. */
        public XKeyEvent.Buffer same_screen(@NativeType("Bool") boolean value) { XKeyEvent.nsame_screen(address(), value ? 1 : 0); return this; }

    }

}