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
 * Structure describing shader core properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderCoreProperties2AMD} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDShaderCoreProperties2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code shaderCoreFeatures} &ndash; a bitmask of {@code VkShaderCorePropertiesFlagBitsAMD} indicating the set of features supported by the shader core.</li>
 * <li>{@code activeComputeUnitCount} &ndash; an unsigned integer value indicating the number of compute units that have been enabled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderCoreProperties2AMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkShaderCorePropertiesFlagsAMD shaderCoreFeatures;
 *     uint32_t activeComputeUnitCount;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderCoreProperties2AMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERCOREFEATURES,
        ACTIVECOMPUTEUNITCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOREFEATURES = layout.offsetof(2);
        ACTIVECOMPUTEUNITCOUNT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderCoreProperties2AMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code shaderCoreFeatures} field. */
    @NativeType("VkShaderCorePropertiesFlagsAMD")
    public int shaderCoreFeatures() { return nshaderCoreFeatures(address()); }
    /** Returns the value of the {@code activeComputeUnitCount} field. */
    @NativeType("uint32_t")
    public int activeComputeUnitCount() { return nactiveComputeUnitCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderCoreProperties2AMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderCoreProperties2AMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderCoreProperties2AMD set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderCoreProperties2AMD set(VkPhysicalDeviceShaderCoreProperties2AMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCoreProperties2AMD malloc() {
        return wrap(VkPhysicalDeviceShaderCoreProperties2AMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCoreProperties2AMD calloc() {
        return wrap(VkPhysicalDeviceShaderCoreProperties2AMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderCoreProperties2AMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderCoreProperties2AMD.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderCoreProperties2AMD create(long address) {
        return wrap(VkPhysicalDeviceShaderCoreProperties2AMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCoreProperties2AMD createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderCoreProperties2AMD.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceShaderCoreProperties2AMD mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceShaderCoreProperties2AMD callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderCoreProperties2AMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCoreProperties2AMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderCoreProperties2AMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreProperties2AMD.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreProperties2AMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderCoreProperties2AMD.PNEXT); }
    /** Unsafe version of {@link #shaderCoreFeatures}. */
    public static int nshaderCoreFeatures(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreProperties2AMD.SHADERCOREFEATURES); }
    /** Unsafe version of {@link #activeComputeUnitCount}. */
    public static int nactiveComputeUnitCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreProperties2AMD.ACTIVECOMPUTEUNITCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderCoreProperties2AMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderCoreProperties2AMD.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderCoreProperties2AMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCoreProperties2AMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderCoreProperties2AMD ELEMENT_FACTORY = VkPhysicalDeviceShaderCoreProperties2AMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderCoreProperties2AMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderCoreProperties2AMD#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderCoreProperties2AMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderCoreProperties2AMD.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderCoreProperties2AMD.npNext(address()); }
        /** Returns the value of the {@code shaderCoreFeatures} field. */
        @NativeType("VkShaderCorePropertiesFlagsAMD")
        public int shaderCoreFeatures() { return VkPhysicalDeviceShaderCoreProperties2AMD.nshaderCoreFeatures(address()); }
        /** Returns the value of the {@code activeComputeUnitCount} field. */
        @NativeType("uint32_t")
        public int activeComputeUnitCount() { return VkPhysicalDeviceShaderCoreProperties2AMD.nactiveComputeUnitCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderCoreProperties2AMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreProperties2AMD.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderCoreProperties2AMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderCoreProperties2AMD.npNext(address(), value); return this; }

    }

}