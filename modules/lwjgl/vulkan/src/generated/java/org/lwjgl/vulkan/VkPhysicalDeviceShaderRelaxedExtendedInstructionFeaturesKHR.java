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
 * struct VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderRelaxedExtendedInstruction;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR extends Struct<VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERRELAXEDEXTENDEDINSTRUCTION;

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
        SHADERRELAXEDEXTENDEDINSTRUCTION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code shaderRelaxedExtendedInstruction} field. */
    @NativeType("VkBool32")
    public boolean shaderRelaxedExtendedInstruction() { return nshaderRelaxedExtendedInstruction(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderRelaxedExtendedInstruction#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sType$Default() { return sType(KHRShaderRelaxedExtendedInstruction.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderRelaxedExtendedInstruction} field. */
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR shaderRelaxedExtendedInstruction(@NativeType("VkBool32") boolean value) { nshaderRelaxedExtendedInstruction(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderRelaxedExtendedInstruction
    ) {
        sType(sType);
        pNext(pNext);
        shaderRelaxedExtendedInstruction(shaderRelaxedExtendedInstruction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR set(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderRelaxedExtendedInstruction}. */
    public static int nshaderRelaxedExtendedInstruction(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.SHADERRELAXEDEXTENDEDINSTRUCTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderRelaxedExtendedInstruction(boolean) shaderRelaxedExtendedInstruction}. */
    public static void nshaderRelaxedExtendedInstruction(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.SHADERRELAXEDEXTENDEDINSTRUCTION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code shaderRelaxedExtendedInstruction} field. */
        @NativeType("VkBool32")
        public boolean shaderRelaxedExtendedInstruction() { return VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nshaderRelaxedExtendedInstruction(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderRelaxedExtendedInstruction#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderRelaxedExtendedInstruction.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderRelaxedExtendedInstruction} field. */
        public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.Buffer shaderRelaxedExtendedInstruction(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR.nshaderRelaxedExtendedInstruction(address(), value ? 1 : 0); return this; }

    }

}