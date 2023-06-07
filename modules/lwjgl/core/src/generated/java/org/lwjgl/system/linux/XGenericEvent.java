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
 * GenericEvent. This event is the standard event for all newer extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XGenericEvent {
 *     int {@link #type};
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     int {@link #extension};
 *     int {@link #evtype};
 * }</code></pre>
 */
public class XGenericEvent extends Struct<XGenericEvent> implements NativeResource {

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
        EVTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        EXTENSION = layout.offsetof(4);
        EVTYPE = layout.offsetof(5);
    }

    protected XGenericEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XGenericEvent create(long address, @Nullable ByteBuffer container) {
        return new XGenericEvent(address, container);
    }

    /**
     * Creates a {@code XGenericEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XGenericEvent(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #type} field. */
    public XGenericEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XGenericEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XGenericEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XGenericEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #extension} field. */
    public XGenericEvent extension(int value) { nextension(address(), value); return this; }
    /** Sets the specified value to the {@link #evtype} field. */
    public XGenericEvent evtype(int value) { nevtype(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XGenericEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        int extension,
        int evtype
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        extension(extension);
        evtype(evtype);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XGenericEvent set(XGenericEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XGenericEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XGenericEvent malloc() {
        return new XGenericEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XGenericEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XGenericEvent calloc() {
        return new XGenericEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XGenericEvent} instance allocated with {@link BufferUtils}. */
    public static XGenericEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XGenericEvent(memAddress(container), container);
    }

    /** Returns a new {@code XGenericEvent} instance for the specified memory address. */
    public static XGenericEvent create(long address) {
        return new XGenericEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGenericEvent createSafe(long address) {
        return address == NULL ? null : new XGenericEvent(address, null);
    }

    /**
     * Returns a new {@link XGenericEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGenericEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XGenericEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGenericEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGenericEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XGenericEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XGenericEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XGenericEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGenericEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XGenericEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XGenericEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XGenericEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XGenericEvent malloc(MemoryStack stack) {
        return new XGenericEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XGenericEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XGenericEvent calloc(MemoryStack stack) {
        return new XGenericEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XGenericEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGenericEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGenericEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGenericEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XGenericEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XGenericEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XGenericEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XGenericEvent.DISPLAY); }
    /** Unsafe version of {@link #extension}. */
    public static int nextension(long struct) { return UNSAFE.getInt(null, struct + XGenericEvent.EXTENSION); }
    /** Unsafe version of {@link #evtype}. */
    public static int nevtype(long struct) { return UNSAFE.getInt(null, struct + XGenericEvent.EVTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XGenericEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XGenericEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #extension(int) extension}. */
    public static void nextension(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEvent.EXTENSION, value); }
    /** Unsafe version of {@link #evtype(int) evtype}. */
    public static void nevtype(long struct, int value) { UNSAFE.putInt(null, struct + XGenericEvent.EVTYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XGenericEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XGenericEvent} structs. */
    public static class Buffer extends StructBuffer<XGenericEvent, Buffer> implements NativeResource {

        private static final XGenericEvent ELEMENT_FACTORY = XGenericEvent.create(-1L);

        /**
         * Creates a new {@code XGenericEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XGenericEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XGenericEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XGenericEvent#type} field. */
        public int type() { return XGenericEvent.ntype(address()); }
        /** @return the value of the {@link XGenericEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XGenericEvent.nserial(address()); }
        /** @return the value of the {@link XGenericEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XGenericEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XGenericEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XGenericEvent.ndisplay(address()); }
        /** @return the value of the {@link XGenericEvent#extension} field. */
        public int extension() { return XGenericEvent.nextension(address()); }
        /** @return the value of the {@link XGenericEvent#evtype} field. */
        public int evtype() { return XGenericEvent.nevtype(address()); }

        /** Sets the specified value to the {@link XGenericEvent#type} field. */
        public XGenericEvent.Buffer type(int value) { XGenericEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEvent#serial} field. */
        public XGenericEvent.Buffer serial(@NativeType("unsigned long") long value) { XGenericEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEvent#send_event} field. */
        public XGenericEvent.Buffer send_event(@NativeType("Bool") boolean value) { XGenericEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XGenericEvent#display} field. */
        public XGenericEvent.Buffer display(@NativeType("Display *") long value) { XGenericEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEvent#extension} field. */
        public XGenericEvent.Buffer extension(int value) { XGenericEvent.nextension(address(), value); return this; }
        /** Sets the specified value to the {@link XGenericEvent#evtype} field. */
        public XGenericEvent.Buffer evtype(int value) { XGenericEvent.nevtype(address(), value); return this; }

    }

}