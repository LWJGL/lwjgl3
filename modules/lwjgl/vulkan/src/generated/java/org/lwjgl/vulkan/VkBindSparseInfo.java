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
 * Structure specifying a sparse binding operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If any element of {@code pWaitSemaphores} or {@code pSignalSemaphores} was created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} then the {@code pNext} chain <b>must</b> include a {@link VkTimelineSemaphoreSubmitInfo} structure</li>
 * <li>If the {@code pNext} chain of this structure includes a {@link VkTimelineSemaphoreSubmitInfo} structure and any element of {@code pWaitSemaphores} was created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} then its {@code waitSemaphoreValueCount} member <b>must</b> equal {@code waitSemaphoreCount}</li>
 * <li>If the {@code pNext} chain of this structure includes a {@link VkTimelineSemaphoreSubmitInfo} structure and any element of {@code pSignalSemaphores} was created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} then its {@code signalSemaphoreValueCount} member <b>must</b> equal {@code signalSemaphoreCount}</li>
 * <li>For each element of {@code pSignalSemaphores} created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} the corresponding element of {@link VkTimelineSemaphoreSubmitInfo}{@code ::pSignalSemaphoreValues} <b>must</b> have a value greater than the current value of the semaphore when the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> is executed</li>
 * <li>For each element of {@code pWaitSemaphores} created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} the corresponding element of {@link VkTimelineSemaphoreSubmitInfo}{@code ::pWaitSemaphoreValues} <b>must</b> have a value which does not differ from the current value of the semaphore or from the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
 * <li>For each element of {@code pSignalSemaphores} created with a {@code VkSemaphoreType} of {@link VK12#VK_SEMAPHORE_TYPE_TIMELINE SEMAPHORE_TYPE_TIMELINE} the corresponding element of {@link VkTimelineSemaphoreSubmitInfo}{@code ::pSignalSemaphoreValues} <b>must</b> have a value which does not differ from the current value of the semaphore or from the value of any outstanding semaphore wait or signal operation on that semaphore by more than <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxTimelineSemaphoreValueDifference">{@code maxTimelineSemaphoreValueDifference}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_BIND_SPARSE_INFO STRUCTURE_TYPE_BIND_SPARSE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupBindSparseInfo} or {@link VkTimelineSemaphoreSubmitInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>If {@code bufferBindCount} is not 0, {@code pBufferBinds} <b>must</b> be a valid pointer to an array of {@code bufferBindCount} valid {@link VkSparseBufferMemoryBindInfo} structures</li>
 * <li>If {@code imageOpaqueBindCount} is not 0, {@code pImageOpaqueBinds} <b>must</b> be a valid pointer to an array of {@code imageOpaqueBindCount} valid {@link VkSparseImageOpaqueMemoryBindInfo} structures</li>
 * <li>If {@code imageBindCount} is not 0, {@code pImageBinds} <b>must</b> be a valid pointer to an array of {@code imageBindCount} valid {@link VkSparseImageMemoryBindInfo} structures</li>
 * <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphores} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>Both of the elements of {@code pSignalSemaphores}, and the elements of {@code pWaitSemaphores} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseBufferMemoryBindInfo}, {@link VkSparseImageMemoryBindInfo}, {@link VkSparseImageOpaqueMemoryBindInfo}, {@link VK10#vkQueueBindSparse QueueBindSparse}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindSparseInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #waitSemaphoreCount};
 *     VkSemaphore const * {@link #pWaitSemaphores};
 *     uint32_t {@link #bufferBindCount};
 *     {@link VkSparseBufferMemoryBindInfo VkSparseBufferMemoryBindInfo} const * {@link #pBufferBinds};
 *     uint32_t {@link #imageOpaqueBindCount};
 *     {@link VkSparseImageOpaqueMemoryBindInfo VkSparseImageOpaqueMemoryBindInfo} const * {@link #pImageOpaqueBinds};
 *     uint32_t {@link #imageBindCount};
 *     {@link VkSparseImageMemoryBindInfo VkSparseImageMemoryBindInfo} const * {@link #pImageBinds};
 *     uint32_t {@link #signalSemaphoreCount};
 *     VkSemaphore const * {@link #pSignalSemaphores};
 * }</code></pre>
 */
public class VkBindSparseInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHORECOUNT,
        PWAITSEMAPHORES,
        BUFFERBINDCOUNT,
        PBUFFERBINDS,
        IMAGEOPAQUEBINDCOUNT,
        PIMAGEOPAQUEBINDS,
        IMAGEBINDCOUNT,
        PIMAGEBINDS,
        SIGNALSEMAPHORECOUNT,
        PSIGNALSEMAPHORES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHORES = layout.offsetof(3);
        BUFFERBINDCOUNT = layout.offsetof(4);
        PBUFFERBINDS = layout.offsetof(5);
        IMAGEOPAQUEBINDCOUNT = layout.offsetof(6);
        PIMAGEOPAQUEBINDS = layout.offsetof(7);
        IMAGEBINDCOUNT = layout.offsetof(8);
        PIMAGEBINDS = layout.offsetof(9);
        SIGNALSEMAPHORECOUNT = layout.offsetof(10);
        PSIGNALSEMAPHORES = layout.offsetof(11);
    }

    /**
     * Creates a {@code VkBindSparseInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindSparseInfo(ByteBuffer container) {
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
    /** the number of semaphores upon which to wait before executing the sparse binding operations for the batch. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** a pointer to an array of semaphores upon which to wait on before the sparse binding operations for this batch begin execution. If semaphores to wait on are provided, they define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-waiting">semaphore wait operation</a>. */
    @Nullable
    @NativeType("VkSemaphore const *")
    public LongBuffer pWaitSemaphores() { return npWaitSemaphores(address()); }
    /** the number of sparse buffer bindings to perform in the batch. */
    @NativeType("uint32_t")
    public int bufferBindCount() { return nbufferBindCount(address()); }
    /** a pointer to an array of {@link VkSparseBufferMemoryBindInfo} structures. */
    @Nullable
    @NativeType("VkSparseBufferMemoryBindInfo const *")
    public VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() { return npBufferBinds(address()); }
    /** the number of opaque sparse image bindings to perform. */
    @NativeType("uint32_t")
    public int imageOpaqueBindCount() { return nimageOpaqueBindCount(address()); }
    /** a pointer to an array of {@link VkSparseImageOpaqueMemoryBindInfo} structures, indicating opaque sparse image bindings to perform. */
    @Nullable
    @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
    public VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() { return npImageOpaqueBinds(address()); }
    /** the number of sparse image bindings to perform. */
    @NativeType("uint32_t")
    public int imageBindCount() { return nimageBindCount(address()); }
    /** a pointer to an array of {@link VkSparseImageMemoryBindInfo} structures, indicating sparse image bindings to perform. */
    @Nullable
    @NativeType("VkSparseImageMemoryBindInfo const *")
    public VkSparseImageMemoryBindInfo.Buffer pImageBinds() { return npImageBinds(address()); }
    /** the number of semaphores to be signaled once the sparse binding operations specified by the structure have completed execution. */
    @NativeType("uint32_t")
    public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
    /** a pointer to an array of semaphores which will be signaled when the sparse binding operations for this batch have completed execution. If semaphores to be signaled are provided, they define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a>. */
    @Nullable
    @NativeType("VkSemaphore const *")
    public LongBuffer pSignalSemaphores() { return npSignalSemaphores(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBindSparseInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BIND_SPARSE_INFO STRUCTURE_TYPE_BIND_SPARSE_INFO} value to the {@link #sType} field. */
    public VkBindSparseInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBindSparseInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupBindSparseInfo} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkDeviceGroupBindSparseInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupBindSparseInfoKHR} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkDeviceGroupBindSparseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfo} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkTimelineSemaphoreSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfoKHR} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkTimelineSemaphoreSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pWaitSemaphores} field. */
    public VkBindSparseInfo pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npWaitSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo.Buffer} to the {@link #pBufferBinds} field. */
    public VkBindSparseInfo pBufferBinds(@Nullable @NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.Buffer value) { npBufferBinds(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} to the {@link #pImageOpaqueBinds} field. */
    public VkBindSparseInfo pImageOpaqueBinds(@Nullable @NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.Buffer value) { npImageOpaqueBinds(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseImageMemoryBindInfo.Buffer} to the {@link #pImageBinds} field. */
    public VkBindSparseInfo pImageBinds(@Nullable @NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.Buffer value) { npImageBinds(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pSignalSemaphores} field. */
    public VkBindSparseInfo pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npSignalSemaphores(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindSparseInfo set(
        int sType,
        long pNext,
        @Nullable LongBuffer pWaitSemaphores,
        @Nullable VkSparseBufferMemoryBindInfo.Buffer pBufferBinds,
        @Nullable VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds,
        @Nullable VkSparseImageMemoryBindInfo.Buffer pImageBinds,
        @Nullable LongBuffer pSignalSemaphores
    ) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphores(pWaitSemaphores);
        pBufferBinds(pBufferBinds);
        pImageOpaqueBinds(pImageOpaqueBinds);
        pImageBinds(pImageBinds);
        pSignalSemaphores(pSignalSemaphores);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindSparseInfo set(VkBindSparseInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindSparseInfo malloc() {
        return wrap(VkBindSparseInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindSparseInfo calloc() {
        return wrap(VkBindSparseInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindSparseInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindSparseInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindSparseInfo} instance for the specified memory address. */
    public static VkBindSparseInfo create(long address) {
        return wrap(VkBindSparseInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindSparseInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBindSparseInfo.class, address);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindSparseInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindSparseInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindSparseInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindSparseInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindSparseInfo malloc(MemoryStack stack) {
        return wrap(VkBindSparseInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindSparseInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindSparseInfo calloc(MemoryStack stack) {
        return wrap(VkBindSparseInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindSparseInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
    @Nullable public static LongBuffer npWaitSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #bufferBindCount}. */
    public static int nbufferBindCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.BUFFERBINDCOUNT); }
    /** Unsafe version of {@link #pBufferBinds}. */
    @Nullable public static VkSparseBufferMemoryBindInfo.Buffer npBufferBinds(long struct) { return VkSparseBufferMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PBUFFERBINDS), nbufferBindCount(struct)); }
    /** Unsafe version of {@link #imageOpaqueBindCount}. */
    public static int nimageOpaqueBindCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT); }
    /** Unsafe version of {@link #pImageOpaqueBinds}. */
    @Nullable public static VkSparseImageOpaqueMemoryBindInfo.Buffer npImageOpaqueBinds(long struct) { return VkSparseImageOpaqueMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS), nimageOpaqueBindCount(struct)); }
    /** Unsafe version of {@link #imageBindCount}. */
    public static int nimageBindCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.IMAGEBINDCOUNT); }
    /** Unsafe version of {@link #pImageBinds}. */
    @Nullable public static VkSparseImageMemoryBindInfo.Buffer npImageBinds(long struct) { return VkSparseImageMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PIMAGEBINDS), nimageBindCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreCount}. */
    public static int nsignalSemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphores() pSignalSemaphores}. */
    @Nullable public static LongBuffer npSignalSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES), nsignalSemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindSparseInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
    public static void npWaitSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code bufferBindCount} field of the specified {@code struct}. */
    public static void nbufferBindCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.BUFFERBINDCOUNT, value); }
    /** Unsafe version of {@link #pBufferBinds(VkSparseBufferMemoryBindInfo.Buffer) pBufferBinds}. */
    public static void npBufferBinds(long struct, @Nullable VkSparseBufferMemoryBindInfo.Buffer value) { memPutAddress(struct + VkBindSparseInfo.PBUFFERBINDS, memAddressSafe(value)); nbufferBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageOpaqueBindCount} field of the specified {@code struct}. */
    public static void nimageOpaqueBindCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT, value); }
    /** Unsafe version of {@link #pImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo.Buffer) pImageOpaqueBinds}. */
    public static void npImageOpaqueBinds(long struct, @Nullable VkSparseImageOpaqueMemoryBindInfo.Buffer value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS, memAddressSafe(value)); nimageOpaqueBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageBindCount} field of the specified {@code struct}. */
    public static void nimageBindCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.IMAGEBINDCOUNT, value); }
    /** Unsafe version of {@link #pImageBinds(VkSparseImageMemoryBindInfo.Buffer) pImageBinds}. */
    public static void npImageBinds(long struct, @Nullable VkSparseImageMemoryBindInfo.Buffer value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEBINDS, memAddressSafe(value)); nimageBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphores(LongBuffer) pSignalSemaphores}. */
    public static void npSignalSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES, memAddressSafe(value)); nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES));
        }
        int bufferBindCount = nbufferBindCount(struct);
        if (bufferBindCount != 0) {
            long pBufferBinds = memGetAddress(struct + VkBindSparseInfo.PBUFFERBINDS);
            check(pBufferBinds);
            validate(pBufferBinds, bufferBindCount, VkSparseBufferMemoryBindInfo.SIZEOF, VkSparseBufferMemoryBindInfo::validate);
        }
        int imageOpaqueBindCount = nimageOpaqueBindCount(struct);
        if (imageOpaqueBindCount != 0) {
            long pImageOpaqueBinds = memGetAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS);
            check(pImageOpaqueBinds);
            validate(pImageOpaqueBinds, imageOpaqueBindCount, VkSparseImageOpaqueMemoryBindInfo.SIZEOF, VkSparseImageOpaqueMemoryBindInfo::validate);
        }
        int imageBindCount = nimageBindCount(struct);
        if (imageBindCount != 0) {
            long pImageBinds = memGetAddress(struct + VkBindSparseInfo.PIMAGEBINDS);
            check(pImageBinds);
            validate(pImageBinds, imageBindCount, VkSparseImageMemoryBindInfo.SIZEOF, VkSparseImageMemoryBindInfo::validate);
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindSparseInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindSparseInfo, Buffer> implements NativeResource {

        private static final VkBindSparseInfo ELEMENT_FACTORY = VkBindSparseInfo.create(-1L);

        /**
         * Creates a new {@code VkBindSparseInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindSparseInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBindSparseInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindSparseInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindSparseInfo.nsType(address()); }
        /** @return the value of the {@link VkBindSparseInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindSparseInfo.npNext(address()); }
        /** @return the value of the {@link VkBindSparseInfo#waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkBindSparseInfo.nwaitSemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkBindSparseInfo#pWaitSemaphores} field. */
        @Nullable
        @NativeType("VkSemaphore const *")
        public LongBuffer pWaitSemaphores() { return VkBindSparseInfo.npWaitSemaphores(address()); }
        /** @return the value of the {@link VkBindSparseInfo#bufferBindCount} field. */
        @NativeType("uint32_t")
        public int bufferBindCount() { return VkBindSparseInfo.nbufferBindCount(address()); }
        /** @return a {@link VkSparseBufferMemoryBindInfo.Buffer} view of the struct array pointed to by the {@link VkBindSparseInfo#pBufferBinds} field. */
        @Nullable
        @NativeType("VkSparseBufferMemoryBindInfo const *")
        public VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() { return VkBindSparseInfo.npBufferBinds(address()); }
        /** @return the value of the {@link VkBindSparseInfo#imageOpaqueBindCount} field. */
        @NativeType("uint32_t")
        public int imageOpaqueBindCount() { return VkBindSparseInfo.nimageOpaqueBindCount(address()); }
        /** @return a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} view of the struct array pointed to by the {@link VkBindSparseInfo#pImageOpaqueBinds} field. */
        @Nullable
        @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
        public VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() { return VkBindSparseInfo.npImageOpaqueBinds(address()); }
        /** @return the value of the {@link VkBindSparseInfo#imageBindCount} field. */
        @NativeType("uint32_t")
        public int imageBindCount() { return VkBindSparseInfo.nimageBindCount(address()); }
        /** @return a {@link VkSparseImageMemoryBindInfo.Buffer} view of the struct array pointed to by the {@link VkBindSparseInfo#pImageBinds} field. */
        @Nullable
        @NativeType("VkSparseImageMemoryBindInfo const *")
        public VkSparseImageMemoryBindInfo.Buffer pImageBinds() { return VkBindSparseInfo.npImageBinds(address()); }
        /** @return the value of the {@link VkBindSparseInfo#signalSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreCount() { return VkBindSparseInfo.nsignalSemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkBindSparseInfo#pSignalSemaphores} field. */
        @Nullable
        @NativeType("VkSemaphore const *")
        public LongBuffer pSignalSemaphores() { return VkBindSparseInfo.npSignalSemaphores(address()); }

        /** Sets the specified value to the {@link VkBindSparseInfo#sType} field. */
        public VkBindSparseInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindSparseInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BIND_SPARSE_INFO STRUCTURE_TYPE_BIND_SPARSE_INFO} value to the {@link VkBindSparseInfo#sType} field. */
        public VkBindSparseInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO); }
        /** Sets the specified value to the {@link VkBindSparseInfo#pNext} field. */
        public VkBindSparseInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindSparseInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupBindSparseInfo} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkDeviceGroupBindSparseInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupBindSparseInfoKHR} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkDeviceGroupBindSparseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfo} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkTimelineSemaphoreSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfoKHR} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkTimelineSemaphoreSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkBindSparseInfo#pWaitSemaphores} field. */
        public VkBindSparseInfo.Buffer pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkBindSparseInfo.npWaitSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo.Buffer} to the {@link VkBindSparseInfo#pBufferBinds} field. */
        public VkBindSparseInfo.Buffer pBufferBinds(@Nullable @NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.Buffer value) { VkBindSparseInfo.npBufferBinds(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} to the {@link VkBindSparseInfo#pImageOpaqueBinds} field. */
        public VkBindSparseInfo.Buffer pImageOpaqueBinds(@Nullable @NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.Buffer value) { VkBindSparseInfo.npImageOpaqueBinds(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseImageMemoryBindInfo.Buffer} to the {@link VkBindSparseInfo#pImageBinds} field. */
        public VkBindSparseInfo.Buffer pImageBinds(@Nullable @NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.Buffer value) { VkBindSparseInfo.npImageBinds(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkBindSparseInfo#pSignalSemaphores} field. */
        public VkBindSparseInfo.Buffer pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkBindSparseInfo.npSignalSemaphores(address(), value); return this; }

    }

}