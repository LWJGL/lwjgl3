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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code serial} &ndash; # of last request processed by server</li>
 * <li>{@code send_event} &ndash; true if this came from an {@link X11#XSendEvent} request</li>
 * <li>{@code display} &ndash; {@code Display} the event was read from</li>
 * <li>{@code window} &ndash; window it reported relative to</li>
 * <li>{@code count} &ndash; if non-zero, at least this many more</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XExposeEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window window;
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int count;
 * }</code></pre>
 */
public class XExposeEvent extends Struct implements NativeResource {

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
        COUNT;

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
        COUNT = layout.offsetof(9);
    }

    /**
     * Creates a {@code XExposeEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XExposeEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** Returns the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** Returns the value of the {@code count} field. */
    public int count() { return ncount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XExposeEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XExposeEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XExposeEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XExposeEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XExposeEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XExposeEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XExposeEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public XExposeEvent width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XExposeEvent height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code count} field. */
    public XExposeEvent count(int value) { ncount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XExposeEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        int x,
        int y,
        int width,
        int height,
        int count
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
        count(count);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XExposeEvent set(XExposeEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XExposeEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XExposeEvent malloc() {
        return wrap(XExposeEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XExposeEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XExposeEvent calloc() {
        return wrap(XExposeEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XExposeEvent} instance allocated with {@link BufferUtils}. */
    public static XExposeEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XExposeEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XExposeEvent} instance for the specified memory address. */
    public static XExposeEvent create(long address) {
        return wrap(XExposeEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XExposeEvent createSafe(long address) {
        return address == NULL ? null : wrap(XExposeEvent.class, address);
    }

    /**
     * Returns a new {@link XExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XExposeEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XExposeEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XExposeEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XExposeEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XExposeEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XExposeEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XExposeEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XExposeEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XExposeEvent mallocStack(MemoryStack stack) {
        return wrap(XExposeEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XExposeEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XExposeEvent callocStack(MemoryStack stack) {
        return wrap(XExposeEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XExposeEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XExposeEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XExposeEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XExposeEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XExposeEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XExposeEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XExposeEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XExposeEvent.WINDOW); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XExposeEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XExposeEvent.Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XExposeEvent.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XExposeEvent.HEIGHT); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + XExposeEvent.COUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XExposeEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XExposeEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XExposeEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XExposeEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XExposeEvent.WINDOW, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XExposeEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XExposeEvent.Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + XExposeEvent.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + XExposeEvent.HEIGHT, value); }
    /** Unsafe version of {@link #count(int) count}. */
    public static void ncount(long struct, int value) { UNSAFE.putInt(null, struct + XExposeEvent.COUNT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XExposeEvent.DISPLAY));
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

    /** An array of {@link XExposeEvent} structs. */
    public static class Buffer extends StructBuffer<XExposeEvent, Buffer> implements NativeResource {

        private static final XExposeEvent ELEMENT_FACTORY = XExposeEvent.create(-1L);

        /**
         * Creates a new {@code XExposeEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XExposeEvent#SIZEOF}, and its mark will be undefined.
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
        protected XExposeEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XExposeEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XExposeEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XExposeEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XExposeEvent.ndisplay(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XExposeEvent.nwindow(address()); }
        /** Returns the value of the {@code x} field. */
        public int x() { return XExposeEvent.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public int y() { return XExposeEvent.ny(address()); }
        /** Returns the value of the {@code width} field. */
        public int width() { return XExposeEvent.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        public int height() { return XExposeEvent.nheight(address()); }
        /** Returns the value of the {@code count} field. */
        public int count() { return XExposeEvent.ncount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XExposeEvent.Buffer type(int value) { XExposeEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XExposeEvent.Buffer serial(@NativeType("unsigned long") long value) { XExposeEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XExposeEvent.Buffer send_event(@NativeType("Bool") boolean value) { XExposeEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XExposeEvent.Buffer display(@NativeType("Display *") long value) { XExposeEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XExposeEvent.Buffer window(@NativeType("Window") long value) { XExposeEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XExposeEvent.Buffer x(int value) { XExposeEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XExposeEvent.Buffer y(int value) { XExposeEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public XExposeEvent.Buffer width(int value) { XExposeEvent.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XExposeEvent.Buffer height(int value) { XExposeEvent.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code count} field. */
        public XExposeEvent.Buffer count(int value) { XExposeEvent.ncount(address(), value); return this; }

    }

}