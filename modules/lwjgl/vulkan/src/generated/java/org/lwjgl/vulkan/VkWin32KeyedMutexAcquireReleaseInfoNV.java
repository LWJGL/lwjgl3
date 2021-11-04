/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Use Windows keyex mutex mechanism to synchronize work.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVWin32KeyedMutex#VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV}</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a valid pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireTimeoutMilliseconds} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
 * <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a valid pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
 * <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a valid pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
 * <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWin32KeyedMutexAcquireReleaseInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t {@link #acquireCount};
 *     VkDeviceMemory const * {@link #pAcquireSyncs};
 *     uint64_t const * {@link #pAcquireKeys};
 *     uint32_t const * {@link #pAcquireTimeoutMilliseconds};
 *     uint32_t {@link #releaseCount};
 *     VkDeviceMemory const * {@link #pReleaseSyncs};
 *     uint64_t const * {@link #pReleaseKeys};
 * }</code></pre>
 */
public class VkWin32KeyedMutexAcquireReleaseInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACQUIRECOUNT,
        PACQUIRESYNCS,
        PACQUIREKEYS,
        PACQUIRETIMEOUTMILLISECONDS,
        RELEASECOUNT,
        PRELEASESYNCS,
        PRELEASEKEYS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACQUIRECOUNT = layout.offsetof(2);
        PACQUIRESYNCS = layout.offsetof(3);
        PACQUIREKEYS = layout.offsetof(4);
        PACQUIRETIMEOUTMILLISECONDS = layout.offsetof(5);
        RELEASECOUNT = layout.offsetof(6);
        PRELEASESYNCS = layout.offsetof(7);
        PRELEASEKEYS = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkWin32KeyedMutexAcquireReleaseInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWin32KeyedMutexAcquireReleaseInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeoutMilliseconds} arrays. */
    @NativeType("uint32_t")
    public int acquireCount() { return nacquireCount(address()); }
    /** a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources. */
    @Nullable
    @NativeType("VkDeviceMemory const *")
    public LongBuffer pAcquireSyncs() { return npAcquireSyncs(address()); }
    /** a pointer to an array of mutex key values to wait for prior to beginning the submitted work. Entries refer to the keyed mutex associated with the corresponding entries in {@code pAcquireSyncs}. */
    @Nullable
    @NativeType("uint64_t const *")
    public LongBuffer pAcquireKeys() { return npAcquireKeys(address()); }
    /** a pointer to an array of timeout values, in millisecond units, for each acquire specified in {@code pAcquireKeys}. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pAcquireTimeoutMilliseconds() { return npAcquireTimeoutMilliseconds(address()); }
    /** the number of entries in the {@code pReleaseSyncs} and {@code pReleaseKeys} arrays. */
    @NativeType("uint32_t")
    public int releaseCount() { return nreleaseCount(address()); }
    /** a pointer to an array of {@code VkDeviceMemory} objects which were imported from Direct3D 11 resources. */
    @Nullable
    @NativeType("VkDeviceMemory const *")
    public LongBuffer pReleaseSyncs() { return npReleaseSyncs(address()); }
    /** a pointer to an array of mutex key values to set when the submitted work has completed. Entries refer to the keyed mutex associated with the corresponding entries in {@code pReleaseSyncs}. */
    @Nullable
    @NativeType("uint64_t const *")
    public LongBuffer pReleaseKeys() { return npReleaseKeys(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVWin32KeyedMutex#VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV} value to the {@code sType} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV sType$Default() { return sType(NVWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #acquireCount} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV acquireCount(@NativeType("uint32_t") int value) { nacquireCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pAcquireSyncs} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { npAcquireSyncs(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pAcquireKeys} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npAcquireKeys(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pAcquireTimeoutMilliseconds} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV pAcquireTimeoutMilliseconds(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npAcquireTimeoutMilliseconds(address(), value); return this; }
    /** Sets the specified value to the {@link #releaseCount} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV releaseCount(@NativeType("uint32_t") int value) { nreleaseCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pReleaseSyncs} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { npReleaseSyncs(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pReleaseKeys} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV pReleaseKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npReleaseKeys(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWin32KeyedMutexAcquireReleaseInfoNV set(
        int sType,
        long pNext,
        int acquireCount,
        @Nullable LongBuffer pAcquireSyncs,
        @Nullable LongBuffer pAcquireKeys,
        @Nullable IntBuffer pAcquireTimeoutMilliseconds,
        int releaseCount,
        @Nullable LongBuffer pReleaseSyncs,
        @Nullable LongBuffer pReleaseKeys
    ) {
        sType(sType);
        pNext(pNext);
        acquireCount(acquireCount);
        pAcquireSyncs(pAcquireSyncs);
        pAcquireKeys(pAcquireKeys);
        pAcquireTimeoutMilliseconds(pAcquireTimeoutMilliseconds);
        releaseCount(releaseCount);
        pReleaseSyncs(pReleaseSyncs);
        pReleaseKeys(pReleaseKeys);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWin32KeyedMutexAcquireReleaseInfoNV set(VkWin32KeyedMutexAcquireReleaseInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV malloc() {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV calloc() {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoNV} instance for the specified memory address. */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV create(long address) {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWin32KeyedMutexAcquireReleaseInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkWin32KeyedMutexAcquireReleaseInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV malloc(MemoryStack stack) {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV calloc(MemoryStack stack) {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PNEXT); }
    /** Unsafe version of {@link #acquireCount}. */
    public static int nacquireCount(long struct) { return UNSAFE.getInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoNV.ACQUIRECOUNT); }
    /** Unsafe version of {@link #pAcquireSyncs() pAcquireSyncs}. */
    @Nullable public static LongBuffer npAcquireSyncs(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRESYNCS), nacquireCount(struct)); }
    /** Unsafe version of {@link #pAcquireKeys() pAcquireKeys}. */
    @Nullable public static LongBuffer npAcquireKeys(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIREKEYS), nacquireCount(struct)); }
    /** Unsafe version of {@link #pAcquireTimeoutMilliseconds() pAcquireTimeoutMilliseconds}. */
    @Nullable public static IntBuffer npAcquireTimeoutMilliseconds(long struct) { return memIntBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRETIMEOUTMILLISECONDS), nacquireCount(struct)); }
    /** Unsafe version of {@link #releaseCount}. */
    public static int nreleaseCount(long struct) { return UNSAFE.getInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoNV.RELEASECOUNT); }
    /** Unsafe version of {@link #pReleaseSyncs() pReleaseSyncs}. */
    @Nullable public static LongBuffer npReleaseSyncs(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASESYNCS), nreleaseCount(struct)); }
    /** Unsafe version of {@link #pReleaseKeys() pReleaseKeys}. */
    @Nullable public static LongBuffer npReleaseKeys(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASEKEYS), nreleaseCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PNEXT, value); }
    /** Sets the specified value to the {@code acquireCount} field of the specified {@code struct}. */
    public static void nacquireCount(long struct, int value) { UNSAFE.putInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoNV.ACQUIRECOUNT, value); }
    /** Unsafe version of {@link #pAcquireSyncs(LongBuffer) pAcquireSyncs}. */
    public static void npAcquireSyncs(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRESYNCS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pAcquireKeys(LongBuffer) pAcquireKeys}. */
    public static void npAcquireKeys(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIREKEYS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pAcquireTimeoutMilliseconds(IntBuffer) pAcquireTimeoutMilliseconds}. */
    public static void npAcquireTimeoutMilliseconds(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRETIMEOUTMILLISECONDS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code releaseCount} field of the specified {@code struct}. */
    public static void nreleaseCount(long struct, int value) { UNSAFE.putInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoNV.RELEASECOUNT, value); }
    /** Unsafe version of {@link #pReleaseSyncs(LongBuffer) pReleaseSyncs}. */
    public static void npReleaseSyncs(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASESYNCS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pReleaseKeys(LongBuffer) pReleaseKeys}. */
    public static void npReleaseKeys(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASEKEYS, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nacquireCount(struct) != 0) {
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRESYNCS));
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIREKEYS));
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PACQUIRETIMEOUTMILLISECONDS));
        }
        if (nreleaseCount(struct) != 0) {
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASESYNCS));
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoNV.PRELEASEKEYS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkWin32KeyedMutexAcquireReleaseInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkWin32KeyedMutexAcquireReleaseInfoNV, Buffer> implements NativeResource {

        private static final VkWin32KeyedMutexAcquireReleaseInfoNV ELEMENT_FACTORY = VkWin32KeyedMutexAcquireReleaseInfoNV.create(-1L);

        /**
         * Creates a new {@code VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWin32KeyedMutexAcquireReleaseInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkWin32KeyedMutexAcquireReleaseInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWin32KeyedMutexAcquireReleaseInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWin32KeyedMutexAcquireReleaseInfoNV.npNext(address()); }
        /** @return the value of the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#acquireCount} field. */
        @NativeType("uint32_t")
        public int acquireCount() { return VkWin32KeyedMutexAcquireReleaseInfoNV.nacquireCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pAcquireSyncs} field. */
        @Nullable
        @NativeType("VkDeviceMemory const *")
        public LongBuffer pAcquireSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireSyncs(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pAcquireKeys} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pAcquireKeys() { return VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireKeys(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pAcquireTimeoutMilliseconds} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pAcquireTimeoutMilliseconds() { return VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireTimeoutMilliseconds(address()); }
        /** @return the value of the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#releaseCount} field. */
        @NativeType("uint32_t")
        public int releaseCount() { return VkWin32KeyedMutexAcquireReleaseInfoNV.nreleaseCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pReleaseSyncs} field. */
        @Nullable
        @NativeType("VkDeviceMemory const *")
        public LongBuffer pReleaseSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseSyncs(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pReleaseKeys} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pReleaseKeys() { return VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseKeys(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVWin32KeyedMutex#VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV} value to the {@code sType} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer sType$Default() { return sType(NVWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkWin32KeyedMutexAcquireReleaseInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#acquireCount} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer acquireCount(@NativeType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.nacquireCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pAcquireSyncs} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pAcquireSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireSyncs(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pAcquireKeys} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pAcquireKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireKeys(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pAcquireTimeoutMilliseconds} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pAcquireTimeoutMilliseconds(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoNV.npAcquireTimeoutMilliseconds(address(), value); return this; }
        /** Sets the specified value to the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#releaseCount} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer releaseCount(@NativeType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoNV.nreleaseCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pReleaseSyncs} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pReleaseSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseSyncs(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoNV#pReleaseKeys} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoNV.Buffer pReleaseKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoNV.npReleaseKeys(address(), value); return this; }

    }

}