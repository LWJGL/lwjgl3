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
 * struct XSelectionClearEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     Atom selection;
 *     Time time;
 * }</code></pre>
 */
public class XSelectionClearEvent extends Struct<XSelectionClearEvent> implements NativeResource {

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
        SELECTION,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        SELECTION = layout.offsetof(5);
        TIME = layout.offsetof(6);
    }

    protected XSelectionClearEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XSelectionClearEvent create(long address, @Nullable ByteBuffer container) {
        return new XSelectionClearEvent(address, container);
    }

    /**
     * Creates a {@code XSelectionClearEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XSelectionClearEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
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
    /** @return the value of the {@code selection} field. */
    @NativeType("Atom")
    public long selection() { return nselection(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("Time")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XSelectionClearEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XSelectionClearEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XSelectionClearEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XSelectionClearEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XSelectionClearEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code selection} field. */
    public XSelectionClearEvent selection(@NativeType("Atom") long value) { nselection(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XSelectionClearEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XSelectionClearEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        long selection,
        long time
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        selection(selection);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XSelectionClearEvent set(XSelectionClearEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XSelectionClearEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XSelectionClearEvent malloc() {
        return new XSelectionClearEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XSelectionClearEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XSelectionClearEvent calloc() {
        return new XSelectionClearEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XSelectionClearEvent} instance allocated with {@link BufferUtils}. */
    public static XSelectionClearEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XSelectionClearEvent(memAddress(container), container);
    }

    /** Returns a new {@code XSelectionClearEvent} instance for the specified memory address. */
    public static XSelectionClearEvent create(long address) {
        return new XSelectionClearEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionClearEvent createSafe(long address) {
        return address == NULL ? null : new XSelectionClearEvent(address, null);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XSelectionClearEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionClearEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionClearEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XSelectionClearEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionClearEvent malloc(MemoryStack stack) {
        return new XSelectionClearEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XSelectionClearEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionClearEvent calloc(MemoryStack stack) {
        return new XSelectionClearEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XSelectionClearEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XSelectionClearEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XSelectionClearEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XSelectionClearEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XSelectionClearEvent.WINDOW); }
    /** Unsafe version of {@link #selection}. */
    public static long nselection(long struct) { return memGetCLong(struct + XSelectionClearEvent.SELECTION); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XSelectionClearEvent.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XSelectionClearEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XSelectionClearEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XSelectionClearEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XSelectionClearEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XSelectionClearEvent.WINDOW, value); }
    /** Unsafe version of {@link #selection(long) selection}. */
    public static void nselection(long struct, long value) { memPutCLong(struct + XSelectionClearEvent.SELECTION, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XSelectionClearEvent.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XSelectionClearEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XSelectionClearEvent} structs. */
    public static class Buffer extends StructBuffer<XSelectionClearEvent, Buffer> implements NativeResource {

        private static final XSelectionClearEvent ELEMENT_FACTORY = XSelectionClearEvent.create(-1L);

        /**
         * Creates a new {@code XSelectionClearEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XSelectionClearEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XSelectionClearEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XSelectionClearEvent.ntype(address()); }
        /** @return the value of the {@link XSelectionClearEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XSelectionClearEvent.nserial(address()); }
        /** @return the value of the {@link XSelectionClearEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XSelectionClearEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XSelectionClearEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XSelectionClearEvent.ndisplay(address()); }
        /** @return the value of the {@link XSelectionClearEvent#window} field. */
        @NativeType("Window")
        public long window() { return XSelectionClearEvent.nwindow(address()); }
        /** @return the value of the {@code selection} field. */
        @NativeType("Atom")
        public long selection() { return XSelectionClearEvent.nselection(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XSelectionClearEvent.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XSelectionClearEvent.Buffer type(int value) { XSelectionClearEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionClearEvent#serial} field. */
        public XSelectionClearEvent.Buffer serial(@NativeType("unsigned long") long value) { XSelectionClearEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionClearEvent#send_event} field. */
        public XSelectionClearEvent.Buffer send_event(@NativeType("Bool") boolean value) { XSelectionClearEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XSelectionClearEvent#display} field. */
        public XSelectionClearEvent.Buffer display(@NativeType("Display *") long value) { XSelectionClearEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionClearEvent#window} field. */
        public XSelectionClearEvent.Buffer window(@NativeType("Window") long value) { XSelectionClearEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code selection} field. */
        public XSelectionClearEvent.Buffer selection(@NativeType("Atom") long value) { XSelectionClearEvent.nselection(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XSelectionClearEvent.Buffer time(@NativeType("Time") long value) { XSelectionClearEvent.ntime(address(), value); return this; }

    }

}