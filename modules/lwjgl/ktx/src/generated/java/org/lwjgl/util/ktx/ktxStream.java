/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Interface of {@code ktxStream}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxStream {
 *     {@link ktxStream_readI ktxStream_read} {@link #read};
 *     {@link ktxStream_skipI ktxStream_skip} {@link #skip};
 *     {@link ktxStream_writeI ktxStream_write} {@link #write};
 *     {@link ktxStream_getposI ktxStream_getpos} {@link #getpos};
 *     {@link ktxStream_setposI ktxStream_setpos} {@link #setpos};
 *     {@link ktxStream_getsizeI ktxStream_getsize} {@link #getsize};
 *     {@link ktxStream_destructI ktxStream_destruct} {@link #destruct};
 *     enum streamType type;
 *     union {
 *         FILE * {@link #data_file file};
 *         ktxMem * {@link #data_mem mem};
 *         struct {
 *             void * {@link #data_custom_ptr_address address};
 *             void * {@link #data_custom_ptr_allocatorAddress allocatorAddress};
 *             ktx_size_t {@link #data_custom_ptr_size size};
 *         } custom_ptr;
 *     } data;
 *     ktx_off_t {@link #readpos};
 *     ktx_bool_t {@link #closeOnDestruct};
 * }</code></pre>
 */
@NativeType("struct ktxStream")
public class ktxStream extends Struct<ktxStream> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        READ,
        SKIP,
        WRITE,
        GETPOS,
        SETPOS,
        GETSIZE,
        DESTRUCT,
        TYPE,
        DATA,
            DATA_FILE,
            DATA_MEM,
            DATA_CUSTOM_PTR,
                DATA_CUSTOM_PTR_ADDRESS,
                DATA_CUSTOM_PTR_ALLOCATORADDRESS,
                DATA_CUSTOM_PTR_SIZE,
        READPOS,
        CLOSEONDESTRUCT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE),
                __struct(
                    __member(POINTER_SIZE),
                    __member(POINTER_SIZE),
                    __member(POINTER_SIZE)
                )
            ),
            __member(8),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        READ = layout.offsetof(0);
        SKIP = layout.offsetof(1);
        WRITE = layout.offsetof(2);
        GETPOS = layout.offsetof(3);
        SETPOS = layout.offsetof(4);
        GETSIZE = layout.offsetof(5);
        DESTRUCT = layout.offsetof(6);
        TYPE = layout.offsetof(7);
        DATA = layout.offsetof(8);
            DATA_FILE = layout.offsetof(9);
            DATA_MEM = layout.offsetof(10);
            DATA_CUSTOM_PTR = layout.offsetof(11);
                DATA_CUSTOM_PTR_ADDRESS = layout.offsetof(12);
                DATA_CUSTOM_PTR_ALLOCATORADDRESS = layout.offsetof(13);
                DATA_CUSTOM_PTR_SIZE = layout.offsetof(14);
        READPOS = layout.offsetof(15);
        CLOSEONDESTRUCT = layout.offsetof(16);
    }

    protected ktxStream(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxStream create(long address, @Nullable ByteBuffer container) {
        return new ktxStream(address, container);
    }

    /**
     * Creates a {@code ktxStream} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxStream(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** pointer to function for reading bytes */
    public ktxStream_read read() { return nread(address()); }
    /** pointer to function for skipping bytes */
    public ktxStream_skip skip() { return nskip(address()); }
    /** pointer to function for writing bytes */
    public ktxStream_write write() { return nwrite(address()); }
    /** pointer to function for getting current position in stream */
    public ktxStream_getpos getpos() { return ngetpos(address()); }
    /** pointer to function for setting current position in stream */
    public ktxStream_setpos setpos() { return nsetpos(address()); }
    /** pointer to function for querying size */
    public ktxStream_getsize getsize() { return ngetsize(address()); }
    /** destruct the stream */
    public ktxStream_destruct destruct() { return ndestruct(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("enum streamType")
    public int type() { return ntype(address()); }
    /** a {@code stdio} {@code FILE} pointer for a {@code ktxFileStream} */
    @NativeType("FILE *")
    public long data_file() { return ndata_file(address()); }
    /** a pointer to a {@code ktxMem} struct for a {@code ktxMemStream} */
    @NativeType("ktxMem *")
    public long data_mem() { return ndata_mem(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return pointer to the data
     */
    @NativeType("void *")
    public ByteBuffer data_custom_ptr_address(int capacity) { return ndata_custom_ptr_address(address(), capacity); }
    /** pointer to a memory allocator */
    @NativeType("void *")
    public long data_custom_ptr_allocatorAddress() { return ndata_custom_ptr_allocatorAddress(address()); }
    /** size of the data */
    @NativeType("ktx_size_t")
    public long data_custom_ptr_size() { return ndata_custom_ptr_size(address()); }
    /** used by {@code FileStream} for {@code stdin} */
    @NativeType("ktx_off_t")
    public long readpos() { return nreadpos(address()); }
    /** close {@code FILE*} or dispose of memory on destruct */
    @NativeType("ktx_bool_t")
    public boolean closeOnDestruct() { return ncloseOnDestruct(address()); }

    /** Sets the specified value to the {@link #read} field. */
    public ktxStream read(@NativeType("ktxStream_read") ktxStream_readI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@link #skip} field. */
    public ktxStream skip(@NativeType("ktxStream_skip") ktxStream_skipI value) { nskip(address(), value); return this; }
    /** Sets the specified value to the {@link #write} field. */
    public ktxStream write(@NativeType("ktxStream_write") ktxStream_writeI value) { nwrite(address(), value); return this; }
    /** Sets the specified value to the {@link #getpos} field. */
    public ktxStream getpos(@NativeType("ktxStream_getpos") ktxStream_getposI value) { ngetpos(address(), value); return this; }
    /** Sets the specified value to the {@link #setpos} field. */
    public ktxStream setpos(@NativeType("ktxStream_setpos") ktxStream_setposI value) { nsetpos(address(), value); return this; }
    /** Sets the specified value to the {@link #getsize} field. */
    public ktxStream getsize(@NativeType("ktxStream_getsize") ktxStream_getsizeI value) { ngetsize(address(), value); return this; }
    /** Sets the specified value to the {@link #destruct} field. */
    public ktxStream destruct(@NativeType("ktxStream_destruct") ktxStream_destructI value) { ndestruct(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public ktxStream type(@NativeType("enum streamType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #data_file} field. */
    public ktxStream data_file(@NativeType("FILE *") long value) { ndata_file(address(), value); return this; }
    /** Sets the specified value to the {@link #data_mem} field. */
    public ktxStream data_mem(@NativeType("ktxMem *") long value) { ndata_mem(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #data_custom_ptr_address} field. */
    public ktxStream data_custom_ptr_address(@NativeType("void *") ByteBuffer value) { ndata_custom_ptr_address(address(), value); return this; }
    /** Sets the specified value to the {@link #data_custom_ptr_allocatorAddress} field. */
    public ktxStream data_custom_ptr_allocatorAddress(@NativeType("void *") long value) { ndata_custom_ptr_allocatorAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #data_custom_ptr_size} field. */
    public ktxStream data_custom_ptr_size(@NativeType("ktx_size_t") long value) { ndata_custom_ptr_size(address(), value); return this; }
    /** Sets the specified value to the {@link #readpos} field. */
    public ktxStream readpos(@NativeType("ktx_off_t") long value) { nreadpos(address(), value); return this; }
    /** Sets the specified value to the {@link #closeOnDestruct} field. */
    public ktxStream closeOnDestruct(@NativeType("ktx_bool_t") boolean value) { ncloseOnDestruct(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxStream set(ktxStream src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxStream} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxStream malloc() {
        return new ktxStream(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxStream} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxStream calloc() {
        return new ktxStream(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxStream} instance allocated with {@link BufferUtils}. */
    public static ktxStream create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxStream(memAddress(container), container);
    }

    /** Returns a new {@code ktxStream} instance for the specified memory address. */
    public static ktxStream create(long address) {
        return new ktxStream(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxStream createSafe(long address) {
        return address == NULL ? null : new ktxStream(address, null);
    }

    /**
     * Returns a new {@link ktxStream.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxStream.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxStream.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxStream.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxStream.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxStream.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxStream.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxStream.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxStream.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxStream} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxStream malloc(MemoryStack stack) {
        return new ktxStream(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxStream} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxStream calloc(MemoryStack stack) {
        return new ktxStream(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxStream.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxStream.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxStream.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxStream.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #read}. */
    public static ktxStream_read nread(long struct) { return ktxStream_read.create(memGetAddress(struct + ktxStream.READ)); }
    /** Unsafe version of {@link #skip}. */
    public static ktxStream_skip nskip(long struct) { return ktxStream_skip.create(memGetAddress(struct + ktxStream.SKIP)); }
    /** Unsafe version of {@link #write}. */
    public static ktxStream_write nwrite(long struct) { return ktxStream_write.create(memGetAddress(struct + ktxStream.WRITE)); }
    /** Unsafe version of {@link #getpos}. */
    public static ktxStream_getpos ngetpos(long struct) { return ktxStream_getpos.create(memGetAddress(struct + ktxStream.GETPOS)); }
    /** Unsafe version of {@link #setpos}. */
    public static ktxStream_setpos nsetpos(long struct) { return ktxStream_setpos.create(memGetAddress(struct + ktxStream.SETPOS)); }
    /** Unsafe version of {@link #getsize}. */
    public static ktxStream_getsize ngetsize(long struct) { return ktxStream_getsize.create(memGetAddress(struct + ktxStream.GETSIZE)); }
    /** Unsafe version of {@link #destruct}. */
    public static ktxStream_destruct ndestruct(long struct) { return ktxStream_destruct.create(memGetAddress(struct + ktxStream.DESTRUCT)); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + ktxStream.TYPE); }
    /** Unsafe version of {@link #data_file}. */
    public static long ndata_file(long struct) { return memGetAddress(struct + ktxStream.DATA_FILE); }
    /** Unsafe version of {@link #data_mem}. */
    public static long ndata_mem(long struct) { return memGetAddress(struct + ktxStream.DATA_MEM); }
    /** Unsafe version of {@link #data_custom_ptr_address(int) data_custom_ptr_address}. */
    public static ByteBuffer ndata_custom_ptr_address(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + ktxStream.DATA_CUSTOM_PTR_ADDRESS), capacity); }
    /** Unsafe version of {@link #data_custom_ptr_allocatorAddress}. */
    public static long ndata_custom_ptr_allocatorAddress(long struct) { return memGetAddress(struct + ktxStream.DATA_CUSTOM_PTR_ALLOCATORADDRESS); }
    /** Unsafe version of {@link #data_custom_ptr_size}. */
    public static long ndata_custom_ptr_size(long struct) { return memGetAddress(struct + ktxStream.DATA_CUSTOM_PTR_SIZE); }
    /** Unsafe version of {@link #readpos}. */
    public static long nreadpos(long struct) { return UNSAFE.getLong(null, struct + ktxStream.READPOS); }
    /** Unsafe version of {@link #closeOnDestruct}. */
    public static boolean ncloseOnDestruct(long struct) { return UNSAFE.getByte(null, struct + ktxStream.CLOSEONDESTRUCT) != 0; }

    /** Unsafe version of {@link #read(ktxStream_readI) read}. */
    public static void nread(long struct, ktxStream_readI value) { memPutAddress(struct + ktxStream.READ, value.address()); }
    /** Unsafe version of {@link #skip(ktxStream_skipI) skip}. */
    public static void nskip(long struct, ktxStream_skipI value) { memPutAddress(struct + ktxStream.SKIP, value.address()); }
    /** Unsafe version of {@link #write(ktxStream_writeI) write}. */
    public static void nwrite(long struct, ktxStream_writeI value) { memPutAddress(struct + ktxStream.WRITE, value.address()); }
    /** Unsafe version of {@link #getpos(ktxStream_getposI) getpos}. */
    public static void ngetpos(long struct, ktxStream_getposI value) { memPutAddress(struct + ktxStream.GETPOS, value.address()); }
    /** Unsafe version of {@link #setpos(ktxStream_setposI) setpos}. */
    public static void nsetpos(long struct, ktxStream_setposI value) { memPutAddress(struct + ktxStream.SETPOS, value.address()); }
    /** Unsafe version of {@link #getsize(ktxStream_getsizeI) getsize}. */
    public static void ngetsize(long struct, ktxStream_getsizeI value) { memPutAddress(struct + ktxStream.GETSIZE, value.address()); }
    /** Unsafe version of {@link #destruct(ktxStream_destructI) destruct}. */
    public static void ndestruct(long struct, ktxStream_destructI value) { memPutAddress(struct + ktxStream.DESTRUCT, value.address()); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + ktxStream.TYPE, value); }
    /** Unsafe version of {@link #data_file(long) data_file}. */
    public static void ndata_file(long struct, long value) { memPutAddress(struct + ktxStream.DATA_FILE, check(value)); }
    /** Unsafe version of {@link #data_mem(long) data_mem}. */
    public static void ndata_mem(long struct, long value) { memPutAddress(struct + ktxStream.DATA_MEM, check(value)); }
    /** Unsafe version of {@link #data_custom_ptr_address(ByteBuffer) data_custom_ptr_address}. */
    public static void ndata_custom_ptr_address(long struct, ByteBuffer value) { memPutAddress(struct + ktxStream.DATA_CUSTOM_PTR_ADDRESS, memAddress(value)); }
    /** Unsafe version of {@link #data_custom_ptr_allocatorAddress(long) data_custom_ptr_allocatorAddress}. */
    public static void ndata_custom_ptr_allocatorAddress(long struct, long value) { memPutAddress(struct + ktxStream.DATA_CUSTOM_PTR_ALLOCATORADDRESS, value); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void ndata_custom_ptr_size(long struct, long value) { memPutAddress(struct + ktxStream.DATA_CUSTOM_PTR_SIZE, value); }
    /** Unsafe version of {@link #readpos(long) readpos}. */
    public static void nreadpos(long struct, long value) { UNSAFE.putLong(null, struct + ktxStream.READPOS, value); }
    /** Unsafe version of {@link #closeOnDestruct(boolean) closeOnDestruct}. */
    public static void ncloseOnDestruct(long struct, boolean value) { UNSAFE.putByte(null, struct + ktxStream.CLOSEONDESTRUCT, value ? (byte)1 : (byte)0); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ktxStream.READ));
        check(memGetAddress(struct + ktxStream.SKIP));
        check(memGetAddress(struct + ktxStream.WRITE));
        check(memGetAddress(struct + ktxStream.GETPOS));
        check(memGetAddress(struct + ktxStream.SETPOS));
        check(memGetAddress(struct + ktxStream.GETSIZE));
        check(memGetAddress(struct + ktxStream.DESTRUCT));
    }

    // -----------------------------------

    /** An array of {@link ktxStream} structs. */
    public static class Buffer extends StructBuffer<ktxStream, Buffer> implements NativeResource {

        private static final ktxStream ELEMENT_FACTORY = ktxStream.create(-1L);

        /**
         * Creates a new {@code ktxStream.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxStream#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxStream getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxStream#read} field. */
        public ktxStream_read read() { return ktxStream.nread(address()); }
        /** @return the value of the {@link ktxStream#skip} field. */
        public ktxStream_skip skip() { return ktxStream.nskip(address()); }
        /** @return the value of the {@link ktxStream#write} field. */
        public ktxStream_write write() { return ktxStream.nwrite(address()); }
        /** @return the value of the {@link ktxStream#getpos} field. */
        public ktxStream_getpos getpos() { return ktxStream.ngetpos(address()); }
        /** @return the value of the {@link ktxStream#setpos} field. */
        public ktxStream_setpos setpos() { return ktxStream.nsetpos(address()); }
        /** @return the value of the {@link ktxStream#getsize} field. */
        public ktxStream_getsize getsize() { return ktxStream.ngetsize(address()); }
        /** @return the value of the {@link ktxStream#destruct} field. */
        public ktxStream_destruct destruct() { return ktxStream.ndestruct(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("enum streamType")
        public int type() { return ktxStream.ntype(address()); }
        /** @return the value of the {@link ktxStream#data_file} field. */
        @NativeType("FILE *")
        public long data_file() { return ktxStream.ndata_file(address()); }
        /** @return the value of the {@link ktxStream#data_mem} field. */
        @NativeType("ktxMem *")
        public long data_mem() { return ktxStream.ndata_mem(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link ktxStream#data_custom_ptr_address} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer data_custom_ptr_address(int capacity) { return ktxStream.ndata_custom_ptr_address(address(), capacity); }
        /** @return the value of the {@link ktxStream#data_custom_ptr_allocatorAddress} field. */
        @NativeType("void *")
        public long data_custom_ptr_allocatorAddress() { return ktxStream.ndata_custom_ptr_allocatorAddress(address()); }
        /** @return the value of the {@link ktxStream#data_custom_ptr_size} field. */
        @NativeType("ktx_size_t")
        public long data_custom_ptr_size() { return ktxStream.ndata_custom_ptr_size(address()); }
        /** @return the value of the {@link ktxStream#readpos} field. */
        @NativeType("ktx_off_t")
        public long readpos() { return ktxStream.nreadpos(address()); }
        /** @return the value of the {@link ktxStream#closeOnDestruct} field. */
        @NativeType("ktx_bool_t")
        public boolean closeOnDestruct() { return ktxStream.ncloseOnDestruct(address()); }

        /** Sets the specified value to the {@link ktxStream#read} field. */
        public ktxStream.Buffer read(@NativeType("ktxStream_read") ktxStream_readI value) { ktxStream.nread(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#skip} field. */
        public ktxStream.Buffer skip(@NativeType("ktxStream_skip") ktxStream_skipI value) { ktxStream.nskip(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#write} field. */
        public ktxStream.Buffer write(@NativeType("ktxStream_write") ktxStream_writeI value) { ktxStream.nwrite(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#getpos} field. */
        public ktxStream.Buffer getpos(@NativeType("ktxStream_getpos") ktxStream_getposI value) { ktxStream.ngetpos(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#setpos} field. */
        public ktxStream.Buffer setpos(@NativeType("ktxStream_setpos") ktxStream_setposI value) { ktxStream.nsetpos(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#getsize} field. */
        public ktxStream.Buffer getsize(@NativeType("ktxStream_getsize") ktxStream_getsizeI value) { ktxStream.ngetsize(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#destruct} field. */
        public ktxStream.Buffer destruct(@NativeType("ktxStream_destruct") ktxStream_destructI value) { ktxStream.ndestruct(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public ktxStream.Buffer type(@NativeType("enum streamType") int value) { ktxStream.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#data_file} field. */
        public ktxStream.Buffer data_file(@NativeType("FILE *") long value) { ktxStream.ndata_file(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#data_mem} field. */
        public ktxStream.Buffer data_mem(@NativeType("ktxMem *") long value) { ktxStream.ndata_mem(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link ktxStream#data_custom_ptr_address} field. */
        public ktxStream.Buffer data_custom_ptr_address(@NativeType("void *") ByteBuffer value) { ktxStream.ndata_custom_ptr_address(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#data_custom_ptr_allocatorAddress} field. */
        public ktxStream.Buffer data_custom_ptr_allocatorAddress(@NativeType("void *") long value) { ktxStream.ndata_custom_ptr_allocatorAddress(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#data_custom_ptr_size} field. */
        public ktxStream.Buffer data_custom_ptr_size(@NativeType("ktx_size_t") long value) { ktxStream.ndata_custom_ptr_size(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#readpos} field. */
        public ktxStream.Buffer readpos(@NativeType("ktx_off_t") long value) { ktxStream.nreadpos(address(), value); return this; }
        /** Sets the specified value to the {@link ktxStream#closeOnDestruct} field. */
        public ktxStream.Buffer closeOnDestruct(@NativeType("ktx_bool_t") boolean value) { ktxStream.ncloseOnDestruct(address(), value); return this; }

    }

}