/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Image IO callbacks, used by {@link STBImage#stbi_load_from_callbacks load_from_callbacks}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbi_io_callbacks {
 *     int (*{@link STBIReadCallbackI read}) (void *user, char *data, int size);
 *     void (*{@link STBISkipCallbackI skip}) (void *user, int n);
 *     int (*{@link STBIEOFCallbackI eof}) (void *user);
 * }</code></pre>
 */
@NativeType("struct stbi_io_callbacks")
public class STBIIOCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        READ,
        SKIP,
        EOF;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        READ = layout.offsetof(0);
        SKIP = layout.offsetof(1);
        EOF = layout.offsetof(2);
    }

    /**
     * Creates a {@code STBIIOCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBIIOCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** fill {@code data} with {@code size} bytes. Return number of bytes actually read. */
    @NativeType("int (*) (void *, char *, int)")
    public STBIReadCallback read() { return nread(address()); }
    /** skip the next {@code n} bytes, or {@code unget} the last -n bytes if negative */
    @NativeType("void (*) (void *, int)")
    public STBISkipCallback skip() { return nskip(address()); }
    /** returns nonzero if we are at end of file/data */
    @NativeType("int (*) (void *)")
    public STBIEOFCallback eof() { return neof(address()); }

    /** Sets the specified value to the {@link #read} field. */
    public STBIIOCallbacks read(@NativeType("int (*) (void *, char *, int)") STBIReadCallbackI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@link #skip} field. */
    public STBIIOCallbacks skip(@NativeType("void (*) (void *, int)") STBISkipCallbackI value) { nskip(address(), value); return this; }
    /** Sets the specified value to the {@link #eof} field. */
    public STBIIOCallbacks eof(@NativeType("int (*) (void *)") STBIEOFCallbackI value) { neof(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public STBIIOCallbacks set(
        STBIReadCallbackI read,
        STBISkipCallbackI skip,
        STBIEOFCallbackI eof
    ) {
        read(read);
        skip(skip);
        eof(eof);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBIIOCallbacks set(STBIIOCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBIIOCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBIIOCallbacks malloc() {
        return wrap(STBIIOCallbacks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBIIOCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBIIOCallbacks calloc() {
        return wrap(STBIIOCallbacks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBIIOCallbacks} instance allocated with {@link BufferUtils}. */
    public static STBIIOCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBIIOCallbacks.class, memAddress(container), container);
    }

    /** Returns a new {@code STBIIOCallbacks} instance for the specified memory address. */
    public static STBIIOCallbacks create(long address) {
        return wrap(STBIIOCallbacks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBIIOCallbacks createSafe(long address) {
        return address == NULL ? null : wrap(STBIIOCallbacks.class, address);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBIIOCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBIIOCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBIIOCallbacks.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBIIOCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBIIOCallbacks malloc(MemoryStack stack) {
        return wrap(STBIIOCallbacks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBIIOCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBIIOCallbacks calloc(MemoryStack stack) {
        return wrap(STBIIOCallbacks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #read}. */
    public static STBIReadCallback nread(long struct) { return STBIReadCallback.create(memGetAddress(struct + STBIIOCallbacks.READ)); }
    /** Unsafe version of {@link #skip}. */
    public static STBISkipCallback nskip(long struct) { return STBISkipCallback.create(memGetAddress(struct + STBIIOCallbacks.SKIP)); }
    /** Unsafe version of {@link #eof}. */
    public static STBIEOFCallback neof(long struct) { return STBIEOFCallback.create(memGetAddress(struct + STBIIOCallbacks.EOF)); }

    /** Unsafe version of {@link #read(STBIReadCallbackI) read}. */
    public static void nread(long struct, STBIReadCallbackI value) { memPutAddress(struct + STBIIOCallbacks.READ, value.address()); }
    /** Unsafe version of {@link #skip(STBISkipCallbackI) skip}. */
    public static void nskip(long struct, STBISkipCallbackI value) { memPutAddress(struct + STBIIOCallbacks.SKIP, value.address()); }
    /** Unsafe version of {@link #eof(STBIEOFCallbackI) eof}. */
    public static void neof(long struct, STBIEOFCallbackI value) { memPutAddress(struct + STBIIOCallbacks.EOF, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + STBIIOCallbacks.READ));
        check(memGetAddress(struct + STBIIOCallbacks.SKIP));
        check(memGetAddress(struct + STBIIOCallbacks.EOF));
    }

    // -----------------------------------

    /** An array of {@link STBIIOCallbacks} structs. */
    public static class Buffer extends StructBuffer<STBIIOCallbacks, Buffer> implements NativeResource {

        private static final STBIIOCallbacks ELEMENT_FACTORY = STBIIOCallbacks.create(-1L);

        /**
         * Creates a new {@code STBIIOCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBIIOCallbacks#SIZEOF}, and its mark will be undefined.
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
        protected STBIIOCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link STBIIOCallbacks#read} field. */
        @NativeType("int (*) (void *, char *, int)")
        public STBIReadCallback read() { return STBIIOCallbacks.nread(address()); }
        /** @return the value of the {@link STBIIOCallbacks#skip} field. */
        @NativeType("void (*) (void *, int)")
        public STBISkipCallback skip() { return STBIIOCallbacks.nskip(address()); }
        /** @return the value of the {@link STBIIOCallbacks#eof} field. */
        @NativeType("int (*) (void *)")
        public STBIEOFCallback eof() { return STBIIOCallbacks.neof(address()); }

        /** Sets the specified value to the {@link STBIIOCallbacks#read} field. */
        public STBIIOCallbacks.Buffer read(@NativeType("int (*) (void *, char *, int)") STBIReadCallbackI value) { STBIIOCallbacks.nread(address(), value); return this; }
        /** Sets the specified value to the {@link STBIIOCallbacks#skip} field. */
        public STBIIOCallbacks.Buffer skip(@NativeType("void (*) (void *, int)") STBISkipCallbackI value) { STBIIOCallbacks.nskip(address(), value); return this; }
        /** Sets the specified value to the {@link STBIIOCallbacks#eof} field. */
        public STBIIOCallbacks.Buffer eof(@NativeType("int (*) (void *)") STBIEOFCallbackI value) { STBIIOCallbacks.neof(address(), value); return this; }

    }

}