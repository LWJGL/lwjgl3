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
 * FMOD structs
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_ASYNCREADINFO {
 *     void * handle;
 *     unsigned int offset;
 *     unsigned int sizebytes;
 *     int priority;
 *     void * userdata;
 *     void * buffer;
 *     unsigned int bytesread;
 *     {@link FMOD_FILE_ASYNCDONE_FUNCI FMOD_FILE_ASYNCDONE_FUNC} done;
 * }</code></pre>
 */
@NativeType("struct FMOD_ASYNCREADINFO")
public class FMOD_ASYNCREADINFO extends Struct<FMOD_ASYNCREADINFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        OFFSET,
        SIZEBYTES,
        PRIORITY,
        USERDATA,
        BUFFER,
        BYTESREAD,
        DONE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        SIZEBYTES = layout.offsetof(2);
        PRIORITY = layout.offsetof(3);
        USERDATA = layout.offsetof(4);
        BUFFER = layout.offsetof(5);
        BYTESREAD = layout.offsetof(6);
        DONE = layout.offsetof(7);
    }

    protected FMOD_ASYNCREADINFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_ASYNCREADINFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_ASYNCREADINFO(address, container);
    }

    /**
     * Creates a {@code FMOD_ASYNCREADINFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_ASYNCREADINFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("unsigned int")
    public int offset() { return noffset(address()); }
    /** @return the value of the {@code sizebytes} field. */
    @NativeType("unsigned int")
    public int sizebytes() { return nsizebytes(address()); }
    /** @return the value of the {@code priority} field. */
    public int priority() { return npriority(address()); }
    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("void *")
    public ByteBuffer buffer() { return nbuffer(address()); }
    /** @return the value of the {@code bytesread} field. */
    @NativeType("unsigned int")
    public int bytesread() { return nbytesread(address()); }
    /** @return the value of the {@code done} field. */
    public FMOD_FILE_ASYNCDONE_FUNC done() { return ndone(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public FMOD_ASYNCREADINFO handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public FMOD_ASYNCREADINFO offset(@NativeType("unsigned int") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code sizebytes} field. */
    public FMOD_ASYNCREADINFO sizebytes(@NativeType("unsigned int") int value) { nsizebytes(address(), value); return this; }
    /** Sets the specified value to the {@code priority} field. */
    public FMOD_ASYNCREADINFO priority(int value) { npriority(address(), value); return this; }
    /** Sets the specified value to the {@code userdata} field. */
    public FMOD_ASYNCREADINFO userdata(@NativeType("void *") long value) { nuserdata(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
    public FMOD_ASYNCREADINFO buffer(@NativeType("void *") ByteBuffer value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code done} field. */
    public FMOD_ASYNCREADINFO done(@NativeType("FMOD_FILE_ASYNCDONE_FUNC") FMOD_FILE_ASYNCDONE_FUNCI value) { ndone(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_ASYNCREADINFO set(
        long handle,
        int offset,
        int sizebytes,
        int priority,
        long userdata,
        ByteBuffer buffer,
        FMOD_FILE_ASYNCDONE_FUNCI done
    ) {
        handle(handle);
        offset(offset);
        sizebytes(sizebytes);
        priority(priority);
        userdata(userdata);
        buffer(buffer);
        done(done);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_ASYNCREADINFO set(FMOD_ASYNCREADINFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_ASYNCREADINFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_ASYNCREADINFO malloc() {
        return new FMOD_ASYNCREADINFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_ASYNCREADINFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_ASYNCREADINFO calloc() {
        return new FMOD_ASYNCREADINFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_ASYNCREADINFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_ASYNCREADINFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_ASYNCREADINFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_ASYNCREADINFO} instance for the specified memory address. */
    public static FMOD_ASYNCREADINFO create(long address) {
        return new FMOD_ASYNCREADINFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_ASYNCREADINFO createSafe(long address) {
        return address == NULL ? null : new FMOD_ASYNCREADINFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_ASYNCREADINFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ASYNCREADINFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_ASYNCREADINFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ASYNCREADINFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_ASYNCREADINFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ASYNCREADINFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_ASYNCREADINFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_ASYNCREADINFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_ASYNCREADINFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_ASYNCREADINFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_ASYNCREADINFO malloc(MemoryStack stack) {
        return new FMOD_ASYNCREADINFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_ASYNCREADINFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_ASYNCREADINFO calloc(MemoryStack stack) {
        return new FMOD_ASYNCREADINFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_ASYNCREADINFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_ASYNCREADINFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_ASYNCREADINFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_ASYNCREADINFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + FMOD_ASYNCREADINFO.HANDLE); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return UNSAFE.getInt(null, struct + FMOD_ASYNCREADINFO.OFFSET); }
    /** Unsafe version of {@link #sizebytes}. */
    public static int nsizebytes(long struct) { return UNSAFE.getInt(null, struct + FMOD_ASYNCREADINFO.SIZEBYTES); }
    /** Unsafe version of {@link #priority}. */
    public static int npriority(long struct) { return UNSAFE.getInt(null, struct + FMOD_ASYNCREADINFO.PRIORITY); }
    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + FMOD_ASYNCREADINFO.USERDATA); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(memGetAddress(struct + FMOD_ASYNCREADINFO.BUFFER), nbytesread(struct)); }
    /** Unsafe version of {@link #bytesread}. */
    public static int nbytesread(long struct) { return UNSAFE.getInt(null, struct + FMOD_ASYNCREADINFO.BYTESREAD); }
    /** Unsafe version of {@link #done}. */
    public static FMOD_FILE_ASYNCDONE_FUNC ndone(long struct) { return FMOD_FILE_ASYNCDONE_FUNC.create(memGetAddress(struct + FMOD_ASYNCREADINFO.DONE)); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + FMOD_ASYNCREADINFO.HANDLE, check(value)); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ASYNCREADINFO.OFFSET, value); }
    /** Unsafe version of {@link #sizebytes(int) sizebytes}. */
    public static void nsizebytes(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ASYNCREADINFO.SIZEBYTES, value); }
    /** Unsafe version of {@link #priority(int) priority}. */
    public static void npriority(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ASYNCREADINFO.PRIORITY, value); }
    /** Unsafe version of {@link #userdata(long) userdata}. */
    public static void nuserdata(long struct, long value) { memPutAddress(struct + FMOD_ASYNCREADINFO.USERDATA, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, ByteBuffer value) { memPutAddress(struct + FMOD_ASYNCREADINFO.BUFFER, memAddress(value)); nbytesread(struct, value.remaining()); }
    /** Sets the specified value to the {@code bytesread} field of the specified {@code struct}. */
    public static void nbytesread(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ASYNCREADINFO.BYTESREAD, value); }
    /** Unsafe version of {@link #done(FMOD_FILE_ASYNCDONE_FUNCI) done}. */
    public static void ndone(long struct, FMOD_FILE_ASYNCDONE_FUNCI value) { memPutAddress(struct + FMOD_ASYNCREADINFO.DONE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_ASYNCREADINFO.HANDLE));
        check(memGetAddress(struct + FMOD_ASYNCREADINFO.BUFFER));
        check(memGetAddress(struct + FMOD_ASYNCREADINFO.DONE));
    }

    // -----------------------------------

    /** An array of {@link FMOD_ASYNCREADINFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_ASYNCREADINFO, Buffer> implements NativeResource {

        private static final FMOD_ASYNCREADINFO ELEMENT_FACTORY = FMOD_ASYNCREADINFO.create(-1L);

        /**
         * Creates a new {@code FMOD_ASYNCREADINFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_ASYNCREADINFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_ASYNCREADINFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return FMOD_ASYNCREADINFO.nhandle(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("unsigned int")
        public int offset() { return FMOD_ASYNCREADINFO.noffset(address()); }
        /** @return the value of the {@code sizebytes} field. */
        @NativeType("unsigned int")
        public int sizebytes() { return FMOD_ASYNCREADINFO.nsizebytes(address()); }
        /** @return the value of the {@code priority} field. */
        public int priority() { return FMOD_ASYNCREADINFO.npriority(address()); }
        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return FMOD_ASYNCREADINFO.nuserdata(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("void *")
        public ByteBuffer buffer() { return FMOD_ASYNCREADINFO.nbuffer(address()); }
        /** @return the value of the {@code bytesread} field. */
        @NativeType("unsigned int")
        public int bytesread() { return FMOD_ASYNCREADINFO.nbytesread(address()); }
        /** @return the value of the {@code done} field. */
        public FMOD_FILE_ASYNCDONE_FUNC done() { return FMOD_ASYNCREADINFO.ndone(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public FMOD_ASYNCREADINFO.Buffer handle(@NativeType("void *") long value) { FMOD_ASYNCREADINFO.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public FMOD_ASYNCREADINFO.Buffer offset(@NativeType("unsigned int") int value) { FMOD_ASYNCREADINFO.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code sizebytes} field. */
        public FMOD_ASYNCREADINFO.Buffer sizebytes(@NativeType("unsigned int") int value) { FMOD_ASYNCREADINFO.nsizebytes(address(), value); return this; }
        /** Sets the specified value to the {@code priority} field. */
        public FMOD_ASYNCREADINFO.Buffer priority(int value) { FMOD_ASYNCREADINFO.npriority(address(), value); return this; }
        /** Sets the specified value to the {@code userdata} field. */
        public FMOD_ASYNCREADINFO.Buffer userdata(@NativeType("void *") long value) { FMOD_ASYNCREADINFO.nuserdata(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
        public FMOD_ASYNCREADINFO.Buffer buffer(@NativeType("void *") ByteBuffer value) { FMOD_ASYNCREADINFO.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code done} field. */
        public FMOD_ASYNCREADINFO.Buffer done(@NativeType("FMOD_FILE_ASYNCDONE_FUNC") FMOD_FILE_ASYNCDONE_FUNCI value) { FMOD_ASYNCREADINFO.ndone(address(), value); return this; }

    }

}