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
 * struct VkDeviceBufferMemoryRequirements {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkBufferCreateInfo VkBufferCreateInfo} const * pCreateInfo;
 * }}</pre>
 */
public class VkDeviceBufferMemoryRequirements extends Struct<VkDeviceBufferMemoryRequirements> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PCREATEINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
    }

    protected VkDeviceBufferMemoryRequirements(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceBufferMemoryRequirements create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceBufferMemoryRequirements(address, container);
    }

    /**
     * Creates a {@code VkDeviceBufferMemoryRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceBufferMemoryRequirements(ByteBuffer container) {
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
    /** @return a {@link VkBufferCreateInfo} view of the struct pointed to by the {@code pCreateInfo} field. */
    @NativeType("VkBufferCreateInfo const *")
    public VkBufferCreateInfo pCreateInfo() { return npCreateInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceBufferMemoryRequirements sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
    public VkDeviceBufferMemoryRequirements sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceBufferMemoryRequirements pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferCreateInfo} to the {@code pCreateInfo} field. */
    public VkDeviceBufferMemoryRequirements pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) { npCreateInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceBufferMemoryRequirements set(
        int sType,
        long pNext,
        VkBufferCreateInfo pCreateInfo
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceBufferMemoryRequirements set(VkDeviceBufferMemoryRequirements src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceBufferMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceBufferMemoryRequirements malloc() {
        return new VkDeviceBufferMemoryRequirements(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceBufferMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceBufferMemoryRequirements calloc() {
        return new VkDeviceBufferMemoryRequirements(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceBufferMemoryRequirements} instance allocated with {@link BufferUtils}. */
    public static VkDeviceBufferMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceBufferMemoryRequirements(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceBufferMemoryRequirements} instance for the specified memory address. */
    public static VkDeviceBufferMemoryRequirements create(long address) {
        return new VkDeviceBufferMemoryRequirements(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceBufferMemoryRequirements createSafe(long address) {
        return address == NULL ? null : new VkDeviceBufferMemoryRequirements(address, null);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirements.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirements.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirements.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceBufferMemoryRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirements.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceBufferMemoryRequirements.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceBufferMemoryRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceBufferMemoryRequirements malloc(MemoryStack stack) {
        return new VkDeviceBufferMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceBufferMemoryRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceBufferMemoryRequirements calloc(MemoryStack stack) {
        return new VkDeviceBufferMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirements.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceBufferMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceBufferMemoryRequirements.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceBufferMemoryRequirements.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceBufferMemoryRequirements.PNEXT); }
    /** Unsafe version of {@link #pCreateInfo}. */
    public static VkBufferCreateInfo npCreateInfo(long struct) { return VkBufferCreateInfo.create(memGetAddress(struct + VkDeviceBufferMemoryRequirements.PCREATEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceBufferMemoryRequirements.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceBufferMemoryRequirements.PNEXT, value); }
    /** Unsafe version of {@link #pCreateInfo(VkBufferCreateInfo) pCreateInfo}. */
    public static void npCreateInfo(long struct, VkBufferCreateInfo value) { memPutAddress(struct + VkDeviceBufferMemoryRequirements.PCREATEINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceBufferMemoryRequirements.PCREATEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceBufferMemoryRequirements} structs. */
    public static class Buffer extends StructBuffer<VkDeviceBufferMemoryRequirements, Buffer> implements NativeResource {

        private static final VkDeviceBufferMemoryRequirements ELEMENT_FACTORY = VkDeviceBufferMemoryRequirements.create(-1L);

        /**
         * Creates a new {@code VkDeviceBufferMemoryRequirements.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceBufferMemoryRequirements#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceBufferMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceBufferMemoryRequirements.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceBufferMemoryRequirements.npNext(address()); }
        /** @return a {@link VkBufferCreateInfo} view of the struct pointed to by the {@code pCreateInfo} field. */
        @NativeType("VkBufferCreateInfo const *")
        public VkBufferCreateInfo pCreateInfo() { return VkDeviceBufferMemoryRequirements.npCreateInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceBufferMemoryRequirements.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceBufferMemoryRequirements.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS} value to the {@code sType} field. */
        public VkDeviceBufferMemoryRequirements.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceBufferMemoryRequirements.Buffer pNext(@NativeType("void const *") long value) { VkDeviceBufferMemoryRequirements.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferCreateInfo} to the {@code pCreateInfo} field. */
        public VkDeviceBufferMemoryRequirements.Buffer pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) { VkDeviceBufferMemoryRequirements.npCreateInfo(address(), value); return this; }

    }

}