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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code read} &ndash; fill {@code data} with {@code size} bytes. Return number of bytes actually read.</li>
 * <li>{@code skip} &ndash; skip the next {@code n} bytes, or {@code unget} the last -n bytes if negative</li>
 * <li>{@code eof} &ndash; returns nonzero if we are at end of file/data</li>
 * </ul>
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

    STBIIOCallbacks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link STBIIOCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBIIOCallbacks(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code read} field. */
    @NativeType("int (*) (void *, char *, int)")
    public STBIReadCallback read() { return nread(address()); }
    /** Returns the value of the {@code skip} field. */
    @NativeType("void (*) (void *, int)")
    public STBISkipCallback skip() { return nskip(address()); }
    /** Returns the value of the {@code eof} field. */
    @NativeType("int (*) (void *)")
    public STBIEOFCallback eof() { return neof(address()); }

    /** Sets the specified value to the {@code read} field. */
    public STBIIOCallbacks read(@NativeType("int (*) (void *, char *, int)") STBIReadCallbackI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@code skip} field. */
    public STBIIOCallbacks skip(@NativeType("void (*) (void *, int)") STBISkipCallbackI value) { nskip(address(), value); return this; }
    /** Sets the specified value to the {@code eof} field. */
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

    /** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBIIOCallbacks malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link STBIIOCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBIIOCallbacks calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link STBIIOCallbacks} instance allocated with {@link BufferUtils}. */
    public static STBIIOCallbacks create() {
        return new STBIIOCallbacks(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link STBIIOCallbacks} instance for the specified memory address. */
    public static STBIIOCallbacks create(long address) {
        return new STBIIOCallbacks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBIIOCallbacks createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link STBIIOCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBIIOCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link STBIIOCallbacks} instance allocated on the thread-local {@link MemoryStack}. */
    public static STBIIOCallbacks mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link STBIIOCallbacks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static STBIIOCallbacks callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link STBIIOCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBIIOCallbacks mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link STBIIOCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBIIOCallbacks callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBIIOCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBIIOCallbacks.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link STBIIOCallbacks} structs. */
    public static class Buffer extends StructBuffer<STBIIOCallbacks, Buffer> implements NativeResource {

        /**
         * Creates a new {@link STBIIOCallbacks.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected STBIIOCallbacks newInstance(long address) {
            return new STBIIOCallbacks(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code read} field. */
        @NativeType("int (*) (void *, char *, int)")
        public STBIReadCallback read() { return STBIIOCallbacks.nread(address()); }
        /** Returns the value of the {@code skip} field. */
        @NativeType("void (*) (void *, int)")
        public STBISkipCallback skip() { return STBIIOCallbacks.nskip(address()); }
        /** Returns the value of the {@code eof} field. */
        @NativeType("int (*) (void *)")
        public STBIEOFCallback eof() { return STBIIOCallbacks.neof(address()); }

        /** Sets the specified value to the {@code read} field. */
        public STBIIOCallbacks.Buffer read(@NativeType("int (*) (void *, char *, int)") STBIReadCallbackI value) { STBIIOCallbacks.nread(address(), value); return this; }
        /** Sets the specified value to the {@code skip} field. */
        public STBIIOCallbacks.Buffer skip(@NativeType("void (*) (void *, int)") STBISkipCallbackI value) { STBIIOCallbacks.nskip(address(), value); return this; }
        /** Sets the specified value to the {@code eof} field. */
        public STBIIOCallbacks.Buffer eof(@NativeType("int (*) (void *)") STBIEOFCallbackI value) { STBIIOCallbacks.neof(address(), value); return this; }

    }

}