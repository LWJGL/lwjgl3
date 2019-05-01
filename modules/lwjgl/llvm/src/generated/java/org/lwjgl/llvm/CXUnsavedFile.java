/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provides the contents of a file that has not yet been saved to disk.
 * 
 * <p>Each {@code CXUnsavedFile} instance provides the name of a file on the system along with the current contents of that file that have not yet been saved
 * to disk.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Filename} &ndash; 
 * the file whose contents have not yet been saved.
 * 
 * <p>This file must already exist in the file system.</p></li>
 * <li>{@code Contents} &ndash; a buffer containing the unsaved contents of this file</li>
 * <li>{@code Length} &ndash; the length of the unsaved contents of this buffer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXUnsavedFile {
 *     char const * Filename;
 *     char const * Contents;
 *     unsigned long Length;
 * }</code></pre>
 */
@NativeType("struct CXUnsavedFile")
public class CXUnsavedFile extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FILENAME,
        CONTENTS,
        LENGTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FILENAME = layout.offsetof(0);
        CONTENTS = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXUnsavedFile} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXUnsavedFile(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code Filename} field. */
    @NativeType("char const *")
    public ByteBuffer Filename() { return nFilename(address()); }
    /** Decodes the null-terminated string pointed to by the {@code Filename} field. */
    @NativeType("char const *")
    public String FilenameString() { return nFilenameString(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code Contents} field. */
    @NativeType("char const *")
    public ByteBuffer Contents() { return nContents(address()); }
    /** Returns the value of the {@code Length} field. */
    @NativeType("unsigned long")
    public long Length() { return nLength(address()); }

    /** Sets the address of the specified encoded string to the {@code Filename} field. */
    public CXUnsavedFile Filename(@NativeType("char const *") ByteBuffer value) { nFilename(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code Contents} field. */
    public CXUnsavedFile Contents(@NativeType("char const *") ByteBuffer value) { nContents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CXUnsavedFile set(
        ByteBuffer Filename,
        ByteBuffer Contents
    ) {
        Filename(Filename);
        Contents(Contents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CXUnsavedFile set(CXUnsavedFile src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CXUnsavedFile} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXUnsavedFile malloc() {
        return wrap(CXUnsavedFile.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXUnsavedFile} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXUnsavedFile calloc() {
        return wrap(CXUnsavedFile.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXUnsavedFile} instance allocated with {@link BufferUtils}. */
    public static CXUnsavedFile create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXUnsavedFile.class, memAddress(container), container);
    }

    /** Returns a new {@code CXUnsavedFile} instance for the specified memory address. */
    public static CXUnsavedFile create(long address) {
        return wrap(CXUnsavedFile.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXUnsavedFile createSafe(long address) {
        return address == NULL ? null : wrap(CXUnsavedFile.class, address);
    }

    /**
     * Returns a new {@link CXUnsavedFile.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXUnsavedFile.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXUnsavedFile.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXUnsavedFile.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXUnsavedFile.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CXUnsavedFile} instance allocated on the thread-local {@link MemoryStack}. */
    public static CXUnsavedFile mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CXUnsavedFile} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CXUnsavedFile callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CXUnsavedFile} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXUnsavedFile mallocStack(MemoryStack stack) {
        return wrap(CXUnsavedFile.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXUnsavedFile} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXUnsavedFile callocStack(MemoryStack stack) {
        return wrap(CXUnsavedFile.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXUnsavedFile.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CXUnsavedFile.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CXUnsavedFile.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXUnsavedFile.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXUnsavedFile.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Filename}. */
    public static ByteBuffer nFilename(long struct) { return memByteBufferNT1(memGetAddress(struct + CXUnsavedFile.FILENAME)); }
    /** Unsafe version of {@link #FilenameString}. */
    public static String nFilenameString(long struct) { return memASCII(memGetAddress(struct + CXUnsavedFile.FILENAME)); }
    /** Unsafe version of {@link #Contents() Contents}. */
    public static ByteBuffer nContents(long struct) { return memByteBuffer(memGetAddress(struct + CXUnsavedFile.CONTENTS), (int)nLength(struct)); }
    /** Unsafe version of {@link #Length}. */
    public static long nLength(long struct) { return memGetCLong(struct + CXUnsavedFile.LENGTH); }

    /** Unsafe version of {@link #Filename(ByteBuffer) Filename}. */
    public static void nFilename(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + CXUnsavedFile.FILENAME, memAddress(value));
    }
    /** Unsafe version of {@link #Contents(ByteBuffer) Contents}. */
    public static void nContents(long struct, ByteBuffer value) { memPutAddress(struct + CXUnsavedFile.CONTENTS, memAddress(value)); nLength(struct, value.remaining()); }
    /** Sets the specified value to the {@code Length} field of the specified {@code struct}. */
    public static void nLength(long struct, long value) { memPutCLong(struct + CXUnsavedFile.LENGTH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CXUnsavedFile.FILENAME));
        check(memGetAddress(struct + CXUnsavedFile.CONTENTS));
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

    /** An array of {@link CXUnsavedFile} structs. */
    public static class Buffer extends StructBuffer<CXUnsavedFile, Buffer> implements NativeResource {

        private static final CXUnsavedFile ELEMENT_FACTORY = CXUnsavedFile.create(-1L);

        /**
         * Creates a new {@code CXUnsavedFile.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXUnsavedFile#SIZEOF}, and its mark will be undefined.
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
        protected CXUnsavedFile getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code Filename} field. */
        @NativeType("char const *")
        public ByteBuffer Filename() { return CXUnsavedFile.nFilename(address()); }
        /** Decodes the null-terminated string pointed to by the {@code Filename} field. */
        @NativeType("char const *")
        public String FilenameString() { return CXUnsavedFile.nFilenameString(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code Contents} field. */
        @NativeType("char const *")
        public ByteBuffer Contents() { return CXUnsavedFile.nContents(address()); }
        /** Returns the value of the {@code Length} field. */
        @NativeType("unsigned long")
        public long Length() { return CXUnsavedFile.nLength(address()); }

        /** Sets the address of the specified encoded string to the {@code Filename} field. */
        public CXUnsavedFile.Buffer Filename(@NativeType("char const *") ByteBuffer value) { CXUnsavedFile.nFilename(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code Contents} field. */
        public CXUnsavedFile.Buffer Contents(@NativeType("char const *") ByteBuffer value) { CXUnsavedFile.nContents(address(), value); return this; }

    }

}