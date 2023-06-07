/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

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
 * struct FMOD_STUDIO_BANK_INFO {
 *     int size;
 *     void * userdata;
 *     int userdatalength;
 *     {@link FMOD_FILE_OPEN_CALLBACKI FMOD_FILE_OPEN_CALLBACK} opencallback;
 *     {@link FMOD_FILE_CLOSE_CALLBACKI FMOD_FILE_CLOSE_CALLBACK} closecallback;
 *     {@link FMOD_FILE_READ_CALLBACKI FMOD_FILE_READ_CALLBACK} readcallback;
 *     {@link FMOD_FILE_SEEK_CALLBACKI FMOD_FILE_SEEK_CALLBACK} seekcallback;
 * }</code></pre>
 */
public class FMOD_STUDIO_BANK_INFO extends Struct<FMOD_STUDIO_BANK_INFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        USERDATA,
        USERDATALENGTH,
        OPENCALLBACK,
        CLOSECALLBACK,
        READCALLBACK,
        SEEKCALLBACK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        USERDATA = layout.offsetof(1);
        USERDATALENGTH = layout.offsetof(2);
        OPENCALLBACK = layout.offsetof(3);
        CLOSECALLBACK = layout.offsetof(4);
        READCALLBACK = layout.offsetof(5);
        SEEKCALLBACK = layout.offsetof(6);
    }

    protected FMOD_STUDIO_BANK_INFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_BANK_INFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_BANK_INFO(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_BANK_INFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_BANK_INFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    public int size() { return nsize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code userdata} field. */
    @Nullable
    @NativeType("void *")
    public ByteBuffer userdata() { return nuserdata(address()); }
    /** @return the value of the {@code userdatalength} field. */
    public int userdatalength() { return nuserdatalength(address()); }
    /** @return the value of the {@code opencallback} field. */
    public FMOD_FILE_OPEN_CALLBACK opencallback() { return nopencallback(address()); }
    /** @return the value of the {@code closecallback} field. */
    public FMOD_FILE_CLOSE_CALLBACK closecallback() { return nclosecallback(address()); }
    /** @return the value of the {@code readcallback} field. */
    public FMOD_FILE_READ_CALLBACK readcallback() { return nreadcallback(address()); }
    /** @return the value of the {@code seekcallback} field. */
    public FMOD_FILE_SEEK_CALLBACK seekcallback() { return nseekcallback(address()); }

    /** Sets the specified value to the {@code size} field. */
    public FMOD_STUDIO_BANK_INFO size(int value) { nsize(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code userdata} field. */
    public FMOD_STUDIO_BANK_INFO userdata(@Nullable @NativeType("void *") ByteBuffer value) { nuserdata(address(), value); return this; }
    /** Sets the specified value to the {@code userdatalength} field. */
    public FMOD_STUDIO_BANK_INFO userdatalength(int value) { nuserdatalength(address(), value); return this; }
    /** Sets the specified value to the {@code opencallback} field. */
    public FMOD_STUDIO_BANK_INFO opencallback(@NativeType("FMOD_FILE_OPEN_CALLBACK") FMOD_FILE_OPEN_CALLBACKI value) { nopencallback(address(), value); return this; }
    /** Sets the specified value to the {@code closecallback} field. */
    public FMOD_STUDIO_BANK_INFO closecallback(@NativeType("FMOD_FILE_CLOSE_CALLBACK") FMOD_FILE_CLOSE_CALLBACKI value) { nclosecallback(address(), value); return this; }
    /** Sets the specified value to the {@code readcallback} field. */
    public FMOD_STUDIO_BANK_INFO readcallback(@NativeType("FMOD_FILE_READ_CALLBACK") FMOD_FILE_READ_CALLBACKI value) { nreadcallback(address(), value); return this; }
    /** Sets the specified value to the {@code seekcallback} field. */
    public FMOD_STUDIO_BANK_INFO seekcallback(@NativeType("FMOD_FILE_SEEK_CALLBACK") FMOD_FILE_SEEK_CALLBACKI value) { nseekcallback(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_BANK_INFO set(
        int size,
        @Nullable ByteBuffer userdata,
        int userdatalength,
        FMOD_FILE_OPEN_CALLBACKI opencallback,
        FMOD_FILE_CLOSE_CALLBACKI closecallback,
        FMOD_FILE_READ_CALLBACKI readcallback,
        FMOD_FILE_SEEK_CALLBACKI seekcallback
    ) {
        size(size);
        userdata(userdata);
        userdatalength(userdatalength);
        opencallback(opencallback);
        closecallback(closecallback);
        readcallback(readcallback);
        seekcallback(seekcallback);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_BANK_INFO set(FMOD_STUDIO_BANK_INFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_BANK_INFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_BANK_INFO malloc() {
        return new FMOD_STUDIO_BANK_INFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_BANK_INFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_BANK_INFO calloc() {
        return new FMOD_STUDIO_BANK_INFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_BANK_INFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_BANK_INFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_BANK_INFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_BANK_INFO} instance for the specified memory address. */
    public static FMOD_STUDIO_BANK_INFO create(long address) {
        return new FMOD_STUDIO_BANK_INFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_BANK_INFO createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_BANK_INFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BANK_INFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BANK_INFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BANK_INFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BANK_INFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BANK_INFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BANK_INFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_BANK_INFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BANK_INFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_BANK_INFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_BANK_INFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_BANK_INFO malloc(MemoryStack stack) {
        return new FMOD_STUDIO_BANK_INFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_BANK_INFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_BANK_INFO calloc(MemoryStack stack) {
        return new FMOD_STUDIO_BANK_INFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BANK_INFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BANK_INFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BANK_INFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BANK_INFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_BANK_INFO.SIZE); }
    /** Unsafe version of {@link #userdata() userdata}. */
    @Nullable public static ByteBuffer nuserdata(long struct) { return memByteBufferSafe(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.USERDATA), nuserdatalength(struct)); }
    /** Unsafe version of {@link #userdatalength}. */
    public static int nuserdatalength(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_BANK_INFO.USERDATALENGTH); }
    /** Unsafe version of {@link #opencallback}. */
    public static FMOD_FILE_OPEN_CALLBACK nopencallback(long struct) { return FMOD_FILE_OPEN_CALLBACK.create(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.OPENCALLBACK)); }
    /** Unsafe version of {@link #closecallback}. */
    public static FMOD_FILE_CLOSE_CALLBACK nclosecallback(long struct) { return FMOD_FILE_CLOSE_CALLBACK.create(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.CLOSECALLBACK)); }
    /** Unsafe version of {@link #readcallback}. */
    public static FMOD_FILE_READ_CALLBACK nreadcallback(long struct) { return FMOD_FILE_READ_CALLBACK.create(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.READCALLBACK)); }
    /** Unsafe version of {@link #seekcallback}. */
    public static FMOD_FILE_SEEK_CALLBACK nseekcallback(long struct) { return FMOD_FILE_SEEK_CALLBACK.create(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.SEEKCALLBACK)); }

    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_BANK_INFO.SIZE, value); }
    /** Unsafe version of {@link #userdata(ByteBuffer) userdata}. */
    public static void nuserdata(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FMOD_STUDIO_BANK_INFO.USERDATA, memAddressSafe(value)); nuserdatalength(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code userdatalength} field of the specified {@code struct}. */
    public static void nuserdatalength(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_BANK_INFO.USERDATALENGTH, value); }
    /** Unsafe version of {@link #opencallback(FMOD_FILE_OPEN_CALLBACKI) opencallback}. */
    public static void nopencallback(long struct, FMOD_FILE_OPEN_CALLBACKI value) { memPutAddress(struct + FMOD_STUDIO_BANK_INFO.OPENCALLBACK, value.address()); }
    /** Unsafe version of {@link #closecallback(FMOD_FILE_CLOSE_CALLBACKI) closecallback}. */
    public static void nclosecallback(long struct, FMOD_FILE_CLOSE_CALLBACKI value) { memPutAddress(struct + FMOD_STUDIO_BANK_INFO.CLOSECALLBACK, value.address()); }
    /** Unsafe version of {@link #readcallback(FMOD_FILE_READ_CALLBACKI) readcallback}. */
    public static void nreadcallback(long struct, FMOD_FILE_READ_CALLBACKI value) { memPutAddress(struct + FMOD_STUDIO_BANK_INFO.READCALLBACK, value.address()); }
    /** Unsafe version of {@link #seekcallback(FMOD_FILE_SEEK_CALLBACKI) seekcallback}. */
    public static void nseekcallback(long struct, FMOD_FILE_SEEK_CALLBACKI value) { memPutAddress(struct + FMOD_STUDIO_BANK_INFO.SEEKCALLBACK, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.OPENCALLBACK));
        check(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.CLOSECALLBACK));
        check(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.READCALLBACK));
        check(memGetAddress(struct + FMOD_STUDIO_BANK_INFO.SEEKCALLBACK));
    }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_BANK_INFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_BANK_INFO, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_BANK_INFO ELEMENT_FACTORY = FMOD_STUDIO_BANK_INFO.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_BANK_INFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_BANK_INFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_BANK_INFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        public int size() { return FMOD_STUDIO_BANK_INFO.nsize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code userdata} field. */
        @Nullable
        @NativeType("void *")
        public ByteBuffer userdata() { return FMOD_STUDIO_BANK_INFO.nuserdata(address()); }
        /** @return the value of the {@code userdatalength} field. */
        public int userdatalength() { return FMOD_STUDIO_BANK_INFO.nuserdatalength(address()); }
        /** @return the value of the {@code opencallback} field. */
        public FMOD_FILE_OPEN_CALLBACK opencallback() { return FMOD_STUDIO_BANK_INFO.nopencallback(address()); }
        /** @return the value of the {@code closecallback} field. */
        public FMOD_FILE_CLOSE_CALLBACK closecallback() { return FMOD_STUDIO_BANK_INFO.nclosecallback(address()); }
        /** @return the value of the {@code readcallback} field. */
        public FMOD_FILE_READ_CALLBACK readcallback() { return FMOD_STUDIO_BANK_INFO.nreadcallback(address()); }
        /** @return the value of the {@code seekcallback} field. */
        public FMOD_FILE_SEEK_CALLBACK seekcallback() { return FMOD_STUDIO_BANK_INFO.nseekcallback(address()); }

        /** Sets the specified value to the {@code size} field. */
        public FMOD_STUDIO_BANK_INFO.Buffer size(int value) { FMOD_STUDIO_BANK_INFO.nsize(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code userdata} field. */
        public FMOD_STUDIO_BANK_INFO.Buffer userdata(@Nullable @NativeType("void *") ByteBuffer value) { FMOD_STUDIO_BANK_INFO.nuserdata(address(), value); return this; }
        /** Sets the specified value to the {@code userdatalength} field. */
        public FMOD_STUDIO_BANK_INFO.Buffer userdatalength(int value) { FMOD_STUDIO_BANK_INFO.nuserdatalength(address(), value); return this; }
        /** Sets the specified value to the {@code opencallback} field. */
        public FMOD_STUDIO_BANK_INFO.Buffer opencallback(@NativeType("FMOD_FILE_OPEN_CALLBACK") FMOD_FILE_OPEN_CALLBACKI value) { FMOD_STUDIO_BANK_INFO.nopencallback(address(), value); return this; }
        /** Sets the specified value to the {@code closecallback} field. */
        public FMOD_STUDIO_BANK_INFO.Buffer closecallback(@NativeType("FMOD_FILE_CLOSE_CALLBACK") FMOD_FILE_CLOSE_CALLBACKI value) { FMOD_STUDIO_BANK_INFO.nclosecallback(address(), value); return this; }
        /** Sets the specified value to the {@code readcallback} field. */
        public FMOD_STUDIO_BANK_INFO.Buffer readcallback(@NativeType("FMOD_FILE_READ_CALLBACK") FMOD_FILE_READ_CALLBACKI value) { FMOD_STUDIO_BANK_INFO.nreadcallback(address(), value); return this; }
        /** Sets the specified value to the {@code seekcallback} field. */
        public FMOD_STUDIO_BANK_INFO.Buffer seekcallback(@NativeType("FMOD_FILE_SEEK_CALLBACK") FMOD_FILE_SEEK_CALLBACKI value) { FMOD_STUDIO_BANK_INFO.nseekcallback(address(), value); return this; }

    }

}