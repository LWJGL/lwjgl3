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
 * struct XReparentEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window event;
 *     Window window;
 *     Window parent;
 *     int x;
 *     int y;
 *     int override_redirect;
 * }</code></pre>
 */
public class XReparentEvent extends Struct implements NativeResource {

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
        PARENT,
        X,
        Y,
        OVERRIDE_REDIRECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
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
        EVENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
        PARENT = layout.offsetof(6);
        X = layout.offsetof(7);
        Y = layout.offsetof(8);
        OVERRIDE_REDIRECT = layout.offsetof(9);
    }

    /**
     * Creates a {@code XReparentEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XReparentEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code parent} field. */
    @NativeType("Window")
    public long parent() { return nparent(address()); }
    /** Returns the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** Returns the value of the {@code override_redirect} field. */
    public int override_redirect() { return noverride_redirect(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XReparentEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XReparentEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XReparentEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XReparentEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code event} field. */
    public XReparentEvent event(@NativeType("Window") long value) { nevent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XReparentEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code parent} field. */
    public XReparentEvent parent(@NativeType("Window") long value) { nparent(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XReparentEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XReparentEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code override_redirect} field. */
    public XReparentEvent override_redirect(int value) { noverride_redirect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XReparentEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long event,
        long window,
        long parent,
        int x,
        int y,
        int override_redirect
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        event(event);
        window(window);
        parent(parent);
        x(x);
        y(y);
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
    public XReparentEvent set(XReparentEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XReparentEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XReparentEvent malloc() {
        return wrap(XReparentEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XReparentEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XReparentEvent calloc() {
        return wrap(XReparentEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XReparentEvent} instance allocated with {@link BufferUtils}. */
    public static XReparentEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XReparentEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XReparentEvent} instance for the specified memory address. */
    public static XReparentEvent create(long address) {
        return wrap(XReparentEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XReparentEvent createSafe(long address) {
        return address == NULL ? null : wrap(XReparentEvent.class, address);
    }

    /**
     * Returns a new {@link XReparentEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XReparentEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XReparentEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XReparentEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XReparentEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XReparentEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XReparentEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XReparentEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XReparentEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XReparentEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XReparentEvent mallocStack(MemoryStack stack) {
        return wrap(XReparentEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XReparentEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XReparentEvent callocStack(MemoryStack stack) {
        return wrap(XReparentEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XReparentEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XReparentEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XReparentEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XReparentEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XReparentEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XReparentEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XReparentEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XReparentEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XReparentEvent.DISPLAY); }
    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return memGetCLong(struct + XReparentEvent.EVENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XReparentEvent.WINDOW); }
    /** Unsafe version of {@link #parent}. */
    public static long nparent(long struct) { return memGetCLong(struct + XReparentEvent.PARENT); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XReparentEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XReparentEvent.Y); }
    /** Unsafe version of {@link #override_redirect}. */
    public static int noverride_redirect(long struct) { return UNSAFE.getInt(null, struct + XReparentEvent.OVERRIDE_REDIRECT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XReparentEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XReparentEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XReparentEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XReparentEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { memPutCLong(struct + XReparentEvent.EVENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XReparentEvent.WINDOW, value); }
    /** Unsafe version of {@link #parent(long) parent}. */
    public static void nparent(long struct, long value) { memPutCLong(struct + XReparentEvent.PARENT, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XReparentEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XReparentEvent.Y, value); }
    /** Unsafe version of {@link #override_redirect(int) override_redirect}. */
    public static void noverride_redirect(long struct, int value) { UNSAFE.putInt(null, struct + XReparentEvent.OVERRIDE_REDIRECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XReparentEvent.DISPLAY));
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

    /** An array of {@link XReparentEvent} structs. */
    public static class Buffer extends StructBuffer<XReparentEvent, Buffer> implements NativeResource {

        private static final XReparentEvent ELEMENT_FACTORY = XReparentEvent.create(-1L);

        /**
         * Creates a new {@code XReparentEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XReparentEvent#SIZEOF}, and its mark will be undefined.
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
        protected XReparentEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XReparentEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XReparentEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XReparentEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XReparentEvent.ndisplay(address()); }
        /** Returns the value of the {@code event} field. */
        @NativeType("Window")
        public long event() { return XReparentEvent.nevent(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XReparentEvent.nwindow(address()); }
        /** Returns the value of the {@code parent} field. */
        @NativeType("Window")
        public long parent() { return XReparentEvent.nparent(address()); }
        /** Returns the value of the {@code x} field. */
        public int x() { return XReparentEvent.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public int y() { return XReparentEvent.ny(address()); }
        /** Returns the value of the {@code override_redirect} field. */
        public int override_redirect() { return XReparentEvent.noverride_redirect(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XReparentEvent.Buffer type(int value) { XReparentEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XReparentEvent.Buffer serial(@NativeType("unsigned long") long value) { XReparentEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XReparentEvent.Buffer send_event(@NativeType("Bool") boolean value) { XReparentEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XReparentEvent.Buffer display(@NativeType("Display *") long value) { XReparentEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code event} field. */
        public XReparentEvent.Buffer event(@NativeType("Window") long value) { XReparentEvent.nevent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XReparentEvent.Buffer window(@NativeType("Window") long value) { XReparentEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code parent} field. */
        public XReparentEvent.Buffer parent(@NativeType("Window") long value) { XReparentEvent.nparent(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XReparentEvent.Buffer x(int value) { XReparentEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XReparentEvent.Buffer y(int value) { XReparentEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code override_redirect} field. */
        public XReparentEvent.Buffer override_redirect(int value) { XReparentEvent.noverride_redirect(address(), value); return this; }

    }

}