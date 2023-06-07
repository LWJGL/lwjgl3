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
 * Error event.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XErrorEvent {
 *     int type;
 *     Display * {@link #display};
 *     XID {@link #resourceid};
 *     unsigned long {@link #serial};
 *     unsigned char {@link #error_code};
 *     unsigned char {@link #request_code};
 *     unsigned char {@link #minor_code};
 * }</code></pre>
 */
public class XErrorEvent extends Struct<XErrorEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DISPLAY,
        RESOURCEID,
        SERIAL,
        ERROR_CODE,
        REQUEST_CODE,
        MINOR_CODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DISPLAY = layout.offsetof(1);
        RESOURCEID = layout.offsetof(2);
        SERIAL = layout.offsetof(3);
        ERROR_CODE = layout.offsetof(4);
        REQUEST_CODE = layout.offsetof(5);
        MINOR_CODE = layout.offsetof(6);
    }

    protected XErrorEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XErrorEvent create(long address, @Nullable ByteBuffer container) {
        return new XErrorEvent(address, container);
    }

    /**
     * Creates a {@code XErrorEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XErrorEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** display the event was read from */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** resource id */
    @NativeType("XID")
    public long resourceid() { return nresourceid(address()); }
    /** serial number of failed request */
    @NativeType("unsigned long")
    public long serial() { return nserial(address()); }
    /** error code of failed request */
    @NativeType("unsigned char")
    public byte error_code() { return nerror_code(address()); }
    /** major op-code of failed request */
    @NativeType("unsigned char")
    public byte request_code() { return nrequest_code(address()); }
    /** minor op-code of failed request */
    @NativeType("unsigned char")
    public byte minor_code() { return nminor_code(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XErrorEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XErrorEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #resourceid} field. */
    public XErrorEvent resourceid(@NativeType("XID") long value) { nresourceid(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XErrorEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #error_code} field. */
    public XErrorEvent error_code(@NativeType("unsigned char") byte value) { nerror_code(address(), value); return this; }
    /** Sets the specified value to the {@link #request_code} field. */
    public XErrorEvent request_code(@NativeType("unsigned char") byte value) { nrequest_code(address(), value); return this; }
    /** Sets the specified value to the {@link #minor_code} field. */
    public XErrorEvent minor_code(@NativeType("unsigned char") byte value) { nminor_code(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XErrorEvent set(
        int type,
        long display,
        long resourceid,
        long serial,
        byte error_code,
        byte request_code,
        byte minor_code
    ) {
        type(type);
        display(display);
        resourceid(resourceid);
        serial(serial);
        error_code(error_code);
        request_code(request_code);
        minor_code(minor_code);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XErrorEvent set(XErrorEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XErrorEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XErrorEvent malloc() {
        return new XErrorEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XErrorEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XErrorEvent calloc() {
        return new XErrorEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XErrorEvent} instance allocated with {@link BufferUtils}. */
    public static XErrorEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XErrorEvent(memAddress(container), container);
    }

    /** Returns a new {@code XErrorEvent} instance for the specified memory address. */
    public static XErrorEvent create(long address) {
        return new XErrorEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XErrorEvent createSafe(long address) {
        return address == NULL ? null : new XErrorEvent(address, null);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XErrorEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XErrorEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XErrorEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XErrorEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XErrorEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XErrorEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XErrorEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XErrorEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XErrorEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XErrorEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XErrorEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XErrorEvent malloc(MemoryStack stack) {
        return new XErrorEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XErrorEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XErrorEvent calloc(MemoryStack stack) {
        return new XErrorEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XErrorEvent.TYPE); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XErrorEvent.DISPLAY); }
    /** Unsafe version of {@link #resourceid}. */
    public static long nresourceid(long struct) { return memGetCLong(struct + XErrorEvent.RESOURCEID); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XErrorEvent.SERIAL); }
    /** Unsafe version of {@link #error_code}. */
    public static byte nerror_code(long struct) { return UNSAFE.getByte(null, struct + XErrorEvent.ERROR_CODE); }
    /** Unsafe version of {@link #request_code}. */
    public static byte nrequest_code(long struct) { return UNSAFE.getByte(null, struct + XErrorEvent.REQUEST_CODE); }
    /** Unsafe version of {@link #minor_code}. */
    public static byte nminor_code(long struct) { return UNSAFE.getByte(null, struct + XErrorEvent.MINOR_CODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XErrorEvent.TYPE, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XErrorEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #resourceid(long) resourceid}. */
    public static void nresourceid(long struct, long value) { memPutCLong(struct + XErrorEvent.RESOURCEID, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XErrorEvent.SERIAL, value); }
    /** Unsafe version of {@link #error_code(byte) error_code}. */
    public static void nerror_code(long struct, byte value) { UNSAFE.putByte(null, struct + XErrorEvent.ERROR_CODE, value); }
    /** Unsafe version of {@link #request_code(byte) request_code}. */
    public static void nrequest_code(long struct, byte value) { UNSAFE.putByte(null, struct + XErrorEvent.REQUEST_CODE, value); }
    /** Unsafe version of {@link #minor_code(byte) minor_code}. */
    public static void nminor_code(long struct, byte value) { UNSAFE.putByte(null, struct + XErrorEvent.MINOR_CODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XErrorEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XErrorEvent} structs. */
    public static class Buffer extends StructBuffer<XErrorEvent, Buffer> implements NativeResource {

        private static final XErrorEvent ELEMENT_FACTORY = XErrorEvent.create(-1L);

        /**
         * Creates a new {@code XErrorEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XErrorEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XErrorEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XErrorEvent.ntype(address()); }
        /** @return the value of the {@link XErrorEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XErrorEvent.ndisplay(address()); }
        /** @return the value of the {@link XErrorEvent#resourceid} field. */
        @NativeType("XID")
        public long resourceid() { return XErrorEvent.nresourceid(address()); }
        /** @return the value of the {@link XErrorEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XErrorEvent.nserial(address()); }
        /** @return the value of the {@link XErrorEvent#error_code} field. */
        @NativeType("unsigned char")
        public byte error_code() { return XErrorEvent.nerror_code(address()); }
        /** @return the value of the {@link XErrorEvent#request_code} field. */
        @NativeType("unsigned char")
        public byte request_code() { return XErrorEvent.nrequest_code(address()); }
        /** @return the value of the {@link XErrorEvent#minor_code} field. */
        @NativeType("unsigned char")
        public byte minor_code() { return XErrorEvent.nminor_code(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XErrorEvent.Buffer type(int value) { XErrorEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XErrorEvent#display} field. */
        public XErrorEvent.Buffer display(@NativeType("Display *") long value) { XErrorEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XErrorEvent#resourceid} field. */
        public XErrorEvent.Buffer resourceid(@NativeType("XID") long value) { XErrorEvent.nresourceid(address(), value); return this; }
        /** Sets the specified value to the {@link XErrorEvent#serial} field. */
        public XErrorEvent.Buffer serial(@NativeType("unsigned long") long value) { XErrorEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XErrorEvent#error_code} field. */
        public XErrorEvent.Buffer error_code(@NativeType("unsigned char") byte value) { XErrorEvent.nerror_code(address(), value); return this; }
        /** Sets the specified value to the {@link XErrorEvent#request_code} field. */
        public XErrorEvent.Buffer request_code(@NativeType("unsigned char") byte value) { XErrorEvent.nrequest_code(address(), value); return this; }
        /** Sets the specified value to the {@link XErrorEvent#minor_code} field. */
        public XErrorEvent.Buffer minor_code(@NativeType("unsigned char") byte value) { XErrorEvent.nminor_code(address(), value); return this; }

    }

}