/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct CXIndexOptions {
 *     unsigned Size;
 *     unsigned char ThreadBackgroundPriorityForIndexing;
 *     unsigned char ThreadBackgroundPriorityForEditing;
 *     unsigned ExcludeDeclarationsFromPCH : 1;
 *     unsigned DisplayDiagnostics : 1;
 *     unsigned StorePreamblesInMemory : 1;
 *     unsigned Reserved : 13;
 *     char const * PreambleStoragePath;
 *     char const * InvocationEmissionPath;
 * }}</pre>
 */
public class CXIndexOptions extends Struct<CXIndexOptions> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        THREADBACKGROUNDPRIORITYFORINDEXING,
        THREADBACKGROUNDPRIORITYFOREDITING,
        BITFIELD0,
        PREAMBLESTORAGEPATH,
        INVOCATIONEMISSIONPATH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(1),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        THREADBACKGROUNDPRIORITYFORINDEXING = layout.offsetof(1);
        THREADBACKGROUNDPRIORITYFOREDITING = layout.offsetof(2);
        BITFIELD0 = layout.offsetof(3);
        PREAMBLESTORAGEPATH = layout.offsetof(4);
        INVOCATIONEMISSIONPATH = layout.offsetof(5);
    }

    protected CXIndexOptions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXIndexOptions create(long address, @Nullable ByteBuffer container) {
        return new CXIndexOptions(address, container);
    }

    /**
     * Creates a {@code CXIndexOptions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIndexOptions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Size} field. */
    @NativeType("unsigned")
    public int Size() { return nSize(address()); }
    /** @return the value of the {@code ThreadBackgroundPriorityForIndexing} field. */
    @NativeType("unsigned char")
    public byte ThreadBackgroundPriorityForIndexing() { return nThreadBackgroundPriorityForIndexing(address()); }
    /** @return the value of the {@code ThreadBackgroundPriorityForEditing} field. */
    @NativeType("unsigned char")
    public byte ThreadBackgroundPriorityForEditing() { return nThreadBackgroundPriorityForEditing(address()); }
    /** @return the value of the {@code ExcludeDeclarationsFromPCH} field. */
    @NativeType("unsigned")
    public boolean ExcludeDeclarationsFromPCH() { return nExcludeDeclarationsFromPCH(address()) != 0; }
    /** @return the value of the {@code DisplayDiagnostics} field. */
    @NativeType("unsigned")
    public boolean DisplayDiagnostics() { return nDisplayDiagnostics(address()) != 0; }
    /** @return the value of the {@code StorePreamblesInMemory} field. */
    @NativeType("unsigned")
    public boolean StorePreamblesInMemory() { return nStorePreamblesInMemory(address()) != 0; }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code PreambleStoragePath} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer PreambleStoragePath() { return nPreambleStoragePath(address()); }
    /** @return the null-terminated string pointed to by the {@code PreambleStoragePath} field. */
    @NativeType("char const *")
    public @Nullable String PreambleStoragePathString() { return nPreambleStoragePathString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code InvocationEmissionPath} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer InvocationEmissionPath() { return nInvocationEmissionPath(address()); }
    /** @return the null-terminated string pointed to by the {@code InvocationEmissionPath} field. */
    @NativeType("char const *")
    public @Nullable String InvocationEmissionPathString() { return nInvocationEmissionPathString(address()); }

    /** Sets the specified value to the {@code Size} field. */
    public CXIndexOptions Size(@NativeType("unsigned") int value) { nSize(address(), value); return this; }
    /** Sets the default value to the {@code Size} field. */
    public CXIndexOptions Size$Default() { return Size(SIZEOF); }
    /** Sets the specified value to the {@code ThreadBackgroundPriorityForIndexing} field. */
    public CXIndexOptions ThreadBackgroundPriorityForIndexing(@NativeType("unsigned char") byte value) { nThreadBackgroundPriorityForIndexing(address(), value); return this; }
    /** Sets the specified value to the {@code ThreadBackgroundPriorityForEditing} field. */
    public CXIndexOptions ThreadBackgroundPriorityForEditing(@NativeType("unsigned char") byte value) { nThreadBackgroundPriorityForEditing(address(), value); return this; }
    /** Sets the specified value to the {@code ExcludeDeclarationsFromPCH} field. */
    public CXIndexOptions ExcludeDeclarationsFromPCH(@NativeType("unsigned") boolean value) { nExcludeDeclarationsFromPCH(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code DisplayDiagnostics} field. */
    public CXIndexOptions DisplayDiagnostics(@NativeType("unsigned") boolean value) { nDisplayDiagnostics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code StorePreamblesInMemory} field. */
    public CXIndexOptions StorePreamblesInMemory(@NativeType("unsigned") boolean value) { nStorePreamblesInMemory(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified encoded string to the {@code PreambleStoragePath} field. */
    public CXIndexOptions PreambleStoragePath(@Nullable @NativeType("char const *") ByteBuffer value) { nPreambleStoragePath(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code InvocationEmissionPath} field. */
    public CXIndexOptions InvocationEmissionPath(@Nullable @NativeType("char const *") ByteBuffer value) { nInvocationEmissionPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CXIndexOptions set(
        int Size,
        byte ThreadBackgroundPriorityForIndexing,
        byte ThreadBackgroundPriorityForEditing,
        boolean ExcludeDeclarationsFromPCH,
        boolean DisplayDiagnostics,
        boolean StorePreamblesInMemory,
        @Nullable ByteBuffer PreambleStoragePath,
        @Nullable ByteBuffer InvocationEmissionPath
    ) {
        Size(Size);
        ThreadBackgroundPriorityForIndexing(ThreadBackgroundPriorityForIndexing);
        ThreadBackgroundPriorityForEditing(ThreadBackgroundPriorityForEditing);
        ExcludeDeclarationsFromPCH(ExcludeDeclarationsFromPCH);
        DisplayDiagnostics(DisplayDiagnostics);
        StorePreamblesInMemory(StorePreamblesInMemory);
        PreambleStoragePath(PreambleStoragePath);
        InvocationEmissionPath(InvocationEmissionPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CXIndexOptions set(CXIndexOptions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CXIndexOptions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXIndexOptions malloc() {
        return new CXIndexOptions(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CXIndexOptions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXIndexOptions calloc() {
        return new CXIndexOptions(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CXIndexOptions} instance allocated with {@link BufferUtils}. */
    public static CXIndexOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CXIndexOptions(memAddress(container), container);
    }

    /** Returns a new {@code CXIndexOptions} instance for the specified memory address. */
    public static CXIndexOptions create(long address) {
        return new CXIndexOptions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXIndexOptions createSafe(long address) {
        return address == NULL ? null : new CXIndexOptions(address, null);
    }

    /**
     * Returns a new {@link CXIndexOptions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIndexOptions.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXIndexOptions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIndexOptions.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIndexOptions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXIndexOptions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CXIndexOptions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIndexOptions.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXIndexOptions.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CXIndexOptions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIndexOptions malloc(MemoryStack stack) {
        return new CXIndexOptions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CXIndexOptions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIndexOptions calloc(MemoryStack stack) {
        return new CXIndexOptions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CXIndexOptions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIndexOptions.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIndexOptions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIndexOptions.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Size}. */
    public static int nSize(long struct) { return memGetInt(struct + CXIndexOptions.SIZE); }
    /** Unsafe version of {@link #ThreadBackgroundPriorityForIndexing}. */
    public static byte nThreadBackgroundPriorityForIndexing(long struct) { return memGetByte(struct + CXIndexOptions.THREADBACKGROUNDPRIORITYFORINDEXING); }
    /** Unsafe version of {@link #ThreadBackgroundPriorityForEditing}. */
    public static byte nThreadBackgroundPriorityForEditing(long struct) { return memGetByte(struct + CXIndexOptions.THREADBACKGROUNDPRIORITYFOREDITING); }
    public static int nbitfield0(long struct) { return memGetInt(struct + CXIndexOptions.BITFIELD0); }
    /** Unsafe version of {@link #ExcludeDeclarationsFromPCH}. */
    public static int nExcludeDeclarationsFromPCH(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #DisplayDiagnostics}. */
    public static int nDisplayDiagnostics(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #StorePreamblesInMemory}. */
    public static int nStorePreamblesInMemory(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    public static int nReserved(long struct) { return (nbitfield0(struct) & 0x00_00_FF_F8) >>> 3; }
    /** Unsafe version of {@link #PreambleStoragePath}. */
    public static @Nullable ByteBuffer nPreambleStoragePath(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + CXIndexOptions.PREAMBLESTORAGEPATH)); }
    /** Unsafe version of {@link #PreambleStoragePathString}. */
    public static @Nullable String nPreambleStoragePathString(long struct) { return memUTF8Safe(memGetAddress(struct + CXIndexOptions.PREAMBLESTORAGEPATH)); }
    /** Unsafe version of {@link #InvocationEmissionPath}. */
    public static @Nullable ByteBuffer nInvocationEmissionPath(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + CXIndexOptions.INVOCATIONEMISSIONPATH)); }
    /** Unsafe version of {@link #InvocationEmissionPathString}. */
    public static @Nullable String nInvocationEmissionPathString(long struct) { return memUTF8Safe(memGetAddress(struct + CXIndexOptions.INVOCATIONEMISSIONPATH)); }

    /** Unsafe version of {@link #Size(int) Size}. */
    public static void nSize(long struct, int value) { memPutInt(struct + CXIndexOptions.SIZE, value); }
    /** Unsafe version of {@link #ThreadBackgroundPriorityForIndexing(byte) ThreadBackgroundPriorityForIndexing}. */
    public static void nThreadBackgroundPriorityForIndexing(long struct, byte value) { memPutByte(struct + CXIndexOptions.THREADBACKGROUNDPRIORITYFORINDEXING, value); }
    /** Unsafe version of {@link #ThreadBackgroundPriorityForEditing(byte) ThreadBackgroundPriorityForEditing}. */
    public static void nThreadBackgroundPriorityForEditing(long struct, byte value) { memPutByte(struct + CXIndexOptions.THREADBACKGROUNDPRIORITYFOREDITING, value); }
    public static void nbitfield0(long struct, int value) { memPutInt(struct + CXIndexOptions.BITFIELD0, value); }
    /** Unsafe version of {@link #ExcludeDeclarationsFromPCH(boolean) ExcludeDeclarationsFromPCH}. */
    public static void nExcludeDeclarationsFromPCH(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #DisplayDiagnostics(boolean) DisplayDiagnostics}. */
    public static void nDisplayDiagnostics(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #StorePreamblesInMemory(boolean) StorePreamblesInMemory}. */
    public static void nStorePreamblesInMemory(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    public static void nReserved(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_FF_F8) | (nbitfield0(struct) & 0xFF_FF_00_07)); }
    /** Unsafe version of {@link #PreambleStoragePath(ByteBuffer) PreambleStoragePath}. */
    public static void nPreambleStoragePath(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + CXIndexOptions.PREAMBLESTORAGEPATH, memAddressSafe(value));
    }
    /** Unsafe version of {@link #InvocationEmissionPath(ByteBuffer) InvocationEmissionPath}. */
    public static void nInvocationEmissionPath(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + CXIndexOptions.INVOCATIONEMISSIONPATH, memAddressSafe(value));
    }

    // -----------------------------------

    /** An array of {@link CXIndexOptions} structs. */
    public static class Buffer extends StructBuffer<CXIndexOptions, Buffer> implements NativeResource {

        private static final CXIndexOptions ELEMENT_FACTORY = CXIndexOptions.create(-1L);

        /**
         * Creates a new {@code CXIndexOptions.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIndexOptions#SIZEOF}, and its mark will be undefined.</p>
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
        protected CXIndexOptions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Size} field. */
        @NativeType("unsigned")
        public int Size() { return CXIndexOptions.nSize(address()); }
        /** @return the value of the {@code ThreadBackgroundPriorityForIndexing} field. */
        @NativeType("unsigned char")
        public byte ThreadBackgroundPriorityForIndexing() { return CXIndexOptions.nThreadBackgroundPriorityForIndexing(address()); }
        /** @return the value of the {@code ThreadBackgroundPriorityForEditing} field. */
        @NativeType("unsigned char")
        public byte ThreadBackgroundPriorityForEditing() { return CXIndexOptions.nThreadBackgroundPriorityForEditing(address()); }
        /** @return the value of the {@code ExcludeDeclarationsFromPCH} field. */
        @NativeType("unsigned")
        public boolean ExcludeDeclarationsFromPCH() { return CXIndexOptions.nExcludeDeclarationsFromPCH(address()) != 0; }
        /** @return the value of the {@code DisplayDiagnostics} field. */
        @NativeType("unsigned")
        public boolean DisplayDiagnostics() { return CXIndexOptions.nDisplayDiagnostics(address()) != 0; }
        /** @return the value of the {@code StorePreamblesInMemory} field. */
        @NativeType("unsigned")
        public boolean StorePreamblesInMemory() { return CXIndexOptions.nStorePreamblesInMemory(address()) != 0; }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code PreambleStoragePath} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer PreambleStoragePath() { return CXIndexOptions.nPreambleStoragePath(address()); }
        /** @return the null-terminated string pointed to by the {@code PreambleStoragePath} field. */
        @NativeType("char const *")
        public @Nullable String PreambleStoragePathString() { return CXIndexOptions.nPreambleStoragePathString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code InvocationEmissionPath} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer InvocationEmissionPath() { return CXIndexOptions.nInvocationEmissionPath(address()); }
        /** @return the null-terminated string pointed to by the {@code InvocationEmissionPath} field. */
        @NativeType("char const *")
        public @Nullable String InvocationEmissionPathString() { return CXIndexOptions.nInvocationEmissionPathString(address()); }

        /** Sets the specified value to the {@code Size} field. */
        public CXIndexOptions.Buffer Size(@NativeType("unsigned") int value) { CXIndexOptions.nSize(address(), value); return this; }
        /** Sets the default value to the {@code Size} field. */
        public CXIndexOptions.Buffer Size$Default() { return Size(SIZEOF); }
        /** Sets the specified value to the {@code ThreadBackgroundPriorityForIndexing} field. */
        public CXIndexOptions.Buffer ThreadBackgroundPriorityForIndexing(@NativeType("unsigned char") byte value) { CXIndexOptions.nThreadBackgroundPriorityForIndexing(address(), value); return this; }
        /** Sets the specified value to the {@code ThreadBackgroundPriorityForEditing} field. */
        public CXIndexOptions.Buffer ThreadBackgroundPriorityForEditing(@NativeType("unsigned char") byte value) { CXIndexOptions.nThreadBackgroundPriorityForEditing(address(), value); return this; }
        /** Sets the specified value to the {@code ExcludeDeclarationsFromPCH} field. */
        public CXIndexOptions.Buffer ExcludeDeclarationsFromPCH(@NativeType("unsigned") boolean value) { CXIndexOptions.nExcludeDeclarationsFromPCH(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code DisplayDiagnostics} field. */
        public CXIndexOptions.Buffer DisplayDiagnostics(@NativeType("unsigned") boolean value) { CXIndexOptions.nDisplayDiagnostics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code StorePreamblesInMemory} field. */
        public CXIndexOptions.Buffer StorePreamblesInMemory(@NativeType("unsigned") boolean value) { CXIndexOptions.nStorePreamblesInMemory(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified encoded string to the {@code PreambleStoragePath} field. */
        public CXIndexOptions.Buffer PreambleStoragePath(@Nullable @NativeType("char const *") ByteBuffer value) { CXIndexOptions.nPreambleStoragePath(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code InvocationEmissionPath} field. */
        public CXIndexOptions.Buffer InvocationEmissionPath(@Nullable @NativeType("char const *") ByteBuffer value) { CXIndexOptions.nInvocationEmissionPath(address(), value); return this; }

    }

}