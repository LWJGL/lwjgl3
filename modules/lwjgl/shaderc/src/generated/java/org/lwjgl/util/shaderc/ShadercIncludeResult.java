/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * An include result.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct shaderc_include_result {
 *     char const * {@link #source_name};
 *     size_t source_name_length;
 *     char const * {@link #content};
 *     size_t content_length;
 *     void * {@link #user_data};
 * }</code></pre>
 */
@NativeType("struct shaderc_include_result")
public class ShadercIncludeResult extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SOURCE_NAME,
        SOURCE_NAME_LENGTH,
        CONTENT,
        CONTENT_LENGTH,
        USER_DATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SOURCE_NAME = layout.offsetof(0);
        SOURCE_NAME_LENGTH = layout.offsetof(1);
        CONTENT = layout.offsetof(2);
        CONTENT_LENGTH = layout.offsetof(3);
        USER_DATA = layout.offsetof(4);
    }

    /**
     * Creates a {@code ShadercIncludeResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ShadercIncludeResult(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * the name of the source file.
     * 
     * <p>The name should be fully resolved in the sense that it should be a unique name in the context of the includer. For example, if the includer maps source
     * names to files in a filesystem, then this name should be the absolute path of the file. For a failed inclusion, this string is empty.</p>
     */
    @NativeType("char const *")
    public ByteBuffer source_name() { return nsource_name(address()); }
    /**
     * the name of the source file.
     * 
     * <p>The name should be fully resolved in the sense that it should be a unique name in the context of the includer. For example, if the includer maps source
     * names to files in a filesystem, then this name should be the absolute path of the file. For a failed inclusion, this string is empty.</p>
     */
    @NativeType("char const *")
    public String source_nameString() { return nsource_nameString(address()); }
    /** @return the value of the {@code source_name_length} field. */
    @NativeType("size_t")
    public long source_name_length() { return nsource_name_length(address()); }
    /** the text contents of the source file in the normal case. For a failed inclusion, this contains the error message. */
    @NativeType("char const *")
    public ByteBuffer content() { return ncontent(address()); }
    /** the text contents of the source file in the normal case. For a failed inclusion, this contains the error message. */
    @NativeType("char const *")
    public String contentString() { return ncontentString(address()); }
    /** @return the value of the {@code content_length} field. */
    @NativeType("size_t")
    public long content_length() { return ncontent_length(address()); }
    /** user data to be passed along with this request */
    @NativeType("void *")
    public long user_data() { return nuser_data(address()); }

    /** Sets the address of the specified encoded string to the {@link #source_name} field. */
    public ShadercIncludeResult source_name(@NativeType("char const *") ByteBuffer value) { nsource_name(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #content} field. */
    public ShadercIncludeResult content(@NativeType("char const *") ByteBuffer value) { ncontent(address(), value); return this; }
    /** Sets the specified value to the {@link #user_data} field. */
    public ShadercIncludeResult user_data(@NativeType("void *") long value) { nuser_data(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ShadercIncludeResult set(
        ByteBuffer source_name,
        ByteBuffer content,
        long user_data
    ) {
        source_name(source_name);
        content(content);
        user_data(user_data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ShadercIncludeResult set(ShadercIncludeResult src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ShadercIncludeResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ShadercIncludeResult malloc() {
        return wrap(ShadercIncludeResult.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ShadercIncludeResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ShadercIncludeResult calloc() {
        return wrap(ShadercIncludeResult.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ShadercIncludeResult} instance allocated with {@link BufferUtils}. */
    public static ShadercIncludeResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ShadercIncludeResult.class, memAddress(container), container);
    }

    /** Returns a new {@code ShadercIncludeResult} instance for the specified memory address. */
    public static ShadercIncludeResult create(long address) {
        return wrap(ShadercIncludeResult.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercIncludeResult createSafe(long address) {
        return address == NULL ? null : wrap(ShadercIncludeResult.class, address);
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ShadercIncludeResult.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercIncludeResult.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ShadercIncludeResult.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ShadercIncludeResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercIncludeResult malloc(MemoryStack stack) {
        return wrap(ShadercIncludeResult.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ShadercIncludeResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercIncludeResult calloc(MemoryStack stack) {
        return wrap(ShadercIncludeResult.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #source_name}. */
    public static ByteBuffer nsource_name(long struct) { return memByteBufferNT1(memGetAddress(struct + ShadercIncludeResult.SOURCE_NAME)); }
    /** Unsafe version of {@link #source_nameString}. */
    public static String nsource_nameString(long struct) { return memUTF8(memGetAddress(struct + ShadercIncludeResult.SOURCE_NAME)); }
    /** Unsafe version of {@link #source_name_length}. */
    public static long nsource_name_length(long struct) { return memGetAddress(struct + ShadercIncludeResult.SOURCE_NAME_LENGTH); }
    /** Unsafe version of {@link #content}. */
    public static ByteBuffer ncontent(long struct) { return memByteBufferNT1(memGetAddress(struct + ShadercIncludeResult.CONTENT)); }
    /** Unsafe version of {@link #contentString}. */
    public static String ncontentString(long struct) { return memUTF8(memGetAddress(struct + ShadercIncludeResult.CONTENT)); }
    /** Unsafe version of {@link #content_length}. */
    public static long ncontent_length(long struct) { return memGetAddress(struct + ShadercIncludeResult.CONTENT_LENGTH); }
    /** Unsafe version of {@link #user_data}. */
    public static long nuser_data(long struct) { return memGetAddress(struct + ShadercIncludeResult.USER_DATA); }

    /** Unsafe version of {@link #source_name(ByteBuffer) source_name}. */
    public static void nsource_name(long struct, ByteBuffer value) {
        memPutAddress(struct + ShadercIncludeResult.SOURCE_NAME, memAddress(value));
        nsource_name_length(struct, value.remaining());
    }
    /** Sets the specified value to the {@code source_name_length} field of the specified {@code struct}. */
    public static void nsource_name_length(long struct, long value) { memPutAddress(struct + ShadercIncludeResult.SOURCE_NAME_LENGTH, value); }
    /** Unsafe version of {@link #content(ByteBuffer) content}. */
    public static void ncontent(long struct, ByteBuffer value) {
        memPutAddress(struct + ShadercIncludeResult.CONTENT, memAddress(value));
        ncontent_length(struct, value.remaining());
    }
    /** Sets the specified value to the {@code content_length} field of the specified {@code struct}. */
    public static void ncontent_length(long struct, long value) { memPutAddress(struct + ShadercIncludeResult.CONTENT_LENGTH, value); }
    /** Unsafe version of {@link #user_data(long) user_data}. */
    public static void nuser_data(long struct, long value) { memPutAddress(struct + ShadercIncludeResult.USER_DATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ShadercIncludeResult.SOURCE_NAME));
        check(memGetAddress(struct + ShadercIncludeResult.CONTENT));
    }

    // -----------------------------------

    /** An array of {@link ShadercIncludeResult} structs. */
    public static class Buffer extends StructBuffer<ShadercIncludeResult, Buffer> implements NativeResource {

        private static final ShadercIncludeResult ELEMENT_FACTORY = ShadercIncludeResult.create(-1L);

        /**
         * Creates a new {@code ShadercIncludeResult.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ShadercIncludeResult#SIZEOF}, and its mark will be undefined.
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
        protected ShadercIncludeResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link ShadercIncludeResult#source_name} field. */
        @NativeType("char const *")
        public ByteBuffer source_name() { return ShadercIncludeResult.nsource_name(address()); }
        /** @return the null-terminated string pointed to by the {@link ShadercIncludeResult#source_name} field. */
        @NativeType("char const *")
        public String source_nameString() { return ShadercIncludeResult.nsource_nameString(address()); }
        /** @return the value of the {@code source_name_length} field. */
        @NativeType("size_t")
        public long source_name_length() { return ShadercIncludeResult.nsource_name_length(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link ShadercIncludeResult#content} field. */
        @NativeType("char const *")
        public ByteBuffer content() { return ShadercIncludeResult.ncontent(address()); }
        /** @return the null-terminated string pointed to by the {@link ShadercIncludeResult#content} field. */
        @NativeType("char const *")
        public String contentString() { return ShadercIncludeResult.ncontentString(address()); }
        /** @return the value of the {@code content_length} field. */
        @NativeType("size_t")
        public long content_length() { return ShadercIncludeResult.ncontent_length(address()); }
        /** @return the value of the {@link ShadercIncludeResult#user_data} field. */
        @NativeType("void *")
        public long user_data() { return ShadercIncludeResult.nuser_data(address()); }

        /** Sets the address of the specified encoded string to the {@link ShadercIncludeResult#source_name} field. */
        public ShadercIncludeResult.Buffer source_name(@NativeType("char const *") ByteBuffer value) { ShadercIncludeResult.nsource_name(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link ShadercIncludeResult#content} field. */
        public ShadercIncludeResult.Buffer content(@NativeType("char const *") ByteBuffer value) { ShadercIncludeResult.ncontent(address(), value); return this; }
        /** Sets the specified value to the {@link ShadercIncludeResult#user_data} field. */
        public ShadercIncludeResult.Buffer user_data(@NativeType("void *") long value) { ShadercIncludeResult.nuser_data(address(), value); return this; }

    }

}