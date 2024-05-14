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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing shader expect assume features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderExpectAssume#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderExpectAssumeFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderExpectAssume};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderExpectAssumeFeaturesKHR extends Struct<VkPhysicalDeviceShaderExpectAssumeFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADEREXPECTASSUME;

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
        SHADEREXPECTASSUME = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderExpectAssumeFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies whether shader modules <b>can</b> declare the {@code ExpectAssumeKHR} capability. */
    @NativeType("VkBool32")
    public boolean shaderExpectAssume() { return nshaderExpectAssume(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderExpectAssume#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR sType$Default() { return sType(KHRShaderExpectAssume.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderExpectAssume} field. */
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR shaderExpectAssume(@NativeType("VkBool32") boolean value) { nshaderExpectAssume(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderExpectAssume
    ) {
        sType(sType);
        pNext(pNext);
        shaderExpectAssume(shaderExpectAssume);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR set(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderExpectAssume}. */
    public static int nshaderExpectAssume(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.SHADEREXPECTASSUME); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderExpectAssume(boolean) shaderExpectAssume}. */
    public static void nshaderExpectAssume(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.SHADEREXPECTASSUME, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderExpectAssumeFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderExpectAssumeFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderExpectAssumeFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#shaderExpectAssume} field. */
        @NativeType("VkBool32")
        public boolean shaderExpectAssume() { return VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.nshaderExpectAssume(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderExpectAssume#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR} value to the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderExpectAssume.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderExpectAssumeFeaturesKHR#shaderExpectAssume} field. */
        public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.Buffer shaderExpectAssume(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderExpectAssumeFeaturesKHR.nshaderExpectAssume(address(), value ? 1 : 0); return this; }

    }

}