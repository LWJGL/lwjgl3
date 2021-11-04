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
 * Use the Windows keyed mutex mechanism to synchronize work.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each member of {@code pAcquireSyncs} and {@code pReleaseSyncs} <b>must</b> be a device memory object imported by setting {@link VkImportMemoryWin32HandleInfoKHR}{@code ::handleType} to {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT} or {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRWin32KeyedMutex#VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR}</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireSyncs} <b>must</b> be a valid pointer to an array of {@code acquireCount} valid {@code VkDeviceMemory} handles</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireKeys} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint64_t} values</li>
 * <li>If {@code acquireCount} is not 0, {@code pAcquireTimeouts} <b>must</b> be a valid pointer to an array of {@code acquireCount} {@code uint32_t} values</li>
 * <li>If {@code releaseCount} is not 0, {@code pReleaseSyncs} <b>must</b> be a valid pointer to an array of {@code releaseCount} valid {@code VkDeviceMemory} handles</li>
 * <li>If {@code releaseCount} is not 0, {@code pReleaseKeys} <b>must</b> be a valid pointer to an array of {@code releaseCount} {@code uint64_t} values</li>
 * <li>Both of the elements of {@code pAcquireSyncs}, and the elements of {@code pReleaseSyncs} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWin32KeyedMutexAcquireReleaseInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #acquireCount};
 *     VkDeviceMemory const * {@link #pAcquireSyncs};
 *     uint64_t const * {@link #pAcquireKeys};
 *     uint32_t const * {@link #pAcquireTimeouts};
 *     uint32_t {@link #releaseCount};
 *     VkDeviceMemory const * {@link #pReleaseSyncs};
 *     uint64_t const * {@link #pReleaseKeys};
 * }</code></pre>
 */
public class VkWin32KeyedMutexAcquireReleaseInfoKHR extends Struct implements NativeResource {

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
        PACQUIRETIMEOUTS,
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
        PACQUIRETIMEOUTS = layout.offsetof(5);
        RELEASECOUNT = layout.offsetof(6);
        PRELEASESYNCS = layout.offsetof(7);
        PRELEASEKEYS = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkWin32KeyedMutexAcquireReleaseInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of entries in the {@code pAcquireSyncs}, {@code pAcquireKeys}, and {@code pAcquireTimeouts} arrays. */
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
    public IntBuffer pAcquireTimeouts() { return npAcquireTimeouts(address()); }
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

    /** Sets the specified value to the {@link #sType} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRWin32KeyedMutex#VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR} value to the {@link #sType} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR sType$Default() { return sType(KHRWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #acquireCount} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR acquireCount(@NativeType("uint32_t") int value) { nacquireCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pAcquireSyncs} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { npAcquireSyncs(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pAcquireKeys} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npAcquireKeys(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pAcquireTimeouts} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pAcquireTimeouts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npAcquireTimeouts(address(), value); return this; }
    /** Sets the specified value to the {@link #releaseCount} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR releaseCount(@NativeType("uint32_t") int value) { nreleaseCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pReleaseSyncs} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { npReleaseSyncs(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pReleaseKeys} field. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR pReleaseKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npReleaseKeys(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWin32KeyedMutexAcquireReleaseInfoKHR set(
        int sType,
        long pNext,
        int acquireCount,
        @Nullable LongBuffer pAcquireSyncs,
        @Nullable LongBuffer pAcquireKeys,
        @Nullable IntBuffer pAcquireTimeouts,
        int releaseCount,
        @Nullable LongBuffer pReleaseSyncs,
        @Nullable LongBuffer pReleaseKeys
    ) {
        sType(sType);
        pNext(pNext);
        acquireCount(acquireCount);
        pAcquireSyncs(pAcquireSyncs);
        pAcquireKeys(pAcquireKeys);
        pAcquireTimeouts(pAcquireTimeouts);
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
    public VkWin32KeyedMutexAcquireReleaseInfoKHR set(VkWin32KeyedMutexAcquireReleaseInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR malloc() {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR calloc() {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoKHR} instance for the specified memory address. */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR create(long address) {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkWin32KeyedMutexAcquireReleaseInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR malloc(MemoryStack stack) {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkWin32KeyedMutexAcquireReleaseInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR calloc(MemoryStack stack) {
        return wrap(VkWin32KeyedMutexAcquireReleaseInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PNEXT); }
    /** Unsafe version of {@link #acquireCount}. */
    public static int nacquireCount(long struct) { return UNSAFE.getInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.ACQUIRECOUNT); }
    /** Unsafe version of {@link #pAcquireSyncs() pAcquireSyncs}. */
    @Nullable public static LongBuffer npAcquireSyncs(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIRESYNCS), nacquireCount(struct)); }
    /** Unsafe version of {@link #pAcquireKeys() pAcquireKeys}. */
    @Nullable public static LongBuffer npAcquireKeys(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIREKEYS), nacquireCount(struct)); }
    /** Unsafe version of {@link #pAcquireTimeouts() pAcquireTimeouts}. */
    @Nullable public static IntBuffer npAcquireTimeouts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIRETIMEOUTS), nacquireCount(struct)); }
    /** Unsafe version of {@link #releaseCount}. */
    public static int nreleaseCount(long struct) { return UNSAFE.getInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.RELEASECOUNT); }
    /** Unsafe version of {@link #pReleaseSyncs() pReleaseSyncs}. */
    @Nullable public static LongBuffer npReleaseSyncs(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PRELEASESYNCS), nreleaseCount(struct)); }
    /** Unsafe version of {@link #pReleaseKeys() pReleaseKeys}. */
    @Nullable public static LongBuffer npReleaseKeys(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PRELEASEKEYS), nreleaseCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code acquireCount} field of the specified {@code struct}. */
    public static void nacquireCount(long struct, int value) { UNSAFE.putInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.ACQUIRECOUNT, value); }
    /** Unsafe version of {@link #pAcquireSyncs(LongBuffer) pAcquireSyncs}. */
    public static void npAcquireSyncs(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIRESYNCS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pAcquireKeys(LongBuffer) pAcquireKeys}. */
    public static void npAcquireKeys(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIREKEYS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pAcquireTimeouts(IntBuffer) pAcquireTimeouts}. */
    public static void npAcquireTimeouts(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIRETIMEOUTS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code releaseCount} field of the specified {@code struct}. */
    public static void nreleaseCount(long struct, int value) { UNSAFE.putInt(null, struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.RELEASECOUNT, value); }
    /** Unsafe version of {@link #pReleaseSyncs(LongBuffer) pReleaseSyncs}. */
    public static void npReleaseSyncs(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PRELEASESYNCS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pReleaseKeys(LongBuffer) pReleaseKeys}. */
    public static void npReleaseKeys(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PRELEASEKEYS, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nacquireCount(struct) != 0) {
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIRESYNCS));
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIREKEYS));
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PACQUIRETIMEOUTS));
        }
        if (nreleaseCount(struct) != 0) {
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PRELEASESYNCS));
            check(memGetAddress(struct + VkWin32KeyedMutexAcquireReleaseInfoKHR.PRELEASEKEYS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkWin32KeyedMutexAcquireReleaseInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkWin32KeyedMutexAcquireReleaseInfoKHR, Buffer> implements NativeResource {

        private static final VkWin32KeyedMutexAcquireReleaseInfoKHR ELEMENT_FACTORY = VkWin32KeyedMutexAcquireReleaseInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkWin32KeyedMutexAcquireReleaseInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#acquireCount} field. */
        @NativeType("uint32_t")
        public int acquireCount() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.nacquireCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pAcquireSyncs} field. */
        @Nullable
        @NativeType("VkDeviceMemory const *")
        public LongBuffer pAcquireSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.npAcquireSyncs(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pAcquireKeys} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pAcquireKeys() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.npAcquireKeys(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pAcquireTimeouts} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pAcquireTimeouts() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.npAcquireTimeouts(address()); }
        /** @return the value of the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#releaseCount} field. */
        @NativeType("uint32_t")
        public int releaseCount() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.nreleaseCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pReleaseSyncs} field. */
        @Nullable
        @NativeType("VkDeviceMemory const *")
        public LongBuffer pReleaseSyncs() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.npReleaseSyncs(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pReleaseKeys} field. */
        @Nullable
        @NativeType("uint64_t const *")
        public LongBuffer pReleaseKeys() { return VkWin32KeyedMutexAcquireReleaseInfoKHR.npReleaseKeys(address()); }

        /** Sets the specified value to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#sType} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRWin32KeyedMutex#VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR} value to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#sType} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer sType$Default() { return sType(KHRWin32KeyedMutex.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR); }
        /** Sets the specified value to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pNext} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#acquireCount} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer acquireCount(@NativeType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.nacquireCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pAcquireSyncs} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer pAcquireSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.npAcquireSyncs(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pAcquireKeys} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer pAcquireKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.npAcquireKeys(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pAcquireTimeouts} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer pAcquireTimeouts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.npAcquireTimeouts(address(), value); return this; }
        /** Sets the specified value to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#releaseCount} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer releaseCount(@NativeType("uint32_t") int value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.nreleaseCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pReleaseSyncs} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer pReleaseSyncs(@Nullable @NativeType("VkDeviceMemory const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.npReleaseSyncs(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#pReleaseKeys} field. */
        public VkWin32KeyedMutexAcquireReleaseInfoKHR.Buffer pReleaseKeys(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkWin32KeyedMutexAcquireReleaseInfoKHR.npReleaseKeys(address(), value); return this; }

    }

}