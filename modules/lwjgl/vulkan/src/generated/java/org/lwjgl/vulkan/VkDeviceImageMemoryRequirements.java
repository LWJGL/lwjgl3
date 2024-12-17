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
 * <pre>{@code
 * struct VkDeviceImageMemoryRequirements {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkImageCreateInfo VkImageCreateInfo} const * pCreateInfo;
 *     VkImageAspectFlagBits planeAspect;
 * }}</pre>
 */
public class VkDeviceImageMemoryRequirements extends Struct<VkDeviceImageMemoryRequirements> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PCREATEINFO,
        PLANEASPECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
        PLANEASPECT = layout.offsetof(3);
    }

    protected VkDeviceImageMemoryRequirements(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceImageMemoryRequirements create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceImageMemoryRequirements(address, container);
    }

    /**
     * Creates a {@code VkDeviceImageMemoryRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceImageMemoryRequirements(ByteBuffer container) {
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
    /** @return a {@link VkImageCreateInfo} view of the struct pointed to by the {@code pCreateInfo} field. */
    @NativeType("VkImageCreateInfo const *")
    public VkImageCreateInfo pCreateInfo() { return npCreateInfo(address()); }
    /** @return the value of the {@code planeAspect} field. */
    @NativeType("VkImageAspectFlagBits")
    public int planeAspect() { return nplaneAspect(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceImageMemoryRequirements sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
    public VkDeviceImageMemoryRequirements sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceImageMemoryRequirements pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCreateInfo} to the {@code pCreateInfo} field. */
    public VkDeviceImageMemoryRequirements pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { npCreateInfo(address(), value); return this; }
    /** Sets the specified value to the {@code planeAspect} field. */
    public VkDeviceImageMemoryRequirements planeAspect(@NativeType("VkImageAspectFlagBits") int value) { nplaneAspect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceImageMemoryRequirements set(
        int sType,
        long pNext,
        VkImageCreateInfo pCreateInfo,
        int planeAspect
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        planeAspect(planeAspect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceImageMemoryRequirements set(VkDeviceImageMemoryRequirements src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceImageMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceImageMemoryRequirements malloc() {
        return new VkDeviceImageMemoryRequirements(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceImageMemoryRequirements calloc() {
        return new VkDeviceImageMemoryRequirements(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirements} instance allocated with {@link BufferUtils}. */
    public static VkDeviceImageMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageMemoryRequirements(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirements} instance for the specified memory address. */
    public static VkDeviceImageMemoryRequirements create(long address) {
        return new VkDeviceImageMemoryRequirements(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceImageMemoryRequirements createSafe(long address) {
        return address == NULL ? null : new VkDeviceImageMemoryRequirements(address, null);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirements.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirements.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirements.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceImageMemoryRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirements.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceImageMemoryRequirements.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceImageMemoryRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageMemoryRequirements malloc(MemoryStack stack) {
        return new VkDeviceImageMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceImageMemoryRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageMemoryRequirements calloc(MemoryStack stack) {
        return new VkDeviceImageMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirements.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirements.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceImageMemoryRequirements.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceImageMemoryRequirements.PNEXT); }
    /** Unsafe version of {@link #pCreateInfo}. */
    public static VkImageCreateInfo npCreateInfo(long struct) { return VkImageCreateInfo.create(memGetAddress(struct + VkDeviceImageMemoryRequirements.PCREATEINFO)); }
    /** Unsafe version of {@link #planeAspect}. */
    public static int nplaneAspect(long struct) { return memGetInt(struct + VkDeviceImageMemoryRequirements.PLANEASPECT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceImageMemoryRequirements.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceImageMemoryRequirements.PNEXT, value); }
    /** Unsafe version of {@link #pCreateInfo(VkImageCreateInfo) pCreateInfo}. */
    public static void npCreateInfo(long struct, VkImageCreateInfo value) { memPutAddress(struct + VkDeviceImageMemoryRequirements.PCREATEINFO, value.address()); }
    /** Unsafe version of {@link #planeAspect(int) planeAspect}. */
    public static void nplaneAspect(long struct, int value) { memPutInt(struct + VkDeviceImageMemoryRequirements.PLANEASPECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceImageMemoryRequirements.PCREATEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceImageMemoryRequirements} structs. */
    public static class Buffer extends StructBuffer<VkDeviceImageMemoryRequirements, Buffer> implements NativeResource {

        private static final VkDeviceImageMemoryRequirements ELEMENT_FACTORY = VkDeviceImageMemoryRequirements.create(-1L);

        /**
         * Creates a new {@code VkDeviceImageMemoryRequirements.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceImageMemoryRequirements#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceImageMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceImageMemoryRequirements.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceImageMemoryRequirements.npNext(address()); }
        /** @return a {@link VkImageCreateInfo} view of the struct pointed to by the {@code pCreateInfo} field. */
        @NativeType("VkImageCreateInfo const *")
        public VkImageCreateInfo pCreateInfo() { return VkDeviceImageMemoryRequirements.npCreateInfo(address()); }
        /** @return the value of the {@code planeAspect} field. */
        @NativeType("VkImageAspectFlagBits")
        public int planeAspect() { return VkDeviceImageMemoryRequirements.nplaneAspect(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceImageMemoryRequirements.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceImageMemoryRequirements.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
        public VkDeviceImageMemoryRequirements.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceImageMemoryRequirements.Buffer pNext(@NativeType("void const *") long value) { VkDeviceImageMemoryRequirements.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCreateInfo} to the {@code pCreateInfo} field. */
        public VkDeviceImageMemoryRequirements.Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { VkDeviceImageMemoryRequirements.npCreateInfo(address(), value); return this; }
        /** Sets the specified value to the {@code planeAspect} field. */
        public VkDeviceImageMemoryRequirements.Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) { VkDeviceImageMemoryRequirements.nplaneAspect(address(), value); return this; }

    }

}