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
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XGravityEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window event;
 *     Window window;
 *     int x;
 *     int y;
 * }</code></pre>
 */
public class XGravityEvent extends Struct implements NativeResource {

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
        EVENT,
        WINDOW,
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
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
        EVENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
    }

    /**
     * Creates a {@code XGravityEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XGravityEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code event} field. */
    @NativeType("Window")
    public long event() { return nevent(address()); }
    /** Returns the value of the {@code window} field. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** Returns the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public int y() { return ny(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XGravityEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XGravityEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XGravityEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XGravityEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code event} field. */
    public XGravityEvent event(@NativeType("Window") long value) { nevent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XGravityEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XGravityEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XGravityEvent y(int value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XGravityEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long event,
        long window,
        int x,
        int y
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        event(event);
        window(window);
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XGravityEvent set(XGravityEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XGravityEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XGravityEvent malloc() {
        return wrap(XGravityEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XGravityEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XGravityEvent calloc() {
        return wrap(XGravityEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XGravityEvent} instance allocated with {@link BufferUtils}. */
    public static XGravityEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XGravityEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XGravityEvent} instance for the specified memory address. */
    public static XGravityEvent create(long address) {
        return wrap(XGravityEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGravityEvent createSafe(long address) {
        return address == NULL ? null : wrap(XGravityEvent.class, address);
    }

    /**
     * Returns a new {@link XGravityEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XGravityEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGravityEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XGravityEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGravityEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XGravityEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XGravityEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XGravityEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XGravityEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XGravityEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XGravityEvent mallocStack(MemoryStack stack) {
        return wrap(XGravityEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XGravityEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XGravityEvent callocStack(MemoryStack stack) {
        return wrap(XGravityEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XGravityEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XGravityEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XGravityEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGravityEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGravityEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XGravityEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XGravityEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XGravityEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XGravityEvent.DISPLAY); }
    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return memGetCLong(struct + XGravityEvent.EVENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XGravityEvent.WINDOW); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XGravityEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XGravityEvent.Y); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XGravityEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XGravityEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XGravityEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XGravityEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { memPutCLong(struct + XGravityEvent.EVENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XGravityEvent.WINDOW, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XGravityEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XGravityEvent.Y, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XGravityEvent.DISPLAY));
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

    /** An array of {@link XGravityEvent} structs. */
    public static class Buffer extends StructBuffer<XGravityEvent, Buffer> implements NativeResource {

        private static final XGravityEvent ELEMENT_FACTORY = XGravityEvent.create(-1L);

        /**
         * Creates a new {@code XGravityEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XGravityEvent#SIZEOF}, and its mark will be undefined.
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
        protected XGravityEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XGravityEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XGravityEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XGravityEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XGravityEvent.ndisplay(address()); }
        /** Returns the value of the {@code event} field. */
        @NativeType("Window")
        public long event() { return XGravityEvent.nevent(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XGravityEvent.nwindow(address()); }
        /** Returns the value of the {@code x} field. */
        public int x() { return XGravityEvent.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public int y() { return XGravityEvent.ny(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XGravityEvent.Buffer type(int value) { XGravityEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XGravityEvent.Buffer serial(@NativeType("unsigned long") long value) { XGravityEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XGravityEvent.Buffer send_event(@NativeType("Bool") boolean value) { XGravityEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XGravityEvent.Buffer display(@NativeType("Display *") long value) { XGravityEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code event} field. */
        public XGravityEvent.Buffer event(@NativeType("Window") long value) { XGravityEvent.nevent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XGravityEvent.Buffer window(@NativeType("Window") long value) { XGravityEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XGravityEvent.Buffer x(int value) { XGravityEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XGravityEvent.Buffer y(int value) { XGravityEvent.ny(address(), value); return this; }

    }

}