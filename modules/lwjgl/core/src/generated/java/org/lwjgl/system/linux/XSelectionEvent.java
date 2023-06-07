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
 * Selection event structure.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XSelectionEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window requestor;
 *     Atom selection;
 *     Atom target;
 *     Atom {@link #property};
 *     Time time;
 * }</code></pre>
 */
public class XSelectionEvent extends Struct<XSelectionEvent> implements NativeResource {

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
        REQUESTOR,
        SELECTION,
        TARGET,
        PROPERTY,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
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
        REQUESTOR = layout.offsetof(4);
        SELECTION = layout.offsetof(5);
        TARGET = layout.offsetof(6);
        PROPERTY = layout.offsetof(7);
        TIME = layout.offsetof(8);
    }

    protected XSelectionEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XSelectionEvent create(long address, @Nullable ByteBuffer container) {
        return new XSelectionEvent(address, container);
    }

    /**
     * Creates a {@code XSelectionEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XSelectionEvent(ByteBuffer container) {
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
    /** @return the value of the {@code requestor} field. */
    @NativeType("Window")
    public long requestor() { return nrequestor(address()); }
    /** @return the value of the {@code selection} field. */
    @NativeType("Atom")
    public long selection() { return nselection(address()); }
    /** @return the value of the {@code target} field. */
    @NativeType("Atom")
    public long target() { return ntarget(address()); }
    /** atom or {@link X11#None} */
    @NativeType("Atom")
    public long property() { return nproperty(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("Time")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XSelectionEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XSelectionEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XSelectionEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XSelectionEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code requestor} field. */
    public XSelectionEvent requestor(@NativeType("Window") long value) { nrequestor(address(), value); return this; }
    /** Sets the specified value to the {@code selection} field. */
    public XSelectionEvent selection(@NativeType("Atom") long value) { nselection(address(), value); return this; }
    /** Sets the specified value to the {@code target} field. */
    public XSelectionEvent target(@NativeType("Atom") long value) { ntarget(address(), value); return this; }
    /** Sets the specified value to the {@link #property} field. */
    public XSelectionEvent property(@NativeType("Atom") long value) { nproperty(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XSelectionEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XSelectionEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long requestor,
        long selection,
        long target,
        long property,
        long time
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        requestor(requestor);
        selection(selection);
        target(target);
        property(property);
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
    public XSelectionEvent set(XSelectionEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XSelectionEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XSelectionEvent malloc() {
        return new XSelectionEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XSelectionEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XSelectionEvent calloc() {
        return new XSelectionEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XSelectionEvent} instance allocated with {@link BufferUtils}. */
    public static XSelectionEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XSelectionEvent(memAddress(container), container);
    }

    /** Returns a new {@code XSelectionEvent} instance for the specified memory address. */
    public static XSelectionEvent create(long address) {
        return new XSelectionEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionEvent createSafe(long address) {
        return address == NULL ? null : new XSelectionEvent(address, null);
    }

    /**
     * Returns a new {@link XSelectionEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XSelectionEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XSelectionEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XSelectionEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XSelectionEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionEvent malloc(MemoryStack stack) {
        return new XSelectionEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XSelectionEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionEvent calloc(MemoryStack stack) {
        return new XSelectionEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XSelectionEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XSelectionEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XSelectionEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XSelectionEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XSelectionEvent.DISPLAY); }
    /** Unsafe version of {@link #requestor}. */
    public static long nrequestor(long struct) { return memGetCLong(struct + XSelectionEvent.REQUESTOR); }
    /** Unsafe version of {@link #selection}. */
    public static long nselection(long struct) { return memGetCLong(struct + XSelectionEvent.SELECTION); }
    /** Unsafe version of {@link #target}. */
    public static long ntarget(long struct) { return memGetCLong(struct + XSelectionEvent.TARGET); }
    /** Unsafe version of {@link #property}. */
    public static long nproperty(long struct) { return memGetCLong(struct + XSelectionEvent.PROPERTY); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XSelectionEvent.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XSelectionEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XSelectionEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XSelectionEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XSelectionEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #requestor(long) requestor}. */
    public static void nrequestor(long struct, long value) { memPutCLong(struct + XSelectionEvent.REQUESTOR, value); }
    /** Unsafe version of {@link #selection(long) selection}. */
    public static void nselection(long struct, long value) { memPutCLong(struct + XSelectionEvent.SELECTION, value); }
    /** Unsafe version of {@link #target(long) target}. */
    public static void ntarget(long struct, long value) { memPutCLong(struct + XSelectionEvent.TARGET, value); }
    /** Unsafe version of {@link #property(long) property}. */
    public static void nproperty(long struct, long value) { memPutCLong(struct + XSelectionEvent.PROPERTY, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XSelectionEvent.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XSelectionEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XSelectionEvent} structs. */
    public static class Buffer extends StructBuffer<XSelectionEvent, Buffer> implements NativeResource {

        private static final XSelectionEvent ELEMENT_FACTORY = XSelectionEvent.create(-1L);

        /**
         * Creates a new {@code XSelectionEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XSelectionEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XSelectionEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XSelectionEvent.ntype(address()); }
        /** @return the value of the {@link XSelectionEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XSelectionEvent.nserial(address()); }
        /** @return the value of the {@link XSelectionEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XSelectionEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XSelectionEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XSelectionEvent.ndisplay(address()); }
        /** @return the value of the {@code requestor} field. */
        @NativeType("Window")
        public long requestor() { return XSelectionEvent.nrequestor(address()); }
        /** @return the value of the {@code selection} field. */
        @NativeType("Atom")
        public long selection() { return XSelectionEvent.nselection(address()); }
        /** @return the value of the {@code target} field. */
        @NativeType("Atom")
        public long target() { return XSelectionEvent.ntarget(address()); }
        /** @return the value of the {@link XSelectionEvent#property} field. */
        @NativeType("Atom")
        public long property() { return XSelectionEvent.nproperty(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XSelectionEvent.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XSelectionEvent.Buffer type(int value) { XSelectionEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionEvent#serial} field. */
        public XSelectionEvent.Buffer serial(@NativeType("unsigned long") long value) { XSelectionEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionEvent#send_event} field. */
        public XSelectionEvent.Buffer send_event(@NativeType("Bool") boolean value) { XSelectionEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XSelectionEvent#display} field. */
        public XSelectionEvent.Buffer display(@NativeType("Display *") long value) { XSelectionEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code requestor} field. */
        public XSelectionEvent.Buffer requestor(@NativeType("Window") long value) { XSelectionEvent.nrequestor(address(), value); return this; }
        /** Sets the specified value to the {@code selection} field. */
        public XSelectionEvent.Buffer selection(@NativeType("Atom") long value) { XSelectionEvent.nselection(address(), value); return this; }
        /** Sets the specified value to the {@code target} field. */
        public XSelectionEvent.Buffer target(@NativeType("Atom") long value) { XSelectionEvent.ntarget(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionEvent#property} field. */
        public XSelectionEvent.Buffer property(@NativeType("Atom") long value) { XSelectionEvent.nproperty(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XSelectionEvent.Buffer time(@NativeType("Time") long value) { XSelectionEvent.ntime(address(), value); return this; }

    }

}