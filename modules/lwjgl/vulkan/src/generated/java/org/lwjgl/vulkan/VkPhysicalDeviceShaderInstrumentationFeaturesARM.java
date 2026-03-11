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
 * struct VkPhysicalDeviceShaderInstrumentationFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderInstrumentation;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderInstrumentationFeaturesARM extends Struct<VkPhysicalDeviceShaderInstrumentationFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERINSTRUMENTATION;

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
        SHADERINSTRUMENTATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderInstrumentationFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderInstrumentationFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderInstrumentationFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderInstrumentationFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code shaderInstrumentation} field. */
    @NativeType("VkBool32")
    public boolean shaderInstrumentation() { return nshaderInstrumentation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderInstrumentationFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMShaderInstrumentation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderInstrumentationFeaturesARM sType$Default() { return sType(ARMShaderInstrumentation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderInstrumentationFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderInstrumentation} field. */
    public VkPhysicalDeviceShaderInstrumentationFeaturesARM shaderInstrumentation(@NativeType("VkBool32") boolean value) { nshaderInstrumentation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderInstrumentationFeaturesARM set(
        int sType,
        long pNext,
        boolean shaderInstrumentation
    ) {
        sType(sType);
        pNext(pNext);
        shaderInstrumentation(shaderInstrumentation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderInstrumentationFeaturesARM set(VkPhysicalDeviceShaderInstrumentationFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM malloc() {
        return new VkPhysicalDeviceShaderInstrumentationFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM calloc() {
        return new VkPhysicalDeviceShaderInstrumentationFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderInstrumentationFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM create(long address) {
        return new VkPhysicalDeviceShaderInstrumentationFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderInstrumentationFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderInstrumentationFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderInstrumentationFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderInstrumentationFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderInstrumentationFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderInstrumentationFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #shaderInstrumentation}. */
    public static int nshaderInstrumentation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderInstrumentationFeaturesARM.SHADERINSTRUMENTATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderInstrumentationFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderInstrumentationFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #shaderInstrumentation(boolean) shaderInstrumentation}. */
    public static void nshaderInstrumentation(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderInstrumentationFeaturesARM.SHADERINSTRUMENTATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderInstrumentationFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderInstrumentationFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceShaderInstrumentationFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderInstrumentationFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderInstrumentationFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderInstrumentationFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderInstrumentationFeaturesARM.npNext(address()); }
        /** @return the value of the {@code shaderInstrumentation} field. */
        @NativeType("VkBool32")
        public boolean shaderInstrumentation() { return VkPhysicalDeviceShaderInstrumentationFeaturesARM.nshaderInstrumentation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderInstrumentationFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMShaderInstrumentation#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer sType$Default() { return sType(ARMShaderInstrumentation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderInstrumentationFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderInstrumentation} field. */
        public VkPhysicalDeviceShaderInstrumentationFeaturesARM.Buffer shaderInstrumentation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderInstrumentationFeaturesARM.nshaderInstrumentation(address(), value ? 1 : 0); return this; }

    }

}