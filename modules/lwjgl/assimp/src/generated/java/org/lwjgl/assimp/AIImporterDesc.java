/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct aiImporterDesc {
 *     char const * mName;
 *     char const * mAuthor;
 *     char const * mMaintainer;
 *     char const * mComments;
 *     unsigned int mFlags;
 *     unsigned int mMinMajor;
 *     unsigned int mMinMinor;
 *     unsigned int mMaxMajor;
 *     unsigned int mMaxMinor;
 *     char const * mFileExtensions;
 * }}</pre>
 */
@NativeType("struct aiImporterDesc")
public class AIImporterDesc extends Struct<AIImporterDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MAUTHOR,
        MMAINTAINER,
        MCOMMENTS,
        MFLAGS,
        MMINMAJOR,
        MMINMINOR,
        MMAXMAJOR,
        MMAXMINOR,
        MFILEEXTENSIONS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MAUTHOR = layout.offsetof(1);
        MMAINTAINER = layout.offsetof(2);
        MCOMMENTS = layout.offsetof(3);
        MFLAGS = layout.offsetof(4);
        MMINMAJOR = layout.offsetof(5);
        MMINMINOR = layout.offsetof(6);
        MMAXMAJOR = layout.offsetof(7);
        MMAXMINOR = layout.offsetof(8);
        MFILEEXTENSIONS = layout.offsetof(9);
    }

    protected AIImporterDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIImporterDesc create(long address, @Nullable ByteBuffer container) {
        return new AIImporterDesc(address, container);
    }

    /**
     * Creates a {@code AIImporterDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIImporterDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mName} field. */
    @NativeType("char const *")
    public ByteBuffer mName() { return nmName(address()); }
    /** @return the null-terminated string pointed to by the {@code mName} field. */
    @NativeType("char const *")
    public String mNameString() { return nmNameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mAuthor} field. */
    @NativeType("char const *")
    public ByteBuffer mAuthor() { return nmAuthor(address()); }
    /** @return the null-terminated string pointed to by the {@code mAuthor} field. */
    @NativeType("char const *")
    public String mAuthorString() { return nmAuthorString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mMaintainer} field. */
    @NativeType("char const *")
    public ByteBuffer mMaintainer() { return nmMaintainer(address()); }
    /** @return the null-terminated string pointed to by the {@code mMaintainer} field. */
    @NativeType("char const *")
    public String mMaintainerString() { return nmMaintainerString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mComments} field. */
    @NativeType("char const *")
    public ByteBuffer mComments() { return nmComments(address()); }
    /** @return the null-terminated string pointed to by the {@code mComments} field. */
    @NativeType("char const *")
    public String mCommentsString() { return nmCommentsString(address()); }
    /** @return the value of the {@code mFlags} field. */
    @NativeType("unsigned int")
    public int mFlags() { return nmFlags(address()); }
    /** @return the value of the {@code mMinMajor} field. */
    @NativeType("unsigned int")
    public int mMinMajor() { return nmMinMajor(address()); }
    /** @return the value of the {@code mMinMinor} field. */
    @NativeType("unsigned int")
    public int mMinMinor() { return nmMinMinor(address()); }
    /** @return the value of the {@code mMaxMajor} field. */
    @NativeType("unsigned int")
    public int mMaxMajor() { return nmMaxMajor(address()); }
    /** @return the value of the {@code mMaxMinor} field. */
    @NativeType("unsigned int")
    public int mMaxMinor() { return nmMaxMinor(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mFileExtensions} field. */
    @NativeType("char const *")
    public ByteBuffer mFileExtensions() { return nmFileExtensions(address()); }
    /** @return the null-terminated string pointed to by the {@code mFileExtensions} field. */
    @NativeType("char const *")
    public String mFileExtensionsString() { return nmFileExtensionsString(address()); }

    /** Sets the address of the specified encoded string to the {@code mName} field. */
    public AIImporterDesc mName(@NativeType("char const *") ByteBuffer value) { nmName(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code mAuthor} field. */
    public AIImporterDesc mAuthor(@NativeType("char const *") ByteBuffer value) { nmAuthor(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code mMaintainer} field. */
    public AIImporterDesc mMaintainer(@NativeType("char const *") ByteBuffer value) { nmMaintainer(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code mComments} field. */
    public AIImporterDesc mComments(@NativeType("char const *") ByteBuffer value) { nmComments(address(), value); return this; }
    /** Sets the specified value to the {@code mFlags} field. */
    public AIImporterDesc mFlags(@NativeType("unsigned int") int value) { nmFlags(address(), value); return this; }
    /** Sets the specified value to the {@code mMinMajor} field. */
    public AIImporterDesc mMinMajor(@NativeType("unsigned int") int value) { nmMinMajor(address(), value); return this; }
    /** Sets the specified value to the {@code mMinMinor} field. */
    public AIImporterDesc mMinMinor(@NativeType("unsigned int") int value) { nmMinMinor(address(), value); return this; }
    /** Sets the specified value to the {@code mMaxMajor} field. */
    public AIImporterDesc mMaxMajor(@NativeType("unsigned int") int value) { nmMaxMajor(address(), value); return this; }
    /** Sets the specified value to the {@code mMaxMinor} field. */
    public AIImporterDesc mMaxMinor(@NativeType("unsigned int") int value) { nmMaxMinor(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code mFileExtensions} field. */
    public AIImporterDesc mFileExtensions(@NativeType("char const *") ByteBuffer value) { nmFileExtensions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIImporterDesc set(
        ByteBuffer mName,
        ByteBuffer mAuthor,
        ByteBuffer mMaintainer,
        ByteBuffer mComments,
        int mFlags,
        int mMinMajor,
        int mMinMinor,
        int mMaxMajor,
        int mMaxMinor,
        ByteBuffer mFileExtensions
    ) {
        mName(mName);
        mAuthor(mAuthor);
        mMaintainer(mMaintainer);
        mComments(mComments);
        mFlags(mFlags);
        mMinMajor(mMinMajor);
        mMinMinor(mMinMinor);
        mMaxMajor(mMaxMajor);
        mMaxMinor(mMaxMinor);
        mFileExtensions(mFileExtensions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIImporterDesc set(AIImporterDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIImporterDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIImporterDesc malloc() {
        return new AIImporterDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIImporterDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIImporterDesc calloc() {
        return new AIImporterDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIImporterDesc} instance allocated with {@link BufferUtils}. */
    public static AIImporterDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIImporterDesc(memAddress(container), container);
    }

    /** Returns a new {@code AIImporterDesc} instance for the specified memory address. */
    public static AIImporterDesc create(long address) {
        return new AIImporterDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIImporterDesc createSafe(long address) {
        return address == NULL ? null : new AIImporterDesc(address, null);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIImporterDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIImporterDesc.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIImporterDesc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIImporterDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIImporterDesc malloc(MemoryStack stack) {
        return new AIImporterDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIImporterDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIImporterDesc calloc(MemoryStack stack) {
        return new AIImporterDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static ByteBuffer nmName(long struct) { return memByteBufferNT1(memGetAddress(struct + AIImporterDesc.MNAME)); }
    /** Unsafe version of {@link #mNameString}. */
    public static String nmNameString(long struct) { return memASCII(memGetAddress(struct + AIImporterDesc.MNAME)); }
    /** Unsafe version of {@link #mAuthor}. */
    public static ByteBuffer nmAuthor(long struct) { return memByteBufferNT1(memGetAddress(struct + AIImporterDesc.MAUTHOR)); }
    /** Unsafe version of {@link #mAuthorString}. */
    public static String nmAuthorString(long struct) { return memUTF8(memGetAddress(struct + AIImporterDesc.MAUTHOR)); }
    /** Unsafe version of {@link #mMaintainer}. */
    public static ByteBuffer nmMaintainer(long struct) { return memByteBufferNT1(memGetAddress(struct + AIImporterDesc.MMAINTAINER)); }
    /** Unsafe version of {@link #mMaintainerString}. */
    public static String nmMaintainerString(long struct) { return memUTF8(memGetAddress(struct + AIImporterDesc.MMAINTAINER)); }
    /** Unsafe version of {@link #mComments}. */
    public static ByteBuffer nmComments(long struct) { return memByteBufferNT1(memGetAddress(struct + AIImporterDesc.MCOMMENTS)); }
    /** Unsafe version of {@link #mCommentsString}. */
    public static String nmCommentsString(long struct) { return memUTF8(memGetAddress(struct + AIImporterDesc.MCOMMENTS)); }
    /** Unsafe version of {@link #mFlags}. */
    public static int nmFlags(long struct) { return memGetInt(struct + AIImporterDesc.MFLAGS); }
    /** Unsafe version of {@link #mMinMajor}. */
    public static int nmMinMajor(long struct) { return memGetInt(struct + AIImporterDesc.MMINMAJOR); }
    /** Unsafe version of {@link #mMinMinor}. */
    public static int nmMinMinor(long struct) { return memGetInt(struct + AIImporterDesc.MMINMINOR); }
    /** Unsafe version of {@link #mMaxMajor}. */
    public static int nmMaxMajor(long struct) { return memGetInt(struct + AIImporterDesc.MMAXMAJOR); }
    /** Unsafe version of {@link #mMaxMinor}. */
    public static int nmMaxMinor(long struct) { return memGetInt(struct + AIImporterDesc.MMAXMINOR); }
    /** Unsafe version of {@link #mFileExtensions}. */
    public static ByteBuffer nmFileExtensions(long struct) { return memByteBufferNT1(memGetAddress(struct + AIImporterDesc.MFILEEXTENSIONS)); }
    /** Unsafe version of {@link #mFileExtensionsString}. */
    public static String nmFileExtensionsString(long struct) { return memASCII(memGetAddress(struct + AIImporterDesc.MFILEEXTENSIONS)); }

    /** Unsafe version of {@link #mName(ByteBuffer) mName}. */
    public static void nmName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIImporterDesc.MNAME, memAddress(value));
    }
    /** Unsafe version of {@link #mAuthor(ByteBuffer) mAuthor}. */
    public static void nmAuthor(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIImporterDesc.MAUTHOR, memAddress(value));
    }
    /** Unsafe version of {@link #mMaintainer(ByteBuffer) mMaintainer}. */
    public static void nmMaintainer(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIImporterDesc.MMAINTAINER, memAddress(value));
    }
    /** Unsafe version of {@link #mComments(ByteBuffer) mComments}. */
    public static void nmComments(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIImporterDesc.MCOMMENTS, memAddress(value));
    }
    /** Unsafe version of {@link #mFlags(int) mFlags}. */
    public static void nmFlags(long struct, int value) { memPutInt(struct + AIImporterDesc.MFLAGS, value); }
    /** Unsafe version of {@link #mMinMajor(int) mMinMajor}. */
    public static void nmMinMajor(long struct, int value) { memPutInt(struct + AIImporterDesc.MMINMAJOR, value); }
    /** Unsafe version of {@link #mMinMinor(int) mMinMinor}. */
    public static void nmMinMinor(long struct, int value) { memPutInt(struct + AIImporterDesc.MMINMINOR, value); }
    /** Unsafe version of {@link #mMaxMajor(int) mMaxMajor}. */
    public static void nmMaxMajor(long struct, int value) { memPutInt(struct + AIImporterDesc.MMAXMAJOR, value); }
    /** Unsafe version of {@link #mMaxMinor(int) mMaxMinor}. */
    public static void nmMaxMinor(long struct, int value) { memPutInt(struct + AIImporterDesc.MMAXMINOR, value); }
    /** Unsafe version of {@link #mFileExtensions(ByteBuffer) mFileExtensions}. */
    public static void nmFileExtensions(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AIImporterDesc.MFILEEXTENSIONS, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIImporterDesc.MNAME));
        check(memGetAddress(struct + AIImporterDesc.MAUTHOR));
        check(memGetAddress(struct + AIImporterDesc.MMAINTAINER));
        check(memGetAddress(struct + AIImporterDesc.MCOMMENTS));
        check(memGetAddress(struct + AIImporterDesc.MFILEEXTENSIONS));
    }

    // -----------------------------------

    /** An array of {@link AIImporterDesc} structs. */
    public static class Buffer extends StructBuffer<AIImporterDesc, Buffer> implements NativeResource {

        private static final AIImporterDesc ELEMENT_FACTORY = AIImporterDesc.create(-1L);

        /**
         * Creates a new {@code AIImporterDesc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIImporterDesc#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIImporterDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mName} field. */
        @NativeType("char const *")
        public ByteBuffer mName() { return AIImporterDesc.nmName(address()); }
        /** @return the null-terminated string pointed to by the {@code mName} field. */
        @NativeType("char const *")
        public String mNameString() { return AIImporterDesc.nmNameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mAuthor} field. */
        @NativeType("char const *")
        public ByteBuffer mAuthor() { return AIImporterDesc.nmAuthor(address()); }
        /** @return the null-terminated string pointed to by the {@code mAuthor} field. */
        @NativeType("char const *")
        public String mAuthorString() { return AIImporterDesc.nmAuthorString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mMaintainer} field. */
        @NativeType("char const *")
        public ByteBuffer mMaintainer() { return AIImporterDesc.nmMaintainer(address()); }
        /** @return the null-terminated string pointed to by the {@code mMaintainer} field. */
        @NativeType("char const *")
        public String mMaintainerString() { return AIImporterDesc.nmMaintainerString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mComments} field. */
        @NativeType("char const *")
        public ByteBuffer mComments() { return AIImporterDesc.nmComments(address()); }
        /** @return the null-terminated string pointed to by the {@code mComments} field. */
        @NativeType("char const *")
        public String mCommentsString() { return AIImporterDesc.nmCommentsString(address()); }
        /** @return the value of the {@code mFlags} field. */
        @NativeType("unsigned int")
        public int mFlags() { return AIImporterDesc.nmFlags(address()); }
        /** @return the value of the {@code mMinMajor} field. */
        @NativeType("unsigned int")
        public int mMinMajor() { return AIImporterDesc.nmMinMajor(address()); }
        /** @return the value of the {@code mMinMinor} field. */
        @NativeType("unsigned int")
        public int mMinMinor() { return AIImporterDesc.nmMinMinor(address()); }
        /** @return the value of the {@code mMaxMajor} field. */
        @NativeType("unsigned int")
        public int mMaxMajor() { return AIImporterDesc.nmMaxMajor(address()); }
        /** @return the value of the {@code mMaxMinor} field. */
        @NativeType("unsigned int")
        public int mMaxMinor() { return AIImporterDesc.nmMaxMinor(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mFileExtensions} field. */
        @NativeType("char const *")
        public ByteBuffer mFileExtensions() { return AIImporterDesc.nmFileExtensions(address()); }
        /** @return the null-terminated string pointed to by the {@code mFileExtensions} field. */
        @NativeType("char const *")
        public String mFileExtensionsString() { return AIImporterDesc.nmFileExtensionsString(address()); }

        /** Sets the address of the specified encoded string to the {@code mName} field. */
        public AIImporterDesc.Buffer mName(@NativeType("char const *") ByteBuffer value) { AIImporterDesc.nmName(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code mAuthor} field. */
        public AIImporterDesc.Buffer mAuthor(@NativeType("char const *") ByteBuffer value) { AIImporterDesc.nmAuthor(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code mMaintainer} field. */
        public AIImporterDesc.Buffer mMaintainer(@NativeType("char const *") ByteBuffer value) { AIImporterDesc.nmMaintainer(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code mComments} field. */
        public AIImporterDesc.Buffer mComments(@NativeType("char const *") ByteBuffer value) { AIImporterDesc.nmComments(address(), value); return this; }
        /** Sets the specified value to the {@code mFlags} field. */
        public AIImporterDesc.Buffer mFlags(@NativeType("unsigned int") int value) { AIImporterDesc.nmFlags(address(), value); return this; }
        /** Sets the specified value to the {@code mMinMajor} field. */
        public AIImporterDesc.Buffer mMinMajor(@NativeType("unsigned int") int value) { AIImporterDesc.nmMinMajor(address(), value); return this; }
        /** Sets the specified value to the {@code mMinMinor} field. */
        public AIImporterDesc.Buffer mMinMinor(@NativeType("unsigned int") int value) { AIImporterDesc.nmMinMinor(address(), value); return this; }
        /** Sets the specified value to the {@code mMaxMajor} field. */
        public AIImporterDesc.Buffer mMaxMajor(@NativeType("unsigned int") int value) { AIImporterDesc.nmMaxMajor(address(), value); return this; }
        /** Sets the specified value to the {@code mMaxMinor} field. */
        public AIImporterDesc.Buffer mMaxMinor(@NativeType("unsigned int") int value) { AIImporterDesc.nmMaxMinor(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code mFileExtensions} field. */
        public AIImporterDesc.Buffer mFileExtensions(@NativeType("char const *") ByteBuffer value) { AIImporterDesc.nmFileExtensions(address(), value); return this; }

    }

}