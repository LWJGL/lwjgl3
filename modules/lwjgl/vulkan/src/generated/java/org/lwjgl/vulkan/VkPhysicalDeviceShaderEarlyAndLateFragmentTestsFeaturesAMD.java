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
 * struct VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderEarlyAndLateFragmentTests;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD extends Struct<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADEREARLYANDLATEFRAGMENTTESTS;

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
        SHADEREARLYANDLATEFRAGMENTTESTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(ByteBuffer container) {
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
    /** @return the value of the {@code shaderEarlyAndLateFragmentTests} field. */
    @NativeType("VkBool32")
    public boolean shaderEarlyAndLateFragmentTests() { return nshaderEarlyAndLateFragmentTests(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDShaderEarlyAndLateFragmentTests#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType$Default() { return sType(AMDShaderEarlyAndLateFragmentTests.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderEarlyAndLateFragmentTests} field. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD shaderEarlyAndLateFragmentTests(@NativeType("VkBool32") boolean value) { nshaderEarlyAndLateFragmentTests(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(
        int sType,
        long pNext,
        boolean shaderEarlyAndLateFragmentTests
    ) {
        sType(sType);
        pNext(pNext);
        shaderEarlyAndLateFragmentTests(shaderEarlyAndLateFragmentTests);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD malloc() {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD calloc() {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create(long address) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.PNEXT); }
    /** Unsafe version of {@link #shaderEarlyAndLateFragmentTests}. */
    public static int nshaderEarlyAndLateFragmentTests(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.SHADEREARLYANDLATEFRAGMENTTESTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.PNEXT, value); }
    /** Unsafe version of {@link #shaderEarlyAndLateFragmentTests(boolean) shaderEarlyAndLateFragmentTests}. */
    public static void nshaderEarlyAndLateFragmentTests(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.SHADEREARLYANDLATEFRAGMENTTESTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.npNext(address()); }
        /** @return the value of the {@code shaderEarlyAndLateFragmentTests} field. */
        @NativeType("VkBool32")
        public boolean shaderEarlyAndLateFragmentTests() { return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nshaderEarlyAndLateFragmentTests(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDShaderEarlyAndLateFragmentTests#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer sType$Default() { return sType(AMDShaderEarlyAndLateFragmentTests.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderEarlyAndLateFragmentTests} field. */
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.Buffer shaderEarlyAndLateFragmentTests(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nshaderEarlyAndLateFragmentTests(address(), value ? 1 : 0); return this; }

    }

}