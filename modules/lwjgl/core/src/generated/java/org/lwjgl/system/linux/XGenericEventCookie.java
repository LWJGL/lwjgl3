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
 * Additional information for an {@code XGenericEvent}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XGenericEventCookie {
 *     int {@link #type};
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     int {@link #extension};
 *     int {@link #evtype};
 *     unsigned int cookie;
 *     void * data;
 * }</code></pre>
 */
public class XGenericEventCookie extends Struct implements NativeResource {

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
        EXTENSION,
        EVTYPE,
        COOKIE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        EXTENSION = layout.offsetof(4);
        EVTYPE = layout.offsetof(5);
        COOKIE = layout.offsetof(6);
        DATA = layout.offsetof(7);
    }

    /**
     * Creates a {@code XGenericEventCookie} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XGenericEventCookie(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** of event. Must be:<br><table><tr><td>{@link X11#GenericEvent}</td></tr></table> */
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
    /** major opcode of extension that caused the event */
    public int extension() { return nextension(address()); }
    /** actual event type */
    public int evtype() { return nevtype(address()); }
    /** @return the value of the {@code cookie} field. */
    @NativeType("unsigned int")
    public int cookie() { return ncookie(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer data(int capacity) { return ndata(address(), capacity); }

    /** Sets the specified value to the {@link #type} field. */
    public XGenericEventCookie type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XGenericEventCookie serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XGenericEventCookie send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XGenericEventCookie display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #extension} field. */
    public XGenericEventCookie extension(int value) { nextension(address(), value); return this; }
    /** Sets the specified value to the {@link #evtype} field. */
    public XGenericEventCookie evtype(int value) { nevtype(address(), value); return this; }
    /** Sets the specified value to the {@code cookie} field. */
    public XGenericEventCookie cookie(@NativeType("unsigned int") int value) { ncookie(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
    public XGenericEventCookie data(@NativeType("void *") ByteBuffer value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XGenericEventCookie set(
        int type,
        long serial,
        boolean send_event,
        long display,
        int extension,
        int evtype,
        int cookie,
        ByteBuffer data
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        extension(extension);
        evtype(evtype);
        cookie(cookie);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XGenericEventCookie set(XGenericEventCookie src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XGenericEventCookie} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XGenericEventCookie malloc() {
        return wrap(XGenericEventCookie.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XGenericEventCookie} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XGenericEventCookie calloc() {
        return wrap(XGenericEventCookie.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XGenericEventCookie} instance allocated with {@link BufferUtils}. */
    public static XGenericEventCookie create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XGenericEventCookie.class, memAddress(container), container);
    }

    /** Returns a new {@code XGenericEventCookie} instance for the specified memory address. */
    public static XGenericEventCookie create(long address) {
        return wrap(XGenericEventCookie.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGenericEventCookie createSafe(long address) {
        return address == NULL ? null : wrap(XGenericEventCookie.class, address);
    }

    /**
     * Returns a new {@link XGenericEventCookie.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGenericEventCookie.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XGenericEventCookie.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGenericEventCookie.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGenericEventCookie.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XGenericEventCookie.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XGenericEventCookie.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XGenericEventCookie.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGenericEventCookie.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEventCookie.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XGenericEventCookie} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XGenericEventCookie malloc(MemoryStack stack) {
        return wrap(XGenericEventCookie.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XGenericEventCookie} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XGenericEventCookie calloc(MemoryStack stack) {
        return wrap(XGenericEventCookie.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XGenericEventCookie.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGenericEventCookie.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGenericEventCookie.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGenericEventCookie.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XGenericEventCookie.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XGenericEventCookie.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XGenericEventCookie.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XGenericEventCookie.DISPLAY); }
    /** Unsafe version of {@link #extension}. */
    public static int nextension(long struct) { return UNSAFE.getInt(null, struct + XGenericEventCookie.EXTENSION); }
    /** Unsafe version of {@link #evtype}. */
    public static int nevtype(long struct) { return UNSAFE.getInt(null, struct + XGenericEventCookie.EVTYPE); }
    /** Unsafe version of {@link #cookie}. */
    public static int ncookie(long struct) { return UNSAFE.getInt(null, struct + XGenericEventCookie.COOKIE); }
    /** Unsafe version of {@link #data(int) data}. */
    public static ByteBuffer ndata(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + XGenericEventCookie.DATA), capacity); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEventCookie.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XGenericEventCookie.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEventCookie.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XGenericEventCookie.DISPLAY, check(value)); }
    /** Unsafe version of {@link #extension(int) extension}. */
    public static void nextension(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEventCookie.EXTENSION, value); }
    /** Unsafe version of {@link #evtype(int) evtype}. */
    public static void nevtype(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEventCookie.EVTYPE, value); }
    /** Unsafe version of {@link #cookie(int) cookie}. */
    public static void ncookie(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEventCookie.COOKIE, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + XGenericEventCookie.DATA, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XGenericEventCookie.DISPLAY));
        check(memGetAddress(struct + XGenericEventCookie.DATA));
    }

    // -----------------------------------

    /** An array of {@link XGenericEventCookie} structs. */
    public static class Buffer extends StructBuffer<XGenericEventCookie, Buffer> implements NativeResource {

        private static final XGenericEventCookie ELEMENT_FACTORY = XGenericEventCookie.create(-1L);

        /**
         * Creates a new {@code XGenericEventCookie.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XGenericEventCookie#SIZEOF}, and its mark will be undefined.
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
        protected XGenericEventCookie getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XGenericEventCookie#type} field. */
        public int type() { return XGenericEventCookie.ntype(address()); }
        /** @return the value of the {@link XGenericEventCookie#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XGenericEventCookie.nserial(address()); }
        /** @return the value of the {@link XGenericEventCookie#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XGenericEventCookie.nsend_event(address()) != 0; }
        /** @return the value of the {@link XGenericEventCookie#display} field. */
        @NativeType("Display *")
        public long display() { return XGenericEventCookie.ndisplay(address()); }
        /** @return the value of the {@link XGenericEventCookie#extension} field. */
        public int extension() { return XGenericEventCookie.nextension(address()); }
        /** @return the value of the {@link XGenericEventCookie#evtype} field. */
        public int evtype() { return XGenericEventCookie.nevtype(address()); }
        /** @return the value of the {@code cookie} field. */
        @NativeType("unsigned int")
        public int cookie() { return XGenericEventCookie.ncookie(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer data(int capacity) { return XGenericEventCookie.ndata(address(), capacity); }

        /** Sets the specified value to the {@link XGenericEventCookie#type} field. */
        public XGenericEventCookie.Buffer type(int value) { XGenericEventCookie.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEventCookie#serial} field. */
        public XGenericEventCookie.Buffer serial(@NativeType("unsigned long") long value) { XGenericEventCookie.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEventCookie#send_event} field. */
        public XGenericEventCookie.Buffer send_event(@NativeType("Bool") boolean value) { XGenericEventCookie.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XGenericEventCookie#display} field. */
        public XGenericEventCookie.Buffer display(@NativeType("Display *") long value) { XGenericEventCookie.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEventCookie#extension} field. */
        public XGenericEventCookie.Buffer extension(int value) { XGenericEventCookie.nextension(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEventCookie#evtype} field. */
        public XGenericEventCookie.Buffer evtype(int value) { XGenericEventCookie.nevtype(address(), value); return this; }
        /** Sets the specified value to the {@code cookie} field. */
        public XGenericEventCookie.Buffer cookie(@NativeType("unsigned int") int value) { XGenericEventCookie.ncookie(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code data} field. */
        public XGenericEventCookie.Buffer data(@NativeType("void *") ByteBuffer value) { XGenericEventCookie.ndata(address(), value); return this; }

    }

}