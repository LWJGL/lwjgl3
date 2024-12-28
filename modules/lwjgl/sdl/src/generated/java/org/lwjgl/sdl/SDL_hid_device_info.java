/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_hid_device_info {
 *     char * path;
 *     unsigned short vendor_id;
 *     unsigned short product_id;
 *     wchar_t * serial_number;
 *     unsigned short release_number;
 *     wchar_t * manufacturer_string;
 *     wchar_t * product_string;
 *     unsigned short usage_page;
 *     unsigned short usage;
 *     int interface_number;
 *     int interface_class;
 *     int interface_subclass;
 *     int interface_protocol;
 *     SDL_hid_bus_type bus_type;
 *     {@link SDL_hid_device_info SDL_hid_device_info} * next;
 * }}</pre>
 */
public class SDL_hid_device_info extends Struct<SDL_hid_device_info> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PATH,
        VENDOR_ID,
        PRODUCT_ID,
        SERIAL_NUMBER,
        RELEASE_NUMBER,
        MANUFACTURER_STRING,
        PRODUCT_STRING,
        USAGE_PAGE,
        USAGE,
        INTERFACE_NUMBER,
        INTERFACE_CLASS,
        INTERFACE_SUBCLASS,
        INTERFACE_PROTOCOL,
        BUS_TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(2),
            __member(2),
            __member(POINTER_SIZE),
            __member(2),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PATH = layout.offsetof(0);
        VENDOR_ID = layout.offsetof(1);
        PRODUCT_ID = layout.offsetof(2);
        SERIAL_NUMBER = layout.offsetof(3);
        RELEASE_NUMBER = layout.offsetof(4);
        MANUFACTURER_STRING = layout.offsetof(5);
        PRODUCT_STRING = layout.offsetof(6);
        USAGE_PAGE = layout.offsetof(7);
        USAGE = layout.offsetof(8);
        INTERFACE_NUMBER = layout.offsetof(9);
        INTERFACE_CLASS = layout.offsetof(10);
        INTERFACE_SUBCLASS = layout.offsetof(11);
        INTERFACE_PROTOCOL = layout.offsetof(12);
        BUS_TYPE = layout.offsetof(13);
        NEXT = layout.offsetof(14);
    }

    protected SDL_hid_device_info(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_hid_device_info create(long address, @Nullable ByteBuffer container) {
        return new SDL_hid_device_info(address, container);
    }

    /**
     * Creates a {@code SDL_hid_device_info} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_hid_device_info(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code path} field. */
    @NativeType("char *")
    public ByteBuffer path() { return npath(address()); }
    /** @return the null-terminated string pointed to by the {@code path} field. */
    @NativeType("char *")
    public String pathString() { return npathString(address()); }
    /** @return the value of the {@code vendor_id} field. */
    @NativeType("unsigned short")
    public short vendor_id() { return nvendor_id(address()); }
    /** @return the value of the {@code product_id} field. */
    @NativeType("unsigned short")
    public short product_id() { return nproduct_id(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code serial_number} field. */
    @NativeType("wchar_t *")
    public ByteBuffer serial_number() { return nserial_number(address()); }
    /** @return the null-terminated string pointed to by the {@code serial_number} field. */
    @NativeType("wchar_t *")
    public String serial_numberString() { return nserial_numberString(address()); }
    /** @return the value of the {@code release_number} field. */
    @NativeType("unsigned short")
    public short release_number() { return nrelease_number(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code manufacturer_string} field. */
    @NativeType("wchar_t *")
    public ByteBuffer manufacturer_string() { return nmanufacturer_string(address()); }
    /** @return the null-terminated string pointed to by the {@code manufacturer_string} field. */
    @NativeType("wchar_t *")
    public String manufacturer_stringString() { return nmanufacturer_stringString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code product_string} field. */
    @NativeType("wchar_t *")
    public ByteBuffer product_string() { return nproduct_string(address()); }
    /** @return the null-terminated string pointed to by the {@code product_string} field. */
    @NativeType("wchar_t *")
    public String product_stringString() { return nproduct_stringString(address()); }
    /** @return the value of the {@code usage_page} field. */
    @NativeType("unsigned short")
    public short usage_page() { return nusage_page(address()); }
    /** @return the value of the {@code usage} field. */
    @NativeType("unsigned short")
    public short usage() { return nusage(address()); }
    /** @return the value of the {@code interface_number} field. */
    public int interface_number() { return ninterface_number(address()); }
    /** @return the value of the {@code interface_class} field. */
    public int interface_class() { return ninterface_class(address()); }
    /** @return the value of the {@code interface_subclass} field. */
    public int interface_subclass() { return ninterface_subclass(address()); }
    /** @return the value of the {@code interface_protocol} field. */
    public int interface_protocol() { return ninterface_protocol(address()); }
    /** @return the value of the {@code bus_type} field. */
    @NativeType("SDL_hid_bus_type")
    public int bus_type() { return nbus_type(address()); }
    /** @return a {@link SDL_hid_device_info} view of the struct pointed to by the {@code next} field. */
    @NativeType("SDL_hid_device_info *")
    public SDL_hid_device_info next() { return nnext(address()); }

    /** Sets the address of the specified encoded string to the {@code path} field. */
    public SDL_hid_device_info path(@NativeType("char *") ByteBuffer value) { npath(address(), value); return this; }
    /** Sets the specified value to the {@code vendor_id} field. */
    public SDL_hid_device_info vendor_id(@NativeType("unsigned short") short value) { nvendor_id(address(), value); return this; }
    /** Sets the specified value to the {@code product_id} field. */
    public SDL_hid_device_info product_id(@NativeType("unsigned short") short value) { nproduct_id(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code serial_number} field. */
    public SDL_hid_device_info serial_number(@NativeType("wchar_t *") ByteBuffer value) { nserial_number(address(), value); return this; }
    /** Sets the specified value to the {@code release_number} field. */
    public SDL_hid_device_info release_number(@NativeType("unsigned short") short value) { nrelease_number(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code manufacturer_string} field. */
    public SDL_hid_device_info manufacturer_string(@NativeType("wchar_t *") ByteBuffer value) { nmanufacturer_string(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code product_string} field. */
    public SDL_hid_device_info product_string(@NativeType("wchar_t *") ByteBuffer value) { nproduct_string(address(), value); return this; }
    /** Sets the specified value to the {@code usage_page} field. */
    public SDL_hid_device_info usage_page(@NativeType("unsigned short") short value) { nusage_page(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public SDL_hid_device_info usage(@NativeType("unsigned short") short value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code interface_number} field. */
    public SDL_hid_device_info interface_number(int value) { ninterface_number(address(), value); return this; }
    /** Sets the specified value to the {@code interface_class} field. */
    public SDL_hid_device_info interface_class(int value) { ninterface_class(address(), value); return this; }
    /** Sets the specified value to the {@code interface_subclass} field. */
    public SDL_hid_device_info interface_subclass(int value) { ninterface_subclass(address(), value); return this; }
    /** Sets the specified value to the {@code interface_protocol} field. */
    public SDL_hid_device_info interface_protocol(int value) { ninterface_protocol(address(), value); return this; }
    /** Sets the specified value to the {@code bus_type} field. */
    public SDL_hid_device_info bus_type(@NativeType("SDL_hid_bus_type") int value) { nbus_type(address(), value); return this; }
    /** Sets the address of the specified {@link SDL_hid_device_info} to the {@code next} field. */
    public SDL_hid_device_info next(@NativeType("SDL_hid_device_info *") SDL_hid_device_info value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_hid_device_info set(
        ByteBuffer path,
        short vendor_id,
        short product_id,
        ByteBuffer serial_number,
        short release_number,
        ByteBuffer manufacturer_string,
        ByteBuffer product_string,
        short usage_page,
        short usage,
        int interface_number,
        int interface_class,
        int interface_subclass,
        int interface_protocol,
        int bus_type,
        SDL_hid_device_info next
    ) {
        path(path);
        vendor_id(vendor_id);
        product_id(product_id);
        serial_number(serial_number);
        release_number(release_number);
        manufacturer_string(manufacturer_string);
        product_string(product_string);
        usage_page(usage_page);
        usage(usage);
        interface_number(interface_number);
        interface_class(interface_class);
        interface_subclass(interface_subclass);
        interface_protocol(interface_protocol);
        bus_type(bus_type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_hid_device_info set(SDL_hid_device_info src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_hid_device_info} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_hid_device_info malloc() {
        return new SDL_hid_device_info(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_hid_device_info} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_hid_device_info calloc() {
        return new SDL_hid_device_info(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_hid_device_info} instance allocated with {@link BufferUtils}. */
    public static SDL_hid_device_info create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_hid_device_info(memAddress(container), container);
    }

    /** Returns a new {@code SDL_hid_device_info} instance for the specified memory address. */
    public static SDL_hid_device_info create(long address) {
        return new SDL_hid_device_info(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_hid_device_info createSafe(long address) {
        return address == NULL ? null : new SDL_hid_device_info(address, null);
    }

    /**
     * Returns a new {@link SDL_hid_device_info.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_hid_device_info.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_hid_device_info.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_hid_device_info.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_hid_device_info.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_hid_device_info.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_hid_device_info.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_hid_device_info.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_hid_device_info.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_hid_device_info} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_hid_device_info malloc(MemoryStack stack) {
        return new SDL_hid_device_info(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_hid_device_info} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_hid_device_info calloc(MemoryStack stack) {
        return new SDL_hid_device_info(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_hid_device_info.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_hid_device_info.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_hid_device_info.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_hid_device_info.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #path}. */
    public static ByteBuffer npath(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_hid_device_info.PATH)); }
    /** Unsafe version of {@link #pathString}. */
    public static String npathString(long struct) { return memUTF8(memGetAddress(struct + SDL_hid_device_info.PATH)); }
    /** Unsafe version of {@link #vendor_id}. */
    public static short nvendor_id(long struct) { return memGetShort(struct + SDL_hid_device_info.VENDOR_ID); }
    /** Unsafe version of {@link #product_id}. */
    public static short nproduct_id(long struct) { return memGetShort(struct + SDL_hid_device_info.PRODUCT_ID); }
    /** Unsafe version of {@link #serial_number}. */
    public static ByteBuffer nserial_number(long struct) { return memByteBufferNT2(memGetAddress(struct + SDL_hid_device_info.SERIAL_NUMBER)); }
    /** Unsafe version of {@link #serial_numberString}. */
    public static String nserial_numberString(long struct) { return memUTF16(memGetAddress(struct + SDL_hid_device_info.SERIAL_NUMBER)); }
    /** Unsafe version of {@link #release_number}. */
    public static short nrelease_number(long struct) { return memGetShort(struct + SDL_hid_device_info.RELEASE_NUMBER); }
    /** Unsafe version of {@link #manufacturer_string}. */
    public static ByteBuffer nmanufacturer_string(long struct) { return memByteBufferNT2(memGetAddress(struct + SDL_hid_device_info.MANUFACTURER_STRING)); }
    /** Unsafe version of {@link #manufacturer_stringString}. */
    public static String nmanufacturer_stringString(long struct) { return memUTF16(memGetAddress(struct + SDL_hid_device_info.MANUFACTURER_STRING)); }
    /** Unsafe version of {@link #product_string}. */
    public static ByteBuffer nproduct_string(long struct) { return memByteBufferNT2(memGetAddress(struct + SDL_hid_device_info.PRODUCT_STRING)); }
    /** Unsafe version of {@link #product_stringString}. */
    public static String nproduct_stringString(long struct) { return memUTF16(memGetAddress(struct + SDL_hid_device_info.PRODUCT_STRING)); }
    /** Unsafe version of {@link #usage_page}. */
    public static short nusage_page(long struct) { return memGetShort(struct + SDL_hid_device_info.USAGE_PAGE); }
    /** Unsafe version of {@link #usage}. */
    public static short nusage(long struct) { return memGetShort(struct + SDL_hid_device_info.USAGE); }
    /** Unsafe version of {@link #interface_number}. */
    public static int ninterface_number(long struct) { return memGetInt(struct + SDL_hid_device_info.INTERFACE_NUMBER); }
    /** Unsafe version of {@link #interface_class}. */
    public static int ninterface_class(long struct) { return memGetInt(struct + SDL_hid_device_info.INTERFACE_CLASS); }
    /** Unsafe version of {@link #interface_subclass}. */
    public static int ninterface_subclass(long struct) { return memGetInt(struct + SDL_hid_device_info.INTERFACE_SUBCLASS); }
    /** Unsafe version of {@link #interface_protocol}. */
    public static int ninterface_protocol(long struct) { return memGetInt(struct + SDL_hid_device_info.INTERFACE_PROTOCOL); }
    /** Unsafe version of {@link #bus_type}. */
    public static int nbus_type(long struct) { return memGetInt(struct + SDL_hid_device_info.BUS_TYPE); }
    /** Unsafe version of {@link #next}. */
    public static SDL_hid_device_info nnext(long struct) { return SDL_hid_device_info.create(memGetAddress(struct + SDL_hid_device_info.NEXT)); }

    /** Unsafe version of {@link #path(ByteBuffer) path}. */
    public static void npath(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_hid_device_info.PATH, memAddress(value));
    }
    /** Unsafe version of {@link #vendor_id(short) vendor_id}. */
    public static void nvendor_id(long struct, short value) { memPutShort(struct + SDL_hid_device_info.VENDOR_ID, value); }
    /** Unsafe version of {@link #product_id(short) product_id}. */
    public static void nproduct_id(long struct, short value) { memPutShort(struct + SDL_hid_device_info.PRODUCT_ID, value); }
    /** Unsafe version of {@link #serial_number(ByteBuffer) serial_number}. */
    public static void nserial_number(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + SDL_hid_device_info.SERIAL_NUMBER, memAddress(value));
    }
    /** Unsafe version of {@link #release_number(short) release_number}. */
    public static void nrelease_number(long struct, short value) { memPutShort(struct + SDL_hid_device_info.RELEASE_NUMBER, value); }
    /** Unsafe version of {@link #manufacturer_string(ByteBuffer) manufacturer_string}. */
    public static void nmanufacturer_string(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + SDL_hid_device_info.MANUFACTURER_STRING, memAddress(value));
    }
    /** Unsafe version of {@link #product_string(ByteBuffer) product_string}. */
    public static void nproduct_string(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + SDL_hid_device_info.PRODUCT_STRING, memAddress(value));
    }
    /** Unsafe version of {@link #usage_page(short) usage_page}. */
    public static void nusage_page(long struct, short value) { memPutShort(struct + SDL_hid_device_info.USAGE_PAGE, value); }
    /** Unsafe version of {@link #usage(short) usage}. */
    public static void nusage(long struct, short value) { memPutShort(struct + SDL_hid_device_info.USAGE, value); }
    /** Unsafe version of {@link #interface_number(int) interface_number}. */
    public static void ninterface_number(long struct, int value) { memPutInt(struct + SDL_hid_device_info.INTERFACE_NUMBER, value); }
    /** Unsafe version of {@link #interface_class(int) interface_class}. */
    public static void ninterface_class(long struct, int value) { memPutInt(struct + SDL_hid_device_info.INTERFACE_CLASS, value); }
    /** Unsafe version of {@link #interface_subclass(int) interface_subclass}. */
    public static void ninterface_subclass(long struct, int value) { memPutInt(struct + SDL_hid_device_info.INTERFACE_SUBCLASS, value); }
    /** Unsafe version of {@link #interface_protocol(int) interface_protocol}. */
    public static void ninterface_protocol(long struct, int value) { memPutInt(struct + SDL_hid_device_info.INTERFACE_PROTOCOL, value); }
    /** Unsafe version of {@link #bus_type(int) bus_type}. */
    public static void nbus_type(long struct, int value) { memPutInt(struct + SDL_hid_device_info.BUS_TYPE, value); }
    /** Unsafe version of {@link #next(SDL_hid_device_info) next}. */
    public static void nnext(long struct, SDL_hid_device_info value) { memPutAddress(struct + SDL_hid_device_info.NEXT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_hid_device_info.PATH));
        check(memGetAddress(struct + SDL_hid_device_info.SERIAL_NUMBER));
        check(memGetAddress(struct + SDL_hid_device_info.MANUFACTURER_STRING));
        check(memGetAddress(struct + SDL_hid_device_info.PRODUCT_STRING));
        check(memGetAddress(struct + SDL_hid_device_info.NEXT));
    }

    // -----------------------------------

    /** An array of {@link SDL_hid_device_info} structs. */
    public static class Buffer extends StructBuffer<SDL_hid_device_info, Buffer> implements NativeResource {

        private static final SDL_hid_device_info ELEMENT_FACTORY = SDL_hid_device_info.create(-1L);

        /**
         * Creates a new {@code SDL_hid_device_info.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_hid_device_info#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected SDL_hid_device_info getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code path} field. */
        @NativeType("char *")
        public ByteBuffer path() { return SDL_hid_device_info.npath(address()); }
        /** @return the null-terminated string pointed to by the {@code path} field. */
        @NativeType("char *")
        public String pathString() { return SDL_hid_device_info.npathString(address()); }
        /** @return the value of the {@code vendor_id} field. */
        @NativeType("unsigned short")
        public short vendor_id() { return SDL_hid_device_info.nvendor_id(address()); }
        /** @return the value of the {@code product_id} field. */
        @NativeType("unsigned short")
        public short product_id() { return SDL_hid_device_info.nproduct_id(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code serial_number} field. */
        @NativeType("wchar_t *")
        public ByteBuffer serial_number() { return SDL_hid_device_info.nserial_number(address()); }
        /** @return the null-terminated string pointed to by the {@code serial_number} field. */
        @NativeType("wchar_t *")
        public String serial_numberString() { return SDL_hid_device_info.nserial_numberString(address()); }
        /** @return the value of the {@code release_number} field. */
        @NativeType("unsigned short")
        public short release_number() { return SDL_hid_device_info.nrelease_number(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code manufacturer_string} field. */
        @NativeType("wchar_t *")
        public ByteBuffer manufacturer_string() { return SDL_hid_device_info.nmanufacturer_string(address()); }
        /** @return the null-terminated string pointed to by the {@code manufacturer_string} field. */
        @NativeType("wchar_t *")
        public String manufacturer_stringString() { return SDL_hid_device_info.nmanufacturer_stringString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code product_string} field. */
        @NativeType("wchar_t *")
        public ByteBuffer product_string() { return SDL_hid_device_info.nproduct_string(address()); }
        /** @return the null-terminated string pointed to by the {@code product_string} field. */
        @NativeType("wchar_t *")
        public String product_stringString() { return SDL_hid_device_info.nproduct_stringString(address()); }
        /** @return the value of the {@code usage_page} field. */
        @NativeType("unsigned short")
        public short usage_page() { return SDL_hid_device_info.nusage_page(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("unsigned short")
        public short usage() { return SDL_hid_device_info.nusage(address()); }
        /** @return the value of the {@code interface_number} field. */
        public int interface_number() { return SDL_hid_device_info.ninterface_number(address()); }
        /** @return the value of the {@code interface_class} field. */
        public int interface_class() { return SDL_hid_device_info.ninterface_class(address()); }
        /** @return the value of the {@code interface_subclass} field. */
        public int interface_subclass() { return SDL_hid_device_info.ninterface_subclass(address()); }
        /** @return the value of the {@code interface_protocol} field. */
        public int interface_protocol() { return SDL_hid_device_info.ninterface_protocol(address()); }
        /** @return the value of the {@code bus_type} field. */
        @NativeType("SDL_hid_bus_type")
        public int bus_type() { return SDL_hid_device_info.nbus_type(address()); }
        /** @return a {@link SDL_hid_device_info} view of the struct pointed to by the {@code next} field. */
        @NativeType("SDL_hid_device_info *")
        public SDL_hid_device_info next() { return SDL_hid_device_info.nnext(address()); }

        /** Sets the address of the specified encoded string to the {@code path} field. */
        public SDL_hid_device_info.Buffer path(@NativeType("char *") ByteBuffer value) { SDL_hid_device_info.npath(address(), value); return this; }
        /** Sets the specified value to the {@code vendor_id} field. */
        public SDL_hid_device_info.Buffer vendor_id(@NativeType("unsigned short") short value) { SDL_hid_device_info.nvendor_id(address(), value); return this; }
        /** Sets the specified value to the {@code product_id} field. */
        public SDL_hid_device_info.Buffer product_id(@NativeType("unsigned short") short value) { SDL_hid_device_info.nproduct_id(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code serial_number} field. */
        public SDL_hid_device_info.Buffer serial_number(@NativeType("wchar_t *") ByteBuffer value) { SDL_hid_device_info.nserial_number(address(), value); return this; }
        /** Sets the specified value to the {@code release_number} field. */
        public SDL_hid_device_info.Buffer release_number(@NativeType("unsigned short") short value) { SDL_hid_device_info.nrelease_number(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code manufacturer_string} field. */
        public SDL_hid_device_info.Buffer manufacturer_string(@NativeType("wchar_t *") ByteBuffer value) { SDL_hid_device_info.nmanufacturer_string(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code product_string} field. */
        public SDL_hid_device_info.Buffer product_string(@NativeType("wchar_t *") ByteBuffer value) { SDL_hid_device_info.nproduct_string(address(), value); return this; }
        /** Sets the specified value to the {@code usage_page} field. */
        public SDL_hid_device_info.Buffer usage_page(@NativeType("unsigned short") short value) { SDL_hid_device_info.nusage_page(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public SDL_hid_device_info.Buffer usage(@NativeType("unsigned short") short value) { SDL_hid_device_info.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code interface_number} field. */
        public SDL_hid_device_info.Buffer interface_number(int value) { SDL_hid_device_info.ninterface_number(address(), value); return this; }
        /** Sets the specified value to the {@code interface_class} field. */
        public SDL_hid_device_info.Buffer interface_class(int value) { SDL_hid_device_info.ninterface_class(address(), value); return this; }
        /** Sets the specified value to the {@code interface_subclass} field. */
        public SDL_hid_device_info.Buffer interface_subclass(int value) { SDL_hid_device_info.ninterface_subclass(address(), value); return this; }
        /** Sets the specified value to the {@code interface_protocol} field. */
        public SDL_hid_device_info.Buffer interface_protocol(int value) { SDL_hid_device_info.ninterface_protocol(address(), value); return this; }
        /** Sets the specified value to the {@code bus_type} field. */
        public SDL_hid_device_info.Buffer bus_type(@NativeType("SDL_hid_bus_type") int value) { SDL_hid_device_info.nbus_type(address(), value); return this; }
        /** Sets the address of the specified {@link SDL_hid_device_info} to the {@code next} field. */
        public SDL_hid_device_info.Buffer next(@NativeType("SDL_hid_device_info *") SDL_hid_device_info value) { SDL_hid_device_info.nnext(address(), value); return this; }

    }

}