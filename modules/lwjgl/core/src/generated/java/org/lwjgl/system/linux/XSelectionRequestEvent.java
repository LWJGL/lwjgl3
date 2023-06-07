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
 * SelectionRequest event structure.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XSelectionRequestEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window owner;
 *     Window requestor;
 *     Atom selection;
 *     Atom target;
 *     Atom property;
 *     Time time;
 * }</code></pre>
 */
public class XSelectionRequestEvent extends Struct<XSelectionRequestEvent> implements NativeResource {

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
        OWNER,
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
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        OWNER = layout.offsetof(4);
        REQUESTOR = layout.offsetof(5);
        SELECTION = layout.offsetof(6);
        TARGET = layout.offsetof(7);
        PROPERTY = layout.offsetof(8);
        TIME = layout.offsetof(9);
    }

    protected XSelectionRequestEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XSelectionRequestEvent create(long address, @Nullable ByteBuffer container) {
        return new XSelectionRequestEvent(address, container);
    }

    /**
     * Creates a {@code XSelectionRequestEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XSelectionRequestEvent(ByteBuffer container) {
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
    /** @return the value of the {@code owner} field. */
    @NativeType("Window")
    public long owner() { return nowner(address()); }
    /** @return the value of the {@code requestor} field. */
    @NativeType("Window")
    public long requestor() { return nrequestor(address()); }
    /** @return the value of the {@code selection} field. */
    @NativeType("Atom")
    public long selection() { return nselection(address()); }
    /** @return the value of the {@code target} field. */
    @NativeType("Atom")
    public long target() { return ntarget(address()); }
    /** @return the value of the {@code property} field. */
    @NativeType("Atom")
    public long property() { return nproperty(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("Time")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XSelectionRequestEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XSelectionRequestEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XSelectionRequestEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XSelectionRequestEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code owner} field. */
    public XSelectionRequestEvent owner(@NativeType("Window") long value) { nowner(address(), value); return this; }
    /** Sets the specified value to the {@code requestor} field. */
    public XSelectionRequestEvent requestor(@NativeType("Window") long value) { nrequestor(address(), value); return this; }
    /** Sets the specified value to the {@code selection} field. */
    public XSelectionRequestEvent selection(@NativeType("Atom") long value) { nselection(address(), value); return this; }
    /** Sets the specified value to the {@code target} field. */
    public XSelectionRequestEvent target(@NativeType("Atom") long value) { ntarget(address(), value); return this; }
    /** Sets the specified value to the {@code property} field. */
    public XSelectionRequestEvent property(@NativeType("Atom") long value) { nproperty(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XSelectionRequestEvent time(@NativeType("Time") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XSelectionRequestEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long owner,
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
        owner(owner);
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
    public XSelectionRequestEvent set(XSelectionRequestEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XSelectionRequestEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XSelectionRequestEvent malloc() {
        return new XSelectionRequestEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XSelectionRequestEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XSelectionRequestEvent calloc() {
        return new XSelectionRequestEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XSelectionRequestEvent} instance allocated with {@link BufferUtils}. */
    public static XSelectionRequestEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XSelectionRequestEvent(memAddress(container), container);
    }

    /** Returns a new {@code XSelectionRequestEvent} instance for the specified memory address. */
    public static XSelectionRequestEvent create(long address) {
        return new XSelectionRequestEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionRequestEvent createSafe(long address) {
        return address == NULL ? null : new XSelectionRequestEvent(address, null);
    }

    /**
     * Returns a new {@link XSelectionRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionRequestEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XSelectionRequestEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionRequestEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionRequestEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XSelectionRequestEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XSelectionRequestEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XSelectionRequestEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XSelectionRequestEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XSelectionRequestEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XSelectionRequestEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionRequestEvent malloc(MemoryStack stack) {
        return new XSelectionRequestEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XSelectionRequestEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XSelectionRequestEvent calloc(MemoryStack stack) {
        return new XSelectionRequestEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XSelectionRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionRequestEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XSelectionRequestEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XSelectionRequestEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XSelectionRequestEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XSelectionRequestEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XSelectionRequestEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XSelectionRequestEvent.DISPLAY); }
    /** Unsafe version of {@link #owner}. */
    public static long nowner(long struct) { return memGetCLong(struct + XSelectionRequestEvent.OWNER); }
    /** Unsafe version of {@link #requestor}. */
    public static long nrequestor(long struct) { return memGetCLong(struct + XSelectionRequestEvent.REQUESTOR); }
    /** Unsafe version of {@link #selection}. */
    public static long nselection(long struct) { return memGetCLong(struct + XSelectionRequestEvent.SELECTION); }
    /** Unsafe version of {@link #target}. */
    public static long ntarget(long struct) { return memGetCLong(struct + XSelectionRequestEvent.TARGET); }
    /** Unsafe version of {@link #property}. */
    public static long nproperty(long struct) { return memGetCLong(struct + XSelectionRequestEvent.PROPERTY); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetCLong(struct + XSelectionRequestEvent.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XSelectionRequestEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XSelectionRequestEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XSelectionRequestEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XSelectionRequestEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #owner(long) owner}. */
    public static void nowner(long struct, long value) { memPutCLong(struct + XSelectionRequestEvent.OWNER, value); }
    /** Unsafe version of {@link #requestor(long) requestor}. */
    public static void nrequestor(long struct, long value) { memPutCLong(struct + XSelectionRequestEvent.REQUESTOR, value); }
    /** Unsafe version of {@link #selection(long) selection}. */
    public static void nselection(long struct, long value) { memPutCLong(struct + XSelectionRequestEvent.SELECTION, value); }
    /** Unsafe version of {@link #target(long) target}. */
    public static void ntarget(long struct, long value) { memPutCLong(struct + XSelectionRequestEvent.TARGET, value); }
    /** Unsafe version of {@link #property(long) property}. */
    public static void nproperty(long struct, long value) { memPutCLong(struct + XSelectionRequestEvent.PROPERTY, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutCLong(struct + XSelectionRequestEvent.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XSelectionRequestEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XSelectionRequestEvent} structs. */
    public static class Buffer extends StructBuffer<XSelectionRequestEvent, Buffer> implements NativeResource {

        private static final XSelectionRequestEvent ELEMENT_FACTORY = XSelectionRequestEvent.create(-1L);

        /**
         * Creates a new {@code XSelectionRequestEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XSelectionRequestEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XSelectionRequestEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XSelectionRequestEvent.ntype(address()); }
        /** @return the value of the {@link XSelectionRequestEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XSelectionRequestEvent.nserial(address()); }
        /** @return the value of the {@link XSelectionRequestEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XSelectionRequestEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XSelectionRequestEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XSelectionRequestEvent.ndisplay(address()); }
        /** @return the value of the {@code owner} field. */
        @NativeType("Window")
        public long owner() { return XSelectionRequestEvent.nowner(address()); }
        /** @return the value of the {@code requestor} field. */
        @NativeType("Window")
        public long requestor() { return XSelectionRequestEvent.nrequestor(address()); }
        /** @return the value of the {@code selection} field. */
        @NativeType("Atom")
        public long selection() { return XSelectionRequestEvent.nselection(address()); }
        /** @return the value of the {@code target} field. */
        @NativeType("Atom")
        public long target() { return XSelectionRequestEvent.ntarget(address()); }
        /** @return the value of the {@code property} field. */
        @NativeType("Atom")
        public long property() { return XSelectionRequestEvent.nproperty(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("Time")
        public long time() { return XSelectionRequestEvent.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XSelectionRequestEvent.Buffer type(int value) { XSelectionRequestEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionRequestEvent#serial} field. */
        public XSelectionRequestEvent.Buffer serial(@NativeType("unsigned long") long value) { XSelectionRequestEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XSelectionRequestEvent#send_event} field. */
        public XSelectionRequestEvent.Buffer send_event(@NativeType("Bool") boolean value) { XSelectionRequestEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XSelectionRequestEvent#display} field. */
        public XSelectionRequestEvent.Buffer display(@NativeType("Display *") long value) { XSelectionRequestEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code owner} field. */
        public XSelectionRequestEvent.Buffer owner(@NativeType("Window") long value) { XSelectionRequestEvent.nowner(address(), value); return this; }
        /** Sets the specified value to the {@code requestor} field. */
        public XSelectionRequestEvent.Buffer requestor(@NativeType("Window") long value) { XSelectionRequestEvent.nrequestor(address(), value); return this; }
        /** Sets the specified value to the {@code selection} field. */
        public XSelectionRequestEvent.Buffer selection(@NativeType("Atom") long value) { XSelectionRequestEvent.nselection(address(), value); return this; }
        /** Sets the specified value to the {@code target} field. */
        public XSelectionRequestEvent.Buffer target(@NativeType("Atom") long value) { XSelectionRequestEvent.ntarget(address(), value); return this; }
        /** Sets the specified value to the {@code property} field. */
        public XSelectionRequestEvent.Buffer property(@NativeType("Atom") long value) { XSelectionRequestEvent.nproperty(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XSelectionRequestEvent.Buffer time(@NativeType("Time") long value) { XSelectionRequestEvent.ntime(address(), value); return this; }

    }

}