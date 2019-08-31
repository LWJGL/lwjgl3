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
 * struct XDestroyWindowEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window event;
 *     Window window;
 * }</code></pre>
 */
public class XDestroyWindowEvent extends Struct implements NativeResource {

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
        EVENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
    }

    /**
     * Creates a {@code XDestroyWindowEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XDestroyWindowEvent(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XDestroyWindowEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XDestroyWindowEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XDestroyWindowEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XDestroyWindowEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code event} field. */
    public XDestroyWindowEvent event(@NativeType("Window") long value) { nevent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XDestroyWindowEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XDestroyWindowEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long event,
        long window
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        event(event);
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
    public XDestroyWindowEvent set(XDestroyWindowEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XDestroyWindowEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XDestroyWindowEvent malloc() {
        return wrap(XDestroyWindowEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XDestroyWindowEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XDestroyWindowEvent calloc() {
        return wrap(XDestroyWindowEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XDestroyWindowEvent} instance allocated with {@link BufferUtils}. */
    public static XDestroyWindowEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XDestroyWindowEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XDestroyWindowEvent} instance for the specified memory address. */
    public static XDestroyWindowEvent create(long address) {
        return wrap(XDestroyWindowEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XDestroyWindowEvent createSafe(long address) {
        return address == NULL ? null : wrap(XDestroyWindowEvent.class, address);
    }

    /**
     * Returns a new {@link XDestroyWindowEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XDestroyWindowEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XDestroyWindowEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XDestroyWindowEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XDestroyWindowEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XDestroyWindowEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XDestroyWindowEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XDestroyWindowEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XDestroyWindowEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XDestroyWindowEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XDestroyWindowEvent mallocStack(MemoryStack stack) {
        return wrap(XDestroyWindowEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XDestroyWindowEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XDestroyWindowEvent callocStack(MemoryStack stack) {
        return wrap(XDestroyWindowEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XDestroyWindowEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XDestroyWindowEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XDestroyWindowEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XDestroyWindowEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XDestroyWindowEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XDestroyWindowEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XDestroyWindowEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XDestroyWindowEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XDestroyWindowEvent.DISPLAY); }
    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return memGetCLong(struct + XDestroyWindowEvent.EVENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XDestroyWindowEvent.WINDOW); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XDestroyWindowEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XDestroyWindowEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XDestroyWindowEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XDestroyWindowEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { memPutCLong(struct + XDestroyWindowEvent.EVENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XDestroyWindowEvent.WINDOW, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XDestroyWindowEvent.DISPLAY));
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

    /** An array of {@link XDestroyWindowEvent} structs. */
    public static class Buffer extends StructBuffer<XDestroyWindowEvent, Buffer> implements NativeResource {

        private static final XDestroyWindowEvent ELEMENT_FACTORY = XDestroyWindowEvent.create(-1L);

        /**
         * Creates a new {@code XDestroyWindowEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XDestroyWindowEvent#SIZEOF}, and its mark will be undefined.
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
        protected XDestroyWindowEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XDestroyWindowEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XDestroyWindowEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XDestroyWindowEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XDestroyWindowEvent.ndisplay(address()); }
        /** Returns the value of the {@code event} field. */
        @NativeType("Window")
        public long event() { return XDestroyWindowEvent.nevent(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XDestroyWindowEvent.nwindow(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XDestroyWindowEvent.Buffer type(int value) { XDestroyWindowEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XDestroyWindowEvent.Buffer serial(@NativeType("unsigned long") long value) { XDestroyWindowEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XDestroyWindowEvent.Buffer send_event(@NativeType("Bool") boolean value) { XDestroyWindowEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XDestroyWindowEvent.Buffer display(@NativeType("Display *") long value) { XDestroyWindowEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code event} field. */
        public XDestroyWindowEvent.Buffer event(@NativeType("Window") long value) { XDestroyWindowEvent.nevent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XDestroyWindowEvent.Buffer window(@NativeType("Window") long value) { XDestroyWindowEvent.nwindow(address(), value); return this; }

    }

}