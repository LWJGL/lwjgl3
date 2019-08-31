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
 * struct XMapRequestEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window parent;
 *     Window window;
 * }</code></pre>
 */
public class XMapRequestEvent extends Struct implements NativeResource {

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
        PARENT,
        WINDOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        PARENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
    }

    /**
     * Creates a {@code XMapRequestEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XMapRequestEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code parent} field. */
    @NativeType("Window")
    public long parent() { return nparent(address()); }
    /** Returns the value of the {@code window} field. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XMapRequestEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XMapRequestEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XMapRequestEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XMapRequestEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code parent} field. */
    public XMapRequestEvent parent(@NativeType("Window") long value) { nparent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XMapRequestEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XMapRequestEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long parent,
        long window
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        parent(parent);
        window(window);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XMapRequestEvent set(XMapRequestEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XMapRequestEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XMapRequestEvent malloc() {
        return wrap(XMapRequestEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XMapRequestEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XMapRequestEvent calloc() {
        return wrap(XMapRequestEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XMapRequestEvent} instance allocated with {@link BufferUtils}. */
    public static XMapRequestEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XMapRequestEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XMapRequestEvent} instance for the specified memory address. */
    public static XMapRequestEvent create(long address) {
        return wrap(XMapRequestEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMapRequestEvent createSafe(long address) {
        return address == NULL ? null : wrap(XMapRequestEvent.class, address);
    }

    /**
     * Returns a new {@link XMapRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XMapRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMapRequestEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XMapRequestEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMapRequestEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XMapRequestEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XMapRequestEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XMapRequestEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XMapRequestEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XMapRequestEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XMapRequestEvent mallocStack(MemoryStack stack) {
        return wrap(XMapRequestEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XMapRequestEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XMapRequestEvent callocStack(MemoryStack stack) {
        return wrap(XMapRequestEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XMapRequestEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XMapRequestEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XMapRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMapRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMapRequestEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XMapRequestEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XMapRequestEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XMapRequestEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XMapRequestEvent.DISPLAY); }
    /** Unsafe version of {@link #parent}. */
    public static long nparent(long struct) { return memGetCLong(struct + XMapRequestEvent.PARENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XMapRequestEvent.WINDOW); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XMapRequestEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XMapRequestEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XMapRequestEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XMapRequestEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #parent(long) parent}. */
    public static void nparent(long struct, long value) { memPutCLong(struct + XMapRequestEvent.PARENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XMapRequestEvent.WINDOW, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XMapRequestEvent.DISPLAY));
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

    /** An array of {@link XMapRequestEvent} structs. */
    public static class Buffer extends StructBuffer<XMapRequestEvent, Buffer> implements NativeResource {

        private static final XMapRequestEvent ELEMENT_FACTORY = XMapRequestEvent.create(-1L);

        /**
         * Creates a new {@code XMapRequestEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XMapRequestEvent#SIZEOF}, and its mark will be undefined.
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
        protected XMapRequestEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XMapRequestEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XMapRequestEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XMapRequestEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XMapRequestEvent.ndisplay(address()); }
        /** Returns the value of the {@code parent} field. */
        @NativeType("Window")
        public long parent() { return XMapRequestEvent.nparent(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XMapRequestEvent.nwindow(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XMapRequestEvent.Buffer type(int value) { XMapRequestEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XMapRequestEvent.Buffer serial(@NativeType("unsigned long") long value) { XMapRequestEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XMapRequestEvent.Buffer send_event(@NativeType("Bool") boolean value) { XMapRequestEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XMapRequestEvent.Buffer display(@NativeType("Display *") long value) { XMapRequestEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code parent} field. */
        public XMapRequestEvent.Buffer parent(@NativeType("Window") long value) { XMapRequestEvent.nparent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XMapRequestEvent.Buffer window(@NativeType("Window") long value) { XMapRequestEvent.nwindow(address(), value); return this; }

    }

}