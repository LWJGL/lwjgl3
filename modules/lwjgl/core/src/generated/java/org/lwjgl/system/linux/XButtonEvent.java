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
 * Button event.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; the event type. One of:<br><table><tr><td>{@link X11#ButtonPress}</td><td>{@link X11#ButtonRelease}</td></tr></table></li>
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
 * <li>{@code state} &ndash; button mask</li>
 * <li>{@code button} &ndash; detail</li>
 * <li>{@code same_screen} &ndash; same screen flag</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XButtonEvent {
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
 *     unsigned int button;
 *     Bool same_screen;
 * }</code></pre>
 */
public class XButtonEvent extends Struct implements NativeResource {

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
        BUTTON,
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
        BUTTON = layout.offsetof(13);
        SAME_SCREEN = layout.offsetof(14);
    }

    /**
     * Creates a {@code XButtonEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XButtonEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code button} field. */
    @NativeType("unsigned int")
    public int button() { return nbutton(address()); }
    /** Returns the value of the {@code same_screen} field. */
    @NativeType("Bool")
    public boolean same_screen() { return nsame_screen(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XButtonEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XButtonEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XButtonEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XButtonEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XButtonEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code root} field. */
    public XButtonEvent root(@NativeType("Window") long value) { nroot(address(), value); return this; }
    /** Sets the specified value to the {@code subwindow} field. */
    public XButtonEvent subwindow(@NativeType("Window") long value) { nsubwindow(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XButtonEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XButtonEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XButtonEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code x_root} field. */
    public XButtonEvent x_root(int value) { nx_root(address(), value); return this; }
    /** Sets the specified value to the {@code y_root} field. */
    public XButtonEvent y_root(int value) { ny_root(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public XButtonEvent state(@NativeType("unsigned int") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public XButtonEvent button(@NativeType("unsigned int") int value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code same_screen} field. */
    public XButtonEvent same_screen(@NativeType("Bool") boolean value) { nsame_screen(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XButtonEvent set(
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
        int button,
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
        button(button);
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
    public XButtonEvent set(XButtonEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XButtonEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XButtonEvent malloc() {
        return wrap(XButtonEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XButtonEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XButtonEvent calloc() {
        return wrap(XButtonEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XButtonEvent} instance allocated with {@link BufferUtils}. */
    public static XButtonEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XButtonEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XButtonEvent} instance for the specified memory address. */
    public static XButtonEvent create(long address) {
        return wrap(XButtonEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XButtonEvent createSafe(long address) {
        return address == NULL ? null : wrap(XButtonEvent.class, address);
    }

    /**
     * Returns a new {@link XButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XButtonEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XButtonEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XButtonEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XButtonEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XButtonEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XButtonEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XButtonEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XButtonEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XButtonEvent mallocStack(MemoryStack stack) {
        return wrap(XButtonEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XButtonEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XButtonEvent callocStack(MemoryStack stack) {
        return wrap(XButtonEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XButtonEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XButtonEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XButtonEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XButtonEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XButtonEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XButtonEvent.WINDOW); }
    /** Unsafe version of {@link #root}. */
    public static long nroot(long struct) { return memGetCLong(struct + XButtonEvent.ROOT); }
    /** Unsafe version of {@link #subwindow}. */
    public static long nsubwindow(long struct) { return memGetCLong(struct + XButtonEvent.SUBWINDOW); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XButtonEvent.TIME); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.Y); }
    /** Unsafe version of {@link #x_root}. */
    public static int nx_root(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.X_ROOT); }
    /** Unsafe version of {@link #y_root}. */
    public static int ny_root(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.Y_ROOT); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.STATE); }
    /** Unsafe version of {@link #button}. */
    public static int nbutton(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.BUTTON); }
    /** Unsafe version of {@link #same_screen}. */
    public static int nsame_screen(long struct) { return UNSAFE.getInt(null, struct + XButtonEvent.SAME_SCREEN); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XButtonEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XButtonEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XButtonEvent.WINDOW, value); }
    /** Unsafe version of {@link #root(long) root}. */
    public static void nroot(long struct, long value) { memPutCLong(struct + XButtonEvent.ROOT, value); }
    /** Unsafe version of {@link #subwindow(long) subwindow}. */
    public static void nsubwindow(long struct, long value) { memPutCLong(struct + XButtonEvent.SUBWINDOW, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XButtonEvent.TIME, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.Y, value); }
    /** Unsafe version of {@link #x_root(int) x_root}. */
    public static void nx_root(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.X_ROOT, value); }
    /** Unsafe version of {@link #y_root(int) y_root}. */
    public static void ny_root(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.Y_ROOT, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.STATE, value); }
    /** Unsafe version of {@link #button(int) button}. */
    public static void nbutton(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.BUTTON, value); }
    /** Unsafe version of {@link #same_screen(boolean) same_screen}. */
    public static void nsame_screen(long struct, int value) { UNSAFE.putInt(null, struct + XButtonEvent.SAME_SCREEN, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XButtonEvent.DISPLAY));
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

    /** An array of {@link XButtonEvent} structs. */
    public static class Buffer extends StructBuffer<XButtonEvent, Buffer> implements NativeResource {

        private static final XButtonEvent ELEMENT_FACTORY = XButtonEvent.create(-1L);

        /**
         * Creates a new {@code XButtonEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XButtonEvent#SIZEOF}, and its mark will be undefined.
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
        protected XButtonEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XButtonEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XButtonEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XButtonEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XButtonEvent.ndisplay(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XButtonEvent.nwindow(address()); }
        /** Returns the value of the {@code root} field. */
        @NativeType("Window")
        public long root() { return XButtonEvent.nroot(address()); }
        /** Returns the value of the {@code subwindow} field. */
        @NativeType("Window")
        public long subwindow() { return XButtonEvent.nsubwindow(address()); }
        /** Returns the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XButtonEvent.ntime(address()); }
        /** Returns the value of the {@code x} field. */
        public int x() { return XButtonEvent.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public int y() { return XButtonEvent.ny(address()); }
        /** Returns the value of the {@code x_root} field. */
        public int x_root() { return XButtonEvent.nx_root(address()); }
        /** Returns the value of the {@code y_root} field. */
        public int y_root() { return XButtonEvent.ny_root(address()); }
        /** Returns the value of the {@code state} field. */
        @NativeType("unsigned int")
        public int state() { return XButtonEvent.nstate(address()); }
        /** Returns the value of the {@code button} field. */
        @NativeType("unsigned int")
        public int button() { return XButtonEvent.nbutton(address()); }
        /** Returns the value of the {@code same_screen} field. */
        @NativeType("Bool")
        public boolean same_screen() { return XButtonEvent.nsame_screen(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XButtonEvent.Buffer type(int value) { XButtonEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XButtonEvent.Buffer serial(@NativeType("unsigned long") long value) { XButtonEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XButtonEvent.Buffer send_event(@NativeType("Bool") boolean value) { XButtonEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XButtonEvent.Buffer display(@NativeType("Display *") long value) { XButtonEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XButtonEvent.Buffer window(@NativeType("Window") long value) { XButtonEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code root} field. */
        public XButtonEvent.Buffer root(@NativeType("Window") long value) { XButtonEvent.nroot(address(), value); return this; }
        /** Sets the specified value to the {@code subwindow} field. */
        public XButtonEvent.Buffer subwindow(@NativeType("Window") long value) { XButtonEvent.nsubwindow(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XButtonEvent.Buffer time(@NativeType("Time") long value) { XButtonEvent.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XButtonEvent.Buffer x(int value) { XButtonEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XButtonEvent.Buffer y(int value) { XButtonEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code x_root} field. */
        public XButtonEvent.Buffer x_root(int value) { XButtonEvent.nx_root(address(), value); return this; }
        /** Sets the specified value to the {@code y_root} field. */
        public XButtonEvent.Buffer y_root(int value) { XButtonEvent.ny_root(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public XButtonEvent.Buffer state(@NativeType("unsigned int") int value) { XButtonEvent.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public XButtonEvent.Buffer button(@NativeType("unsigned int") int value) { XButtonEvent.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code same_screen} field. */
        public XButtonEvent.Buffer same_screen(@NativeType("Bool") boolean value) { XButtonEvent.nsame_screen(address(), value ? 1 : 0); return this; }

    }

}