/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Parameters for recording calls to VMA functions. To be used in {@link VmaAllocatorCreateInfo}{@code ::pRecordSettings}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code flags} &ndash; flags for recording. Must be:<br><table><tr><td>{@link Vma#VMA_RECORD_FLUSH_AFTER_CALL_BIT RECORD_FLUSH_AFTER_CALL_BIT}</td></tr></table></li>
 * <li>{@code pFilePath} &ndash; 
 * path to the file that should be written by the recording.
 * 
 * <p>Suggested extension: "csv". If the file already exists, it will be overwritten. It will be opened for the whole time {@code VmaAllocator} object is
 * alive. If opening this file fails, creation of the whole allocator object fails.</p></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaRecordSettings {
 *     VmaRecordFlags flags;
 *     char const * pFilePath;
 * }</code></pre>
 */
public class VmaRecordSettings extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PFILEPATH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PFILEPATH = layout.offsetof(1);
    }

    /**
     * Creates a {@code VmaRecordSettings} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaRecordSettings(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code flags} field. */
    @NativeType("VmaRecordFlags")
    public int flags() { return nflags(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pFilePath} field. */
    @NativeType("char const *")
    public ByteBuffer pFilePath() { return npFilePath(address()); }
    /** Decodes the null-terminated string pointed to by the {@code pFilePath} field. */
    @NativeType("char const *")
    public String pFilePathString() { return npFilePathString(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public VmaRecordSettings flags(@NativeType("VmaRecordFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pFilePath} field. */
    public VmaRecordSettings pFilePath(@NativeType("char const *") ByteBuffer value) { npFilePath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaRecordSettings set(
        int flags,
        ByteBuffer pFilePath
    ) {
        flags(flags);
        pFilePath(pFilePath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaRecordSettings set(VmaRecordSettings src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaRecordSettings} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaRecordSettings malloc() {
        return wrap(VmaRecordSettings.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaRecordSettings} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaRecordSettings calloc() {
        return wrap(VmaRecordSettings.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaRecordSettings} instance allocated with {@link BufferUtils}. */
    public static VmaRecordSettings create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaRecordSettings.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaRecordSettings} instance for the specified memory address. */
    public static VmaRecordSettings create(long address) {
        return wrap(VmaRecordSettings.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaRecordSettings createSafe(long address) {
        return address == NULL ? null : wrap(VmaRecordSettings.class, address);
    }

    /**
     * Returns a new {@link VmaRecordSettings.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaRecordSettings.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaRecordSettings.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaRecordSettings.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaRecordSettings.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VmaRecordSettings} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaRecordSettings mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VmaRecordSettings} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaRecordSettings callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VmaRecordSettings} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaRecordSettings mallocStack(MemoryStack stack) {
        return wrap(VmaRecordSettings.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaRecordSettings} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaRecordSettings callocStack(MemoryStack stack) {
        return wrap(VmaRecordSettings.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaRecordSettings.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaRecordSettings.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VmaRecordSettings.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaRecordSettings.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaRecordSettings.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VmaRecordSettings.FLAGS); }
    /** Unsafe version of {@link #pFilePath}. */
    public static ByteBuffer npFilePath(long struct) { return memByteBufferNT1(memGetAddress(struct + VmaRecordSettings.PFILEPATH)); }
    /** Unsafe version of {@link #pFilePathString}. */
    public static String npFilePathString(long struct) { return memASCII(memGetAddress(struct + VmaRecordSettings.PFILEPATH)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VmaRecordSettings.FLAGS, value); }
    /** Unsafe version of {@link #pFilePath(ByteBuffer) pFilePath}. */
    public static void npFilePath(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VmaRecordSettings.PFILEPATH, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VmaRecordSettings.PFILEPATH));
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

    /** An array of {@link VmaRecordSettings} structs. */
    public static class Buffer extends StructBuffer<VmaRecordSettings, Buffer> implements NativeResource {

        private static final VmaRecordSettings ELEMENT_FACTORY = VmaRecordSettings.create(-1L);

        /**
         * Creates a new {@code VmaRecordSettings.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaRecordSettings#SIZEOF}, and its mark will be undefined.
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
        protected VmaRecordSettings getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code flags} field. */
        @NativeType("VmaRecordFlags")
        public int flags() { return VmaRecordSettings.nflags(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pFilePath} field. */
        @NativeType("char const *")
        public ByteBuffer pFilePath() { return VmaRecordSettings.npFilePath(address()); }
        /** Decodes the null-terminated string pointed to by the {@code pFilePath} field. */
        @NativeType("char const *")
        public String pFilePathString() { return VmaRecordSettings.npFilePathString(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public VmaRecordSettings.Buffer flags(@NativeType("VmaRecordFlags") int value) { VmaRecordSettings.nflags(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pFilePath} field. */
        public VmaRecordSettings.Buffer pFilePath(@NativeType("char const *") ByteBuffer value) { VmaRecordSettings.npFilePath(address(), value); return this; }

    }

}