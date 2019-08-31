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
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XSelectionClearEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window window;
 *     Atom selection;
 *     Time time;
 * }</code></pre>
 */
public class XSelectionClearEvent extends Struct implements NativeResource {

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
    /** Returns the value of the {@code selection} field. */
    @NativeType("Atom")
    public long selection() { return nselection(address()); }
    /** Returns the value of the {@code time} field. */
    @NativeType("Time")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XSelectionClearEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XSelectionClearEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XSelectionClearEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XSelectionClearEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
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
        return wrap(XSelectionClearEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XSelectionClearEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XSelectionClearEvent calloc() {
        return wrap(XSelectionClearEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XSelectionClearEvent} instance allocated with {@link BufferUtils}. */
    public static XSelectionClearEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XSelectionClearEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XSelectionClearEvent} instance for the specified memory address. */
    public static XSelectionClearEvent create(long address) {
        return wrap(XSelectionClearEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionClearEvent createSafe(long address) {
        return address == NULL ? null : wrap(XSelectionClearEvent.class, address);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XSelectionClearEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionClearEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XSelectionClearEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XSelectionClearEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XSelectionClearEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XSelectionClearEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XSelectionClearEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionClearEvent mallocStack(MemoryStack stack) {
        return wrap(XSelectionClearEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XSelectionClearEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionClearEvent callocStack(MemoryStack stack) {
        return wrap(XSelectionClearEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionClearEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionClearEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /** An array of {@link XSelectionClearEvent} structs. */
    public static class Buffer extends StructBuffer<XSelectionClearEvent, Buffer> implements NativeResource {

        private static final XSelectionClearEvent ELEMENT_FACTORY = XSelectionClearEvent.create(-1L);

        /**
         * Creates a new {@code XSelectionClearEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XSelectionClearEvent#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code type} field. */
        public int type() { return XSelectionClearEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XSelectionClearEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XSelectionClearEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XSelectionClearEvent.ndisplay(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XSelectionClearEvent.nwindow(address()); }
        /** Returns the value of the {@code selection} field. */
        @NativeType("Atom")
        public long selection() { return XSelectionClearEvent.nselection(address()); }
        /** Returns the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XSelectionClearEvent.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XSelectionClearEvent.Buffer type(int value) { XSelectionClearEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XSelectionClearEvent.Buffer serial(@NativeType("unsigned long") long value) { XSelectionClearEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XSelectionClearEvent.Buffer send_event(@NativeType("Bool") boolean value) { XSelectionClearEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XSelectionClearEvent.Buffer display(@NativeType("Display *") long value) { XSelectionClearEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XSelectionClearEvent.Buffer window(@NativeType("Window") long value) { XSelectionClearEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code selection} field. */
        public XSelectionClearEvent.Buffer selection(@NativeType("Atom") long value) { XSelectionClearEvent.nselection(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XSelectionClearEvent.Buffer time(@NativeType("Time") long value) { XSelectionClearEvent.ntime(address(), value); return this; }

    }

}