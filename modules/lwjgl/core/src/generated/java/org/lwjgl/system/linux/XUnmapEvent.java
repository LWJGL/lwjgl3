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
 * struct XUnmapEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window event;
 *     Window window;
 *     int from_configure;
 * }</code></pre>
 */
public class XUnmapEvent extends Struct implements NativeResource {

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
        FROM_CONFIGURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
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
        FROM_CONFIGURE = layout.offsetof(6);
    }

    /**
     * Creates a {@code XUnmapEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XUnmapEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code from_configure} field. */
    public int from_configure() { return nfrom_configure(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XUnmapEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XUnmapEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XUnmapEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XUnmapEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code event} field. */
    public XUnmapEvent event(@NativeType("Window") long value) { nevent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XUnmapEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code from_configure} field. */
    public XUnmapEvent from_configure(int value) { nfrom_configure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XUnmapEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long event,
        long window,
        int from_configure
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        event(event);
        window(window);
        from_configure(from_configure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XUnmapEvent set(XUnmapEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XUnmapEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XUnmapEvent malloc() {
        return wrap(XUnmapEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XUnmapEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XUnmapEvent calloc() {
        return wrap(XUnmapEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XUnmapEvent} instance allocated with {@link BufferUtils}. */
    public static XUnmapEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XUnmapEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XUnmapEvent} instance for the specified memory address. */
    public static XUnmapEvent create(long address) {
        return wrap(XUnmapEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XUnmapEvent createSafe(long address) {
        return address == NULL ? null : wrap(XUnmapEvent.class, address);
    }

    /**
     * Returns a new {@link XUnmapEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XUnmapEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XUnmapEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XUnmapEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XUnmapEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XUnmapEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XUnmapEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XUnmapEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XUnmapEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XUnmapEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XUnmapEvent mallocStack(MemoryStack stack) {
        return wrap(XUnmapEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XUnmapEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XUnmapEvent callocStack(MemoryStack stack) {
        return wrap(XUnmapEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XUnmapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XUnmapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XUnmapEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XUnmapEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XUnmapEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XUnmapEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XUnmapEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XUnmapEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XUnmapEvent.DISPLAY); }
    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return memGetCLong(struct + XUnmapEvent.EVENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XUnmapEvent.WINDOW); }
    /** Unsafe version of {@link #from_configure}. */
    public static int nfrom_configure(long struct) { return UNSAFE.getInt(null, struct + XUnmapEvent.FROM_CONFIGURE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XUnmapEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XUnmapEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XUnmapEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XUnmapEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { memPutCLong(struct + XUnmapEvent.EVENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XUnmapEvent.WINDOW, value); }
    /** Unsafe version of {@link #from_configure(int) from_configure}. */
    public static void nfrom_configure(long struct, int value) { UNSAFE.putInt(null, struct + XUnmapEvent.FROM_CONFIGURE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XUnmapEvent.DISPLAY));
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

    /** An array of {@link XUnmapEvent} structs. */
    public static class Buffer extends StructBuffer<XUnmapEvent, Buffer> implements NativeResource {

        private static final XUnmapEvent ELEMENT_FACTORY = XUnmapEvent.create(-1L);

        /**
         * Creates a new {@code XUnmapEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XUnmapEvent#SIZEOF}, and its mark will be undefined.
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
        protected XUnmapEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XUnmapEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XUnmapEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XUnmapEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XUnmapEvent.ndisplay(address()); }
        /** Returns the value of the {@code event} field. */
        @NativeType("Window")
        public long event() { return XUnmapEvent.nevent(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XUnmapEvent.nwindow(address()); }
        /** Returns the value of the {@code from_configure} field. */
        public int from_configure() { return XUnmapEvent.nfrom_configure(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XUnmapEvent.Buffer type(int value) { XUnmapEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XUnmapEvent.Buffer serial(@NativeType("unsigned long") long value) { XUnmapEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XUnmapEvent.Buffer send_event(@NativeType("Bool") boolean value) { XUnmapEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XUnmapEvent.Buffer display(@NativeType("Display *") long value) { XUnmapEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code event} field. */
        public XUnmapEvent.Buffer event(@NativeType("Window") long value) { XUnmapEvent.nevent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XUnmapEvent.Buffer window(@NativeType("Window") long value) { XUnmapEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code from_configure} field. */
        public XUnmapEvent.Buffer from_configure(int value) { XUnmapEvent.nfrom_configure(address(), value); return this; }

    }

}