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
 * struct VkDeviceGroupRenderPassBeginInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceMask;
 *     uint32_t deviceRenderAreaCount;
 *     {@link VkRect2D VkRect2D} const * pDeviceRenderAreas;
 * }</code></pre>
 */
public class VkDeviceGroupRenderPassBeginInfo extends Struct<VkDeviceGroupRenderPassBeginInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEMASK,
        DEVICERENDERAREACOUNT,
        PDEVICERENDERAREAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEMASK = layout.offsetof(2);
        DEVICERENDERAREACOUNT = layout.offsetof(3);
        PDEVICERENDERAREAS = layout.offsetof(4);
    }

    protected VkDeviceGroupRenderPassBeginInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceGroupRenderPassBeginInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceGroupRenderPassBeginInfo(address, container);
    }

    /**
     * Creates a {@code VkDeviceGroupRenderPassBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupRenderPassBeginInfo(ByteBuffer container) {
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
    /** @return the value of the {@code deviceMask} field. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }
    /** @return the value of the {@code deviceRenderAreaCount} field. */
    @NativeType("uint32_t")
    public int deviceRenderAreaCount() { return ndeviceRenderAreaCount(address()); }
    /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDeviceRenderAreas} field. */
    @NativeType("VkRect2D const *")
    public VkRect2D.@Nullable Buffer pDeviceRenderAreas() { return npDeviceRenderAreas(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupRenderPassBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO} value to the {@code sType} field. */
    public VkDeviceGroupRenderPassBeginInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupRenderPassBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    public VkDeviceGroupRenderPassBeginInfo deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
    public VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npDeviceRenderAreas(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupRenderPassBeginInfo set(
        int sType,
        long pNext,
        int deviceMask,
        VkRect2D.@Nullable Buffer pDeviceRenderAreas
    ) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        pDeviceRenderAreas(pDeviceRenderAreas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupRenderPassBeginInfo set(VkDeviceGroupRenderPassBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfo malloc() {
        return new VkDeviceGroupRenderPassBeginInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfo calloc() {
        return new VkDeviceGroupRenderPassBeginInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupRenderPassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupRenderPassBeginInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance for the specified memory address. */
    public static VkDeviceGroupRenderPassBeginInfo create(long address) {
        return new VkDeviceGroupRenderPassBeginInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceGroupRenderPassBeginInfo createSafe(long address) {
        return address == NULL ? null : new VkDeviceGroupRenderPassBeginInfo(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceGroupRenderPassBeginInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfo malloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceGroupRenderPassBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfo calloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupRenderPassBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupRenderPassBeginInfo.PNEXT); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return memGetInt(struct + VkDeviceGroupRenderPassBeginInfo.DEVICEMASK); }
    /** Unsafe version of {@link #deviceRenderAreaCount}. */
    public static int ndeviceRenderAreaCount(long struct) { return memGetInt(struct + VkDeviceGroupRenderPassBeginInfo.DEVICERENDERAREACOUNT); }
    /** Unsafe version of {@link #pDeviceRenderAreas}. */
    public static VkRect2D.@Nullable Buffer npDeviceRenderAreas(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS), ndeviceRenderAreaCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupRenderPassBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupRenderPassBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { memPutInt(struct + VkDeviceGroupRenderPassBeginInfo.DEVICEMASK, value); }
    /** Sets the specified value to the {@code deviceRenderAreaCount} field of the specified {@code struct}. */
    public static void ndeviceRenderAreaCount(long struct, int value) { memPutInt(struct + VkDeviceGroupRenderPassBeginInfo.DEVICERENDERAREACOUNT, value); }
    /** Unsafe version of {@link #pDeviceRenderAreas(VkRect2D.Buffer) pDeviceRenderAreas}. */
    public static void npDeviceRenderAreas(long struct, VkRect2D.@Nullable Buffer value) { memPutAddress(struct + VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS, memAddressSafe(value)); ndeviceRenderAreaCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceRenderAreaCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupRenderPassBeginInfo.PDEVICERENDERAREAS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupRenderPassBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupRenderPassBeginInfo, Buffer> implements NativeResource {

        private static final VkDeviceGroupRenderPassBeginInfo ELEMENT_FACTORY = VkDeviceGroupRenderPassBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupRenderPassBeginInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupRenderPassBeginInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceGroupRenderPassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupRenderPassBeginInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupRenderPassBeginInfo.npNext(address()); }
        /** @return the value of the {@code deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkDeviceGroupRenderPassBeginInfo.ndeviceMask(address()); }
        /** @return the value of the {@code deviceRenderAreaCount} field. */
        @NativeType("uint32_t")
        public int deviceRenderAreaCount() { return VkDeviceGroupRenderPassBeginInfo.ndeviceRenderAreaCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDeviceRenderAreas} field. */
        @NativeType("VkRect2D const *")
        public VkRect2D.@Nullable Buffer pDeviceRenderAreas() { return VkDeviceGroupRenderPassBeginInfo.npDeviceRenderAreas(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO} value to the {@code sType} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupRenderPassBeginInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer deviceMask(@NativeType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.ndeviceMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
        public VkDeviceGroupRenderPassBeginInfo.Buffer pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkDeviceGroupRenderPassBeginInfo.npDeviceRenderAreas(address(), value); return this; }

    }

}