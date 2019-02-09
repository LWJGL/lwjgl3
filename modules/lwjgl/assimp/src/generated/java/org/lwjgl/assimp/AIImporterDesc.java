/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Meta information about a particular importer. Importers need to fill this structure, but they can freely decide how talkative they are. A common use
 * case for loader meta info is a user interface in which the user can choose between various import/export file formats. Building such an UI by hand
 * means a lot of maintenance as importers / exporters are added to Assimp, so it might be useful to have a common mechanism to query some rough importer
 * characteristics.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; Full name of the importer (i.e. Blender3D importer)</li>
 * <li>{@code mAuthor} &ndash; Original author (left blank if unknown or whole assimp team)</li>
 * <li>{@code mMaintainer} &ndash; Current maintainer, left blank if the author maintains</li>
 * <li>{@code mComments} &ndash; Implementation comments, i.e. unimplemented features</li>
 * <li>{@code mFlags} &ndash; These flags indicate some characteristics common to many importers.</li>
 * <li>{@code mMinMajor} &ndash; Minimum major format that can be loaded in major.minor style.</li>
 * <li>{@code mMinMinor} &ndash; Minimum minor format that can be loaded in major.minor style.</li>
 * <li>{@code mMaxMajor} &ndash; Maximum major format that can be loaded in major.minor style.</li>
 * <li>{@code mMaxMinor} &ndash; Maximum minor format that can be loaded in major.minor style.</li>
 * <li>{@code mFileExtensions} &ndash; 
 * List of file extensions this importer can handle. List entries are separated by space characters. All entries are lower case without a leading dot
 * (i.e. "xml dae" would be a valid value. Note that multiple importers may respond to the same file extension - assimp calls all importers in the order
 * in which they are registered and each importer gets the opportunity to load the file until one importer "claims" the file. Apart from file extension
 * checks, importers typically use other methods to quickly reject files (i.e. magic words) so this does not mean that common or generic file extensions
 * such as XML would be tediously slow.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
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
 * }</code></pre>
 */
@NativeType("struct aiImporterDesc")
public class AIImporterDesc extends Struct implements NativeResource {

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

    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mName} field. */
    @NativeType("char const *")
    public ByteBuffer mName() { return nmName(address()); }
    /** Decodes the null-terminated string pointed to by the {@code mName} field. */
    @NativeType("char const *")
    public String mNameString() { return nmNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mAuthor} field. */
    @NativeType("char const *")
    public ByteBuffer mAuthor() { return nmAuthor(address()); }
    /** Decodes the null-terminated string pointed to by the {@code mAuthor} field. */
    @NativeType("char const *")
    public String mAuthorString() { return nmAuthorString(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mMaintainer} field. */
    @NativeType("char const *")
    public ByteBuffer mMaintainer() { return nmMaintainer(address()); }
    /** Decodes the null-terminated string pointed to by the {@code mMaintainer} field. */
    @NativeType("char const *")
    public String mMaintainerString() { return nmMaintainerString(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mComments} field. */
    @NativeType("char const *")
    public ByteBuffer mComments() { return nmComments(address()); }
    /** Decodes the null-terminated string pointed to by the {@code mComments} field. */
    @NativeType("char const *")
    public String mCommentsString() { return nmCommentsString(address()); }
    /** Returns the value of the {@code mFlags} field. */
    @NativeType("unsigned int")
    public int mFlags() { return nmFlags(address()); }
    /** Returns the value of the {@code mMinMajor} field. */
    @NativeType("unsigned int")
    public int mMinMajor() { return nmMinMajor(address()); }
    /** Returns the value of the {@code mMinMinor} field. */
    @NativeType("unsigned int")
    public int mMinMinor() { return nmMinMinor(address()); }
    /** Returns the value of the {@code mMaxMajor} field. */
    @NativeType("unsigned int")
    public int mMaxMajor() { return nmMaxMajor(address()); }
    /** Returns the value of the {@code mMaxMinor} field. */
    @NativeType("unsigned int")
    public int mMaxMinor() { return nmMaxMinor(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mFileExtensions} field. */
    @NativeType("char const *")
    public ByteBuffer mFileExtensions() { return nmFileExtensions(address()); }
    /** Decodes the null-terminated string pointed to by the {@code mFileExtensions} field. */
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
        return wrap(AIImporterDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIImporterDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIImporterDesc calloc() {
        return wrap(AIImporterDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIImporterDesc} instance allocated with {@link BufferUtils}. */
    public static AIImporterDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIImporterDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code AIImporterDesc} instance for the specified memory address. */
    public static AIImporterDesc create(long address) {
        return wrap(AIImporterDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIImporterDesc createSafe(long address) {
        return address == NULL ? null : wrap(AIImporterDesc.class, address);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIImporterDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIImporterDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code AIImporterDesc} instance allocated on the thread-local {@link MemoryStack}. */
    public static AIImporterDesc mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code AIImporterDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static AIImporterDesc callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code AIImporterDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIImporterDesc mallocStack(MemoryStack stack) {
        return wrap(AIImporterDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIImporterDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIImporterDesc callocStack(MemoryStack stack) {
        return wrap(AIImporterDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIImporterDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIImporterDesc.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    public static int nmFlags(long struct) { return UNSAFE.getInt(null, struct + AIImporterDesc.MFLAGS); }
    /** Unsafe version of {@link #mMinMajor}. */
    public static int nmMinMajor(long struct) { return UNSAFE.getInt(null, struct + AIImporterDesc.MMINMAJOR); }
    /** Unsafe version of {@link #mMinMinor}. */
    public static int nmMinMinor(long struct) { return UNSAFE.getInt(null, struct + AIImporterDesc.MMINMINOR); }
    /** Unsafe version of {@link #mMaxMajor}. */
    public static int nmMaxMajor(long struct) { return UNSAFE.getInt(null, struct + AIImporterDesc.MMAXMAJOR); }
    /** Unsafe version of {@link #mMaxMinor}. */
    public static int nmMaxMinor(long struct) { return UNSAFE.getInt(null, struct + AIImporterDesc.MMAXMINOR); }
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
    public static void nmFlags(long struct, int value) { UNSAFE.putInt(null, struct + AIImporterDesc.MFLAGS, value); }
    /** Unsafe version of {@link #mMinMajor(int) mMinMajor}. */
    public static void nmMinMajor(long struct, int value) { UNSAFE.putInt(null, struct + AIImporterDesc.MMINMAJOR, value); }
    /** Unsafe version of {@link #mMinMinor(int) mMinMinor}. */
    public static void nmMinMinor(long struct, int value) { UNSAFE.putInt(null, struct + AIImporterDesc.MMINMINOR, value); }
    /** Unsafe version of {@link #mMaxMajor(int) mMaxMajor}. */
    public static void nmMaxMajor(long struct, int value) { UNSAFE.putInt(null, struct + AIImporterDesc.MMAXMAJOR, value); }
    /** Unsafe version of {@link #mMaxMinor(int) mMaxMinor}. */
    public static void nmMaxMinor(long struct, int value) { UNSAFE.putInt(null, struct + AIImporterDesc.MMAXMINOR, value); }
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

    /** An array of {@link AIImporterDesc} structs. */
    public static class Buffer extends StructBuffer<AIImporterDesc, Buffer> implements NativeResource {

        private static final AIImporterDesc ELEMENT_FACTORY = AIImporterDesc.create(-1L);

        /**
         * Creates a new {@code AIImporterDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIImporterDesc#SIZEOF}, and its mark will be undefined.
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
        protected AIImporterDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mName} field. */
        @NativeType("char const *")
        public ByteBuffer mName() { return AIImporterDesc.nmName(address()); }
        /** Decodes the null-terminated string pointed to by the {@code mName} field. */
        @NativeType("char const *")
        public String mNameString() { return AIImporterDesc.nmNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mAuthor} field. */
        @NativeType("char const *")
        public ByteBuffer mAuthor() { return AIImporterDesc.nmAuthor(address()); }
        /** Decodes the null-terminated string pointed to by the {@code mAuthor} field. */
        @NativeType("char const *")
        public String mAuthorString() { return AIImporterDesc.nmAuthorString(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mMaintainer} field. */
        @NativeType("char const *")
        public ByteBuffer mMaintainer() { return AIImporterDesc.nmMaintainer(address()); }
        /** Decodes the null-terminated string pointed to by the {@code mMaintainer} field. */
        @NativeType("char const *")
        public String mMaintainerString() { return AIImporterDesc.nmMaintainerString(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mComments} field. */
        @NativeType("char const *")
        public ByteBuffer mComments() { return AIImporterDesc.nmComments(address()); }
        /** Decodes the null-terminated string pointed to by the {@code mComments} field. */
        @NativeType("char const *")
        public String mCommentsString() { return AIImporterDesc.nmCommentsString(address()); }
        /** Returns the value of the {@code mFlags} field. */
        @NativeType("unsigned int")
        public int mFlags() { return AIImporterDesc.nmFlags(address()); }
        /** Returns the value of the {@code mMinMajor} field. */
        @NativeType("unsigned int")
        public int mMinMajor() { return AIImporterDesc.nmMinMajor(address()); }
        /** Returns the value of the {@code mMinMinor} field. */
        @NativeType("unsigned int")
        public int mMinMinor() { return AIImporterDesc.nmMinMinor(address()); }
        /** Returns the value of the {@code mMaxMajor} field. */
        @NativeType("unsigned int")
        public int mMaxMajor() { return AIImporterDesc.nmMaxMajor(address()); }
        /** Returns the value of the {@code mMaxMinor} field. */
        @NativeType("unsigned int")
        public int mMaxMinor() { return AIImporterDesc.nmMaxMinor(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code mFileExtensions} field. */
        @NativeType("char const *")
        public ByteBuffer mFileExtensions() { return AIImporterDesc.nmFileExtensions(address()); }
        /** Decodes the null-terminated string pointed to by the {@code mFileExtensions} field. */
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