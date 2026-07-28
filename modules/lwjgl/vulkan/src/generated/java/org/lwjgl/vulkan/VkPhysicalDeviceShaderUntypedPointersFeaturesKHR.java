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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceShaderUntypedPointersFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderUntypedPointers;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderUntypedPointersFeaturesKHR extends Struct<VkPhysicalDeviceShaderUntypedPointersFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERUNTYPEDPOINTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERUNTYPEDPOINTERS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderUntypedPointersFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code shaderUntypedPointers} field. */
    @NativeType("VkBool32")
    public boolean shaderUntypedPointers() { return nshaderUntypedPointers(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderUntypedPointers#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR sType$Default() { return sType(KHRShaderUntypedPointers.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderUntypedPointers} field. */
    public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR shaderUntypedPointers(@NativeType("VkBool32") boolean value) { nshaderUntypedPointers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderUntypedPointers
    ) {
        sType(sType);
        pNext(pNext);
        shaderUntypedPointers(shaderUntypedPointers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR set(VkPhysicalDeviceShaderUntypedPointersFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderUntypedPointersFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderUntypedPointersFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderUntypedPointers}. */
    public static int nshaderUntypedPointers(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.SHADERUNTYPEDPOINTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderUntypedPointers(boolean) shaderUntypedPointers}. */
    public static void nshaderUntypedPointers(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.SHADERUNTYPEDPOINTERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderUntypedPointersFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderUntypedPointersFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderUntypedPointersFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderUntypedPointersFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code shaderUntypedPointers} field. */
        @NativeType("VkBool32")
        public boolean shaderUntypedPointers() { return VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.nshaderUntypedPointers(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderUntypedPointers#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderUntypedPointers.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderUntypedPointers} field. */
        public VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.Buffer shaderUntypedPointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderUntypedPointersFeaturesKHR.nshaderUntypedPointers(address(), value ? 1 : 0); return this; }

    }

}