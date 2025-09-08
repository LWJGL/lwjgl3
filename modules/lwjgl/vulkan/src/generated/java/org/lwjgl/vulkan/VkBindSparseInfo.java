/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkBindSparseInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreCount;
 *     VkSemaphore const * pWaitSemaphores;
 *     uint32_t bufferBindCount;
 *     {@link VkSparseBufferMemoryBindInfo VkSparseBufferMemoryBindInfo} const * pBufferBinds;
 *     uint32_t imageOpaqueBindCount;
 *     {@link VkSparseImageOpaqueMemoryBindInfo VkSparseImageOpaqueMemoryBindInfo} const * pImageOpaqueBinds;
 *     uint32_t imageBindCount;
 *     {@link VkSparseImageMemoryBindInfo VkSparseImageMemoryBindInfo} const * pImageBinds;
 *     uint32_t signalSemaphoreCount;
 *     VkSemaphore const * pSignalSemaphores;
 * }</code></pre>
 */
public class VkBindSparseInfo extends Struct<VkBindSparseInfo> implements NativeResource {

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

    protected VkBindSparseInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindSparseInfo create(long address, @Nullable ByteBuffer container) {
        return new VkBindSparseInfo(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code waitSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
    @NativeType("VkSemaphore const *")
    public @Nullable LongBuffer pWaitSemaphores() { return npWaitSemaphores(address()); }
    /** @return the value of the {@code bufferBindCount} field. */
    @NativeType("uint32_t")
    public int bufferBindCount() { return nbufferBindCount(address()); }
    /** @return a {@link VkSparseBufferMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pBufferBinds} field. */
    @NativeType("VkSparseBufferMemoryBindInfo const *")
    public VkSparseBufferMemoryBindInfo.@Nullable Buffer pBufferBinds() { return npBufferBinds(address()); }
    /** @return the value of the {@code imageOpaqueBindCount} field. */
    @NativeType("uint32_t")
    public int imageOpaqueBindCount() { return nimageOpaqueBindCount(address()); }
    /** @return a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageOpaqueBinds} field. */
    @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
    public VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer pImageOpaqueBinds() { return npImageOpaqueBinds(address()); }
    /** @return the value of the {@code imageBindCount} field. */
    @NativeType("uint32_t")
    public int imageBindCount() { return nimageBindCount(address()); }
    /** @return a {@link VkSparseImageMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageBinds} field. */
    @NativeType("VkSparseImageMemoryBindInfo const *")
    public VkSparseImageMemoryBindInfo.@Nullable Buffer pImageBinds() { return npImageBinds(address()); }
    /** @return the value of the {@code signalSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
    @NativeType("VkSemaphore const *")
    public @Nullable LongBuffer pSignalSemaphores() { return npSignalSemaphores(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindSparseInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BIND_SPARSE_INFO STRUCTURE_TYPE_BIND_SPARSE_INFO} value to the {@code sType} field. */
    public VkBindSparseInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindSparseInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupBindSparseInfo} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkDeviceGroupBindSparseInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupBindSparseInfoKHR} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkDeviceGroupBindSparseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFrameBoundaryTensorsARM} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkFrameBoundaryTensorsARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfo} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkTimelineSemaphoreSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfoKHR} value to the {@code pNext} chain. */
    public VkBindSparseInfo pNext(VkTimelineSemaphoreSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
    public VkBindSparseInfo pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npWaitSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo.Buffer} to the {@code pBufferBinds} field. */
    public VkBindSparseInfo pBufferBinds(@NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.@Nullable Buffer value) { npBufferBinds(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} to the {@code pImageOpaqueBinds} field. */
    public VkBindSparseInfo pImageOpaqueBinds(@NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer value) { npImageOpaqueBinds(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseImageMemoryBindInfo.Buffer} to the {@code pImageBinds} field. */
    public VkBindSparseInfo pImageBinds(@NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.@Nullable Buffer value) { npImageBinds(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
    public VkBindSparseInfo pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npSignalSemaphores(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindSparseInfo set(
        int sType,
        long pNext,
        @Nullable LongBuffer pWaitSemaphores,
        VkSparseBufferMemoryBindInfo.@Nullable Buffer pBufferBinds,
        VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer pImageOpaqueBinds,
        VkSparseImageMemoryBindInfo.@Nullable Buffer pImageBinds,
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
        return new VkBindSparseInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindSparseInfo calloc() {
        return new VkBindSparseInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindSparseInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindSparseInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkBindSparseInfo} instance for the specified memory address. */
    public static VkBindSparseInfo create(long address) {
        return new VkBindSparseInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindSparseInfo createSafe(long address) {
        return address == NULL ? null : new VkBindSparseInfo(address, null);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindSparseInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindSparseInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkBindSparseInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindSparseInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindSparseInfo calloc(MemoryStack stack) {
        return new VkBindSparseInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindSparseInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindSparseInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkBindSparseInfo.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
    public static @Nullable LongBuffer npWaitSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #bufferBindCount}. */
    public static int nbufferBindCount(long struct) { return memGetInt(struct + VkBindSparseInfo.BUFFERBINDCOUNT); }
    /** Unsafe version of {@link #pBufferBinds}. */
    public static VkSparseBufferMemoryBindInfo.@Nullable Buffer npBufferBinds(long struct) { return VkSparseBufferMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PBUFFERBINDS), nbufferBindCount(struct)); }
    /** Unsafe version of {@link #imageOpaqueBindCount}. */
    public static int nimageOpaqueBindCount(long struct) { return memGetInt(struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT); }
    /** Unsafe version of {@link #pImageOpaqueBinds}. */
    public static VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer npImageOpaqueBinds(long struct) { return VkSparseImageOpaqueMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS), nimageOpaqueBindCount(struct)); }
    /** Unsafe version of {@link #imageBindCount}. */
    public static int nimageBindCount(long struct) { return memGetInt(struct + VkBindSparseInfo.IMAGEBINDCOUNT); }
    /** Unsafe version of {@link #pImageBinds}. */
    public static VkSparseImageMemoryBindInfo.@Nullable Buffer npImageBinds(long struct) { return VkSparseImageMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PIMAGEBINDS), nimageBindCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreCount}. */
    public static int nsignalSemaphoreCount(long struct) { return memGetInt(struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphores() pSignalSemaphores}. */
    public static @Nullable LongBuffer npSignalSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES), nsignalSemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindSparseInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindSparseInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
    public static void npWaitSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code bufferBindCount} field of the specified {@code struct}. */
    public static void nbufferBindCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.BUFFERBINDCOUNT, value); }
    /** Unsafe version of {@link #pBufferBinds(VkSparseBufferMemoryBindInfo.Buffer) pBufferBinds}. */
    public static void npBufferBinds(long struct, VkSparseBufferMemoryBindInfo.@Nullable Buffer value) { memPutAddress(struct + VkBindSparseInfo.PBUFFERBINDS, memAddressSafe(value)); nbufferBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageOpaqueBindCount} field of the specified {@code struct}. */
    public static void nimageOpaqueBindCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT, value); }
    /** Unsafe version of {@link #pImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo.Buffer) pImageOpaqueBinds}. */
    public static void npImageOpaqueBinds(long struct, VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS, memAddressSafe(value)); nimageOpaqueBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageBindCount} field of the specified {@code struct}. */
    public static void nimageBindCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.IMAGEBINDCOUNT, value); }
    /** Unsafe version of {@link #pImageBinds(VkSparseImageMemoryBindInfo.Buffer) pImageBinds}. */
    public static void npImageBinds(long struct, VkSparseImageMemoryBindInfo.@Nullable Buffer value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEBINDS, memAddressSafe(value)); nimageBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT, value); }
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindSparseInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindSparseInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindSparseInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindSparseInfo.npNext(address()); }
        /** @return the value of the {@code waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkBindSparseInfo.nwaitSemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public @Nullable LongBuffer pWaitSemaphores() { return VkBindSparseInfo.npWaitSemaphores(address()); }
        /** @return the value of the {@code bufferBindCount} field. */
        @NativeType("uint32_t")
        public int bufferBindCount() { return VkBindSparseInfo.nbufferBindCount(address()); }
        /** @return a {@link VkSparseBufferMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pBufferBinds} field. */
        @NativeType("VkSparseBufferMemoryBindInfo const *")
        public VkSparseBufferMemoryBindInfo.@Nullable Buffer pBufferBinds() { return VkBindSparseInfo.npBufferBinds(address()); }
        /** @return the value of the {@code imageOpaqueBindCount} field. */
        @NativeType("uint32_t")
        public int imageOpaqueBindCount() { return VkBindSparseInfo.nimageOpaqueBindCount(address()); }
        /** @return a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageOpaqueBinds} field. */
        @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
        public VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer pImageOpaqueBinds() { return VkBindSparseInfo.npImageOpaqueBinds(address()); }
        /** @return the value of the {@code imageBindCount} field. */
        @NativeType("uint32_t")
        public int imageBindCount() { return VkBindSparseInfo.nimageBindCount(address()); }
        /** @return a {@link VkSparseImageMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageBinds} field. */
        @NativeType("VkSparseImageMemoryBindInfo const *")
        public VkSparseImageMemoryBindInfo.@Nullable Buffer pImageBinds() { return VkBindSparseInfo.npImageBinds(address()); }
        /** @return the value of the {@code signalSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreCount() { return VkBindSparseInfo.nsignalSemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public @Nullable LongBuffer pSignalSemaphores() { return VkBindSparseInfo.npSignalSemaphores(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindSparseInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindSparseInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BIND_SPARSE_INFO STRUCTURE_TYPE_BIND_SPARSE_INFO} value to the {@code sType} field. */
        public VkBindSparseInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindSparseInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindSparseInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupBindSparseInfo} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkDeviceGroupBindSparseInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupBindSparseInfoKHR} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkDeviceGroupBindSparseInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFrameBoundaryEXT} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkFrameBoundaryEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFrameBoundaryTensorsARM} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkFrameBoundaryTensorsARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfo} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkTimelineSemaphoreSubmitInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTimelineSemaphoreSubmitInfoKHR} value to the {@code pNext} chain. */
        public VkBindSparseInfo.Buffer pNext(VkTimelineSemaphoreSubmitInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
        public VkBindSparseInfo.Buffer pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkBindSparseInfo.npWaitSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo.Buffer} to the {@code pBufferBinds} field. */
        public VkBindSparseInfo.Buffer pBufferBinds(@NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.@Nullable Buffer value) { VkBindSparseInfo.npBufferBinds(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} to the {@code pImageOpaqueBinds} field. */
        public VkBindSparseInfo.Buffer pImageOpaqueBinds(@NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.@Nullable Buffer value) { VkBindSparseInfo.npImageOpaqueBinds(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseImageMemoryBindInfo.Buffer} to the {@code pImageBinds} field. */
        public VkBindSparseInfo.Buffer pImageBinds(@NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.@Nullable Buffer value) { VkBindSparseInfo.npImageBinds(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
        public VkBindSparseInfo.Buffer pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkBindSparseInfo.npSignalSemaphores(address(), value); return this; }

    }

}