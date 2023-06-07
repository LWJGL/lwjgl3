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
 * struct XMappingEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     int {@link #request};
 *     int {@link #first_keycode};
 *     int {@link #count};
 * }</code></pre>
 */
public class XMappingEvent extends Struct<XMappingEvent> implements NativeResource {

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
        REQUEST,
        FIRST_KEYCODE,
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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        REQUEST = layout.offsetof(5);
        FIRST_KEYCODE = layout.offsetof(6);
        COUNT = layout.offsetof(7);
    }

    protected XMappingEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XMappingEvent create(long address, @Nullable ByteBuffer container) {
        return new XMappingEvent(address, container);
    }

    /**
     * Creates a {@code XMappingEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XMappingEvent(ByteBuffer container) {
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
    /** one of:<br><table><tr><td>{@link X11#MappingModifier}</td><td>{@link X11#MappingKeyboard}</td><td>{@link X11#MappingPointer}</td></tr></table> */
    public int request() { return nrequest(address()); }
    /** first keycode */
    public int first_keycode() { return nfirst_keycode(address()); }
    /** defines range of change w. {@code first_keycode} */
    public int count() { return ncount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XMappingEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XMappingEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XMappingEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XMappingEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XMappingEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #request} field. */
    public XMappingEvent request(int value) { nrequest(address(), value); return this; }
    /** Sets the specified value to the {@link #first_keycode} field. */
    public XMappingEvent first_keycode(int value) { nfirst_keycode(address(), value); return this; }
    /** Sets the specified value to the {@link #count} field. */
    public XMappingEvent count(int value) { ncount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XMappingEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        int request,
        int first_keycode,
        int count
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        request(request);
        first_keycode(first_keycode);
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
    public XMappingEvent set(XMappingEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XMappingEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XMappingEvent malloc() {
        return new XMappingEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XMappingEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XMappingEvent calloc() {
        return new XMappingEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XMappingEvent} instance allocated with {@link BufferUtils}. */
    public static XMappingEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XMappingEvent(memAddress(container), container);
    }

    /** Returns a new {@code XMappingEvent} instance for the specified memory address. */
    public static XMappingEvent create(long address) {
        return new XMappingEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMappingEvent createSafe(long address) {
        return address == NULL ? null : new XMappingEvent(address, null);
    }

    /**
     * Returns a new {@link XMappingEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMappingEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XMappingEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMappingEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMappingEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XMappingEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XMappingEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XMappingEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMappingEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XMappingEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XMappingEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XMappingEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XMappingEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XMappingEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XMappingEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XMappingEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XMappingEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XMappingEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XMappingEvent malloc(MemoryStack stack) {
        return new XMappingEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XMappingEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XMappingEvent calloc(MemoryStack stack) {
        return new XMappingEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XMappingEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMappingEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMappingEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMappingEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XMappingEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XMappingEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XMappingEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XMappingEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XMappingEvent.WINDOW); }
    /** Unsafe version of {@link #request}. */
    public static int nrequest(long struct) { return UNSAFE.getInt(null, struct + XMappingEvent.REQUEST); }
    /** Unsafe version of {@link #first_keycode}. */
    public static int nfirst_keycode(long struct) { return UNSAFE.getInt(null, struct + XMappingEvent.FIRST_KEYCODE); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + XMappingEvent.COUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XMappingEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XMappingEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XMappingEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XMappingEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XMappingEvent.WINDOW, value); }
    /** Unsafe version of {@link #request(int) request}. */
    public static void nrequest(long struct, int value) { UNSAFE.putInt(null, struct + XMappingEvent.REQUEST, value); }
    /** Unsafe version of {@link #first_keycode(int) first_keycode}. */
    public static void nfirst_keycode(long struct, int value) { UNSAFE.putInt(null, struct + XMappingEvent.FIRST_KEYCODE, value); }
    /** Unsafe version of {@link #count(int) count}. */
    public static void ncount(long struct, int value) { UNSAFE.putInt(null, struct + XMappingEvent.COUNT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XMappingEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XMappingEvent} structs. */
    public static class Buffer extends StructBuffer<XMappingEvent, Buffer> implements NativeResource {

        private static final XMappingEvent ELEMENT_FACTORY = XMappingEvent.create(-1L);

        /**
         * Creates a new {@code XMappingEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XMappingEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XMappingEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XMappingEvent.ntype(address()); }
        /** @return the value of the {@link XMappingEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XMappingEvent.nserial(address()); }
        /** @return the value of the {@link XMappingEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XMappingEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XMappingEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XMappingEvent.ndisplay(address()); }
        /** @return the value of the {@link XMappingEvent#window} field. */
        @NativeType("Window")
        public long window() { return XMappingEvent.nwindow(address()); }
        /** @return the value of the {@link XMappingEvent#request} field. */
        public int request() { return XMappingEvent.nrequest(address()); }
        /** @return the value of the {@link XMappingEvent#first_keycode} field. */
        public int first_keycode() { return XMappingEvent.nfirst_keycode(address()); }
        /** @return the value of the {@link XMappingEvent#count} field. */
        public int count() { return XMappingEvent.ncount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XMappingEvent.Buffer type(int value) { XMappingEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XMappingEvent#serial} field. */
        public XMappingEvent.Buffer serial(@NativeType("unsigned long") long value) { XMappingEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XMappingEvent#send_event} field. */
        public XMappingEvent.Buffer send_event(@NativeType("Bool") boolean value) { XMappingEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XMappingEvent#display} field. */
        public XMappingEvent.Buffer display(@NativeType("Display *") long value) { XMappingEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XMappingEvent#window} field. */
        public XMappingEvent.Buffer window(@NativeType("Window") long value) { XMappingEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XMappingEvent#request} field. */
        public XMappingEvent.Buffer request(int value) { XMappingEvent.nrequest(address(), value); return this; }
        /** Sets the specified value to the {@link XMappingEvent#first_keycode} field. */
        public XMappingEvent.Buffer first_keycode(int value) { XMappingEvent.nfirst_keycode(address(), value); return this; }
        /** Sets the specified value to the {@link XMappingEvent#count} field. */
        public XMappingEvent.Buffer count(int value) { XMappingEvent.ncount(address(), value); return this; }

    }

}