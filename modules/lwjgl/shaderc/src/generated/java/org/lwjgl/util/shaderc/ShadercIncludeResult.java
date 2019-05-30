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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code source_name} &ndash; 
 * the name of the source file.
 * 
 * <p>The name should be fully resolved in the sense that it should be a unique name in the context of the includer. For example, if the includer maps source
 * names to files in a filesystem, then this name should be the absolute path of the file. For a failed inclusion, this string is empty.</p></li>
 * <li>{@code content} &ndash; the text contents of the source file in the normal case. For a failed inclusion, this contains the error message.</li>
 * <li>{@code user_data} &ndash; user data to be passed along with this request</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct shaderc_include_result {
 *     char const * source_name;
 *     size_t source_name_length;
 *     char const * content;
 *     size_t content_length;
 *     void * user_data;
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

    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code source_name} field. */
    @NativeType("char const *")
    public ByteBuffer source_name() { return nsource_name(address()); }
    /** Decodes the null-terminated string pointed to by the {@code source_name} field. */
    @NativeType("char const *")
    public String source_nameString() { return nsource_nameString(address()); }
    /** Returns the value of the {@code source_name_length} field. */
    @NativeType("size_t")
    public long source_name_length() { return nsource_name_length(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code content} field. */
    @NativeType("char const *")
    public ByteBuffer content() { return ncontent(address()); }
    /** Decodes the null-terminated string pointed to by the {@code content} field. */
    @NativeType("char const *")
    public String contentString() { return ncontentString(address()); }
    /** Returns the value of the {@code content_length} field. */
    @NativeType("size_t")
    public long content_length() { return ncontent_length(address()); }
    /** Returns the value of the {@code user_data} field. */
    @NativeType("void *")
    public long user_data() { return nuser_data(address()); }

    /** Sets the address of the specified encoded string to the {@code source_name} field. */
    public ShadercIncludeResult source_name(@NativeType("char const *") ByteBuffer value) { nsource_name(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code content} field. */
    public ShadercIncludeResult content(@NativeType("char const *") ByteBuffer value) { ncontent(address(), value); return this; }
    /** Sets the specified value to the {@code user_data} field. */
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

    /** Returns a new {@code ShadercIncludeResult} instance allocated on the thread-local {@link MemoryStack}. */
    public static ShadercIncludeResult mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ShadercIncludeResult} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ShadercIncludeResult callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ShadercIncludeResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercIncludeResult mallocStack(MemoryStack stack) {
        return wrap(ShadercIncludeResult.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ShadercIncludeResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercIncludeResult callocStack(MemoryStack stack) {
        return wrap(ShadercIncludeResult.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercIncludeResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercIncludeResult.Buffer callocStack(int capacity, MemoryStack stack) {
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
    public static void nuser_data(long struct, long value) { memPutAddress(struct + ShadercIncludeResult.USER_DATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ShadercIncludeResult.SOURCE_NAME));
        check(memGetAddress(struct + ShadercIncludeResult.CONTENT));
        check(memGetAddress(struct + ShadercIncludeResult.USER_DATA));
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

        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code source_name} field. */
        @NativeType("char const *")
        public ByteBuffer source_name() { return ShadercIncludeResult.nsource_name(address()); }
        /** Decodes the null-terminated string pointed to by the {@code source_name} field. */
        @NativeType("char const *")
        public String source_nameString() { return ShadercIncludeResult.nsource_nameString(address()); }
        /** Returns the value of the {@code source_name_length} field. */
        @NativeType("size_t")
        public long source_name_length() { return ShadercIncludeResult.nsource_name_length(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code content} field. */
        @NativeType("char const *")
        public ByteBuffer content() { return ShadercIncludeResult.ncontent(address()); }
        /** Decodes the null-terminated string pointed to by the {@code content} field. */
        @NativeType("char const *")
        public String contentString() { return ShadercIncludeResult.ncontentString(address()); }
        /** Returns the value of the {@code content_length} field. */
        @NativeType("size_t")
        public long content_length() { return ShadercIncludeResult.ncontent_length(address()); }
        /** Returns the value of the {@code user_data} field. */
        @NativeType("void *")
        public long user_data() { return ShadercIncludeResult.nuser_data(address()); }

        /** Sets the address of the specified encoded string to the {@code source_name} field. */
        public ShadercIncludeResult.Buffer source_name(@NativeType("char const *") ByteBuffer value) { ShadercIncludeResult.nsource_name(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code content} field. */
        public ShadercIncludeResult.Buffer content(@NativeType("char const *") ByteBuffer value) { ShadercIncludeResult.ncontent(address(), value); return this; }
        /** Sets the specified value to the {@code user_data} field. */
        public ShadercIncludeResult.Buffer user_data(@NativeType("void *") long value) { ShadercIncludeResult.nuser_data(address(), value); return this; }

    }

}