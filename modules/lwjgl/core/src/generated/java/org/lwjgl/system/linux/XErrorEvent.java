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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code display} &ndash; display the event was read from</li>
 * <li>{@code resourceid} &ndash; resource id</li>
 * <li>{@code serial} &ndash; serial number of failed request</li>
 * <li>{@code error_code} &ndash; error code of failed request</li>
 * <li>{@code request_code} &ndash; major op-code of failed request</li>
 * <li>{@code minor_code} &ndash; minor op-code of failed request</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XErrorEvent {
 *     int type;
 *     Display * display;
 *     XID resourceid;
 *     unsigned long serial;
 *     unsigned char error_code;
 *     unsigned char request_code;
 *     unsigned char minor_code;
 * }</code></pre>
 */
public class XErrorEvent extends Struct implements NativeResource {

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

    /** Returns the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code display} field. */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** Returns the value of the {@code resourceid} field. */
    @NativeType("XID")
    public long resourceid() { return nresourceid(address()); }
    /** Returns the value of the {@code serial} field. */
    @NativeType("unsigned long")
    public long serial() { return nserial(address()); }
    /** Returns the value of the {@code error_code} field. */
    @NativeType("unsigned char")
    public byte error_code() { return nerror_code(address()); }
    /** Returns the value of the {@code request_code} field. */
    @NativeType("unsigned char")
    public byte request_code() { return nrequest_code(address()); }
    /** Returns the value of the {@code minor_code} field. */
    @NativeType("unsigned char")
    public byte minor_code() { return nminor_code(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XErrorEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XErrorEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code resourceid} field. */
    public XErrorEvent resourceid(@NativeType("XID") long value) { nresourceid(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XErrorEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code error_code} field. */
    public XErrorEvent error_code(@NativeType("unsigned char") byte value) { nerror_code(address(), value); return this; }
    /** Sets the specified value to the {@code request_code} field. */
    public XErrorEvent request_code(@NativeType("unsigned char") byte value) { nrequest_code(address(), value); return this; }
    /** Sets the specified value to the {@code minor_code} field. */
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
        return wrap(XErrorEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XErrorEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XErrorEvent calloc() {
        return wrap(XErrorEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XErrorEvent} instance allocated with {@link BufferUtils}. */
    public static XErrorEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XErrorEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XErrorEvent} instance for the specified memory address. */
    public static XErrorEvent create(long address) {
        return wrap(XErrorEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XErrorEvent createSafe(long address) {
        return address == NULL ? null : wrap(XErrorEvent.class, address);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XErrorEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XErrorEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XErrorEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XErrorEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XErrorEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XErrorEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XErrorEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XErrorEvent mallocStack(MemoryStack stack) {
        return wrap(XErrorEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XErrorEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XErrorEvent callocStack(MemoryStack stack) {
        return wrap(XErrorEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XErrorEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XErrorEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /** An array of {@link XErrorEvent} structs. */
    public static class Buffer extends StructBuffer<XErrorEvent, Buffer> implements NativeResource {

        private static final XErrorEvent ELEMENT_FACTORY = XErrorEvent.create(-1L);

        /**
         * Creates a new {@code XErrorEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XErrorEvent#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code type} field. */
        public int type() { return XErrorEvent.ntype(address()); }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XErrorEvent.ndisplay(address()); }
        /** Returns the value of the {@code resourceid} field. */
        @NativeType("XID")
        public long resourceid() { return XErrorEvent.nresourceid(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XErrorEvent.nserial(address()); }
        /** Returns the value of the {@code error_code} field. */
        @NativeType("unsigned char")
        public byte error_code() { return XErrorEvent.nerror_code(address()); }
        /** Returns the value of the {@code request_code} field. */
        @NativeType("unsigned char")
        public byte request_code() { return XErrorEvent.nrequest_code(address()); }
        /** Returns the value of the {@code minor_code} field. */
        @NativeType("unsigned char")
        public byte minor_code() { return XErrorEvent.nminor_code(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XErrorEvent.Buffer type(int value) { XErrorEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XErrorEvent.Buffer display(@NativeType("Display *") long value) { XErrorEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code resourceid} field. */
        public XErrorEvent.Buffer resourceid(@NativeType("XID") long value) { XErrorEvent.nresourceid(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XErrorEvent.Buffer serial(@NativeType("unsigned long") long value) { XErrorEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code error_code} field. */
        public XErrorEvent.Buffer error_code(@NativeType("unsigned char") byte value) { XErrorEvent.nerror_code(address(), value); return this; }
        /** Sets the specified value to the {@code request_code} field. */
        public XErrorEvent.Buffer request_code(@NativeType("unsigned char") byte value) { XErrorEvent.nrequest_code(address(), value); return this; }
        /** Sets the specified value to the {@code minor_code} field. */
        public XErrorEvent.Buffer minor_code(@NativeType("unsigned char") byte value) { XErrorEvent.nminor_code(address(), value); return this; }

    }

}